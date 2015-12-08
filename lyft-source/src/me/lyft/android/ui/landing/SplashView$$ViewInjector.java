// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package me.lyft.android.ui.landing:
//            SplashView

public class _cls9
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (SplashView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, SplashView splashview, Object obj)
    {
        splashview.logoView = (ImageView)viewinjector.logoView((View)viewinjector.logoView(obj, 0x7f0d03e6, "field 'logoView'"), 0x7f0d03e6, "field 'logoView'");
    }

    public volatile void reset(Object obj)
    {
        reset((SplashView)obj);
    }

    public void reset(SplashView splashview)
    {
        splashview.logoView = null;
    }

    public _cls9()
    {
    }
}
