// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cy;

import com.google.android.m4b.maps.ct.e;
import com.google.android.m4b.maps.ct.f;
import com.google.android.m4b.maps.ct.h;
import com.google.android.m4b.maps.ct.i;
import com.google.android.m4b.maps.ct.l;
import com.google.android.m4b.maps.ct.m;
import com.google.android.m4b.maps.ct.s;
import com.google.android.m4b.maps.ct.t;
import com.google.android.m4b.maps.ct.v;
import com.google.android.m4b.maps.ct.x;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.cy:
//            b

public final class com.google.android.m4b.maps.cy.a extends com.google.android.m4b.maps.ct.j.d
    implements b
{
    public static final class a extends com.google.android.m4b.maps.ct.j.c
        implements b
    {

        private a()
        {
            super(com.google.android.m4b.maps.cy.a.d());
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static volatile s d = null;
    private static final com.google.android.m4b.maps.cy.a f;
    private static volatile t g;
    private static final long serialVersionUID = 0L;
    private byte e;

    private com.google.android.m4b.maps.cy.a(e e1, h h1)
    {
        com.google.android.m4b.maps.ct.x.a a1;
        boolean flag;
        e = -1;
        a1 = x.b();
        flag = false;
_L4:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = e1.a();
        j;
        JVM INSTR tableswitch 0 0: default 162
    //                   0 77;
           goto _L1 _L2
_L1:
        boolean flag1 = a(c, h(), e1, a1, h1, j);
        if (!flag1)
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        a = a1.b();
        c.b();
        return;
        e1;
        e1.a = this;
        throw new RuntimeException(e1);
        e1;
        a = a1.b();
        c.b();
        throw e1;
        e1;
        e1 = new m(e1.getMessage());
        e1.a = this;
        throw new RuntimeException(e1);
    }

    public static com.google.android.m4b.maps.cy.a c()
    {
        return f;
    }

    static com.google.android.m4b.maps.cy.a d()
    {
        return f;
    }

    public final int a()
    {
        int k = 0;
        int j = b;
        if (j != -1)
        {
            return j;
        }
        Object obj = super.c;
        j = 0;
        for (; k < ((i) (obj)).a.b(); k++)
        {
            j += i.c(((i) (obj)).a.b(k));
        }

        for (obj = ((i) (obj)).a.c().iterator(); ((Iterator) (obj)).hasNext();)
        {
            j += i.c((java.util.Map.Entry)((Iterator) (obj)).next());
        }

        j = j + 0 + a.c();
        b = j;
        return j;
    }

    protected final Object a(com.google.android.m4b.maps.ct.j.h h1, Object obj, Object obj1)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.google.android.m4b.maps.ct.j.h.values().length];
                try
                {
                    a[com.google.android.m4b.maps.ct.j.h.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.google.android.m4b.maps.ct.j.h.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.google.android.m4b.maps.ct.j.h.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.google.android.m4b.maps.ct.j.h.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.google.android.m4b.maps.ct.j.h.f.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.google.android.m4b.maps.ct.j.h.c.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.google.android.m4b.maps.ct.j.h.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.google.android.m4b.maps.ct.j.h.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[h1.ordinal()];
        JVM INSTR tableswitch 1 8: default 56
    //                   1 64
    //                   2 82
    //                   3 96
    //                   4 161
    //                   5 163
    //                   6 172
    //                   7 201
    //                   8 205;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        throw new UnsupportedOperationException();
_L2:
        h1 = new com.google.android.m4b.maps.cy.a((e)obj, (h)obj1);
_L11:
        return h1;
_L3:
        return new com.google.android.m4b.maps.cy.a(l.c, h.a());
_L4:
        byte byte0 = e;
        if (byte0 == 1)
        {
            return f;
        }
        if (byte0 == 0)
        {
            return null;
        }
        boolean flag = ((Boolean)obj).booleanValue();
        if (!b())
        {
            if (flag)
            {
                e = 0;
            }
            return null;
        }
        if (flag)
        {
            e = 1;
        }
        return f;
_L5:
        return null;
_L6:
        return new a((byte)0);
_L7:
        h1 = this;
        if (obj == f) goto _L11; else goto _L10
_L10:
        h1 = (com.google.android.m4b.maps.cy.a)obj;
        a(((com.google.android.m4b.maps.ct.j.d) (h1)));
        a(((com.google.android.m4b.maps.cy.a) (h1)).a);
        return this;
_L8:
        return f;
_L9:
        if (g != null) goto _L13; else goto _L12
_L12:
        com/google/android/m4b/maps/cy/a;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            g = new com.google.android.m4b.maps.ct.j.b(f);
        }
        com/google/android/m4b/maps/cy/a;
        JVM INSTR monitorexit ;
_L13:
        return g;
        h1;
        com/google/android/m4b/maps/cy/a;
        JVM INSTR monitorexit ;
        throw h1;
    }

    public final void a(f f1)
    {
        (new com.google.android.m4b.maps.ct.j.d.a(this, true, (byte)0)).a(0x7fffffff, f1);
        a.a(f1);
    }

    static 
    {
        f = new com.google.android.m4b.maps.cy.a(l.c, h.a());
    }
}
