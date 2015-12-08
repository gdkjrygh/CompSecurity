// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import p.dn.ao;
import p.ds.f;

// Referenced classes of package p.cx:
//            c

class init> extends init>
{

    final ao a;
    final c b;

    public void a()
    {
        int k = a.c();
        int i = a.d();
        if (!c.g(b) || k >= c.a(b).length || i == 0)
        {
            b.a(a.c(), new String[0]);
            return;
        }
        int l = Math.min(c.a(b).length - k, i);
        int ai[] = new int[l];
        i = 0;
        for (int j = k; j < l + k;)
        {
            ai[i] = c.a(b)[j].b();
            j++;
            i++;
        }

        b.a(k, ai);
    }

    Math(c c1, ao ao1)
    {
        b = c1;
        a = ao1;
        super();
    }
}
