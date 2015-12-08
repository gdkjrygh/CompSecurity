// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.pinterest.activity.create.BoardSelectedEvent;
import com.pinterest.activity.create.adapter.BoardPickerAdapter;
import com.pinterest.activity.create.fragment.view.CreateBoardListHeader;
import com.pinterest.activity.create.fragment.view.CreateBoardListHeaderEdit;
import com.pinterest.activity.create.fragment.view.CreateBoardListHeaderRepin;
import com.pinterest.activity.task.dialog.EditPinDescriptionDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.ListFragment;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.utils.AggregatedPinUtils;
import com.pinterest.ui.grid.AdapterFooterView;
import com.pinterest.ui.notify.DialogTitleView;
import org.apache.commons.lang3.StringUtils;

public class BoardPickerFragment extends ListFragment
{

    private static final int COUNT = 3;
    private static final String DEFAULT_EDIT_TEXT = Resources.string(0x7f07019c);
    private static final int DESCRIPTION = 2;
    private static final int DUPLICATE = 1;
    private static final int MINIMUM_NUMBER_BOARDS = 3;
    private static final int TITLE = 0;
    protected static BoardFeed _boardFeed;
    protected static BoardFeed _suggestedBoardFeed;
    protected static BoardFeed _suggestionInterestBoardsFeed;
    protected BoardPickerAdapter _adapter;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    protected CreateBoardListHeaderRepin _fastRepinDup;
    protected CreateBoardListHeaderEdit _fastRepinEdit;
    protected boolean _fastRepinMode;
    protected CreateBoardListHeader _fastRepinTitle;
    protected DialogTitleView _headerVw;
    protected int _layoutId;
    protected Pin _pin;
    public ApiResponseHandler onBoardCreated;
    private android.view.View.OnClickListener onDuplicateRepinClicked;
    private android.view.View.OnClickListener onEditDescriptionClicked;
    private android.widget.AdapterView.OnItemClickListener onItemClicked;

    public BoardPickerFragment()
    {
        _layoutId = 0x7f0300b9;
        _fastRepinMode = false;
        onItemClicked = new _cls1();
        onEditDescriptionClicked = new _cls3();
        onDuplicateRepinClicked = new _cls4();
        _eventsSubscriber = new _cls6();
        onBoardCreated = new _cls7();
        _adapter = new BoardPickerAdapter();
        _adapter.setApiTag(getApiTag());
        _adapter.setDataSource(_boardFeed);
    }

    public static void clear()
    {
        _suggestedBoardFeed = null;
    }

    public static BoardFeed getBoardFeed()
    {
        return _boardFeed;
    }

    public static void setBoardFeed(BoardFeed boardfeed)
    {
        _boardFeed = boardfeed;
    }

    public static void setSuggestedBoardFeed(BoardFeed boardfeed)
    {
        _suggestedBoardFeed = boardfeed;
    }

    private void showEditDescriptionDialog()
    {
        final EditPinDescriptionDialog dialog = new EditPinDescriptionDialog();
        boolean flag = Experiments.P();
        if (flag)
        {
            dialog.setHint(DEFAULT_EDIT_TEXT);
        }
        if (!flag || AggregatedPinUtils.hasUserChangedDescription(_pin) || !StringUtils.equals(_fastRepinEdit.getDescriptionText(), DEFAULT_EDIT_TEXT))
        {
            dialog.setPrefilledText(_fastRepinEdit.getDescriptionText());
        }
        dialog.setTitle(0x7f07019d);
        dialog.setOnClickListener(new _cls5());
        Events.post(new DialogEvent(dialog));
    }

    protected void loadCachedBoards()
    {
        (new _cls2()).execute();
    }

