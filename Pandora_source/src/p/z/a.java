// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.z;

import android.content.Context;
import p.r.c;
import p.r.f;
import p.x.d;
import p.x.i;
import p.x.j;
import p.x.k;

public class p.z.a
    implements j
{
    public static class a
        implements k
    {

        private final i a = new i(500);

        public j a(Context context, p.x.c c)
        {
            return new p.z.a(a);
        }

        public void a()
        {
        }

        public a()
        {
        }
    }


    private final i a;

    public p.z.a()
    {
        this(null);
    }

    public p.z.a(i k)
    {
        a = k;
    }

    public volatile c a(Object obj, int k, int l)
    {
        return a((d)obj, k, l);
    }

    public c a(d d1, int k, int l)
    {
        d d2 = d1;
        if (a != null)
        {
            d2 = (d)a.a(d1, 0, 0);
            if (d2 == null)
            {
                a.a(d1, 0, 0, d1);
                d2 = d1;
            }
        }
        return new f(d2);
    }
}
