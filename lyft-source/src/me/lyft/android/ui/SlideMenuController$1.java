// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import me.lyft.android.analytics.ScreenAnalytics;

// Referenced classes of package me.lyft.android.ui:
//            SlideMenuController

class this._cls0
    implements android.support.v4.widget.tener
{

    final SlideMenuController this$0;

    public void onDrawerClosed(View view)
    {
        ScreenAnalytics.trackMenuClose();
    }

    public void onDrawerOpened(View view)
    {
        ScreenAnalytics.trackMenuOpen();
    }

    public void onDrawerSlide(View view, float f)
    {
    }

    public void onDrawerStateChanged(int i)
    {
    }

    ()
    {
        this$0 = SlideMenuController.this;
        super();
    }
}
