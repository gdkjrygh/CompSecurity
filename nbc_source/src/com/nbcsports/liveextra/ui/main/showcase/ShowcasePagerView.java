// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.showcase;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import com.phunware.nbc.sochi.customview.LinePageIndicator;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.main.showcase:
//            ShowcasePagerAdapter, ShowcasePresenter

public class ShowcasePagerView extends LinearLayout
{

    private ShowcasePagerAdapter adapter;
    Configuration config;
    LinePageIndicator indicator;
    ViewPager pager;
    ShowcasePresenter presenter;

    public ShowcasePagerView(Context context)
    {
        this(context, null);
    }

    public ShowcasePagerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ShowcasePagerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        MainNavigationContentActivity.component().inject(this);
    }

    public void bind(List list)
    {
        FragmentActivity fragmentactivity;
        for (fragmentactivity = (FragmentActivity)getContext(); fragmentactivity == null || fragmentactivity.isFinishing() || android.os.Build.VERSION.SDK_INT >= 17 && fragmentactivity.isDestroyed();)
        {
            return;
        }

        byte byte0;
        if (list.isEmpty())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        setVisibility(byte0);
        if (adapter == null)
        {
            adapter = new ShowcasePagerAdapter(fragmentactivity.getSupportFragmentManager());
            pager.setAdapter(adapter);
            indicator.setViewPager(pager);
        }
        adapter.update(list);
    }

    public ShowcasePresenter getPresenter()
    {
        return presenter;
    }

    public void hide()
    {
        setVisibility(8);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        ButterKnife.bind(this);
        presenter.bindView(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.unbind(this);
        presenter.releaseView();
    }

    public void show()
    {
        setVisibility(0);
    }
}
