// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.al.b;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.be.i;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.bd;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bx.o;
import com.google.android.m4b.maps.y.j;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            b

public abstract class com.google.android.m4b.maps.bq.a extends com.google.android.m4b.maps.bq.b
{
    public abstract class a extends b.a
    {

        protected int a;
        protected byte b[][];
        private com.google.android.m4b.maps.bq.a f;

        private void a(InputStream inputstream)
        {
            int j1 = super.d;
            int k = 0;
            do
            {
                com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(null);
                if (com.google.android.m4b.maps.ac.c.a(com.google.android.m4b.maps.cq.e.f, inputstream, a1) != -1)
                {
                    Object obj1 = a1.f(1);
                    byte abyte0[];
                    byte abyte1[];
                    int l;
                    int i1;
                    if (((com.google.android.m4b.maps.ac.a) (obj1)).i(8))
                    {
                        i1 = ((com.google.android.m4b.maps.ac.a) (obj1)).d(8);
                    } else
                    {
                        i1 = -1;
                    }
                    abyte0 = a1.c(2);
                    if (abyte0 != null)
                    {
                        l = abyte0.length;
                    } else
                    {
                        l = 0;
                    }
                    abyte1 = a(l, i1);
                    if (abyte0 != null)
                    {
                        System.arraycopy(abyte0, 0, abyte1, abyte1.length - l, l);
                    }
                    if (k < j1)
                    {
                        Object obj;
                        com.google.android.m4b.maps.bo.bd.a aa[];
                        int k1;
                        int l1;
                        int i2;
                        int j2;
                        int k2;
                        if (((com.google.android.m4b.maps.ac.a) (obj1)).i(30))
                        {
                            obj = al.a(((com.google.android.m4b.maps.ac.a) (obj1)).e(30));
                        } else
                        {
                            obj = obj1;
                        }
                        k1 = ((com.google.android.m4b.maps.ac.a) (obj)).d(2);
                        l1 = ((com.google.android.m4b.maps.ac.a) (obj)).d(3);
                        i2 = ((com.google.android.m4b.maps.ac.a) (obj)).d(4);
                        j2 = com.google.android.m4b.maps.bq.a.f(f);
                        obj = new af();
                        aa = com.google.android.m4b.maps.bo.bd.a.values();
                        k2 = aa.length;
                        for (i1 = 0; i1 < k2; i1++)
                        {
                            bd bd1 = aa[i1].a(((com.google.android.m4b.maps.ac.a) (obj1)));
                            if (bd1 != null)
                            {
                                ((af) (obj)).a(bd1);
                            }
                        }

                        obj1 = com.google.android.m4b.maps.al.b.a(ah.a(((com.google.android.m4b.maps.ac.a) (obj1)).d(1)), new ac(i2 - j2, k1, l1, ((af) (obj))));
                        if (((Pair) (obj1)).second == null)
                        {
                            obj = new Pair(((Pair) (obj1)).first, "");
                        } else
                        {
                            obj = obj1;
                        }
                        obj = (Integer)super.e.get(obj);
                        if (obj == null)
                        {
                            if (ab.a(f.getName(), 6))
                            {
                                Log.e(f.getName(), "Received wrong tile");
                            }
                        } else
                        if (l == 0)
                        {
                            if (ab.a(f.getName(), 3))
                            {
                                obj = f.getName();
                                abyte1 = String.valueOf(((Pair) (obj1)).first);
                                obj1 = (String)((Pair) (obj1)).second;
                                Log.d(((String) (obj)), (new StringBuilder(String.valueOf(abyte1).length() + 27 + String.valueOf(obj1).length())).append("COMPACT-0 tile with key: ").append(abyte1).append(", ").append(((String) (obj1))).toString());
                            }
                        } else
                        {
                            b[((Integer) (obj)).intValue()] = abyte1;
                        }
                    }
                    k++;
                } else
                {
                    if (k != j1 && ab.a(f.getName(), 3))
                    {
                        Log.d(f.getName(), (new StringBuilder(48)).append("Received ").append(k).append(" tiles, expected ").append(j1).toString());
                    }
                    return;
                }
            } while (true);
        }

        private b i()
        {
            b b1 = b.a;
            for (int k = 0; k < super.d;)
            {
                b b2;
label0:
                {
                    b b3 = super.c[k].d;
                    if (b1 != b.a)
                    {
                        b2 = b1;
                        if (b3.f >= b1.f)
                        {
                            break label0;
                        }
                    }
                    b2 = b3;
                }
                k++;
                b1 = b2;
            }

            return b1;
        }

