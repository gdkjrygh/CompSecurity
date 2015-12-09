// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        .yout = (LinearLayout)ctor.ageLayout((View)ctor.ageLayout(obj, 0x7f0e04e4, "field 'trackPackageLayout'"), 0x7f0e04e4, "field 'trackPackageLayout'");
        .yout = (TextView)ctor.pe((View)ctor.pe(obj, 0x7f0e04e5, "field 'carrierType'"), 0x7f0e04e5, "field 'carrierType'");
        .yout = (TextView)ctor.us((View)ctor.us(obj, 0x7f0e04e6, "field 'trackStatus'"), 0x7f0e04e6, "field 'trackStatus'");
        .yout = (TextView)ctor.od((View)ctor.od(obj, 0x7f0e04e7, "field 'trackMethod'"), 0x7f0e04e7, "field 'trackMethod'");
        . = (TextView)ctor.umber((View)ctor.umber(obj, 0x7f0e0385, "field 'trackingNumber'"), 0x7f0e0385, "field 'trackingNumber'");
        .tton = (Button)ctor.ageButton((View)ctor.ageButton(obj, 0x7f0e04e8, "field 'trackPackageButton'"), 0x7f0e04e8, "field 'trackPackageButton'");
        . = (TextView)ctor.rDate((View)ctor.rDate(obj, 0x7f0e04ea, "field 'trackOrderDate'"), 0x7f0e04ea, "field 'trackOrderDate'");
        .Layout = (LinearLayout)ctor.rDateLayout((View)ctor.rDateLayout(obj, 0x7f0e04e9, "field 'trackOrderDateLayout'"), 0x7f0e04e9, "field 'trackOrderDateLayout'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.yout = null;
        inject1.yout = null;
        inject1.yout = null;
        inject1.yout = null;
        inject1. = null;
        inject1.tton = null;
        inject1. = null;
        inject1.Layout = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
