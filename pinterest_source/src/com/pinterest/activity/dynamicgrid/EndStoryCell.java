// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.DynamicRelationship;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.FontUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PTextView;

public class EndStoryCell extends FrameLayout
{

    private android.view.View.OnClickListener _overrideClickListener;
    private DynamicStory _story;
    protected PTextView _title;
    protected FrameLayout _wrapper;

    public EndStoryCell(Context context)
    {
        this(context, null);
    }

    public EndStoryCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EndStoryCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static EndStoryCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof EndStoryCell)
        {
            return (EndStoryCell)view;
        } else
        {
            return new EndStoryCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    private void init()
    {
        inflate(getContext(), 0x7f0301ce, this);
        ButterKnife.a(this);
        FontUtils.setFont(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD, _title);
    }

    public void onClick(View view)
    {
        Pinalytics.a(EventType.TAP, ElementType.STORY_END_CELL, ComponentType.DYNAMIC_GRID_STORY, _story.getUid());
        if (_overrideClickListener != null)
        {
            _overrideClickListener.onClick(view);
            return;
        }
        if (_story.getRelationship().getActionDeepLink() != null)
        {
            Location.navigateUri(getContext(), _story.getRelationship().getActionDeepLink());
            return;
        } else
        {
            Events.post(new Navigation(Location.HOMEFEED_BUILDER_LIST));
            return;
        }
    }

    public void setBackground(int i)
    {
        _wrapper.setBackgroundResource(i);
    }

    public void setOverrideClickListener(android.view.View.OnClickListener onclicklistener)
    {
        _overrideClickListener = onclicklistener;
    }

    public void setSize(int i)
    {
        _wrapper.getLayoutParams().width = i;
        _wrapper.getLayoutParams().height = i;
    }

    public void setStory(DynamicStory dynamicstory)
    {
        _story = dynamicstory;
        if (_story.getRelationship() != null && _story.getRelationship().getActionText() != null)
        {
            _title.setText(_story.getRelationship().getActionText());
            return;
        } else
        {
            _title.setText(Resources.string(0x7f0704fb));
            return;
        }
    }

    public void setTitleColor(int i)
    {
        _title.setTextColor(i);
    }

    public void setTitleText(String s)
    {
        _title.setText(s);
    }
}
