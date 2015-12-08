// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import b.a.a.a.a.b.a;
import b.a.a.a.a.b.ag;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.e;
import b.a.a.a.a.e.m;
import b.a.a.a.f;
import b.a.a.a.o;
import b.a.a.a.q;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.a.a:
//            aq, ap, h, bj

final class ar extends a
    implements aq
{

    public ar(o o, String s, String s1, m m)
    {
        super(o, s, s1, m, d.b);
    }

    public final boolean a(ap ap1)
    {
        e e1 = b().a("X-CRASHLYTICS-API-KEY", ap1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        com.a.a.h.f();
        e1 = e1.a("X-CRASHLYTICS-API-CLIENT-VERSION", "2.2.4.42");
        for (Iterator iterator = ap1.b.e().entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            e1 = e1.a((String)entry.getKey(), (String)entry.getValue());
        }

        ap1 = ap1.b;
        ap1 = e1.a("report[file]", ap1.b(), "application/octet-stream", ap1.d()).b("report[identifier]", ap1.c());
        f.c().a("Fabric", (new StringBuilder("Sending report to: ")).append(a()).toString());
        int i = ap1.b();
        f.c().a("Fabric", (new StringBuilder("Create report request ID: ")).append(ap1.a("X-REQUEST-ID")).toString());
        f.c().a("Fabric", (new StringBuilder("Result was: ")).append(i).toString());
        return ag.a(i) == 0;
    }
}
