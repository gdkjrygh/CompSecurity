// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ct;

import p.bd.g;
import p.bg.bk;
import p.bg.z;
import p.bh.k;
import p.cu.a;
import p.cv.c;

// Referenced classes of package p.ct:
//            c

class .Object
    implements c
{

    final String a;
    final p.ct.c b;

    public void a(g g1)
    {
        if (g1.d().booleanValue() && a != null && !"".equals(a))
        {
            p.ct.c.c((new StringBuilder()).append("Showing album art named ").append(a).toString());
            g1 = new bk();
            z z1 = new z();
            z1.a(a);
            z1.a(k.b);
            g1.a(z1);
            b.c.a(g1);
        }
    }

    .String(p.ct.c c1, String s)
    {
        b = c1;
        a = s;
        super();
    }
}
