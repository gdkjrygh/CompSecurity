// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.Date;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            gs, el, eb

final class ec
    implements com.android.volley.i.b
{

    final Date a;
    final el b;
    final eb c;

    ec(eb eb, Date date, el el1)
    {
        c = eb;
        a = date;
        b = el1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        if (gs.b())
        {
            gs.a("Posted App Icon", a);
        }
        if (b != null)
        {
            b.a(((JSONObject) (obj)));
        }
    }
}
