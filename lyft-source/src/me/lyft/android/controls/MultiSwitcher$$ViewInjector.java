// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

// Referenced classes of package me.lyft.android.controls:
//            MultiSwitcher

public class 
    implements butterknife.ViewInjector
{

    public volatile void inject(butterknife.ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (MultiSwitcher)obj, obj1);
    }

    public void inject(butterknife.ViewInjector viewinjector, MultiSwitcher multiswitcher, Object obj)
    {
        multiswitcher.thumbView = (ViewGroup)viewinjector.humbView((View)viewinjector.humbView(obj, 0x7f0d03af, "field 'thumbView'"), 0x7f0d03af, "field 'thumbView'");
        multiswitcher.itemsPlaceHolder = (LinearLayout)viewinjector.temsPlaceHolder((View)viewinjector.temsPlaceHolder(obj, 0x7f0d03ae, "field 'itemsPlaceHolder'"), 0x7f0d03ae, "field 'itemsPlaceHolder'");
    }

    public volatile void reset(Object obj)
    {
        reset((MultiSwitcher)obj);
    }

    public void reset(MultiSwitcher multiswitcher)
    {
        multiswitcher.thumbView = null;
        multiswitcher.itemsPlaceHolder = null;
    }

    public ()
    {
    }
}
