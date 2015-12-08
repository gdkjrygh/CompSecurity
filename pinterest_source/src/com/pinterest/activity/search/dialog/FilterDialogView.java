// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.dialog;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.search.adapter.ActionFilterAdapter;
import com.pinterest.activity.search.event.GuidedSearchEvent;
import com.pinterest.activity.search.ui.GuidedSearchFilterHeader;
import com.pinterest.activity.search.ui.GuidedSearchFilterTransparent;
import com.pinterest.activity.task.event.DialogHideEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.FilterOption;
import com.pinterest.api.model.ModelAccessCache;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.SearchFilter;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ElementType;
import java.util.ArrayList;
import java.util.HashMap;

public class FilterDialogView extends FrameLayout
{

    private static int NUM_TOP_RESULTS_TO_DISPLAY = 3;
    private ActionFilterAdapter _actionFilterListAdapter;
    View _anchor;
    LinearLayout _contentViewOuter;
    LinearLayout _contentViewWrapper;
    private String _filterImageUrl;
    private String _filterName;
    private ArrayList _filterOptions;
    private String _filterType;
    GuidedSearchFilterTransparent _guide;
    private int _guideXOffset;
    private GuidedSearchFilterHeader _guidedSearchFilterHeader;
    private String _mainOptionsTitle;
    ListView _optionsLv;
    private int _position;
    FrameLayout _spacer;
    private int _spacerHeight;
    FrameLayout _spacerTop;
    private int _spacerTopHeight;
    private ArrayList _topFilterOptions;
    private String _topOptionsTitle;
    private android.widget.AdapterView.OnItemClickListener onFilterClicked;
    private android.widget.AdapterView.OnItemClickListener onTopFilterItemClicked;

    public FilterDialogView(Context context)
    {
        this(context, null);
    }

