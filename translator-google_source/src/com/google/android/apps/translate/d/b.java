// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.d;

import com.google.analytics.tracking.android.bh;
import com.google.android.libraries.translate.logging.c;
import com.google.android.libraries.translate.logging.f;

// Referenced classes of package com.google.android.apps.translate.d:
//            a

final class b
    implements f
{

    final String a;
    final String b;
    final String c;
    final long d;
    final String e;
    final a f;

    b(a a1, String s, String s1, String s2, long l, String s3)
    {
        f = a1;
        a = s;
        b = s1;
        c = s2;
        d = l;
        e = s3;
        super();
    }

    public final void a(int i, String s, String s1)
    {
        String s3 = Integer.toString(i);
        String s2 = com.google.android.apps.translate.d.a.d(s);
        String s4 = com.google.android.apps.translate.d.a.e(s);
        s = com.google.android.apps.translate.d.a.f(s);
        bh bh1 = com.google.android.apps.translate.d.a.a(a, b);
        bh1.a(5, s2);
        bh1.a(7, s4);
        bh1.a(6, s);
        bh1.a(8, s3);
        bh1.a("translation", c, s1, Long.valueOf(1L));
        bh1 = com.google.android.apps.translate.d.a.a(a, b);
        bh1.a(8, s3);
        bh1.a(5, s2);
        bh1.a(7, s4);
        bh1.a(6, s);
        bh1.a("translation", System.currentTimeMillis() - d, c, s1);
        if (e != null)
        {
            s = f.a;
            s1 = e;
            s.a((new StringBuilder(String.valueOf(s1).length() + 5 + String.valueOf(s2).length())).append(s1).append(",otf=").append(s2).toString());
        }
    }
}
