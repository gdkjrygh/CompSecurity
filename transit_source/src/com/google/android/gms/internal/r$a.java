// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.widget.ViewSwitcher;

// Referenced classes of package com.google.android.gms.internal:
//            r, x, h, co, 
//            g, ab, cg, ce, 
//            ae

private static final class eg
{

    public final String adUnitId;
    public final ViewSwitcher ec;
    public final x ed;
    public final Context ee;
    public final h ef;
    public final co eg;
    public ab eh;
    public cg ei;
    public ce ej;
    public ae ek;

    public (Context context, x x1, String s, co co1)
    {
        if (x1.ex)
        {
            ec = null;
        } else
        {
            ec = new ViewSwitcher(context);
            ec.setMinimumWidth(x1.widthPixels);
            ec.setMinimumHeight(x1.heightPixels);
            ec.setVisibility(4);
        }
        ed = x1;
        adUnitId = s;
        ee = context;
        ef = new h(g.a(co1.hP, context));
        eg = co1;
    }
}
