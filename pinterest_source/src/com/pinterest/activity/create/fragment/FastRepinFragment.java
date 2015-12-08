// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ListView;
import com.pinterest.activity.create.adapter.BoardPickerAdapter;
import com.pinterest.activity.create.fragment.view.CreateBoardListHeaderEdit;
import com.pinterest.activity.create.fragment.view.CreateBoardListHeaderRepin;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.anim.SlideUpDownAnimation;
import com.pinterest.kit.utils.AggregatedPinUtils;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            BoardPickerFragment

public class FastRepinFragment extends BoardPickerFragment
{

    private boolean _aggregatedPinsEnabled;
    private String _customDescription;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private String _imageSignature;
    protected com.pinterest.api.remote.MyUserApi.BoardPickerApiResponse onBoardsLoaded;
    private com.pinterest.api.remote.PinApi.PinApiResponse onPinLoaded;
    ApiResponseHandler pinBatchResponse;

    public FastRepinFragment()
    {
        _eventsSubscriber = new _cls1();
        pinBatchResponse = new _cls2();
        onBoardsLoaded = new _cls3();
        onPinLoaded = new _cls4();
        _layoutId = 0x7f0300ba;
        _fastRepinMode = true;
        _adapter.setFastRepinMode(_fastRepinMode);
    }

    private Pin handleRepinResponse(PinterestJsonObject pinterestjsonobject)
    {
        Object obj = null;
        try
        {
            pinterestjsonobject = Pin.make(pinterestjsonobject, false).getPin();
        }
        // Misplaced declaration of an exception variable
        catch (PinterestJsonObject pinterestjsonobject)
        {
            pinterestjsonobject = obj;
        }
        Events.postSticky(new com.pinterest.events.FeedEvents.MyBoardsInvalidated());
        return pinterestjsonobject;
    }

    private boolean hasRecommend(PinterestJsonObject pinterestjsonobject)
    {
        return pinterestjsonobject.e("data").a() != 0;
    }

