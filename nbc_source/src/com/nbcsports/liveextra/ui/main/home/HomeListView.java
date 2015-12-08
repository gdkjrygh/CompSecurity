// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.nbcsports.liveextra.ui.main.core.ContentListPresenter;
import com.nbcsports.liveextra.ui.main.core.ContentListView;
import com.phunware.nbc.sochi.MainNavigationContentActivity;

// Referenced classes of package com.nbcsports.liveextra.ui.main.home:
//            HomeListPresenter

public class HomeListView extends ContentListView
{

    HomeListPresenter presenter;

    public HomeListView(Context context)
    {
        super(context);
    }

    public HomeListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public HomeListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected ContentListPresenter getPresenter()
    {
        return presenter;
    }

    protected void inject()
    {
        MainNavigationContentActivity.component().inject(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        presenter.bindView(this);
        timelineWrapper.setVisibility(8);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        presenter.releaseView();
    }

    public void onHideTimeline()
    {
        super.onHideTimeline();
        presenter.onHideTimeline();
    }

    public void onShowTimeline()
    {
        super.onShowTimeline();
        presenter.onShowTimeline();
    }
}
