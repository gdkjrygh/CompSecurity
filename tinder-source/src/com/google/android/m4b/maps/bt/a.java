// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.graphics.Bitmap;
import android.util.Log;
import android.widget.TextView;
import com.google.android.m4b.maps.a.k;
import com.google.android.m4b.maps.a.l;
import com.google.android.m4b.maps.a.r;
import com.google.android.m4b.maps.aa.af;
import com.google.android.m4b.maps.am.g;
import com.google.android.m4b.maps.am.j;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.cg.bc;
import com.google.android.m4b.maps.cg.o;
import com.google.android.m4b.maps.y.p;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            b, c, k, i

class com.google.android.m4b.maps.bt.a
{
    static final class a extends g
    {

        private final String l;

        public final Map a()
        {
            return af.a("User-Agent", l);
        }

        a(String s1, com.google.android.m4b.maps.a.m.b b1, String s2)
        {
            super(s1, b1, android.graphics.Bitmap.Config.ARGB_8888, com.google.android.m4b.maps.bt.a.e());
            l = s2;
        }
    }

    static final class b extends j
    {

        private final String l;

        public final Map a()
        {
            return af.a("User-Agent", l);
        }

        b(String s1, com.google.android.m4b.maps.a.m.b b1, String s2)
        {
            super(s1, b1, com.google.android.m4b.maps.bt.a.e(), (byte)0);
            l = s2;
        }
    }


    private static final String i = com/google/android/m4b/maps/bt/a.getSimpleName();
    private static final com.google.android.m4b.maps.a.m.a j = new com.google.android.m4b.maps.a.m.a() {

        public final void a(r r1)
        {
            if (!com.google.android.m4b.maps.y.p.b(r1.getMessage()) && ab.a(com.google.android.m4b.maps.bt.a.d(), 6))
            {
                Log.e(com.google.android.m4b.maps.bt.a.d(), r1.getMessage());
            }
        }

    };
    final com.google.android.m4b.maps.bt.b a;
    int b;
    bc c;
    com.google.android.m4b.maps.ac.a d;
    String e;
    com.google.android.m4b.maps.bt.k f;
    Bitmap g;
    Bitmap h;
    private final TextView k;
    private final l l;
    private final c m;
    private final Calendar n;
    private final boolean o;
    private final o p;
    private final String q;
    private g r;
    private j s;
    private String t;

    com.google.android.m4b.maps.bt.a(com.google.android.m4b.maps.bt.b b1, TextView textview, l l1, c c1, Calendar calendar, boolean flag, o o1, 
            e e1, bc bc1, String s1)
    {
        b = 1;
        a = b1;
        k = textview;
        l = l1;
        m = c1;
        n = calendar;
        o = flag;
        p = o1;
        c = bc1;
        q = s1;
        b1 = new com.google.android.m4b.maps.bs.e.a(e1) {

            private e a;
            private com.google.android.m4b.maps.bt.a b;

            public final void a()
            {
                com.google.android.m4b.maps.bt.a a1 = b;
                String s2 = a.c.d;
                com.google.android.m4b.maps.ac.a a2 = a.e;
                a1.e = s2;
                a1.d = a2.f(1);
                a1.a();
            }

            
            {
                b = com.google.android.m4b.maps.bt.a.this;
                a = e1;
                super();
            }
        };
        textview = null;
        e1;
        JVM INSTR monitorenter ;
        if (!e1.f && !e1.g) goto _L2; else goto _L1
_L1:
        e1;
        JVM INSTR monitorexit ;
        if (b1 != null)
        {
            b1.a();
        }
        return;
_L2:
        e1.h.add(b1);
        b1 = textview;
        if (true) goto _L1; else goto _L3
_L3:
        b1;
        e1;
        JVM INSTR monitorexit ;
        throw b1;
    }

    static Bitmap a(com.google.android.m4b.maps.bt.a a1, Bitmap bitmap)
    {
        a1.g = bitmap;
        return bitmap;
    }

    static bc a(com.google.android.m4b.maps.bt.a a1)
    {
        return a1.c;
    }

    static String a(com.google.android.m4b.maps.bt.a a1, String s1)
    {
        a1.t = s1;
        return s1;
    }

    static Bitmap b(com.google.android.m4b.maps.bt.a a1, Bitmap bitmap)
    {
        a1.h = bitmap;
        return bitmap;
    }

    static void b(com.google.android.m4b.maps.bt.a a1)
    {
        a1.f();
    }

    static Calendar c(com.google.android.m4b.maps.bt.a a1)
    {
        return a1.n;
    }

    static String d()
    {
        return i;
    }

    static com.google.android.m4b.maps.a.m.a e()
    {
        return j;
    }

