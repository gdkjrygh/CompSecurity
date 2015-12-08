// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.b.a;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.y;
import b.a.a.a.a.d.p;
import b.a.a.a.a.e.c;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.g;
import b.a.a.a.l;
import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.a.a.a:
//            a

final class n extends a
    implements p
{

    private final String b;

    public n(l l, String s, String s1, g g, String s2)
    {
        super(l, s, s1, g, c.b);
        b = s2;
    }

    public final boolean a(List list)
    {
        boolean flag = false;
        Object obj1 = b();
        Object obj = b;
        obj1 = ((d) (obj1)).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        com.a.a.a.a.c();
        obj = ((d) (obj1)).a("X-CRASHLYTICS-API-CLIENT-VERSION", "1.2.2.56").a("X-CRASHLYTICS-API-KEY", ((String) (obj)));
        obj1 = list.iterator();
        for (int i = 0; ((Iterator) (obj1)).hasNext(); i++)
        {
            File file = (File)((Iterator) (obj1)).next();
            android.content.Context context = com.a.a.a.a.c().v();
            (new StringBuilder("Adding analytics session file ")).append(file.getName()).append(" to multipart POST");
            j.e(context);
            ((d) (obj)).a((new StringBuilder("session_analytics_file_")).append(i).toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
        }

        obj1 = com.a.a.a.a.c().v();
        (new StringBuilder("Sending ")).append(list.size()).append(" analytics files to ").append(a());
        j.e(((android.content.Context) (obj1)));
        int k = ((d) (obj)).b();
        j.e(com.a.a.a.a.c().v());
        if (y.a(k) == 0)
        {
            flag = true;
        }
        return flag;
    }
}