    private void updateDupView(boolean flag)
    {
        View view = _fastRepinDup.findViewById(0x7f0f034d);
        boolean flag1;
        if (view.getVisibility() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag == flag1)
        {
            return;
        }
        if (flag)
        {
            SlideUpDownAnimation slideupdownanimation = new SlideUpDownAnimation(view, true, view.getLayoutParams().height);
            slideupdownanimation.setDuration(300L);
            view.startAnimation(slideupdownanimation);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    protected void loadCachedBoards()
    {
        (new _cls5()).execute();
    }

    protected void loadData()
    {
        if (_pin != null)
        {
            PinApi.a(_pin.getUid(), onPinLoaded, getApiTag());
        }
    }

    protected void loadSuggestedBoards()
    {
        PinApi.a(_pin.getUid(), new _cls6(), getApiTag());
    }

    protected void onBoardSelected(Board board)
    {
        if (board != null)
        {
            pin(board.getUid());
        }
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber);
        super.onDestroyView();
    }

    public void onPause()
    {
        super.onPause();
        StopWatch.get().invalidate("repin_dialog");
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        Events.register(_eventsSubscriber, com/pinterest/api/model/Pin$EditEvent, new Class[] {
            com/pinterest/activity/create/helper/CreateBoardHelper$BoardCreatedEvent, com/pinterest/base/Device$MetricsUpdateEvent
        });
        _listView.setSelectionFromTop(0, 0);
        _aggregatedPinsEnabled = Experiments.P();
        if (_pin != null && _fastRepinTitle != null)
        {
            if (_aggregatedPinsEnabled)
            {
                _fastRepinEdit.setHintTextStringId(0x7f07019c);
            }
            if (!_aggregatedPinsEnabled || AggregatedPinUtils.hasUserChangedDescription(_pin))
            {
                _fastRepinEdit.setDescriptionText(_pin.getDescription());
            } else
            {
                _fastRepinEdit.setDescriptionText("");
            }
        }
        if (Device.isTablet() || Device.isLandscape())
        {
            ViewHelper.updateViewWidth(view, Constants.SHEET_MAX_WIDTH);
        }
        MyUserApi.a(onBoardsLoaded, getApiTag());
    }

    public void pin(String s)
    {
        Pinalytics.a(ElementType.PIN_REPIN_BUTTON, ComponentType.MODAL_ADD_PIN, _pin.getUid());
        com.pinterest.api.remote.PinApi.PinDetailParams pindetailparams = new com.pinterest.api.remote.PinApi.PinDetailParams();
        pindetailparams.a = _pin.getUid();
        pindetailparams.b = s;
        String s1;
        if (_customDescription != null)
        {
            s = _customDescription;
        } else
        {
            s = _pin.getDescription();
        }
        s1 = s;
        if (_aggregatedPinsEnabled)
        {
            s1 = s;
            if (StringUtils.isEmpty(s))
            {
                s1 = s;
                if (!AggregatedPinUtils.hasUserChangedDescription(_pin))
                {
                    s1 = _pin.getDescription();
                }
            }
        }
        pindetailparams.d = s1;
        pindetailparams.e = MyUser.isConnectedToFacebookSt();
        pindetailparams.f = false;
        if (_imageSignature != null)
        {
            pindetailparams.g = _imageSignature;
        }
        Events.post(new com.pinterest.api.model.Pin.PinRepinEvent(_pin));
        Pinalytics.a(EventType.PIN_REPIN, _pin.getUid(), _pin.getLoggingAuxData());
        StopWatch.get().start("repin_submit");
        ModelHelper.repinPin(_pin, pindetailparams, pinBatchResponse, getApiTag());
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation != null)
        {
            if (_pin == null)
            {
                setPin(navigation.getModelAsPin());
                loadData();
            }
            _imageSignature = (String)navigation.getExtra("com.pinterest.EXTRA_IMAGE_SIGNATURE");
        }
    }

    public void setPin(Pin pin1)
    {
        _pin = pin1;
    }


/*
    static String access$002(FastRepinFragment fastrepinfragment, String s)
    {
        fastrepinfragment._customDescription = s;
        return s;
    }

*/




    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final FastRepinFragment this$0;

        public void onEventMainThread(com.pinterest.activity.create.helper.CreateBoardHelper.BoardCreatedEvent boardcreatedevent)
        {
            boardcreatedevent = boardcreatedevent.getBoardId();
            pin(boardcreatedevent);
            getActivity().onBackPressed();
        }

        public void onEventMainThread(com.pinterest.api.model.Pin.EditEvent editevent)
        {
            editevent = editevent.getPin();
            if (editevent != null && editevent.getUid().startsWith(_pin.getUid()))
            {
                _customDescription = editevent.getDescription();
            }
        }

        public void onEventMainThread(com.pinterest.base.Device.MetricsUpdateEvent metricsupdateevent)
        {
            metricsupdateevent = getView();
            int i;
            if (Device.isTablet() || Device.isLandscape())
            {
                i = Constants.SHEET_MAX_WIDTH;
            } else
            {
                i = (int)Device.getScreenWidth();
            }
            ViewHelper.updateViewWidth(metricsupdateevent, i);
        }

        _cls1()
        {
            this$0 = FastRepinFragment.this;
            super();
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final FastRepinFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            apiresponse = ((PinterestJsonObject)apiresponse.getData()).c(String.format("POST:/v3/pins/%s/repin/", new Object[] {
                _pin.getUid()
            }));
            if ((new ApiResponse(apiresponse)).getCode() != 0)
            {
                onFailure(null, apiresponse);
                StopWatch.get().invalidate("repin_submit");
                return;
            }
            apiresponse = handleRepinResponse(apiresponse);
            if (apiresponse == null)
            {
                StopWatch.get().invalidate("repin_submit");
                return;
            } else
            {
                StopWatch.get().complete("repin_submit");
                Events.post(new ToastEvent(new PinnedToast(apiresponse)));
                VerifiedDomainUtil.showToastIfNecessary(_pin);
                return;
            }
        }

