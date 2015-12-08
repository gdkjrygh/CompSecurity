// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest.view;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.activity.explore.adapter.ExploreSubInterestsAdapter;
import com.pinterest.activity.interest.adapter.RelatedInterestsAdapter;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.experiment.Experiments;
import org.lucasr.twowayview.TwoWayView;

public class RelatedInterestsView extends TwoWayView
{

    private String _apiTag;
    private String _contentId;
    private InterestsFeed _interests;
    private PinterestBaseAdapter _interestsAdapter;
    private int _maxInterests;

    public RelatedInterestsView(Context context)
    {
        this(context, null);
    }

    public RelatedInterestsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RelatedInterestsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        setOrientation(org.lucasr.twowayview.TwoWayView.Orientation.HORIZONTAL);
        if (Experiments.j())
        {
            _interestsAdapter = new ExploreSubInterestsAdapter();
        } else
        {
            _interestsAdapter = new RelatedInterestsAdapter();
        }
        setAdapter(_interestsAdapter);
        setSelector(0x106000d);
        setOnItemClickListener(new _cls1());
        setHorizontalScrollBarEnabled(false);
    }

    private void loadData()
    {
        _cls2 _lcls2 = new _cls2();
        InterestsApi.a(_contentId, _maxInterests, _lcls2, _apiTag);
    }

    private void updateView()
    {
        if (_interests == null)
        {
            return;
        }
        byte byte0;
        if (_interests.getCount() == 0)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        setVisibility(byte0);
    }

    public int getMaxInterests()
    {
        return _maxInterests;
    }

    public boolean hasInterests()
    {
        return _interests != null && _interests.getCount() > 0;
    }

    protected void onDetachedFromWindow()
    {
        setAdapter(null);
        super.onDetachedFromWindow();
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setContentId(String s)
    {
        if (_contentId != null)
        {
            return;
        } else
        {
            _contentId = s;
            loadData();
            return;
        }
    }

    public void setMaxInterests(int i)
    {
        _maxInterests = i;
    }




/*
    static InterestsFeed access$102(RelatedInterestsView relatedinterestsview, InterestsFeed interestsfeed)
    {
        relatedinterestsview._interests = interestsfeed;
        return interestsfeed;
    }

*/

    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final RelatedInterestsView this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = new HashMap();
            view = (Interest)_interestsAdapter.getItem(i);
            if (view == null)
            {
                return;
            } else
            {
                adapterview.put("interest", view.getUrlName());
                Pinalytics.a(ElementType.FLOWED_INTEREST, ComponentType.INTEREST_RELATED_CAROUSEL, adapterview);
                StopWatch.get().start("interest_ttrfp");
                Events.post(new Navigation(Location.INTEREST, view));
                return;
            }
        }

        _cls1()
        {
            this$0 = RelatedInterestsView.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse
    {

        final RelatedInterestsView this$0;

        public void onSuccess(Feed feed)
        {
            _interests = (InterestsFeed)feed;
            _interestsAdapter.setDataSource(_interests);
            if (_interests.getCount() != 0)
            {
                setVisibility(0);
            }
        }

        _cls2()
        {
            this$0 = RelatedInterestsView.this;
            super();
        }
    }

}
