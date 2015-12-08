// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.an;

import com.google.android.m4b.maps.ct.e;
import com.google.android.m4b.maps.ct.f;
import com.google.android.m4b.maps.ct.h;
import com.google.android.m4b.maps.ct.j;
import com.google.android.m4b.maps.ct.l;
import com.google.android.m4b.maps.ct.m;
import com.google.android.m4b.maps.ct.o;
import com.google.android.m4b.maps.ct.r;
import com.google.android.m4b.maps.ct.s;
import com.google.android.m4b.maps.ct.t;
import com.google.android.m4b.maps.ct.x;
import java.io.IOException;

public final class com.google.android.m4b.maps.an.a
{
    public static final class a extends j
        implements b
    {

        private static volatile s g = null;
        private static final a i;
        private static volatile t j;
        private static final long serialVersionUID = 0L;
        private int c;
        private long d;
        private long e;
        private o f;
        private byte h;

        private void a(long l1)
        {
            c = c | 1;
            d = l1;
        }

        public static void a(a a1, long l1)
        {
            a1.a(l1);
        }

        public static a b()
        {
            return (a)i.k();
        }

        private void b(long l1)
        {
            c = c | 2;
            e = l1;
        }

        public static void b(a a1, long l1)
        {
            a1.b(l1);
        }

        public static a c()
        {
            return i;
        }

        static a d()
        {
            return i;
        }

        private boolean n()
        {
            return (c & 1) == 1;
        }

        private boolean o()
        {
            return (c & 2) == 2;
        }

        private boolean p()
        {
            return (c & 4) == 4;
        }

        public final int a()
        {
            int k = b;
            if (k != -1)
            {
                return k;
            }
            int i1 = 0;
            if ((c & 1) == 1)
            {
                i1 = com.google.android.m4b.maps.ct.f.b(1) + 0;
            }
            k = i1;
            if ((c & 2) == 2)
            {
                k = i1 + com.google.android.m4b.maps.ct.f.b(2);
            }
            i1 = k;
            if ((c & 4) == 4)
            {
                i1 = k + com.google.android.m4b.maps.ct.f.a(3, f);
            }
            k = i1 + a.c();
            b = k;
            return k;
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
        //                       1 64
        //                       2 82
        //                       3 96
        //                       4 218
        //                       5 220
        //                       6 229
        //                       7 311
        //                       8 315;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
            throw new UnsupportedOperationException();
_L2:
            h1 = new a((e)obj, (h)obj1);
_L11:
            return h1;
_L3:
            return new a(l.c, com.google.android.m4b.maps.ct.h.a());
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
            boolean flag = ((Boolean)obj).booleanValue();
            if (!n())
            {
                if (flag)
                {
                    h = 0;
                }
                return null;
            }
            if (!o())
            {
                if (flag)
                {
                    h = 0;
                }
                return null;
            }
            if (p() && !((com.google.android.m4b.maps.cy.a)f.a(com.google.android.m4b.maps.cy.a.c())).j())
            {
                if (flag)
                {
                    h = 0;
                }
                return null;
            }
            if (flag)
            {
                h = 1;
            }
            return i;
_L5:
            return null;
_L6:
            return new a((byte)0);
_L7:
            h1 = this;
            if (obj == i) goto _L11; else goto _L10
_L10:
            h1 = (a)obj;
            if (h1.n())
            {
                a(((a) (h1)).d);
            }
            if (h1.o())
            {
                b(((a) (h1)).e);
            }
            if (h1.p())
            {
                f.a(((a) (h1)).f);
                c = c | 4;
            }
            a(((a) (h1)).a);
            return this;
_L8:
            return i;
_L9:
            if (j != null) goto _L13; else goto _L12
_L12:
            com/google/android/m4b/maps/an/a$a;
            JVM INSTR monitorenter ;
            if (j == null)
            {
                j = new com.google.android.m4b.maps.ct.j.b(i);
            }
            com/google/android/m4b/maps/an/a$a;
            JVM INSTR monitorexit ;
_L13:
            return j;
            h1;
            com/google/android/m4b/maps/an/a$a;
            JVM INSTR monitorexit ;
            throw h1;
        }

        public final void a(f f1)
        {
            if ((c & 1) == 1)
            {
                f1.a(1, d);
            }
            if ((c & 2) == 2)
            {
                f1.a(2, e);
            }
            if ((c & 4) == 4)
            {
                f1.a(3, f.e());
            }
            a.a(f1);
        }

        static 
        {
            i = new a(l.c, com.google.android.m4b.maps.ct.h.a());
        }

        private a(e e1, h h1)
        {
            com.google.android.m4b.maps.ct.x.a a1;
            boolean flag;
            f = new o();
            h = -1;
            d = 0L;
            e = 0L;
            f.c();
            a1 = x.b();
            flag = false;
_L9:
            if (flag) goto _L2; else goto _L1
_L1:
            int k = e1.a();
            k;
            JVM INSTR lookupswitch 4: default 245
        //                       0: 248
        //                       9: 116
        //                       17: 163
        //                       26: 211;
               goto _L3 _L4 _L5 _L6 _L7
_L3:
            if (!a1.a(k, e1))
            {
                flag = true;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            c = c | 1;
            d = e1.h();
            continue; /* Loop/switch isn't completed */
            e1;
            e1.a = this;
            throw new RuntimeException(e1);
            e1;
            a = a1.b();
            throw e1;
_L6:
            c = c | 2;
            e = e1.h();
            continue; /* Loop/switch isn't completed */
            e1;
            e1 = new m(e1.getMessage());
            e1.a = this;
            throw new RuntimeException(e1);
_L7:
            f.a(e1.d(), h1);
            c = c | 4;
            continue; /* Loop/switch isn't completed */
_L2:
            a = a1.b();
            return;
_L4:
            flag = true;
            if (true) goto _L9; else goto _L8
_L8:
        }
    }

    public static final class a.a extends com.google.android.m4b.maps.ct.j.a
        implements b
    {

        private a.a()
        {
            super(a.d());
        }

        a.a(byte byte0)
        {
            this();
        }
    }

    public static interface b
        extends r
    {
    }

}
