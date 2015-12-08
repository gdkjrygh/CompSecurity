// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.a.b.a;
import b.a.a.a.a.b.y;
import b.a.a.a.a.e.c;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.g;
import b.a.a.a.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.a.a.c:
//            an, am, g, av

final class ao extends a
    implements an
{

    public ao(l l, String s, String s1, g g1)
    {
        super(l, s, s1, g1, c.b);
    }

    public final boolean a(am am1)
    {
        d d1 = b().a("X-CRASHLYTICS-API-KEY", am1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        g.f();
        d1 = d1.a("X-CRASHLYTICS-API-CLIENT-VERSION", "2.3.2.56");
        for (Iterator iterator = am1.b.e().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            d1 = d1.a((String)entry.getKey(), (String)entry.getValue());
        }

        am1 = am1.b;
        am1 = d1.a("report[file]", am1.b(), "application/octet-stream", am1.d()).b("report[identifier]", am1.c());
        b.a.a.a.d.c();
        (new StringBuilder("Sending report to: ")).append(a());
        int i = am1.b();
        b.a.a.a.d.c();
        (new StringBuilder("Create report request ID: ")).append(am1.a("X-REQUEST-ID"));
        b.a.a.a.d.c();
        return y.a(i) == 0;
    }
}
