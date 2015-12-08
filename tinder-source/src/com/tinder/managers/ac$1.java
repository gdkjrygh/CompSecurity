// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.af;
import com.tinder.enums.ReportCause;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ac

public final class d
    implements com.android.volley.
{

    final af a;
    final String b;
    final ReportCause c;
    final String d;
    final ac e;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("response=")).append(obj);
        if (((JSONObject) (obj)).optString("status").equals("not found"))
        {
            a.f();
            return;
        } else
        {
            a.a(b, c, d);
            return;
        }
    }

    public use(ac ac1, af af1, String s, ReportCause reportcause, String s1)
    {
        e = ac1;
        a = af1;
        b = s;
        c = reportcause;
        d = s1;
        super();
    }
}
