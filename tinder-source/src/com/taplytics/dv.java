// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.Date;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            gs, el, dp

final class dv
    implements com.android.volley.i.b
{

    final Date a;
    final el b;
    final dp c;

    dv(dp dp, Date date, el el1)
    {
        c = dp;
        a = date;
        b = el1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        if (gs.b())
        {
            gs.a("Posted Chosen Activity", a);
        }
        if (b != null)
        {
            b.a(((JSONObject) (obj)));
        }
    }
}
