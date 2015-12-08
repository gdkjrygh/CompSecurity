// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.SearchCarouselAdapter;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.ImpressionView;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.StoryImpression;
import org.lucasr.twowayview.TwoWayView;

public class SearchCarouselView extends LinearLayout
    implements ImpressionView
{

    private SearchCarouselAdapter _adapter;
    TwoWayView _horizontalList;
    private StoryImpression _impression;
    private long _impressionStart;
    private String _lastQuery;
    Button _shopBt;
    private DynamicStory _story;
    TextView _title;

    public SearchCarouselView(Context context)
    {
        this(context, null);
    }

    public SearchCarouselView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SearchCarouselView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301fc, this, true);
        ButterKnife.a(this);
        setOrientation(1);
        setBackgroundResource(0x7f0e0015);
        _adapter = new SearchCarouselAdapter();
        _horizontalList.setOrientation(org.lucasr.twowayview.TwoWayView.Orientation.HORIZONTAL);
        _horizontalList.setSelector(0x7f020275);
    }

    public StoryImpression markImpressionEnd()
    {
        if (_impression == null)
        {
            return null;
        } else
        {
            StoryImpression storyimpression = _impression;
            storyimpression.setIdStr(_story.getUid());
            storyimpression.setEndTime(System.currentTimeMillis() * 0xf4240L);
            storyimpression.setItemCount((short)_story.getObjectsCount());
            storyimpression.setVisibleCount((short)_adapter.getVisibleCount());
            _impressionStart = 0L;
            return storyimpression;
        }
    }

    public volatile Object markImpressionEnd()
    {
        return markImpressionEnd();
    }

    public void markImpressionStart()
    {
        _impressionStart = System.currentTimeMillis() * 0xf4240L;
        _impression = new StoryImpression();
        _impression.setTime(_impressionStart);
    }

    void onShopMoreClicked(View view)
    {
        Events.post(new Navigation(Location.SEARCH_PIN_COMMERCE, _lastQuery));
    }

    public void setLastQuery(String s)
    {
        _lastQuery = s;
    }

    public void setStory(DynamicStory dynamicstory)
    {
        if (dynamicstory == null)
        {
            return;
        } else
        {
            _story = dynamicstory;
            _adapter.setDataSource(dynamicstory, _lastQuery);
            _horizontalList.setAdapter(_adapter);
            return;
        }
    }
}
