// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.pinterest.activity.pin.view.PinFlashlightCropView;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.FlashlightApi;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.schemas.event.Context;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.ViewData;
import com.pinterest.schemas.event.ViewType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.progress.LoadingView;
import java.util.ArrayList;
import java.util.List;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.flashlight:
//            FlashlightAnnotationListAdapter

public class FlashlightResultsFragment extends PinGridFragment
{

    private static final int MAX_NUM_SELECTED_ANNOTATIONS = 3;
    private List _annotationList;
    private FlashlightAnnotationListAdapter _annotationListAdapter;
    private android.widget.AdapterView.OnItemClickListener _annotationSelectedListener;
    TwoWayView _annotationsView;
    ImageView _closeFlashlightButton;
    private Runnable _eduRunnable;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private PinFlashlightCropView _flashlightCropView;
    private boolean _isAlive;
    LoadingView _loadingView;
    private Pin _pin;
    private com.pinterest.api.model.Pin.GalleryItem _pinGalleryItem;
    private String _searchIdentifier;
    private List _selectedAnnotations;
    private boolean _shouldLoadExperience;

    public FlashlightResultsFragment()
    {
        _eventsSubscriber = new _cls1();
        _annotationSelectedListener = new _cls2();
        _layoutId = 0x7f0300c9;
    }

    private String getImageSignature()
    {
        if (_pin.getGalleryItems() != null && _pin.getGalleryItems().size() > 1)
        {
            return _pinGalleryItem.getImageSignature();
        } else
        {
            return _pin.getImageSignature();
        }
    }

    private boolean isFragmentDead()
    {
        return !_isAlive || this == null || getView() == null;
    }

    private void loadFlashlightAnnotationResults()
    {
        loadFlashlightSearchResults(_flashlightCropView.getCropperRect(), _flashlightCropView.getViewWidth(), _flashlightCropView.getViewHeight(), _selectedAnnotations);
    }

    private void setFeedInsertionIdForLogging()
    {
        Context context = Pinalytics.h();
        if (context == null)
        {
            Pinalytics.a(this);
            context = Pinalytics.h();
        }
        if (context != null && _searchIdentifier != null)
        {
            ViewData viewdata1 = context.getViewData();
            ViewData viewdata = viewdata1;
            if (viewdata1 == null)
            {
                viewdata = new ViewData();
            }
            viewdata.setFeedInsertionId(_searchIdentifier);
            context.setViewData(viewdata);
        }
    }

    private void updateAnnotationsUI(boolean flag)
    {
        updateGridViewPaddingForAnnotations();
        if (_annotationsView != null && _annotationListAdapter != null && _annotationList != null && !_annotationList.isEmpty())
        {
            _annotationsView.setVisibility(0);
            _annotationListAdapter.setDataSource(_annotationList);
            if (flag)
            {
                _annotationsView.post(new _cls3());
            }
        }
    }

    private void updateGridViewPaddingForAnnotations()
    {
        if (_annotationsView != null && (_annotationList == null || _annotationList.isEmpty()))
        {
            _annotationsView.setVisibility(8);
            int i = (int)Resources.dimension(0x7f0a012e);
            _gridVw.setPadding(_gridVw.getPaddingLeft(), i, _gridVw.getPaddingRight(), _gridVw.getPaddingBottom());
        } else
        if (_annotationsView != null && _annotationsView.getVisibility() != 0 && _annotationList != null && !_annotationList.isEmpty())
        {
            ViewHelper.setVisibility(_annotationsView, 0);
            int j = (int)Resources.dimension(0x7f0a012d);
            _gridVw.setPadding(_gridVw.getPaddingLeft(), j, _gridVw.getPaddingRight(), _gridVw.getPaddingBottom());
            return;
        }
    }

    public void cancelFlashlightSearchRequests()
    {
        ApiHttpClient.cancelPendingRequests(getApiTag());
    }

