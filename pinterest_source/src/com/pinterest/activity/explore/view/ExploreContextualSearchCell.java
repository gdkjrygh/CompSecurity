// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.explore.util.ExploreStoryCell;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.ImpressionView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.ContextualSearchObject;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.SearchImpression;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.ProportionalImageView;
import java.util.HashMap;

public class ExploreContextualSearchCell extends FrameLayout
    implements ExploreStoryCell, ImpressionView
{

    ContextualSearchObject _contextualSearchObject;
    ProportionalImageView _imageView;
    private SearchImpression _impression;
    private long _impressionStart;
    private int _slotPosition;
    private String _storyId;
    private int _storyPosition;
    TextView _title;

    public ExploreContextualSearchCell(Context context)
    {
        this(context, null);
    }

    public ExploreContextualSearchCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static ExploreContextualSearchCell get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof ExploreContextualSearchCell))
        {
            return new ExploreContextualSearchCell(ViewHelper.getContext(view, viewgroup));
        } else
        {
            return (ExploreContextualSearchCell)view;
        }
    }

    private void updateUI()
    {
        _title.setText(_contextualSearchObject.getTitle());
        _imageView.loadUrl(_contextualSearchObject.getPin().getImageMediumUrl());
    }

    public SearchImpression getImpression()
    {
        return _impression;
    }

    protected void init()
    {
        inflate(getContext(), 0x7f03009e, this);
        ButterKnife.a(this);
        _imageView = (ProportionalImageView)findViewById(0x7f0f01ce);
    }

    public Object markImpressionEnd()
    {
        if (_impression == null || _contextualSearchObject == null)
        {
            return null;
        } else
        {
            SearchImpression searchimpression = _impression;
            searchimpression.setTerm(_contextualSearchObject.getTitle());
            searchimpression.setEndTime(System.currentTimeMillis() * 0xf4240L);
            searchimpression.setSlotIndex((short)_slotPosition);
            searchimpression.setStoryIndex((short)_storyPosition);
            _impressionStart = 0L;
            return searchimpression;
        }
    }

    public void markImpressionStart()
    {
        _impressionStart = System.currentTimeMillis() * 0xf4240L;
        _impression = new SearchImpression();
        _impression.setTime(_impressionStart);
    }

    public void onSearchCellClicked(View view)
    {
        view = new HashMap();
        view.put("grid_index", String.valueOf(_slotPosition));
        view.put("story_index", String.valueOf(_storyPosition));
        view.put("story_id", _storyId);
        view.put("image_signature", _contextualSearchObject.getPin().getImageSignature());
        Pinalytics.a(ElementType.CONTEXTUAL_STORY_USER, ComponentType.CONTEXTUAL_STORY, null, view);
        view = new Navigation(Location.SEARCH, _contextualSearchObject.getTitle());
        view.putStringParcelable("com.pinterest.EXTRA_SEARCH_CONTEXT", "VALUE_CONTEXTUAL");
        Events.post(view);
    }

    public void setContextualSearchObject(ContextualSearchObject contextualsearchobject)
    {
        if (contextualsearchobject == null)
        {
            return;
        } else
        {
            _contextualSearchObject = contextualsearchobject;
            updateUI();
            return;
        }
    }

    public void setSlotPosition(int i)
    {
        _slotPosition = i;
    }

    public void setStoryId(String s)
    {
        _storyId = s;
    }

    public void setStoryPosition(int i)
    {
        _storyPosition = i;
    }
}
