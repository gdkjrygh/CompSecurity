// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.bb;
import com.google.android.m4b.maps.bo.n;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bo.z;
import com.google.android.m4b.maps.br.b;
import com.google.android.m4b.maps.bx.i;
import com.google.android.m4b.maps.bx.r;
import java.util.ArrayList;
import java.util.List;

public abstract class h extends r
{

    private boolean a;
    protected final bb b;
    protected final t c;
    protected final b d;
    public float e;
    public float f;
    protected final int g;
    public boolean h;
    protected boolean i;
    boolean j;
    protected boolean k;
    protected int l;
    private List m;

    protected h(bb bb, b b1, t t1, float f1, float f2, int i1, boolean flag, 
            boolean flag1)
    {
        j = false;
        k = false;
        m = new ArrayList();
        l = 0x10000;
        b = bb;
        c = t1;
        d = b1;
        e = f1;
        f = f2;
        g = i1;
        h = flag;
        j = flag1;
    }

    public static float a(t t1, float f1, int i1, int j1, float f2)
    {
        float f3;
        int k1;
        if (t1.e())
        {
            k1 = t1.d.c;
        } else
        {
            k1 = 0;
        }
        f3 = k1;
        return Math.max(i1, Math.min(j1, f3 * f1)) * f2;
    }

    public static int a(float f1)
    {
        if (f1 < 1.0F && f1 >= 0.25F)
        {
            return (int)(65536D * Math.sqrt(1.3333333730697632D * (double)(f1 - 0.25F)));
        } else
        {
            return 0x10000;
        }
    }

    static int a(int i1, int j1)
    {
        return ((i1 >>> 24) * j1) / 255 << 24;
    }

    public static int a(t t1, i i1)
    {
        int k1 = -1;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.google.android.m4b.maps.bx.i.values().length];
                try
                {
                    a[i.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[i.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[i.g.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[i1.ordinal()])
        {
        default:
            int j1;
            if (t1.e())
            {
                j1 = t1.d.a;
            } else
            {
                j1 = 0xff000000;
            }
            k1 = j1;
            if (j1 == 0)
            {
                k1 = 0xff000000;
            }
            // fall through

        case 1: // '\001'
        case 3: // '\003'
            return k1;

        case 2: // '\002'
            return 0xffc0c0c0;
        }
    }

    static int b(int i1)
    {
        return ((i1 >>> 16 & 0xff) * 77 + (i1 >>> 8 & 0xff) * 151 + (i1 & 0xff) * 28) / 256;
    }

    public static int b(t t1, i i1)
    {
        int j1 = 0xa0000000;
        _cls1.a[i1.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 51
    //                   2 53
    //                   3 51;
           goto _L1 _L2 _L3 _L2
_L1:
        if (!t1.e()) goto _L5; else goto _L4
_L4:
        j1 = t1.d.b;
_L2:
        return j1;
_L3:
        return 0x80000000;
_L5:
        int k1 = a(t1, i1);
        int l1 = a(k1, 160);
        if (b(k1) >= 192)
        {
            return 0x808080 | l1;
        } else
        {
            return 0xffffff | l1;
        }
    }

    public final void a(int i1)
    {
        boolean flag;
        if ((i1 & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
    }

    public boolean a(as as1)
    {
        return as1.a().a(o().a()) && as1.a(o());
    }

    public void b(d d1)
    {
        super.b(d1);
    }

    public boolean b(com.google.android.m4b.maps.bi.b b1, d d1)
    {
        return false;
    }

    public void c(d d1)
    {
        super.c(d1);
        a = true;
    }

    public final com.google.android.m4b.maps.bx.r.a d()
    {
        return com.google.android.m4b.maps.bx.r.a.j;
    }

    public abstract float n();

    public abstract n o();

    public final b p()
    {
        return d;
    }

    public int q()
    {
        return g;
    }

    public abstract String r();

    public final bb s()
    {
        return b;
    }

    public final void t()
    {
        i = true;
    }
}
