// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.progress.LoadingView;
import com.pinterest.ui.text.PTextView;
import org.apache.commons.lang3.StringUtils;

public class ExploreContextualSectionFooter extends FrameLayout
{

    FrameLayout _container;
    private LoadingView _spinner;
    PTextView _title;

    public ExploreContextualSectionFooter(Context context)
    {
        this(context, null);
    }

    public ExploreContextualSectionFooter(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ExploreContextualSectionFooter(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public static ExploreContextualSectionFooter get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof ExploreContextualSectionFooter))
        {
            return new ExploreContextualSectionFooter(ViewHelper.getContext(view, viewgroup));
        } else
        {
            return (ExploreContextualSectionFooter)view;
        }
    }

    private void resetViews()
    {
        _spinner.setState(8);
        ViewHelper.setVisibility(_title, 0);
    }

    protected void init()
    {
        inflate(getContext(), 0x7f03009f, this);
        ButterKnife.a(this);
        _title = (PTextView)findViewById(0x7f0f0077);
        _spinner = (LoadingView)findViewById(0x7f0f01d0);
        _title.setText(Resources.string(0x7f070186));
        _title.setCompoundDrawablesWithIntrinsicBounds(null, null, Resources.drawable(0x7f020189), null);
        _title.setIconTint(Resources.color(0x7f0e00a9));
    }

    public void setLoading()
    {
        ViewHelper.setVisibility(_title, 8);
        _spinner.setState(0);
    }

    public void setTitle(String s)
    {
        if (StringUtils.isNotEmpty(s))
        {
            _title.setText(s);
        }
    }

    public void showFooter(boolean flag)
    {
        if (!flag)
        {
            resetViews();
        }
        ViewHelper.setVisibility(_container, flag);
    }
}
