// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.TextView;

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        . = (TextView)ctor.ew((View)ctor.ew(obj, 0x7f0e0370, "field 'orderIdView'"), 0x7f0e0370, "field 'orderIdView'");
        .teView = (TextView)ctor.oryDateView((View)ctor.oryDateView(obj, 0x7f0e0372, "field 'orderHistoryDateView'"), 0x7f0e0372, "field 'orderHistoryDateView'");
        .atusView = (TextView)ctor.oryStatusView((View)ctor.oryStatusView(obj, 0x7f0e0374, "field 'orderHistoryStatusView'"), 0x7f0e0374, "field 'orderHistoryStatusView'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.inject = null;
        inject1.teView = null;
        inject1.atusView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
