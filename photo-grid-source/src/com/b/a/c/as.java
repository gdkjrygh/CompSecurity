// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.a;
import a.a.a.a.a.b.ag;
import a.a.a.a.a.e.d;
import a.a.a.a.a.e.e;
import a.a.a.a.a.e.m;
import a.a.a.a.f;
import a.a.a.a.p;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.b.a.c:
//            ar, aq, h, bq

final class as extends a
    implements ar
{

    public as(p p, String s, String s1, m m)
    {
        super(p, s, s1, m, d.b);
    }

    public final boolean a(aq aq1)
    {
        e e1 = b().a("X-CRASHLYTICS-API-KEY", aq1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        com.b.a.c.h.f();
        e1 = e1.a("X-CRASHLYTICS-API-CLIENT-VERSION", "2.3.5.79");
        for (Iterator iterator = aq1.b.e().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            e1 = e1.a((String)entry.getKey(), (String)entry.getValue());
        }

        aq1 = aq1.b;
        aq1 = e1.a("report[file]", aq1.b(), "application/octet-stream", aq1.d()).b("report[identifier]", aq1.c());
        f.d();
        (new StringBuilder("Sending report to: ")).append(a());
        int i = aq1.b();
        f.d();
        (new StringBuilder("Create report request ID: ")).append(aq1.a("X-REQUEST-ID"));
        f.d();
        return ag.a(i) == 0;
    }
}
