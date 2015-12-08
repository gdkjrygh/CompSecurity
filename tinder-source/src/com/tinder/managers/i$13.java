// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.c;
import com.tinder.enums.ReportCause;
import com.tinder.model.Match;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            i

public final class e
    implements com.android.volley.
{

    final c a;
    final Match b;
    final String c;
    final ReportCause d;
    final String e;
    final i f;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("response=")).append(obj);
        a.a(b, d);
        i.a(f, e);
    }

    public use(i j, c c1, Match match, String s, ReportCause reportcause, String s1)
    {
        f = j;
        a = c1;
        b = match;
        c = s;
        d = reportcause;
        e = s1;
        super();
    }
}
