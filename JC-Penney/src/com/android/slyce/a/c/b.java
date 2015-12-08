// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.c.b.a;

// Referenced classes of package com.android.slyce.a.c:
//            a, u, i

class b
    implements Runnable
{

    final u a;
    final int b;
    final i c;
    final a d;
    final com.android.slyce.a.c.a e;

    b(com.android.slyce.a.c.a a1, u u, int i, i j, a a2)
    {
        e = a1;
        a = u;
        b = i;
        c = j;
        d = a2;
        super();
    }

    public void run()
    {
        com.android.slyce.a.c.a.a(e, a, b, c, d);
    }
}
