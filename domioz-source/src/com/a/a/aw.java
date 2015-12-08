// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import com.a.a.c.a.c;
import com.a.a.c.a.d;
import com.a.a.c.a.e;
import com.a.a.c.a.f;
import com.a.a.c.a.g;

// Referenced classes of package com.a.a:
//            be, bh, bd, ay, 
//            az, bf, bg, bc, 
//            ax, ba, bb, f

final class aw
{

    private static final e a = new e("", "");
    private static final be b[] = new be[0];
    private static final bh c[] = new bh[0];
    private static final bd d[] = new bd[0];
    private static final ay e[] = new ay[0];
    private static final az f[] = new az[0];

    private static bf a(g ag[])
    {
        bd abd[];
        int i;
        if (ag != null)
        {
            abd = new bd[ag.length];
        } else
        {
            abd = d;
        }
        for (i = 0; i < abd.length; i++)
        {
            abd[i] = new bd(ag[i]);
        }

        return new bf(abd);
    }

    public static void a(d d1, com.a.a.f f1)
    {
        boolean flag = false;
        Object aobj[];
        Object obj;
        Object aobj1[];
        int i;
        if (d1.b != null)
        {
            aobj = d1.b;
        } else
        {
            aobj = a;
        }
        obj = new bg(((e) (aobj)));
        aobj1 = d1.c;
        if (aobj1 != null)
        {
            aobj = new bh[aobj1.length];
        } else
        {
            aobj = c;
        }
        for (i = 0; i < aobj.length; i++)
        {
            f f2 = aobj1[i];
            aobj[i] = new bh(f2, a(f2.c));
        }

        bf bf1 = new bf(((be []) (aobj)));
        com.a.a.c.a.a aa[] = d1.d;
        if (aa != null)
        {
            aobj = new ay[aa.length];
        } else
        {
            aobj = e;
        }
        for (i = 0; i < aobj.length; i++)
        {
            aobj[i] = new ay(aa[i]);
        }

        obj = new bc(((bg) (obj)), bf1, new bf(((be []) (aobj))));
        bf1 = d1.e;
        if (bf1 != null)
        {
            aobj = new az[bf1.length];
            i = ((flag) ? 1 : 0);
        } else
        {
            aobj = f;
            i = ((flag) ? 1 : 0);
        }
        for (; i < aobj.length; i++)
        {
            aobj[i] = new az(bf1[i]);
        }

        ax ax1 = new ax(((bc) (obj)), new bf(((be []) (aobj))));
        obj = d1.f;
        obj = new ba((float)((c) (obj)).f / 100F, ((c) (obj)).g, ((c) (obj)).h, ((c) (obj)).a, ((c) (obj)).b - ((c) (obj)).d, ((c) (obj)).c - ((c) (obj)).e);
        (new bb(d1.a, "ndk-crash", ax1, ((ba) (obj)))).b(f1);
    }

}
