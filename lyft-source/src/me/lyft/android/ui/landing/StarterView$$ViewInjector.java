// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;

// Referenced classes of package me.lyft.android.ui.landing:
//            StarterView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (StarterView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, StarterView starterview, Object obj)
    {
        starterview.lyftLogo = (View)viewinjector.lyftLogo(obj, 0x7f0d0081, "field 'lyftLogo'");
        starterview.splashView = (View)viewinjector.splashView(obj, 0x7f0d007a, "field 'splashView'");
    }

    public volatile void reset(Object obj)
    {
        reset((StarterView)obj);
    }

    public void reset(StarterView starterview)
    {
        starterview.lyftLogo = null;
        starterview.splashView = null;
    }

    public ()
    {
    }
}