    protected void onBoardSelected(Board board)
    {
        if (board == null)
        {
            return;
        } else
        {
            Events.postSticky(new BoardSelectedEvent(board.getUid()));
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            _adapter.setPublicOnly(bundle.getBoolean("com.pinterest.EXTRA_HIDE_SECRET_BOARDS", false));
        }
        loadCachedBoards();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(_layoutId, viewgroup, false);
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/events/FeedEvents$MyBoardsInvalidated, com/pinterest/activity/create/helper/CreateBoardHelper$BoardCreatedEvent
        });
        _listView.setOnItemClickListener(null);
        _listView = null;
        _fastRepinTitle = null;
        _headerVw = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (_boardFeed == null)
        {
            _boardFeed = new BoardFeed(DiskCache.getJsonObject("MY_PICKER_BOARDS"), null);
        }
        _listView = (ListView)view.findViewById(0x7f0f0128);
        if (_fastRepinMode)
        {
            _fastRepinTitle = new CreateBoardListHeader(view.getContext());
            _listView.addHeaderView(_fastRepinTitle);
            _fastRepinDup = new CreateBoardListHeaderRepin(view.getContext());
            _listView.addHeaderView(_fastRepinDup);
            _fastRepinEdit = new CreateBoardListHeaderEdit(view.getContext());
            _listView.addHeaderView(_fastRepinEdit);
        }
        _listView.setAdapter(_adapter);
        _listView.setOnItemClickListener(onItemClicked);
        _footerView.setState(1);
        _headerVw = (DialogTitleView)view.findViewById(0x7f0f0133);
        if (_headerVw != null)
        {
            _headerVw.titleTv.setText(0x7f0701b1);
            _headerVw.setVisibility(0);
        }
        Events.register(_eventsSubscriber, com/pinterest/events/FeedEvents$MyBoardsInvalidated, new Class[0]);
        Events.registerSticky(_eventsSubscriber, com/pinterest/activity/create/helper/CreateBoardHelper$BoardCreatedEvent, new Class[0]);
    }










    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final BoardPickerFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (_adapter != null)
            {
                int j = i;
                if (_fastRepinMode)
                {
                    if (i == 0)
                    {
                        pressBackButton();
                        return;
                    }
                    if (i == 1)
                    {
                        onDuplicateRepinClicked.onClick(_fastRepinDup);
                        return;
                    }
                    if (i == 2)
                    {
                        onEditDescriptionClicked.onClick(_fastRepinEdit);
                        return;
                    }
                    j = i - 3;
                }
                if (_adapter.getItemViewType(j) == 1)
                {
                    adapterview = CreateBoardDialog.newInstance(null);
                    adapterview.setShouldNavigateToBoardOnCreate(false);
                    Events.post(new DialogEvent(adapterview));
                    return;
                }
                if (_adapter.getItemViewType(j) != 2)
                {
                    view = _adapter.getItem(j);
                    if (_adapter.getItemViewType(j) == 3)
                    {
                        if (view != null)
                        {
                            adapterview = CreateBoardDialog.newInstance(view.getName());
                            adapterview.setShouldNavigateToBoardOnCreate(false);
                            adapterview.setIsSuggestedBoard(true);
                            Events.post(new DialogEvent(adapterview));
                            return;
                        }
                    } else
                    {
                        if (view != null)
                        {
                            adapterview = view.getUid();
                        } else
                        {
                            adapterview = MyUser.getLastSelectedBoardId();
                        }
                        MyUser.setLastSelectedBoardId(adapterview);
                        Pinalytics.a(ElementType.BOARD_NAME, null, adapterview);
                        onBoardSelected(view);
                        getActivity().onBackPressed();
                        return;
                    }
                }
            }
        }

        _cls1()
        {
            this$0 = BoardPickerFragment.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final BoardPickerFragment this$0;

        public void onClick(View view)
        {
            showEditDescriptionDialog();
        }

        _cls3()
        {
            this$0 = BoardPickerFragment.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final BoardPickerFragment this$0;

        public void onClick(View view)
        {
            if (_pin != null)
            {
                Pinalytics.a(ElementType.DUPLICATE_PIN_WARNING, ComponentType.SHEET, _pin.getPinnedToBoardUid());
                pressBackButton();
                Events.post(new Navigation(Location.BOARD, _pin.getPinnedToBoard()));
            }
        }

        _cls4()
        {
            this$0 = BoardPickerFragment.this;
            super();
        }
    }


    private class _cls6
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final BoardPickerFragment this$0;

        private boolean shouldBoardPickerClose()
        {
            return getActivity() instanceof CreateActivity;
        }

        public void onEventMainThread(com.pinterest.activity.create.helper.CreateBoardHelper.BoardCreatedEvent boardcreatedevent)
        {
            if (shouldBoardPickerClose())
            {
                Events.removeStickyEvent(boardcreatedevent);
                pressBackButton();
            }
        }

        public void onEventMainThread(com.pinterest.events.FeedEvents.MyBoardsInvalidated myboardsinvalidated)
        {
            if (_adapter != null)
            {
                loadCachedBoards();
            }
        }

        _cls6()
        {
            this$0 = BoardPickerFragment.this;
            super();
        }
    }


    private class _cls7 extends ApiResponseHandler
    {

        final BoardPickerFragment this$0;

        public void onFinish()
        {
            hideWaitDialog();
            super.onFinish();
        }

        public void onStart()
        {
            showWaitDialog(0x7f0701a4);
            super.onStart();
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = MyUser.getLastSelectedBoardId();
            Pinalytics.a(EventType.BOARD_CREATE, apiresponse);
            apiresponse = ModelHelper.getBoard(apiresponse);
            com.pinterest.network.json.PinterestJsonObject pinterestjsonobject = DiskCache.getJsonObject("MY_PICKER_BOARDS");
            if (_adapter != null)
            {
                _adapter.setDataSource(new BoardFeed(pinterestjsonobject, null));
            }
            if (getActivity() == null)
            {
                return;
            } else
            {
                onBoardSelected(apiresponse);
                getActivity().onBackPressed();
                return;
            }
        }

        _cls7()
        {
            this$0 = BoardPickerFragment.this;
            super();
        }
    }


    private class _cls5 extends com.pinterest.activity.task.dialog.EditFieldDialog.OnClickListener
    {

        final BoardPickerFragment this$0;
        final EditPinDescriptionDialog val$dialog;

        public void onNegativeClicked()
        {
            dialog.dismiss();
        }

        public void onPositiveClicked(String s, boolean flag)
        {
            if (s == null)
            {
                Application.showToast(0x7f070195);
                return;
            }
            if (flag)
            {
                Pin pin = new Pin();
                pin.setUid((new StringBuilder()).append(_pin.getUid()).append("-repin").toString());
                pin.setDescription(s);
                Events.post(new com.pinterest.api.model.Pin.EditEvent(pin));
                _fastRepinEdit.setDescriptionText(pin.getDescription());
                _fastRepinEdit.requestFocus();
            }
            dialog.dismiss();
        }

        _cls5()
        {
            this$0 = BoardPickerFragment.this;
            dialog = editpindescriptiondialog;
            super();
        }
    }


    private class _cls2 extends BackgroundTask
    {

        final BoardPickerFragment this$0;

        public void onFinish()
        {
            if (_adapter == null)
            {
                return;
            } else
            {
                _adapter.setCachedSuggestions(BoardPickerFragment._suggestedBoardFeed, _pin, false);
                _adapter.setDataSource(BoardPickerFragment._boardFeed);
                _adapter.notifyDataSetChanged();
                return;
            }
        }

        public void run()
        {
            BoardFeed boardfeed = new BoardFeed(DiskCache.getJsonObject("MY_PICKER_BOARDS"), null);
            BoardPickerFragment._boardFeed = boardfeed;
            if (boardfeed.getCount() > 5)
            {
                java.util.List list = MyUser.getLastUsedBoardsBlocking();
                if (BoardPickerFragment._suggestedBoardFeed == null)
                {
                    BoardPickerFragment._suggestedBoardFeed = new BoardFeed();
                }
                BoardPickerFragment._suggestedBoardFeed.setItems(list);
            }
        }

        _cls2()
        {
            this$0 = BoardPickerFragment.this;
            super();
        }
    }

}
