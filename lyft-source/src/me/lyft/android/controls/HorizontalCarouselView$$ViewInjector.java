// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package me.lyft.android.controls:
//            HorizontalCarouselView

public class 
    implements butterknife.ViewInjector
{

    public volatile void inject(butterknife.ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (HorizontalCarouselView)obj, obj1);
    }

    public void inject(butterknife.ViewInjector viewinjector, HorizontalCarouselView horizontalcarouselview, Object obj)
    {
        horizontalcarouselview.containerView = (LinearLayout)viewinjector.ontainerView((View)viewinjector.ontainerView(obj, 0x7f0d0237, "field 'containerView'"), 0x7f0d0237, "field 'containerView'");
    }

    public volatile void reset(Object obj)
    {
        reset((HorizontalCarouselView)obj);
    }

    public void reset(HorizontalCarouselView horizontalcarouselview)
    {
        horizontalcarouselview.containerView = null;
    }

    public ()
    {
    }
}
