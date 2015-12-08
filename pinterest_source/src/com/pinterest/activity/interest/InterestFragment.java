// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.category.fragment.CategoryFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.ApiFields;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.actionbar.ActionBar;
import com.pinterest.ui.actionbar.MetadataBar;
import com.pinterest.ui.grid.PinterestGridView;

public class InterestFragment extends CategoryFragment
{

    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    MetadataBar _floatingMetadataBar;
    private Interest _interest;
    private MetadataBar _metadataBar;
    private com.pinterest.api.remote.InterestsApi.InterestApiResponseHandler onInterestLoaded;

    public InterestFragment()
    {
        onInterestLoaded = new _cls3(false);
        _eventsSubscriber = new _cls4();
        Experiments.a("interests_feed_blended_pin_annotation_android2");
        if (Experiments.o())
        {
            ((PinGridAdapter)_adapter).setForceShowInterest(true);
        }
    }

    private void updateMetadataBarState()
    {
        if (getView() == null || _floatingMetadataBar == null || _gridVw == null || _metadataBar == null)
        {
            return;
        }
        int ai[] = new int[2];
        _metadataBar.getLocationOnScreen(ai);
        int ai1[] = new int[2];
        _floatingMetadataBar.getLocationOnScreen(ai1);
        if (ai[1] > ai1[1])
        {
            _floatingMetadataBar.setVisibility(4);
            _metadataBar.setVisibility(0);
            return;
        } else
        {
            _floatingMetadataBar.setVisibility(0);
            _metadataBar.setVisibility(4);
            _floatingMetadataBar.setTranslationY((float)_actionBar.getHeight() - Math.abs(_actionBarWrapper.getY()));
            return;
        }
    }

    public String getContentId()
    {
        if (_interest != null)
        {
            return _interest.getUid();
        } else
        {
            return null;
        }
    }

    public Model getContentModel()
    {
        return _interest;
    }

    public String getContentTitle()
    {
        if (_interest != null)
        {
            return _interest.getName();
        } else
        {
            return null;
        }
    }

    public Interest getInterest()
    {
        return _interest;
    }

    protected String getStopwatchKey()
    {
        return "interest_ttrfp";
    }

    protected void loadData()
    {
        if (_interest == null)
        {
            return;
        } else
        {
            InterestsApi.a(_interest.getUid(), new com.pinterest.api.remote.PinApi.PinFeedApiResponse(gridResponseHandler), getApiTag());
            InterestsApi.a(_interest.getUid(), onInterestLoaded, ApiFields.u, getApiTag());
            return;
        }
    }

    public void onDestroyView()
    {
        _metadataBar = null;
        _floatingMetadataBar = null;
        Events.post(new com.pinterest.kit.utils.GifDecoder.CancelGifDecodeTaskEvent());
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/api/model/Interest$UpdateEvent
        });
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        if (_interest == null)
        {
            return;
        }
        Experiments.a("topical_feeds_android");
        if (Experiments.j())
        {
            _addRelatedInterests = false;
            MyUser.addLastUsedInterest(_interest.getUid());
        }
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(_interest.getName());
        _floatingMetadataBar.postDelayed(new _cls1(), 1L);
        _metadataBar = new MetadataBar(view.getContext());
        _metadataBar.setModel(_interest);
        _floatingMetadataBar.setModel(_interest);
        _gridVw.addHeaderView(_metadataBar, -1, -2);
        if (Experiments.j())
        {
            addRelatedInterestsHeader(view);
        }
        _gridVw.addListener(new _cls2());
        view = new View(view.getContext());
        view.setBackgroundColor(Resources.color(0x7f0e0074));
        _gridVw.addHeaderView(view, -1, (int)Resources.dimension(0x7f0a0134));
        Events.register(_eventsSubscriber, com/pinterest/api/model/Interest$UpdateEvent, new Class[0]);
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _interest = navigation.getModelAsInterest();
    }

    protected void stopStopwatch()
    {
        StopWatch.get().complete(getStopwatchKey());
    }




/*
    static Interest access$102(InterestFragment interestfragment, Interest interest)
    {
        interestfragment._interest = interest;
        return interest;
    }

*/


    private class _cls3 extends com.pinterest.api.remote.InterestsApi.InterestApiResponseHandler
    {

        final InterestFragment this$0;

        public void onSuccess(Interest interest)
        {
            if (interest != null)
            {
                _interest = interest;
                if (_metadataBar != null)
                {
                    _metadataBar.setModel(_interest);
                }
                if (_floatingMetadataBar != null)
                {
                    _floatingMetadataBar.setModel(_interest);
                }
            }
        }

        _cls3(boolean flag)
        {
            this$0 = InterestFragment.this;
            super(flag);
        }
    }


    private class _cls4
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final InterestFragment this$0;

        public void onEventMainThread(com.pinterest.api.model.Interest.UpdateEvent updateevent)
        {
            updateevent = updateevent.getInterest();
            if (updateevent != null && _interest != null && updateevent.getUid() == _interest.getUid())
            {
                _interest = updateevent;
                if (_metadataBar != null)
                {
                    _metadataBar.setModel(_interest);
                }
                if (_floatingMetadataBar != null)
                {
                    _floatingMetadataBar.setModel(_interest);
                    return;
                }
            }
        }

        _cls4()
        {
            this$0 = InterestFragment.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final InterestFragment this$0;

        public void run()
        {
            updateMetadataBarState();
        }

        _cls1()
        {
            this$0 = InterestFragment.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final InterestFragment this$0;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            updateMetadataBarState();
        }

        _cls2()
        {
            this$0 = InterestFragment.this;
            super();
        }
    }

}
