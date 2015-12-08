// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.c;
import com.tinder.enums.ReportCause;
import com.tinder.model.Match;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            ac

public final class f
    implements com.android.volley.
{

    final c a;
    final Match b;
    final Match c;
    final String d;
    final ReportCause e;
    final boolean f;
    final ac g;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("response=")).append(obj);
        a.a(b, c.getId(), d, e, f);
    }

    public use(ac ac1, c c1, Match match, Match match1, String s, ReportCause reportcause, boolean flag)
    {
        g = ac1;
        a = c1;
        b = match;
        c = match1;
        d = s;
        e = reportcause;
        f = flag;
        super();
    }
}