    public FilterDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onFilterClicked = new _cls3();
        onTopFilterItemClicked = new _cls4();
        init();
    }

    private void closeDialog()
    {
        Animation animation = getScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, false);
        _contentViewOuter.startAnimation(animation);
        animation.setAnimationListener(new _cls2());
    }

    private int getNumCols(int i)
    {
        return i / ((int)Resources.dimension(0x7f0a01b3) + (int)Resources.dimension(0x7f0a01b2));
    }

    private Animation getScaleAnimation(float f, float f1, float f2, float f3, boolean flag)
    {
        float f5 = (float)_guideXOffset + getResources().getDimension(0x7f0a01ba) / 2.0F;
        float f4 = f5;
        if (_position == 0)
        {
            f4 = f5 + getResources().getDimension(0x7f0a015f);
        }
        ScaleAnimation scaleanimation = new ScaleAnimation(f, f1, f2, f3, f4, 0.0F);
        scaleanimation.setFillAfter(true);
        scaleanimation.setFillEnabled(true);
        scaleanimation.setDuration(getResources().getInteger(0x7f0d000e));
        scaleanimation.setInterpolator(new OvershootInterpolator(2.0F));
        AnimationSet animationset = new AnimationSet(true);
        animationset.addAnimation(scaleanimation);
        if (flag)
        {
            animationset.addAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f04000d));
            return animationset;
        } else
        {
            animationset.addAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f040011));
            return animationset;
        }
    }

    private void performFilter(FilterOption filteroption)
    {
        if (filteroption == null)
        {
            return;
        } else
        {
            GuidedSearchEvent guidedsearchevent = new GuidedSearchEvent(null, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
            guidedsearchevent.setActionFilter(new SearchFilter(filteroption.getId(), ModelHelper.defaultCacheExpirationDate(), _filterType, filteroption.getDisplayName(), filteroption.getTypeValue(), null, null, null));
            HashMap hashmap = new HashMap();
            hashmap.put("filter_type", _filterType);
            hashmap.put("label", filteroption.getTypeValue());
            Pinalytics.a(ElementType.SEARCH_FILTER_SUGGESTION, hashmap);
            guidedsearchevent.setDominantColor(filteroption.getDominantColorWithDefault());
            guidedsearchevent.setForceRefresh(true);
            StopWatch.get().start("search_ttrfp");
            Events.post(guidedsearchevent);
            Events.post(new DialogHideEvent());
            return;
        }
    }

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f030087, this, true);
        ButterKnife.a(this);
        _actionFilterListAdapter = new ActionFilterAdapter(getContext());
        _guidedSearchFilterHeader = new GuidedSearchFilterHeader(_optionsLv.getContext());
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (com.pinterest.api.model.SearchFilter.FilterType.BRAND.getValue().equalsIgnoreCase(_filterType))
        {
            _guidedSearchFilterHeader.updateData(_topFilterOptions.subList(0, Math.min(_topFilterOptions.size(), getNumCols(i))), _topOptionsTitle);
        }
    }

    public void onSpacerClicked(View view)
    {
        closeDialog();
    }

    public void onSpacerTopClicked(View view)
    {
        closeDialog();
    }

    public void setFilter(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        }
        _filterType = bundle.getString("filterType");
        _filterName = bundle.getString("filterName");
        _filterImageUrl = bundle.getString("filterImageUrl");
        _filterOptions = ModelAccessCache.fromIdList(bundle.getStringArrayList("filterOptionIds"));
        _topFilterOptions = ModelAccessCache.fromIdList(bundle.getStringArrayList("topFilterOptionIds"));
        _position = bundle.getInt("position");
        _spacerHeight = bundle.getInt("height");
        _guideXOffset = bundle.getInt("offset");
        _mainOptionsTitle = bundle.getString("mainOptionsTitle");
        _topOptionsTitle = bundle.getString("topOptionsTitle");
        updateUI();
        _optionsLv.setAdapter(null);
        _optionsLv.removeHeaderView(_guidedSearchFilterHeader);
        if (com.pinterest.api.model.SearchFilter.FilterType.SALIENT_COLOR.getValue().equalsIgnoreCase(_filterType))
        {
            _guidedSearchFilterHeader.updateData(_filterOptions, _mainOptionsTitle);
            _guidedSearchFilterHeader.setOnItemClickListener(onTopFilterItemClicked);
            bundle = _contentViewWrapper;
            GuidedSearchFilterHeader guidedsearchfilterheader = _guidedSearchFilterHeader;
            int i;
            if (_contentViewWrapper.getChildCount() == 0)
            {
                i = 0;
            } else
            {
                i = _contentViewWrapper.getChildCount() - 1;
            }
            bundle.addView(guidedsearchfilterheader, i);
            return;
        }
        _contentViewOuter.removeView(_guidedSearchFilterHeader);
        if (com.pinterest.api.model.SearchFilter.FilterType.BRAND.getValue().equalsIgnoreCase(_filterType))
        {
            _guidedSearchFilterHeader.setOnItemClickListener(onTopFilterItemClicked);
            _optionsLv.addHeaderView(_guidedSearchFilterHeader);
            _actionFilterListAdapter.updateData(_filterOptions, _mainOptionsTitle, null, null);
            _guidedSearchFilterHeader.updateData(_topFilterOptions, _topOptionsTitle);
        } else
        if (_topFilterOptions != null && _topFilterOptions.size() > 0)
        {
            _actionFilterListAdapter.updateData(_filterOptions, _mainOptionsTitle, _topFilterOptions, _topOptionsTitle);
        } else
        {
            _actionFilterListAdapter.updateData(_filterOptions, _mainOptionsTitle, null, null);
        }
        _optionsLv.setOnItemClickListener(onFilterClicked);
        _optionsLv.setAdapter(_actionFilterListAdapter);
    }

    public void updateUI()
    {
        _spacerTopHeight = (int)(Resources.dimension(0x7f0a01c3) + (float)Constants.MARGIN);
        _spacerTop.getLayoutParams().height = _spacerTopHeight;
        GuidedSearchFilterTransparent guidedsearchfiltertransparent = _guide;
        boolean flag;
        if (_position == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        guidedsearchfiltertransparent.setFirstFilter(flag);
        _guide.setX(_guideXOffset);
        _guide.setFilterName(_filterName);
        _guide.setFilterType(_filterType);
        _guide.setFilterImageUrl(_filterImageUrl);
        _guide.updateUI();
        _contentViewOuter.startAnimation(getScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, true));
        post(new _cls1());
    }







    private class _cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final FilterDialogView this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            int j = _optionsLv.getHeaderViewsCount();
            if (i >= j && j > 0)
            {
                performFilter(_actionFilterListAdapter.getItem(i - j));
                return;
            } else
            {
                performFilter(_actionFilterListAdapter.getItem(i));
                return;
            }
        }

        _cls3()
        {
            this$0 = FilterDialogView.this;
            super();
        }
    }


    private class _cls4
        implements android.widget.AdapterView.OnItemClickListener
    {

        final FilterDialogView this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            performFilter(_guidedSearchFilterHeader.getItem(i));
        }

        _cls4()
        {
            this$0 = FilterDialogView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.animation.Animation.AnimationListener
    {

        final FilterDialogView this$0;

        public void onAnimationEnd(Animation animation)
        {
            Events.post(new DialogHideEvent());
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
        }

        _cls2()
        {
            this$0 = FilterDialogView.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final FilterDialogView this$0;

        public void run()
        {
            int j = (_guideXOffset + _guide.getMeasuredWidth() / 2) - _anchor.getMeasuredWidth() / 2;
            int i = j;
            if (_position == 0)
            {
                i = (int)((float)j + Resources.dimension(0x7f0a015f) / 2.0F);
            }
            _anchor.setX(i);
        }

        _cls1()
        {
            this$0 = FilterDialogView.this;
            super();
        }
    }

}
