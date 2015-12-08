// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.goggles.b;

import android.os.Build;
import com.google.android.apps.gsa.a.c.d;
import com.google.bionics.goggles.api2.j;
import com.google.bionics.goggles.api2.s;
import com.google.f.e.k;
import com.google.f.e.l;
import com.google.f.e.n;
import java.util.UUID;

// Referenced classes of package com.google.android.goggles.b:
//            g

final class h
    implements d
{

    final g a;
    private int b;

    h(g g1)
    {
        a = g1;
        super();
        b = 0;
    }

    public final l b()
    {
        int i = b;
        b = i + 1;
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            l l1 = (new l()).a(true).a("visualsearch");
            l1.setExtension(s.a, a.c);
            com.google.protobuf.nano.c c = k.a;
            g g1 = a;
            k k1 = (new k()).a("").b("Android").c(Build.DISPLAY);
            String s1 = g1.a;
            if (s1 == null)
            {
                throw new NullPointerException();
            } else
            {
                k1.c = s1;
                k1.b = k1.b | 2;
                l1.setExtension(c, k1.d(g1.b).e(g1.b()).f(Build.MODEL));
                l1.setExtension(n.a, (new n()).a(UUID.randomUUID().toString()));
                return l1;
            }

        case 1: // '\001'
            l l2 = new l();
            com.google.protobuf.nano.c c1 = s.b;
            j j1 = a.d;
            j1.b = 0;
            j1.a = j1.a | 1;
            l2.setExtension(c1, j1);
            return l2;
        }
    }

    public final void close()
    {
        b = 2;
    }
}
