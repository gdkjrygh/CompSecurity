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

public final class com.google.android.m4b.maps.cw.a
{
    public static final class a extends com.google.android.m4b.maps.ct.j.d
        implements b
    {

        private static volatile s g = null;
        private static final a i;
        private static volatile t j;
        private static final long serialVersionUID = 0L;
        public String d;
        private int e;
        private o f;
        private byte h;

        static void a(a a1, com.google.android.m4b.maps.an.a a2)
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

        public static void a(a a1, String s)
        {
            if (s == null)
            {
                throw new NullPointerException();
            } else
            {
                a1.e = a1.e | 2;
                a1.d = s;
                return;
            }
        }

        public static a n()
        {
            return (a)i.k();
        }

        static a o()
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
                java.util.Map.Entry entry = ((i) (obj)).a.b(j1);
                k1 = com.google.android.m4b.maps.ct.i.c((com.google.android.m4b.maps.ct.i.a)entry.getKey(), entry.getValue());
                j1++;
            }

            for (obj = ((i) (obj)).a.c().iterator(); ((Iterator) (obj)).hasNext();)
            {
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                k += com.google.android.m4b.maps.ct.i.c((com.google.android.m4b.maps.ct.i.a)entry1.getKey(), entry1.getValue());
            }

            k = i1 + k + a.c();
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
        //                       4 190
        //                       5 192
        //                       6 201
        //                       7 300
        //                       8 304;
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
            h1 = this;
            if (obj == i) goto _L11; else goto _L10
_L10:
            h1 = (a)obj;
            if (h1.c())
            {
                f.a(((a) (h1)).f);
                e = e | 1;
            }
            boolean flag;
            if ((((a) (h1)).e & 2) == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                e = e | 2;
                d = ((a) (h1)).d;
            }
            a(((com.google.android.m4b.maps.ct.j.d) (h1)));
            a(((a) (h1)).a);
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
                j = new com.google.android.m4b.maps.ct.j.b(i);
            }
            com/google/android/m4b/maps/cw/a$a;
            JVM INSTR monitorexit ;
_L13:
            return j;
            h1;
            com/google/android/m4b/maps/cw/a$a;
            JVM INSTR monitorexit ;
            throw h1;
        }

        public final void a(f f1)
        {
            com.google.android.m4b.maps.ct.j.d.a a1 = new com.google.android.m4b.maps.ct.j.d.a(this, false, (byte)0);
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

        public final com.google.android.m4b.maps.an.a d()
        {
            return (com.google.android.m4b.maps.an.a)f.a(com.google.android.m4b.maps.an.a.c());
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
        //                       0: 242
        //                       10: 113
        //                       18: 171;
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

    public static final class a.a extends com.google.android.m4b.maps.ct.j.c
        implements b
    {

        public final a.a a(com.google.android.m4b.maps.an.a a1)
        {
            b();
            a.a((a)a, a1);
            return this;
        }

        private a.a()
        {
            super(com.google.android.m4b.maps.cw.a.o());
        }

        a.a(byte byte0)
        {
            this();
        }
    }

    public static interface b
        extends com.google.android.m4b.maps.ct.j.e
    {
    }

}
