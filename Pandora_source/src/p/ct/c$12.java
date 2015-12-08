// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ct;

import p.bd.g;
import p.cv.c;
import p.df.a;

// Referenced classes of package p.ct:
//            c

class Object
    implements c
{

    final int a;
    final p.ct.c b;

    public void a(g g1)
    {
        if (g1.d().booleanValue())
        {
            p.df.a.a("AppLink", "Adding sub menus");
            b.a(9, "From Current Artist", a, 0, new String[] {
                "Create Station from Artist"
            });
            b.a(10, "From Current Track", a, 1, new String[] {
                "Create Station from Track", "Create Station from Song"
            });
        }
    }

    String(p.ct.c c1, int i)
    {
        b = c1;
        a = i;
        super();
    }
}