    private void f()
    {
        if (c())
        {
            Bitmap bitmap;
            if (c != null && c.a)
            {
                bitmap = h;
            } else
            {
                bitmap = g;
            }
            a.a(bitmap, f);
            if (t != null)
            {
                k.setText(t);
            } else
            {
                k.setText("");
            }
            p.a(true);
        }
    }

    final void a()
    {
        Object obj;
        boolean flag2 = false;
        p.a(false);
        com.google.android.m4b.maps.bt.k k1 = m.b();
        float f1;
        boolean flag;
        boolean flag1;
        if (k1.f > 0 && k1.g > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag2;
        if (flag)
        {
            flag1 = flag2;
            if (d != null)
            {
                flag1 = flag2;
                if (!com.google.android.m4b.maps.y.p.b(e))
                {
                    flag1 = true;
                }
            }
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        obj = d.f(10);
        f1 = Float.intBitsToFloat(((com.google.android.m4b.maps.ac.a) (obj)).f(5).d(5));
        f = new com.google.android.m4b.maps.bt.k(k1.e, k1.f, k1.g, f1, k1.a, k1.b, k1.c, k1.d);
        if (b != 0) goto _L4; else goto _L3
_L3:
        b();
        f();
_L2:
        return;
_L4:
        Object obj1;
        obj1 = com.google.android.m4b.maps.bt.i.a(((com.google.android.m4b.maps.ac.a) (obj)), f, b, null, e);
        if (r == null || !((String) (obj1)).equals(((k) (r)).b))
        {
            break; /* Loop/switch isn't completed */
        }
        if (c())
        {
            p.a(true);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        b();
        obj1 = new a(((String) (obj1)), new com.google.android.m4b.maps.a.m.b() {

            private com.google.android.m4b.maps.bt.a a;

            public final void a(Object obj2)
            {
                obj2 = (Bitmap)obj2;
                com.google.android.m4b.maps.bt.a.a(a, ((Bitmap) (obj2)));
                if (com.google.android.m4b.maps.bt.a.a(a) == null || !com.google.android.m4b.maps.bt.a.a(a).a)
                {
                    com.google.android.m4b.maps.bt.a.b(a);
                }
            }

            
            {
                a = com.google.android.m4b.maps.bt.a.this;
                super();
            }
        }, q);
        r = (g)l.a(((k) (obj1)));
        if (o)
        {
            b b1 = new b(com.google.android.m4b.maps.bt.i.a(((com.google.android.m4b.maps.ac.a) (obj)), f, b, e), new com.google.android.m4b.maps.a.m.b() {

                private com.google.android.m4b.maps.bt.a a;

                public final void a(Object obj2)
                {
                    String s1 = (String)obj2;
                    obj2 = a;
                    Object obj3 = com.google.android.m4b.maps.bt.a.c(a);
                    String as[] = s1.replace("[", "").replace("]", "").replace("\"", "").split(",");
                    int i1 = ((Calendar) (obj3)).get(1);
                    obj3 = String.valueOf(com.google.android.m4b.maps.y.g.a(", ").a(as));
                    com.google.android.m4b.maps.bt.a.a(((com.google.android.m4b.maps.bt.a) (obj2)), (new StringBuilder(String.valueOf(obj3).length() + 13)).append("\251").append(i1).append(" ").append(((String) (obj3))).toString().trim());
                    com.google.android.m4b.maps.bt.a.b(a);
                }

            
            {
                a = com.google.android.m4b.maps.bt.a.this;
                super();
            }
            }, q);
            s = (j)l.a(b1);
        }
        if (c != null)
        {
            obj = com.google.android.m4b.maps.bt.i.a(((com.google.android.m4b.maps.ac.a) (obj)), f, b, c, e);
            com.google.android.m4b.maps.a.m.b b2 = new com.google.android.m4b.maps.a.m.b() {

                private com.google.android.m4b.maps.bt.a a;

                public final void a(Object obj2)
                {
                    obj2 = (Bitmap)obj2;
                    com.google.android.m4b.maps.bt.a.b(a, ((Bitmap) (obj2)));
                    if (com.google.android.m4b.maps.bt.a.a(a).a)
                    {
                        com.google.android.m4b.maps.bt.a.b(a);
                    }
                }

            
            {
                a = com.google.android.m4b.maps.bt.a.this;
                super();
            }
            };
            l.a(new a(((String) (obj)), b2, q));
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    final void b()
    {
        if (r != null)
        {
            r.h = true;
            r = null;
            g = null;
            h = null;
        }
        if (s != null)
        {
            s.h = true;
            s = null;
            t = null;
        }
    }

    final boolean c()
    {
label0:
        {
            if (r != null)
            {
                Bitmap bitmap;
                if (c != null && c.a)
                {
                    bitmap = h;
                } else
                {
                    bitmap = g;
                }
                if (bitmap == null || o && t == null)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

}
