// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.GridView;
import butterknife.ButterKnife;
import com.pinterest.activity.search.adapter.ActionFilterGridAdapter;
import com.pinterest.api.model.FilterOption;
import com.pinterest.ui.listview.SolidTitleDivider;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class GuidedSearchFilterHeader extends FrameLayout
{

    private ActionFilterGridAdapter _actionFilterGridAdapter;
    GridView _optionsGv;
    SolidTitleDivider _topCategoryTitle;

    public GuidedSearchFilterHeader(Context context)
    {
        this(context, null);
    }

    public GuidedSearchFilterHeader(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public FilterOption getItem(int i)
    {
        return _actionFilterGridAdapter.getItem(i);
    }

    protected void init()
    {
        inflate(getContext(), 0x7f030086, this);
        ButterKnife.a(this);
        _actionFilterGridAdapter = new ActionFilterGridAdapter(getContext());
        _optionsGv.setAdapter(_actionFilterGridAdapter);
    }

    public void setGridStretchMode(int i)
    {
        _optionsGv.setStretchMode(i);
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        _optionsGv.setOnItemClickListener(onitemclicklistener);
    }

    public void setTitleText(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            _topCategoryTitle.setVisibility(8);
            return;
        } else
        {
            _topCategoryTitle.setVisibility(0);
            _topCategoryTitle.setText(s);
            return;
        }
    }

    public void updateData(List list, String s)
    {
        _actionFilterGridAdapter.updateData(list);
        setTitleText(s);
    }
}
