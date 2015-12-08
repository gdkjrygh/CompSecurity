// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.a.ae;
import com.nuance.b.c.b;

// Referenced classes of package com.nuance.b.b:
//            fc, u

final class fd
    implements Runnable
{

    final b a;
    final String b;
    final String c;
    final u d;
    final ae e;
    final fc f;

    fd(fc fc1, b b1, String s, String s1, u u, ae ae)
    {
        f = fc1;
        a = b1;
        b = s;
        c = s1;
        d = u;
        e = ae;
        super();
    }

    public final void run()
    {
        f.a(a, b, d, e);
    }
}
