// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PromoBannerView

public class 
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PromoBannerView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, PromoBannerView promobannerview, Object obj)
    {
        promobannerview.bannerTextView = (TextView)viewinjector.bannerTextView((View)viewinjector.bannerTextView(obj, 0x7f0d037e, "field 'bannerTextView'"), 0x7f0d037e, "field 'bannerTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((PromoBannerView)obj);
    }

    public void reset(PromoBannerView promobannerview)
    {
        promobannerview.bannerTextView = null;
    }

    public ()
    {
    }
}