    public void loadFlashlightSearchResults(RectF rectf, int i, int j, List list)
    {
        String s = getImageSignature();
        _refreshing = true;
        float f = Math.max(0.0F, rectf.left / (float)i);
        float f1 = Math.max(0.0F, rectf.top / (float)j);
        float f2 = Math.min(Math.min(rectf.width() / (float)i, 1.0F), 1.0F - f);
        float f3 = Math.min(Math.min(rectf.height() / (float)j, 1.0F), 1.0F - f1);
        if (_adapter != null && ((PinGridAdapter)_adapter).getCount() > 0 && ((PinGridAdapter)_adapter).getDataSource() != null)
        {
            ((PinGridAdapter)_adapter).getDataSource().destroy();
            ((PinGridAdapter)_adapter).resetCachedItemHeights();
            if (_gridVw != null)
            {
                _gridVw.reset();
            }
        }
        cancelFlashlightSearchRequests();
        boolean flag;
        if (list != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        FlashlightApi.a(s, f, f1, f2, f3, list, new FlashlightFeedApiResponseHandler(gridResponseHandler, flag), getApiTag());
    }

    void onCloseFlashlightClicked(View view)
    {
        setActive(false);
        Pinalytics.a(ElementType.CLOSE_BUTTON);
        Events.post(new FlashlightCloseButtonEvent());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        updateContextForLogging();
        _isAlive = true;
        _shouldLoadExperience = true;
    }

    public void onDestroyView()
    {
        cancelFlashlightSearchRequests();
        _annotationsView.setAdapter(null);
        _annotationListAdapter = null;
        _annotationSelectedListener = null;
        if (_eduRunnable != null)
        {
            EducationHelper.a(_eduRunnable);
        }
        Events.unregister(_eventsSubscriber);
        setActive(false);
        _isAlive = false;
        super.onDestroyView();
    }

    public void onPinFragmentActivate()
    {
        setActive(true);
        Events.register(_eventsSubscriber, com/pinterest/activity/task/view/MainViewPager$PageChangedEvent, new Class[] {
            com/pinterest/activity/flashlight/FlashlightResultsFragment$FlashlightEducationDismissedEvent
        });
    }

    public void onPinFragmentDeactivate()
    {
        setActive(false);
        Events.unregister(_eventsSubscriber);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        setActive(true);
        _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.NONE);
        _selectedAnnotations = new ArrayList();
        _annotationListAdapter = new FlashlightAnnotationListAdapter(_selectedAnnotations);
        _annotationsView.setHorizontalScrollBarEnabled(false);
        _annotationsView.setSelector(0x106000d);
        _annotationsView.setOnItemClickListener(_annotationSelectedListener);
        _annotationsView.setAdapter(_annotationListAdapter);
        int i = Resources.color(0x7f0e006a);
        _closeFlashlightButton.setImageDrawable(DrawableUtils.tintIcon(0x7f020169, i));
        Events.register(_eventsSubscriber, com/pinterest/activity/task/education/event/EducationEvent, new Class[] {
            com/pinterest/activity/flashlight/FlashlightResultsFragment$FlashlightEducationDismissedEvent
        });
    }

    public void setFlashlightCropView(PinFlashlightCropView pinflashlightcropview)
    {
        _flashlightCropView = pinflashlightcropview;
        _flashlightCropView.setFlashlightCropperMoveListener(new _cls4());
    }

    public void setPin(Pin pin)
    {
        _pin = pin;
    }

    public void setPinGalleryItem(com.pinterest.api.model.Pin.GalleryItem galleryitem)
    {
        _pinGalleryItem = galleryitem;
    }

    public void updateContextForLogging()
    {
        Context context = Pinalytics.h();
        if (context == null || context.getViewType() != null && !context.getViewType().equals(ViewType.FLASHLIGHT))
        {
            Pinalytics.a(this);
            setFeedInsertionIdForLogging();
        }
    }








/*
    static boolean access$1302(FlashlightResultsFragment flashlightresultsfragment, boolean flag)
    {
        flashlightresultsfragment._shouldLoadExperience = flag;
        return flag;
    }

*/


/*
    static Runnable access$1402(FlashlightResultsFragment flashlightresultsfragment, Runnable runnable)
    {
        flashlightresultsfragment._eduRunnable = runnable;
        return runnable;
    }

*/



/*
    static List access$202(FlashlightResultsFragment flashlightresultsfragment, List list)
    {
        flashlightresultsfragment._annotationList = list;
        return list;
    }

*/






/*
    static String access$902(FlashlightResultsFragment flashlightresultsfragment, String s)
    {
        flashlightresultsfragment._searchIdentifier = s;
        return s;
    }

*/

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final FlashlightResultsFragment this$0;

        public void onEventMainThread(FlashlightEducationDismissedEvent flashlighteducationdismissedevent)
        {
            _flashlightCropView.hidePulsarsIfShown();
        }

        public void onEventMainThread(EducationEvent educationevent)
        {
            if (educationevent != null && educationevent.getType() != null && _flashlightCropView != null && educationevent.getType().equals(com.pinterest.activity.task.education.event.EducationEvent.Type.START) && EducationHelper.j())
            {
                _flashlightCropView.startFirstFlashlightExperience();
            }
        }

        public void onEventMainThread(com.pinterest.activity.task.view.MainViewPager.PageChangedEvent pagechangedevent)
        {
            if (pagechangedevent.getNavigation().getFragmentClass().equals(com/pinterest/activity/pin/fragment/PinSwipeFragment))
            {
                updateContextForLogging();
            }
        }

