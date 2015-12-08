// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.b.a;
import b.a.a.a.a.d.k;
import b.a.a.a.a.e.c;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.g;
import b.a.a.a.l;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class y extends a
    implements k
{

    private final String c;

    public y(l l1, String s, String s1, g g, String s2)
    {
        super(l1, s, s1, g, c.b);
        c = s2;
    }

    public final boolean a(List list)
    {
        boolean flag = false;
        d d1 = a(Collections.emptyMap()).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", b.a()).a("X-CRASHLYTICS-API-KEY", c);
        Iterator iterator = list.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            File file = (File)iterator.next();
            d1.a((new StringBuilder("session_analytics_file_")).append(i).toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
        }

        b.a.a.a.d.a();
        (new StringBuilder("Sending ")).append(list.size()).append(" analytics files to ").append(super.a);
        int j = d1.b();
        b.a.a.a.d.a();
        if (b.a.a.a.a.b.y.a(j) == 0)
        {
            flag = true;
        }
        return flag;
    }
}