        _cls2()
        {
            this$0 = FastRepinFragment.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.api.remote.MyUserApi.BoardPickerApiResponse
    {

        final FastRepinFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            StopWatch.get().invalidate("repin_dialog");
            try
            {
                if (DiskCache.getJsonObject("MY_PICKER_BOARDS") == null)
                {
                    pressBackButton();
                }
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                return;
            }
        }

        public void onSuccess(Feed feed)
        {
            BoardPickerFragment._boardFeed = (BoardFeed)feed;
            if (_adapter != null)
            {
                _adapter.setDataSource(BoardPickerFragment._boardFeed);
            }
            StopWatch.get().complete("repin_dialog");
        }

        _cls3()
        {
            this$0 = FastRepinFragment.this;
            super();
        }
    }


    private class _cls4 extends com.pinterest.api.remote.PinApi.PinApiResponse
    {

        final FastRepinFragment this$0;

        public void onSuccess(Pin pin1)
        {
            super.onSuccess(pin1);
            setPin(pin1);
            if (isAdded())
            {
                updateDupView(pin1.isDuplicated());
            }
        }

        _cls4()
        {
            this$0 = FastRepinFragment.this;
            super();
        }
    }


    private class _cls5 extends BackgroundTask
    {

        final FastRepinFragment this$0;

        public void onFinish()
        {
            if (BoardPickerFragment._boardFeed != null && BoardPickerFragment._boardFeed.getCount() < 5)
            {
                Experiments.a("android_user_suggestion_boards");
                if (Experiments.B())
                {
                    loadSuggestedBoards();
                }
            }
            if (_adapter == null)
            {
                return;
            } else
            {
                _adapter.setDataSource(BoardPickerFragment._boardFeed);
                _adapter.setCachedSuggestions(BoardPickerFragment._suggestedBoardFeed, _pin, true);
                _adapter.notifyDataSetChanged();
                return;
            }
        }

        public void run()
        {
            if (BoardPickerFragment._suggestedBoardFeed == null)
            {
                BoardPickerFragment._suggestedBoardFeed = new BoardFeed();
            }
            BoardFeed boardfeed = new BoardFeed(DiskCache.getJsonObject("MY_PICKER_BOARDS"), null);
            BoardPickerFragment._boardFeed = boardfeed;
            if (boardfeed.getCount() > 5)
            {
                List list = MyUser.getLastUsedBoardsBlocking();
                BoardPickerFragment._suggestedBoardFeed.setItems(list);
            }
        }

        _cls5()
        {
            this$0 = FastRepinFragment.this;
            super();
        }
    }


    private class _cls6 extends ApiResponseHandler
    {

        final FastRepinFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Object obj = new ArrayList();
            if (apiresponse.getData() instanceof PinterestJsonArray)
            {
                obj = Board.makeAll((PinterestJsonArray)apiresponse.getData());
            }
            BoardPickerFragment._suggestionInterestBoardsFeed = new BoardFeed();
            if (((List) (obj)).size() > 5)
            {
                BoardPickerFragment._suggestionInterestBoardsFeed.setItems(((List) (obj)).subList(0, 5));
            } else
            {
                BoardPickerFragment._suggestionInterestBoardsFeed.setItems(((List) (obj)));
            }
            if (_adapter == null)
            {
                return;
            } else
            {
                _adapter.setSuggestedBoardSuggestions(BoardPickerFragment._suggestionInterestBoardsFeed);
                _adapter.notifyDataSetChanged();
                return;
            }
        }

        _cls6()
        {
            this$0 = FastRepinFragment.this;
            super();
        }
    }

}
