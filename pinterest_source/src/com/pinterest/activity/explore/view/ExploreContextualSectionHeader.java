// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.ui.ViewHelper;
import org.apache.commons.lang3.StringUtils;

public class ExploreContextualSectionHeader extends LinearLayout
{

    TextView _subtitleEt;
    TextView _titleEt;

    public ExploreContextualSectionHeader(Context context)
    {
        this(context, null);
    }

    public ExploreContextualSectionHeader(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ExploreContextualSectionHeader(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static ExploreContextualSectionHeader get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof ExploreContextualSectionHeader))
        {
            return new ExploreContextualSectionHeader(ViewHelper.getContext(view, viewgroup));
        } else
        {
            return (ExploreContextualSectionHeader)view;
        }
    }

    protected void init()
    {
        inflate(getContext(), 0x7f0300a0, this);
        ButterKnife.a(this);
    }

    public void setSubTitle(String s)
    {
        if (StringUtils.isNotEmpty(s))
        {
            ViewHelper.setVisibility(_subtitleEt, 0);
            _subtitleEt.setText(s);
            return;
        } else
        {
            ViewHelper.setVisibility(_subtitleEt, 8);
            return;
        }
    }

    public void setTitle(String s)
    {
        if (StringUtils.isNotEmpty(s))
        {
            _titleEt.setText(s);
        }
    }
}
