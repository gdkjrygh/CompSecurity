// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.a.b.a;
import a.a.a.a.a.b.ag;
import a.a.a.a.a.d.l;
import a.a.a.a.a.e.d;
import a.a.a.a.a.e.e;
import a.a.a.a.a.e.m;
import a.a.a.a.f;
import a.a.a.a.p;
import java.io.File;
import java.util.Iterator;
import java.util.List;

final class u extends a
    implements l
{

    private final String b;

    public u(p p1, String s, String s1, m m, String s2)
    {
        super(p1, s, s1, m, d.b);
        b = s2;
    }

    public final boolean a(List list)
    {
        boolean flag = false;
        e e1 = b().a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", a.a()).a("X-CRASHLYTICS-API-KEY", b);
        Iterator iterator = list.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            File file = (File)iterator.next();
            e1.a((new StringBuilder("session_analytics_file_")).append(i).toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
        }

        f.d();
        (new StringBuilder("Sending ")).append(list.size()).append(" analytics files to ").append(a());
        int j = e1.b();
        f.d();
        if (ag.a(j) == 0)
        {
            flag = true;
        }
        return flag;
    }
}
