// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        . = (TextView)ctor.umber((View)ctor.umber(obj, 0x7f0e0385, "field 'trackingNumber'"), 0x7f0e0385, "field 'trackingNumber'");
        . = (TextView)ctor.abel((View)ctor.abel(obj, 0x7f0e0386, "field 'scheduleLabel'"), 0x7f0e0386, "field 'scheduleLabel'");
        .dDate = (TextView)ctor.DayAndDate((View)ctor.DayAndDate(obj, 0x7f0e0387, "field 'deliveredDayAndDate'"), 0x7f0e0387, "field 'deliveredDayAndDate'");
        .dDate = (TextView)ctor.DayAndDate((View)ctor.DayAndDate(obj, 0x7f0e0388, "field 'status'"), 0x7f0e0388, "field 'status'");
        .ssView = (ImageView)ctor.rogressView((View)ctor.rogressView(obj, 0x7f0e0389, "field 'shipmentProgressView'"), 0x7f0e0389, "field 'shipmentProgressView'");
        .ssView = (TextView)ctor.ce((View)ctor.ce(obj, 0x7f0e038a, "field 'leftAtPlace'"), 0x7f0e038a, "field 'leftAtPlace'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1. = null;
        inject1. = null;
        inject1.dDate = null;
        inject1.dDate = null;
        inject1.ssView = null;
        inject1.ssView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
