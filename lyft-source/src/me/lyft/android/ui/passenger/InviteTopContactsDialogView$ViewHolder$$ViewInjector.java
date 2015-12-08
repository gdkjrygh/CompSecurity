// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class 
    implements butterknife.er..ViewInjector
{

    public volatile void inject(butterknife.er..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (inject)obj, obj1);
    }

    public void inject(butterknife.er..ViewInjector viewinjector, inject inject1, Object obj)
    {
        inject1.inject = (ImageView)viewinjector.imageView((View)viewinjector.imageView(obj, 0x7f0d00c6, "field 'imageView'"), 0x7f0d00c6, "field 'imageView'");
        inject1.inject = (TextView)viewinjector.textView((View)viewinjector.textView(obj, 0x7f0d0243, "field 'textView'"), 0x7f0d0243, "field 'textView'");
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public void reset(reset reset1)
    {
        reset1.reset = null;
        reset1.reset = null;
    }

    public ()
    {
    }
}
