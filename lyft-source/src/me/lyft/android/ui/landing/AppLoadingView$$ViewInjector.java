// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;

// Referenced classes of package me.lyft.android.ui.landing:
//            AppLoadingView, SplashView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (AppLoadingView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, AppLoadingView apploadingview, Object obj)
    {
        apploadingview.splashView = (SplashView)viewinjector.splashView((View)viewinjector.splashView(obj, 0x7f0d007a, "field 'splashView'"), 0x7f0d007a, "field 'splashView'");
    }

    public volatile void reset(Object obj)
    {
        reset((AppLoadingView)obj);
    }

    public void reset(AppLoadingView apploadingview)
    {
        apploadingview.splashView = null;
    }

    public ()
    {
    }
}