        _cls1()
        {
            this$0 = FlashlightResultsFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final FlashlightResultsFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            if (_annotationListAdapter == null || view == null || !(view instanceof TopicAnnotationCell) || _annotationList == null || _annotationList.isEmpty() || i < 0 || i >= _annotationList.size())
            {
                return;
            }
            adapterview = (String)_annotationList.get(i);
            if (adapterview != null)
            {
                view = new HashMap();
                view.put("label", adapterview);
                Pinalytics.a(ElementType.FLASHLIGHT_ANNOTATION, view);
            }
            if (adapterview == null || !_selectedAnnotations.contains(adapterview)) goto _L2; else goto _L1
_L1:
            _selectedAnnotations.remove(adapterview);
_L4:
            updateAnnotationsUI(false);
            loadFlashlightAnnotationResults();
            return;
_L2:
            if (_selectedAnnotations.size() < 3)
            {
                _selectedAnnotations.add(adapterview);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls2()
        {
            this$0 = FlashlightResultsFragment.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final FlashlightResultsFragment this$0;

        public void run()
        {
            if (_annotationsView != null && _annotationsView.getVisibility() == 0)
            {
                _annotationsView.smoothScrollToPositionFromOffset(0, 0, 700);
            }
        }

        _cls3()
        {
            this$0 = FlashlightResultsFragment.this;
            super();
        }
    }


    private class FlashlightFeedApiResponseHandler extends FeedApiResponseHandler
    {

        private boolean _isAnnotationRequest;
        final FlashlightResultsFragment this$0;

        private void handleAnnotations(PinterestJsonObject pinterestjsonobject)
        {
            _annotationList = new ArrayList();
            PinterestJsonArray pinterestjsonarray = pinterestjsonobject.d("annotations");
            _searchIdentifier = pinterestjsonobject.a("search_identifier", null);
            setFeedInsertionIdForLogging();
            if (pinterestjsonarray != null)
            {
                if (pinterestjsonarray.a() > 0)
                {
                    for (int i = 0; i < pinterestjsonarray.a(); i++)
                    {
                        pinterestjsonobject = pinterestjsonarray.a(i);
                        if (pinterestjsonobject != null && !StringUtils.isEmpty(pinterestjsonobject) && !_selectedAnnotations.contains(pinterestjsonobject))
                        {
                            _annotationList.add(pinterestjsonobject);
                        }
                    }

                }
                if (_isAnnotationRequest)
                {
                    if (_selectedAnnotations.size() < 3)
                    {
                        _annotationList.addAll(0, _selectedAnnotations);
                    } else
                    {
                        _annotationList.clear();
                        _annotationList.addAll(_selectedAnnotations);
                    }
                } else
                {
                    _selectedAnnotations.clear();
                }
                if (_annotationsView != null && _annotationListAdapter != null)
                {
                    updateAnnotationsUI(true);
                }
            }
        }

        public void onFinish()
        {
            super.onFinish();
            if (_loadingView != null)
            {
                _loadingView.setState(2);
            }
            if (_shouldLoadExperience && !isFragmentDead())
            {
                _shouldLoadExperience = false;
                _eduRunnable = EducationHelper.a(Placement.ANDROID_FLASHLIGHT_TAKEOVER, FlashlightResultsFragment.this);
            }
        }

        public void onStart()
        {
            if (
// JavaClassFileOutputException: get_constant: invalid tag

        public void onSuccess(final PinterestJsonObject response)
        {
            onSuccess(response);
            if (isFragmentDead())
            {
                return;
            } else
            {
                class _cls1 extends BackgroundTask
                {

                    private Feed _feed;
                    final FlashlightFeedApiResponseHandler this$1;
                    final PinterestJsonObject val$response;

                    public void onFinish()
                    {
                        super.onFinish();
                        onSuccess(_feed);
                        handleAnnotations(response);
                    }

                    public void run()
                    {
                        _feed = new PinFeed(response, 
// JavaClassFileOutputException: get_constant: invalid tag

                _cls1()
                {
                    this$1 = FlashlightFeedApiResponseHandler.this;
                    response = pinterestjsonobject;
                    BackgroundTask();
                }
                }

                (new _cls1()).execute();
                return;
            }
        }



        public FlashlightFeedApiResponseHandler()
        {
            this$0 = FlashlightResultsFragment.this;
            super();
        }

        public FlashlightFeedApiResponseHandler(FeedApiResponseHandler feedapiresponsehandler, boolean flag)
        {
            this$0 = FlashlightResultsFragment.this;
            super(feedapiresponsehandler);
            _isAnnotationRequest = flag;
        }
    }


    private class FlashlightCloseButtonEvent
    {

        public FlashlightCloseButtonEvent()
        {
        }
    }


    private class _cls4
        implements com.pinterest.activity.pin.view.PinFlashlightCropView.FlashlightCropperMoveListener
    {

        final FlashlightResultsFragment this$0;

        public void onCropperMoveEnd(RectF rectf, int i, int j)
        {
            loadFlashlightSearchResults(rectf, i, j, null);
        }

        public void onCropperMoveStart(RectF rectf, int i, int j)
        {
        }

        _cls4()
        {
            this$0 = FlashlightResultsFragment.this;
            super();
        }
    }

}