        public final void a(DataOutput dataoutput)
        {
            com.google.android.m4b.maps.ac.a a2 = new com.google.android.m4b.maps.ac.a(com.google.android.m4b.maps.cq.e.b);
            com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(com.google.android.m4b.maps.cq.e.c);
            a1.b(1, a2);
            a2.a(1, com.google.android.m4b.maps.bq.a.a(f));
            a2.a(4, com.google.android.m4b.maps.bq.a.b(f));
            a2.a(5, i().f);
            if (com.google.android.m4b.maps.bq.a.c(f) > 1.0F)
            {
                a2.a(6, com.google.android.m4b.maps.bq.a.c(f));
            }
            for (Iterator iterator = com.google.android.m4b.maps.bq.a.d(f).iterator(); iterator.hasNext(); a2.a(2, ((Integer)iterator.next()).intValue())) { }
            if (com.google.android.m4b.maps.bq.a.e(f))
            {
                a2.a(3, 2);
            }
            if (o.a())
            {
                a2.a(3, 0);
            }
            if (f.c.a.a)
            {
                a2.a(3, 4);
            }
            if (i() != b.a)
            {
                a2.a(5, i().f);
            }
            a2.a(3, 6);
            if (f.b == ah.x)
            {
                a2.a(3, 7);
            }
            int l = super.d;
            for (int k = 0; k < l; k++)
            {
                Object obj = super.c[k];
                Object obj1 = ((b.d) (obj)).a;
                com.google.android.m4b.maps.ac.a a3 = new com.google.android.m4b.maps.ac.a(com.google.android.m4b.maps.cq.e.g);
                a3.a(30, al.a(((ac) (obj1)).b, ((ac) (obj1)).c, ((ac) (obj1)).a + com.google.android.m4b.maps.bq.a.f(f)));
                a3.a(2, 0L);
                a3.a(3, 0L);
                a3.a(4, 0L);
                a3.a(1, ((b.d) (obj)).h.A);
                a3.a(7, ((b.d) (obj)).h.B);
                ah ah1 = ((b.d) (obj)).h;
                obj1 = ((ac) (obj1)).d.a.values().iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    bd bd1 = (bd)((Iterator) (obj1)).next();
                    if (bd1.a(ah1))
                    {
                        bd1.a(a3);
                    }
                } while (true);
                if (f.c.a.a)
                {
                    a3.a(8, ((b.d) (obj)).i);
                }
                obj = f.b.H;
                if (obj != null)
                {
                    a3.b(15, obj);
                }
                a1.a(9, a3);
            }

            com.google.android.m4b.maps.ac.c.a(dataoutput, a1);
        }

        protected final boolean a(b.d d1)
        {
            while (super.d == 0 || super.c[0].a.a == d1.a.a && super.c[0].a.d == d1.a.d) 
            {
                return true;
            }
            return false;
        }

        public final boolean a(DataInput datainput)
        {
            datainput = com.google.android.m4b.maps.ac.c.a(datainput);
            com.google.android.m4b.maps.ac.a a1 = new com.google.android.m4b.maps.ac.a(null);
            int k;
            boolean flag;
            if (com.google.android.m4b.maps.ac.c.a(com.google.android.m4b.maps.cq.e.f, datainput, a1) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.m4b.maps.y.j.b(flag);
            a = a1.d(1);
            k = a1.d(2);
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            if (ab.a(f.getName(), 6))
            {
                Log.e(f.getName(), (new StringBuilder(40)).append("Received tile response code: ").append(k).toString());
            }
            a(((InputStream) (datainput)));
            datainput.close();
            return true;
            Exception exception;
            exception;
            datainput.close();
            throw exception;
        }

        protected byte[] a(int k, int l)
        {
            return new byte[k];
        }

        public final int g()
        {
            return 108;
        }

        protected int h()
        {
            return a;
        }

        protected a(e e1)
        {
            f = com.google.android.m4b.maps.bq.a.this;
            super(e1);
            b = new byte[8][];
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        private static final b g[];
        final int f;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/google/android/m4b/maps/bq/a$b, s);
        }

        public static b[] values()
        {
            return (b[])g.clone();
        }

        static 
        {
            a = new b("UNKNOWN", 0, -1);
            b = new b("NORMAL", 1, 1);
            c = new b("PREFETCH_OFFLINE_MAP", 2, 4);
            d = new b("PREFETCH_ROUTE", 3, 6);
            e = new b("PREFETCH_AREA", 4, 12);
            g = (new b[] {
                a, b, c, d, e
            });
        }

        private b(String s, int k, int l)
        {
            super(s, k);
            f = l;
        }
    }


    private volatile boolean e;
    private final int f = 256;
    private final List g;
    private final int h;
    private final int i;
    private final float j;

    protected com.google.android.m4b.maps.bq.a(u u, String s, ah ah1, List list, int k, int l, float f1, 
            boolean flag, Locale locale, File file, e e1)
    {
        com.google.android.m4b.maps.be.k k1 = ah1.b();
        char c2;
        if (com.google.android.m4b.maps.al.b.a() && ah1.G)
        {
            com.google.android.m4b.maps.be.i.c c1 = ah1.a(e1);
            s = new i(s, ah1.a(), c1, ah1, e1);
        } else
        {
            s = null;
        }
        if (ah1 == ah.d)
        {
            c2 = '\u03E8';
        } else
        {
            c2 = '\u0BB8';
        }
        super(u, ah1, k1, s, c2, flag, l, locale, file, e1);
        e = false;
        g = list;
        i = k;
        if (list.contains(Integer.valueOf(7)) || list.contains(Integer.valueOf(10)) || list.contains(Integer.valueOf(11)) || list.contains(Integer.valueOf(12)) || list.contains(Integer.valueOf(9)))
        {
            h = 0;
        } else
        {
            h = 1;
        }
        j = f1;
    }

    static int a(com.google.android.m4b.maps.bq.a a1)
    {
        return a1.f;
    }

    static int b(com.google.android.m4b.maps.bq.a a1)
    {
        return a1.i;
    }

    static float c(com.google.android.m4b.maps.bq.a a1)
    {
        return a1.j;
    }

    static List d(com.google.android.m4b.maps.bq.a a1)
    {
        return a1.g;
    }

    static boolean e(com.google.android.m4b.maps.bq.a a1)
    {
        return a1.e;
    }

    static int f(com.google.android.m4b.maps.bq.a a1)
    {
        return a1.h;
    }
}
