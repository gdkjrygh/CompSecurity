// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.b.a;
import b.a.a.a.a.b.ag;
import b.a.a.a.a.b.l;
import b.a.a.a.a.d.q;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.e;
import b.a.a.a.a.e.m;
import b.a.a.a.o;
import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.a.a.a:
//            a

final class j extends a
    implements q
{

    private final String b;

    public j(o o, String s, String s1, m m, String s2)
    {
        super(o, s, s1, m, d.b);
        b = s2;
    }

    public final boolean a(List list)
    {
        boolean flag = false;
        Object obj1 = b();
        Object obj = b;
        obj1 = ((e) (obj1)).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        com.a.a.a.a.b();
        obj = ((e) (obj1)).a("X-CRASHLYTICS-API-CLIENT-VERSION", "1.2.0.42").a("X-CRASHLYTICS-API-KEY", ((String) (obj)));
        obj1 = list.iterator();
        for (int i = 0; ((Iterator) (obj1)).hasNext(); i++)
        {
            File file = (File)((Iterator) (obj1)).next();
            l.a(com.a.a.a.a.b().w(), (new StringBuilder("Adding analytics session file ")).append(file.getName()).append(" to multipart POST").toString());
            ((e) (obj)).a((new StringBuilder("session_analytics_file_")).append(i).toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
        }

        l.a(com.a.a.a.a.b().w(), (new StringBuilder("Sending ")).append(list.size()).append(" analytics files to ").append(a()).toString());
        int k = ((e) (obj)).b();
        l.a(com.a.a.a.a.b().w(), (new StringBuilder("Response code for analytics file send is ")).append(k).toString());
        if (ag.a(k) == 0)
        {
            flag = true;
        }
        return flag;
    }
}
