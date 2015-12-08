// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cw;

import com.google.android.m4b.maps.ct.e;
import com.google.android.m4b.maps.ct.f;
import com.google.android.m4b.maps.ct.h;
import com.google.android.m4b.maps.ct.i;
import com.google.android.m4b.maps.ct.l;
import com.google.android.m4b.maps.ct.m;
import com.google.android.m4b.maps.ct.o;
import com.google.android.m4b.maps.ct.s;
import com.google.android.m4b.maps.ct.t;
import com.google.android.m4b.maps.ct.v;
import com.google.android.m4b.maps.ct.x;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.cw:
//            a

public static final class c extends com.google.android.m4b.maps.ct.c
    implements c
{
    public static final class a extends com.google.android.m4b.maps.ct.j.c
        implements a.b
    {

        public final a a(com.google.android.m4b.maps.an.a.a a1)
        {
            b();
            a.a.a((a.a)a, a1);
            return this;
        }

        private a()
        {
            super(com.google.android.m4b.maps.cw.a.a.o());
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static volatile s g = null;
    private static final <init> i;
    private static volatile t j;
    private static final long serialVersionUID = 0L;
    public String d;
    private int e;
    private o f;
    private byte h;

    static void a(a.a a1, com.google.android.m4b.maps.an.a.a a2)
    {
        if (a2 == null)
        {
            throw new NullPointerException();
        } else
        {
            a1.f.b(a2);
            a1.e = a1.e | 1;
            return;
        }
    }

    public static void a(e e1, String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            e1.e = e1.e | 2;
            e1.d = s;
            return;
        }
    }

    public static a n()
    {
        return (a)i.k();
    }

    static k o()
    {
        return i;
    }

    public final int a()
    {
        int j1 = 0;
        int k = b;
        if (k != -1)
        {
            return k;
        }
        Object obj;
        int i1;
        if ((e & 1) == 1)
        {
            k = com.google.android.m4b.maps.ct.f.a(1, f) + 0;
        } else
        {
            k = 0;
        }
        if ((e & 2) == 2)
        {
            i1 = k + com.google.android.m4b.maps.ct.f.c(d);
        } else
        {
            i1 = k;
        }
        obj = super.c;
        int k1;
        for (k = 0; j1 < ((i) (obj)).a.b(); k = k1 + k)
        {
            java.util.Entry entry = ((i) (obj)).a.b(j1);
            k1 = com.google.android.m4b.maps.ct.i.c((com.google.android.m4b.maps.ct.c)entry.getKey(), entry.getValue());
            j1++;
        }

        for (obj = ((i) (obj)).a.c().iterator(); ((Iterator) (obj)).hasNext();)
        {
            java.util.Entry entry1 = (java.util.Entry)((Iterator) (obj)).next();
            k += com.google.android.m4b.maps.ct.i.c((com.google.android.m4b.maps.ct.c)entry1.getKey(), entry1.getValue());
        }

        k = i1 + k + a.c();
        b = k;
        return k;
    }

    protected final Object a(com.google.android.m4b.maps.ct.b b, Object obj, Object obj1)
    {
        a[b.ordinal()];
        JVM INSTR tableswitch 1 8: default 56
    //                   1 64
    //                   2 82
    //                   3 96
    //                   4 190
    //                   5 192
    //                   6 201
    //                   7 300
    //                   8 304;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        throw new UnsupportedOperationException();
_L2:
        b = new <init>((e)obj, (h)obj1);
_L11:
        return b;
_L3:
        return new <init>(l.c, com.google.android.m4b.maps.ct.h.a());
_L4:
        byte byte0 = h;
        if (byte0 == 1)
        {
            return i;
        }
        if (byte0 == 0)
        {
            return null;
        }
        boolean flag1 = ((Boolean)obj).booleanValue();
        if (c() && !d().j())
        {
            if (flag1)
            {
                h = 0;
            }
            return null;
        }
        if (!b())
        {
            if (flag1)
            {
                h = 0;
            }
            return null;
        }
        if (flag1)
        {
            h = 1;
        }
        return i;
_L5:
        return null;
_L6:
        return new a((byte)0);
_L7:
        b = this;
        if (obj == i) goto _L11; else goto _L10
_L10:
        b = (i)obj;
        if (b.c())
        {
            f.a(((f) (b)).f);
            e = e | 1;
        }
        boolean flag;
        if ((((e) (b)).e & 2) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e = e | 2;
            d = ((d) (b)).d;
        }
        a(((com.google.android.m4b.maps.ct.a) (b)));
        a(((a) (b)).a);
        return this;
_L8:
        return i;
_L9:
        if (j != null) goto _L13; else goto _L12
_L12:
        com/google/android/m4b/maps/cw/a$a;
        JVM INSTR monitorenter ;
        if (j == null)
        {
            j = new com.google.android.m4b.maps.ct.<init>(i);
        }
        com/google/android/m4b/maps/cw/a$a;
        JVM INSTR monitorexit ;
_L13:
        return j;
        b;
        com/google/android/m4b/maps/cw/a$a;
        JVM INSTR monitorexit ;
        throw b;
    }

    public final void a(f f1)
    {
        com.google.android.m4b.maps.ct.a a1 = new com.google.android.m4b.maps.ct.a(this, false, (byte)0);
        if ((e & 1) == 1)
        {
            f1.a(1, f.e());
        }
        if ((e & 2) == 2)
        {
            f1.a(d);
        }
        a1.a(0x20000000, f1);
        a.a(f1);
    }

    public final boolean c()
    {
        return (e & 1) == 1;
    }

    public final com.google.android.m4b.maps.an.e d()
    {
        return (com.google.android.m4b.maps.an.e)f.a(com.google.android.m4b.maps.an.c());
    }

    static 
    {
        i = new <init>(l.c, com.google.android.m4b.maps.ct.h.a());
    }

    private a(e e1, h h1)
    {
        com.google.android.m4b.maps.ct.a a1;
        boolean flag;
        f = new o();
        h = -1;
        f.c();
        d = "";
        a1 = x.b();
        flag = false;
_L8:
        if (flag) goto _L2; else goto _L1
_L1:
        int k = e1.a();
        k;
        JVM INSTR lookupswitch 3: default 239
    //                   0: 242
    //                   10: 113
    //                   18: 171;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!a(c, h(), e1, a1, h1, k))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        f.a(e1.d(), h1);
        e = e | 1;
        continue; /* Loop/switch isn't completed */
        e1;
        e1.a = this;
        throw new RuntimeException(e1);
        e1;
        a = a1.b();
        c.b();
        throw e1;
_L6:
        String s = e1.b();
        e = e | 2;
        d = s;
        continue; /* Loop/switch isn't completed */
        e1;
        e1 = new m(e1.getMessage());
        e1.a = this;
        throw new RuntimeException(e1);
_L2:
        a = a1.b();
        c.b();
        return;
_L4:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
