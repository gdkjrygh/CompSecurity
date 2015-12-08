// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.opengl.GLUtils;
import android.os.Process;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.TextView;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bh.a;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.g;
import com.google.android.m4b.maps.bm.k;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.n;
import com.google.android.m4b.maps.bp.b;
import com.google.android.m4b.maps.bq.m;
import com.google.android.m4b.maps.br.c;
import com.google.android.m4b.maps.br.e;
import com.google.android.m4b.maps.cc.h;
import com.google.android.m4b.maps.cc.j;
import com.google.android.m4b.maps.cc.l;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            i, ah, c, aa, 
//            an, am, o, l, 
//            r, f, ab, ag, 
//            u, af, k, ak, 
//            g, d, v, x

public final class ai
    implements com.google.android.m4b.maps.bi.e.a, com.google.android.m4b.maps.bw.g.b, as.k
{
    static final class a
    {

        final r a[];
        final com.google.android.m4b.maps.bx.l b[];

        public a(List list, List list1)
        {
            a = (r[])list.toArray(new r[list.size()]);
            b = (com.google.android.m4b.maps.bx.l[])list1.toArray(new com.google.android.m4b.maps.bx.l[list1.size()]);
        }
    }

    static final class b
    {

        r a;
        a b;

        b(a a1, r r1)
        {
            b = a1;
            a = r1;
        }
    }

    public static final class b.a extends Enum
    {

        public static final b.a a;
        public static final b.a b;
        public static final b.a c;
        private static final b.a d[];

        public static b.a valueOf(String s1)
        {
            return (b.a)Enum.valueOf(com/google/android/m4b/maps/bx/ai$b$a, s1);
        }

        public static b.a[] values()
        {
            return (b.a[])d.clone();
        }

        static 
        {
            a = new b.a("ADD", 0);
            b = new b.a("REMOVE", 1);
            c = new b.a("REPLACE_BASE_TILE", 2);
            d = (new b.a[] {
                a, b, c
            });
        }

        private b.a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public static volatile boolean a = false;
    public static final ThreadLocal b = new ThreadLocal() {

        protected final Object initialValue()
        {
            return new com.google.android.m4b.maps.bm.h();
        }

    };
    private static final int i[] = {
        60672, 59904, 57856, 0x10000
    };
    private static final int j[] = {
        32768, 32768, 32768, 0x10000
    };
    private static final int k[] = {
        32768, 32768, 32768, 0x10000
    };
    private static final int l[] = {
        0, 0, 0, 0x10000
    };
    private static final int m[] = {
        0, 0, 0, 0
    };
    private static final Comparator p = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (r)obj;
            obj1 = (r)obj1;
            return ((r) (obj)).d().ordinal() - ((r) (obj1)).d().ordinal();
        }

    };
    private final float A;
    private e B;
    private final com.google.android.m4b.maps.bx.c C;
    private final aa D = new aa();
    private com.google.android.m4b.maps.bp.c E;
    private final HashSet F = new HashSet();
    private final HashSet G = new HashSet();
    private final int H[] = new int[1];
    private final List I = new ArrayList();
    private long J;
    private boolean K;
    private final l.a L = new l.a() {

        private ai a;

        public final boolean a()
        {
            if (com.google.android.m4b.maps.bx.ai.a(a) != null)
            {
                synchronized (a)
                {
                    com.google.android.m4b.maps.bx.ai.b(a);
                }
            }
            break MISSING_BLOCK_LABEL_35;
            exception;
            ai1;
            JVM INSTR monitorexit ;
            throw exception;
            return true;
        }

            
            {
                a = ai.this;
                super();
            }
    };
    private boolean M;
    private Bitmap N;
    private boolean O;
    private float P;
    private long Q;
    private volatile i R;
    private final List S = new CopyOnWriteArrayList();
    private final List T = new ArrayList();
    private com.google.android.m4b.maps.bx.g U;
    private volatile com.google.android.m4b.maps.bx.g V;
    private volatile boolean W;
    private long X;
    private int Y;
    private boolean Z;
    private volatile float aa;
    private boolean ab;
    private volatile int ac;
    private boolean ad;
    private int ae;
    private long af;
    private Map ag;
    private List ah;
    private boolean ai;
    private boolean aj;
    private final com.google.android.m4b.maps.cf.j ak = null;
    private final com.google.android.m4b.maps.cf.g al = null;
    private volatile long am;
    private final Object an = new Object();
    private final com.google.android.m4b.maps.bw.g ao;
    d c;
    public final com.google.android.m4b.maps.bx.c d;
    public final com.google.android.m4b.maps.bx.ah e;
    final com.google.android.m4b.maps.bp.b f = new com.google.android.m4b.maps.bp.b();
    volatile com.google.android.m4b.maps.bx.g g;
    public volatile com.google.android.m4b.maps.bx.l h;
    private volatile c n;
    private volatile com.google.android.m4b.maps.bi.c o;
    private volatile int q;
    private volatile int r;
    private final LinkedList s = new LinkedList();
    private final ArrayList t = new ArrayList();
    private final ArrayList u = new ArrayList();
    private final ArrayList v = new ArrayList();
    private final com.google.android.m4b.maps.bi.b w;
    private final af x;
    private final g y = new g(this);
    private final Resources z;

    public ai(af af1, Resources resources, com.google.android.m4b.maps.bi.b b1, com.google.android.m4b.maps.bx.l l1, TextView textview, com.google.android.m4b.maps.bw.g g1)
    {
        r = 1;
        J = 0L;
        ab = false;
        ac = 0;
        ad = false;
        ae = 0x7fffffff;
        af = 0L;
        ag = new WeakHashMap();
        ah = new ArrayList();
        ai = true;
        am = -1L;
        n = c.s;
        R = com.google.android.m4b.maps.bx.i.a;
        x = af1;
        z = resources;
        A = resources.getDisplayMetrics().density;
        com.google.android.m4b.maps.cc.l.a(A);
        com.google.android.m4b.maps.cc.j.a(A);
        w = b1;
        h = l1;
        u.add(h);
        e = new com.google.android.m4b.maps.bx.ah(resources);
        d = new com.google.android.m4b.maps.bx.c(2, e);
        C = new com.google.android.m4b.maps.bx.c(1, e);
        c(h);
        c(d);
        c(e);
        c(f);
        c(D);
        af1 = new an(com.google.android.m4b.maps.bx.r.a.d);
        b1 = com.google.android.m4b.maps.bx.i.c;
        ((an) (af1)).b[((i) (b1)).h] = 0x80000000;
        c(af1);
        c(new am());
        if (com.google.android.m4b.maps.bx.o.a())
        {
            E = new com.google.android.m4b.maps.bp.c(resources, textview);
        } else
        {
            E = null;
        }
        h.a(L);
        h.d = true;
        Q = SystemClock.uptimeMillis();
        ao = g1;
    }

    static com.google.android.m4b.maps.bp.c a(ai ai1)
    {
        return ai1.E;
    }

    private void a(com.google.android.m4b.maps.bi.b b1)
    {
        int i1 = b1.h;
        int j1 = b1.i;
        if (i1 > 0 && j1 > 0)
        {
            GL10 gl10 = c.a;
            gl10.glMatrixMode(5889);
            gl10.glLoadIdentity();
            gl10.glViewport(0, 0, i1, j1);
            if (b1.l == null)
            {
                b1.j();
            }
            gl10.glMultMatrixf(b1.l, 0);
            gl10.glEnable(3089);
            gl10.glScissor(0, 0, i1, j1);
        }
    }

    private void a(com.google.android.m4b.maps.bi.b b1, int i1, boolean flag)
    {
        a a1;
        Object obj4;
        Object obj5;
        int j2;
        a1 = j();
        c.h();
        obj4 = R;
        if (b1.g != P)
        {
            a(b1);
            P = b1.g;
        }
        GL10 gl10 = c.a;
        gl10.glMatrixMode(5888);
        gl10.glLoadIdentity();
        if (b1.k == null)
        {
            b1.k();
        }
        gl10.glMultMatrixf(b1.k, 0);
        for (int j1 = 0; j1 < a1.a.length; j1++)
        {
            a1.a[j1].a(i1);
        }

        if (flag)
        {
            for (int k1 = 0; k1 < a1.a.length; k1++)
            {
                a1.a[k1].a(b1, c);
            }

            I.clear();
            boolean flag2 = a;
            D.a = I;
        }
        if (c(((i) (obj4))))
        {
            obj5 = a1.b;
            Object obj;
            boolean flag1;
            if ((i1 & 2) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = B;
            if (((e) (obj)).g != null)
            {
                obj = ((e) (obj)).g.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    h h1 = (h)((Iterator) (obj)).next();
                    if (h1 != null)
                    {
                        h1.a(i1);
                    }
                } while (true);
            }
            com.google.android.m4b.maps.bx.l al1[];
            int i3;
            int l3;
            boolean flag3;
            if (flag1)
            {
                e e1 = B;
                Object obj2 = b1.i();
                e1.a();
                obj2 = ((as) (obj2)).a();
                int l2 = e1.h.size();
                int i2 = 0;
                while (i2 < l2) 
                {
                    obj5 = (h)e1.h.get(i2);
                    if (obj5 != null)
                    {
                        if (((h) (obj5)).a(e1.d, e1.e) && ((ar) (obj2)).b(((h) (obj5)).o().a()))
                        {
                            e1.b(((h) (obj5)));
                        } else
                        {
                            ((h) (obj5)).c(e1.e);
                        }
                    }
                    i2++;
                }
                e1.h.clear();
                e1.i = -1;
                e1.l = true;
                e1.m = true;
                e1.j = false;
                O = true;
            } else
            {
label0:
                {
                    if (flag || O)
                    {
                        break label0;
                    }
                    e e2 = B;
                    long l4 = SystemClock.elapsedRealtime();
                    if (e2.l || e2.m)
                    {
                        boolean flag4 = e2.m;
                        e2.a();
                        int j3 = e2.h.size();
                        j2 = 0;
                        while (j2 < j3) 
                        {
                            h h2 = (h)e2.h.get(j2);
                            if (h2 != null)
                            {
                                if ((!flag4 || h2.a(e2.f) && !e2.c(h2)) && !e2.a(h2))
                                {
                                    e2.b(h2);
                                } else
                                {
                                    h2.c(e2.e);
                                }
                            }
                            j2++;
                        }
                        e2.h.clear();
                        e2.i = -1;
                        e2.l = false;
                        e2.m = false;
                    }
                    e2.j = e2.a(20L + l4);
                }
            }
        }
_L2:
        if (E == null)
        {
            break MISSING_BLOCK_LABEL_1137;
        }
        this;
        JVM INSTR monitorenter ;
        flag3 = K;
        K = false;
        this;
        JVM INSTR monitorexit ;
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_1137;
        }
        F.clear();
        G.clear();
        H[0] = -1;
        j2 = H[0];
        al1 = a1.b;
        l3 = al1.length;
        for (i3 = 0; i3 < l3; i3++)
        {
            al1[i3].a(b1, ((i) (obj4)), F, G, H);
            if (H[0] > j2)
            {
                j2 = H[0];
            }
        }

        break MISSING_BLOCK_LABEL_999;
        com.google.android.m4b.maps.bo.aq aq1;
        com.google.android.m4b.maps.bx.f f1;
        HashSet hashset1;
        HashSet hashset2;
        HashMap hashmap;
        int k3;
        this;
        JVM INSTR monitorenter ;
        this;
        JVM INSTR monitorexit ;
        B.a(b1, aq1, k3, f1, hashset1, hashset2, hashmap, h.e);
        O = false;
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
        Object obj3 = E;
        Object obj1 = F;
        HashSet hashset = G;
        String s1;
        String s2;
        if (j2 == -1)
        {
            j2 = Calendar.getInstance().get(1);
        }
        s1 = com.google.android.m4b.maps.bp.c.a(((HashSet) (obj1)));
        s2 = com.google.android.m4b.maps.bp.c.a(hashset);
        if (!((HashSet) (obj1)).isEmpty() && !hashset.isEmpty())
        {
            obj1 = ((com.google.android.m4b.maps.bp.c) (obj3)).a.getString(com.google.android.m4b.maps.h.h.maps_dav_map_copyrights_full, new Object[] {
                Integer.valueOf(j2), Integer.valueOf(j2), s2, Integer.valueOf(j2), s1
            });
        } else
        if (((HashSet) (obj1)).isEmpty() && hashset.isEmpty())
        {
            obj1 = ((com.google.android.m4b.maps.bp.c) (obj3)).a.getString(com.google.android.m4b.maps.h.h.maps_dav_map_copyrights_google_only, new Object[] {
                Integer.valueOf(j2)
            });
        } else
        if (hashset.isEmpty())
        {
            obj1 = ((com.google.android.m4b.maps.bp.c) (obj3)).a.getString(com.google.android.m4b.maps.h.h.maps_dav_map_copyrights_map_data_only, new Object[] {
                Integer.valueOf(j2), Integer.valueOf(j2), s1
            });
        } else
        {
            obj1 = ((com.google.android.m4b.maps.bp.c) (obj3)).a.getString(com.google.android.m4b.maps.h.h.maps_dav_map_copyrights_imagery_only, new Object[] {
                Integer.valueOf(j2), Integer.valueOf(j2), s2
            });
        }
        obj1 = ((String) (obj1)).replaceAll("&copy;", "\251");
        ((com.google.android.m4b.maps.bp.c) (obj3)).b.post(new com.google.android.m4b.maps.bp.c._cls1(((com.google.android.m4b.maps.bp.c) (obj3)), ((String) (obj1))));
        if (flag || i1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(a1, flag);
        obj1 = new com.google.android.m4b.maps.bx.ab(((i) (obj4)), 0);
        obj3 = c;
        if ((((d) (obj3)).d & 1) == 0)
        {
            ((d) (obj3)).a.glEnableClientState(32884);
            ((d) (obj3)).a(1, true);
        }
        obj3 = c;
        if ((((d) (obj3)).d & 4) == 0)
        {
            ((d) (obj3)).a.glEnable(3042);
            ((d) (obj3)).a(4, true);
        }
        aj = true;
        for (obj3 = ah.iterator(); ((Iterator) (obj3)).hasNext();)
        {
            obj4 = (ag)((Iterator) (obj3)).next();
            obj1.c = ((ag) (obj4));
            obj4 = ((ag) (obj4)).a;
            c.f();
            ((r) (obj4)).a(c, b1, ((com.google.android.m4b.maps.bx.ab) (obj1)));
            c.g();
            aj = ((r) (obj4)).e() & aj;
        }

        c.h();
        i1 = c.a.glGetError();
        if (i1 != 0)
        {
            b1 = new StringBuilder();
            if (i1 == 1285)
            {
                long l5 = SystemClock.uptimeMillis();
                long l6 = X;
                b1.append("\nTime in current GL context: ").append(l5 - l6).append("\n");
                b1.append(com.google.android.m4b.maps.bh.a.a().c());
                W = true;
            }
            if (com.google.android.m4b.maps.ay.ab.a("Renderer", 6))
            {
                b1 = String.valueOf(b1);
                Log.e("Renderer", (new StringBuilder(String.valueOf(b1).length() + 39)).append("drawFrameInternal GL ERROR: ").append(i1).append(b1).toString());
            }
        }
        flag = W;
        if (i1 == 1285)
        {
            b1 = a1.a;
            int k2 = b1.length;
            for (i1 = 0; i1 < k2; i1++)
            {
                b1[i1].l_();
            }

        }
        W = false;
        return;
    }

    private void a(a a1, boolean flag)
    {
        boolean flag1 = false;
        LinkedList linkedlist = s;
        linkedlist;
        JVM INSTR monitorenter ;
        if (ai || flag)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        linkedlist;
        JVM INSTR monitorexit ;
        return;
        r ar1[];
        int j1;
        flag = ai;
        ai = false;
        ar1 = a1.a;
        j1 = ar1.length;
        int i1 = 0;
_L2:
        r r1;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        r1 = ar1[i1];
        Object obj1 = (List)ag.get(r1);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        obj = new ArrayList();
        ag.put(r1, obj);
        flag = true;
        flag |= r1.a(((List) (obj)));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        ah.clear();
        a1 = a1.a;
        j1 = a1.length;
        i1 = ((flag1) ? 1 : 0);
_L15:
        if (i1 >= j1) goto _L6; else goto _L5
_L5:
        obj = a1[i1];
        obj = (List)ag.get(obj);
        if (obj == null) goto _L8; else goto _L7
_L7:
        ah.addAll(((java.util.Collection) (obj)));
          goto _L8
_L6:
        Collections.sort(ah);
        a1 = new HashSet();
        obj = ah.iterator();
_L9:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_295;
            }
            obj1 = (ag)((Iterator) (obj)).next();
            if (a1.contains(((ag) (obj1)).a))
            {
                break MISSING_BLOCK_LABEL_286;
            }
            obj1.d = true;
            a1.add(((ag) (obj1)).a);
        } while (true);
        a1;
        linkedlist;
        JVM INSTR monitorexit ;
        throw a1;
        obj1.d = false;
          goto _L9
        a1.clear();
        obj = com.google.android.m4b.maps.aa.f.a(ah).iterator();
_L13:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L10
_L10:
        obj1 = (ag)((Iterator) (obj)).next();
        if (a1.contains(((ag) (obj1)).a)) goto _L12; else goto _L11
_L11:
        obj1.e = true;
        a1.add(((ag) (obj1)).a);
          goto _L13
_L12:
        obj1.e = false;
          goto _L13
_L4:
        linkedlist;
        JVM INSTR monitorexit ;
        return;
_L8:
        i1++;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public static int[] a(i i1)
    {
        static final class _cls4
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[b.a.values().length];
                try
                {
                    b[com.google.android.m4b.maps.bx.b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[com.google.android.m4b.maps.bx.b.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[com.google.android.m4b.maps.bx.b.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                a = new int[com.google.android.m4b.maps.bx.i.values().length];
                try
                {
                    a[com.google.android.m4b.maps.bx.i.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.google.android.m4b.maps.bx.i.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.google.android.m4b.maps.bx.i.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.google.android.m4b.maps.bx.i.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.google.android.m4b.maps.bx.i.c.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.google.android.m4b.maps.bx.i.g.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.google.android.m4b.maps.bx._cls4.a[i1.ordinal()])
        {
        default:
            return m;

        case 1: // '\001'
            return i;

        case 2: // '\002'
            return i;

        case 3: // '\003'
            return i;

        case 4: // '\004'
            return j;

        case 5: // '\005'
            return k;

        case 6: // '\006'
            return l;
        }
    }

    static boolean b(ai ai1)
    {
        ai1.K = true;
        return true;
    }

    private void c(r r1)
    {
        ai = true;
        s.add(r1);
    }

    private static boolean c(i i1)
    {
        return i1 != com.google.android.m4b.maps.bx.i.f && i1 != com.google.android.m4b.maps.bx.i.e;
    }

    private void f()
    {
        if (q >= 0)
        {
            int i1;
            if (Z)
            {
                i1 = 10;
            } else
            {
                i1 = r;
            }
            try
            {
                Process.setThreadPriority(q, i1);
                if (com.google.android.m4b.maps.ay.ab.a("Renderer", 3))
                {
                    Log.d("Renderer", (new StringBuilder(21)).append("Priority: ").append(i1).toString());
                    return;
                }
            }
            catch (RuntimeException runtimeexception)
            {
                if (com.google.android.m4b.maps.ay.ab.a("Renderer", 6))
                {
                    String s1 = String.valueOf(runtimeexception);
                    Log.e("Renderer", (new StringBuilder(String.valueOf(s1).length() + 31)).append("Could not set thread priority: ").append(s1).toString());
                    return;
                }
            }
        }
    }

    private int g()
    {
        boolean flag = false;
        Iterator iterator = S.iterator();
        Object obj = null;
        int i1;
        int j1;
        for (i1 = 0; iterator.hasNext(); i1 |= j1)
        {
            u u1 = (u)iterator.next();
            j1 = u1.b(w);
            if (j1 != 0 && u1.h() != null)
            {
                obj = u1.h();
            }
        }

        if (i1 != 0)
        {
            if (obj != null && !((com.google.android.m4b.maps.bi.c) (obj)).equals(o))
            {
                h.k = ((com.google.android.m4b.maps.bi.c) (obj));
                o = ((com.google.android.m4b.maps.bi.c) (obj));
            }
            x.a(false, false);
        } else
        {
            h.k = null;
            o = null;
        }
        obj = w;
        if (i1 != 0)
        {
            flag = true;
        }
        if (((com.google.android.m4b.maps.bi.b) (obj)).c != flag)
        {
            obj.c = flag;
            obj.p = com.google.android.m4b.maps.bi.b.o.incrementAndGet();
        }
        return i1;
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = T.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_36;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    private Bitmap i()
    {
        this;
        JVM INSTR monitorenter ;
        M = true;
_L1:
        boolean flag = M;
        Exception exception;
label0:
        {
            if (!flag)
            {
                break label0;
            }
            Bitmap bitmap;
            try
            {
                wait();
            }
            catch (InterruptedException interruptedexception) { }
            finally
            {
                this;
            }
        }
          goto _L1
        bitmap = N;
        N = null;
        this;
        JVM INSTR monitorexit ;
        return bitmap;
        throw exception;
    }

    private a j()
    {
        LinkedList linkedlist = s;
        linkedlist;
        JVM INSTR monitorenter ;
        if (!ad)
        {
            for (Iterator iterator = s.iterator(); iterator.hasNext(); ((r)iterator.next()).a(c, x)) { }
            break MISSING_BLOCK_LABEL_59;
        }
          goto _L1
        Exception exception;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
        ad = true;
          goto _L1
_L34:
        int i1;
        if (i1 >= t.size()) goto _L3; else goto _L2
_L2:
        ai = true;
        obj = (b)t.get(i1);
        com.google.android.m4b.maps.bx._cls4.b[((b) (obj)).b.ordinal()];
        JVM INSTR tableswitch 1 3: default 1048
    //                   1 136
    //                   2 763
    //                   3 870;
           goto _L4 _L5 _L6 _L7
_L5:
        if (s.contains(((b) (obj)).a)) goto _L4; else goto _L8
_L8:
        ((b) (obj)).a.a(null);
        if (!(((b) (obj)).a instanceof com.google.android.m4b.maps.bx.l)) goto _L10; else goto _L9
_L9:
        Object obj2;
        obj2 = (com.google.android.m4b.maps.bx.l)((b) (obj)).a;
        ((com.google.android.m4b.maps.bx.l) (obj2)).a(L);
        u.add(obj2);
        if (((com.google.android.m4b.maps.bx.l) (obj2)).c.ordinal() >= ae) goto _L12; else goto _L11
_L11:
        boolean flag = true;
_L16:
        if (!((com.google.android.m4b.maps.bx.l) (obj2)).m) goto _L10; else goto _L13
_L13:
        Iterator iterator1 = v.iterator();
_L21:
        if (!iterator1.hasNext()) goto _L10; else goto _L14
_L14:
        com.google.android.m4b.maps.bf.c c1;
        Object obj3;
        obj3 = (ah)iterator1.next();
        c1 = ((com.google.android.m4b.maps.bx.l) (obj2)).f;
        if (!(c1.c instanceof com.google.android.m4b.maps.bq.n))
        {
            obj = String.valueOf(c1.c.e());
            throw new UnsupportedOperationException((new StringBuilder(String.valueOf(obj).length() + 35)).append("Modifiers not supported on store '").append(((String) (obj))).append("'").toString());
        }
          goto _L15
_L12:
        obj2.d = false;
          goto _L16
_L15:
        if (!((ah) (obj3)).C)
        {
            obj = String.valueOf(obj3);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Only modifiers may be added, not ").append(((String) (obj))).toString());
        }
        if (!com.google.android.m4b.maps.bq.l.a(((ah) (obj3)))) goto _L18; else goto _L17
_L17:
        Object obj4;
        obj4 = com.google.android.m4b.maps.bq.l.b(((ah) (obj3)));
        if (!(obj4 instanceof m))
        {
            obj = String.valueOf(((com.google.android.m4b.maps.bq.j) (obj4)).e());
            throw new UnsupportedOperationException((new StringBuilder(String.valueOf(obj).length() + 49)).append("Modifier store '").append(((String) (obj))).append("' must be a vector modifier store").toString());
        }
        obj3 = c1.f;
        obj3;
        JVM INSTR monitorenter ;
        if (!c1.f.contains(obj4)) goto _L20; else goto _L19
_L19:
        obj2.j = true;
          goto _L21
_L20:
        ((com.google.android.m4b.maps.bq.j) (obj4)).a(c1.h);
        c1.f.add((m)obj4);
        obj3;
        JVM INSTR monitorexit ;
        obj3 = new TreeSet();
        obj4 = c1.f;
        obj4;
        JVM INSTR monitorenter ;
        for (Iterator iterator2 = c1.f.iterator(); iterator2.hasNext(); ((TreeSet) (obj3)).add(((m)iterator2.next()).e())) { }
          goto _L22
        obj;
        obj4;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        obj3;
        JVM INSTR monitorexit ;
        throw obj;
_L18:
        obj = String.valueOf(obj3);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 19)).append("Unknown tile store ").append(((String) (obj))).toString());
_L22:
        obj4;
        JVM INSTR monitorexit ;
        synchronized (c1.j)
        {
            c1.j.add(c1.d);
        }
        c1.d = new com.google.android.m4b.maps.bh.a.d(c1.c.e(), ((Set) (obj3)), c1.e);
          goto _L19
        obj;
        set;
        JVM INSTR monitorexit ;
        throw obj;
_L10:
        c(((b) (obj)).a);
        obj2 = ((b) (obj)).a.g();
        if (obj2 == null) goto _L24; else goto _L23
_L23:
        a(((u) (obj2)));
_L24:
        ((b) (obj)).a.a(c, x);
        boolean flag1 = true;
          goto _L4
_L6:
        if (!s.remove(((b) (obj)).a)) goto _L4; else goto _L25
_L25:
        if (!(((b) (obj)).a instanceof com.google.android.m4b.maps.bx.l)) goto _L27; else goto _L26
_L26:
        if (((b) (obj)).a.d().ordinal() == ae)
        {
            flag = true;
        }
        u.remove(((b) (obj)).a);
_L27:
        ag.remove(((b) (obj)).a);
        ((b) (obj)).a.a(c);
        obj = ((b) (obj)).a.g();
        if (obj == null) goto _L4; else goto _L28
_L28:
        S.remove(obj);
          goto _L4
_L7:
        h = (com.google.android.m4b.maps.bx.l)((b) (obj)).a;
          goto _L4
_L3:
        t.clear();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_978;
        }
        ae = 0x7fffffff;
        iterator1 = u.iterator();
        Object obj1 = null;
_L30:
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (com.google.android.m4b.maps.bx.l)iterator1.next();
        obj2.d = false;
        if (((com.google.android.m4b.maps.bx.l) (obj2)).c.ordinal() >= ae)
        {
            continue; /* Loop/switch isn't completed */
        }
        ae = ((com.google.android.m4b.maps.bx.l) (obj2)).c.ordinal();
        obj1 = obj2;
        if (true) goto _L30; else goto _L29
_L29:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_978;
        }
        obj1.d = true;
        if (!flag1) goto _L32; else goto _L31
_L31:
        if (s.size() > 1)
        {
            Collections.sort(s, p);
        }
_L32:
        obj1 = new a(s, u);
        linkedlist;
        JVM INSTR monitorexit ;
        return ((a) (obj1));
_L1:
        i1 = 0;
        flag = false;
        flag1 = false;
        continue; /* Loop/switch isn't completed */
_L4:
        i1++;
        if (true) goto _L34; else goto _L33
_L33:
    }

    private void k()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        i1 = Y;
        Y = 0;
        this;
        JVM INSTR monitorexit ;
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        Object obj;
        boolean flag;
        if (i1 == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (com.google.android.m4b.maps.ay.ab.a("Renderer", 3))
        {
            Iterator iterator;
            Exception exception;
            if (flag)
            {
                obj = " critical";
            } else
            {
                obj = "";
            }
            obj = String.valueOf(obj);
            if (((String) (obj)).length() != 0)
            {
                obj = "onLowMemory".concat(((String) (obj)));
            } else
            {
                obj = new String("onLowMemory");
            }
            Log.d("Renderer", ((String) (obj)));
        }
        obj = B;
        if (flag)
        {
            ((e) (obj)).a.b.a();
            ((e) (obj)).c.a();
        } else
        {
            obj = ((e) (obj)).a;
            ((com.google.android.m4b.maps.bx.k) (obj)).b.a(Math.max(((com.google.android.m4b.maps.bw.e) (((com.google.android.m4b.maps.bx.k) (obj)).b)).a.size() / 2, 8));
        }
        obj = s;
        obj;
        JVM INSTR monitorenter ;
        for (iterator = s.iterator(); iterator.hasNext(); ((r)iterator.next()).a(flag)) { }
        break MISSING_BLOCK_LABEL_210;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        JVM INSTR monitorexit ;
_L2:
    }

    public final float a(com.google.android.m4b.maps.bo.g g1)
    {
        LinkedList linkedlist = s;
        linkedlist;
        JVM INSTR monitorenter ;
        Iterator iterator = u.iterator();
        float f1 = 21F;
_L1:
        com.google.android.m4b.maps.bx.l l1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_80;
        }
        l1 = (com.google.android.m4b.maps.bx.l)iterator.next();
        if (l1.h != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        float f2 = 21F;
_L2:
        f1 = Math.min(f1, f2);
          goto _L1
        f2 = l1.h.a(g1);
          goto _L2
        linkedlist;
        JVM INSTR monitorexit ;
        return f1;
        g1;
        linkedlist;
        JVM INSTR monitorexit ;
        throw g1;
    }

    public final Bitmap a(Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        N = bitmap;
        bitmap = i();
        this;
        JVM INSTR monitorexit ;
        return bitmap;
        bitmap;
        throw bitmap;
    }

    public final ak a(r.a a1)
    {
        return new ak(a1, e);
    }

    public final void a()
    {
        x.a(false, false);
    }

    public final void a(c c1)
    {
        if (c1 != n)
        {
            n = c1;
            if (B != null)
            {
                e e1 = B;
                if (c1 != e1.b)
                {
                    e1.b = c1;
                    e1.k = true;
                }
                x.a(true, false);
            }
        }
    }

    public final void a(com.google.android.m4b.maps.bx.l l1)
    {
        synchronized (s)
        {
            b b1 = new b(com.google.android.m4b.maps.bx.b.a.a, l1);
            t.add(b1);
            l1 = new b(com.google.android.m4b.maps.bx.b.a.c, l1);
            t.add(l1);
            l1 = new b(com.google.android.m4b.maps.bx.b.a.b, h);
            t.add(l1);
        }
        if (B != null)
        {
            B.k = true;
        }
        x.a(true, false);
        return;
        l1;
        linkedlist;
        JVM INSTR monitorexit ;
        throw l1;
    }

    public final void a(r r1)
    {
        synchronized (s)
        {
            r1 = new b(com.google.android.m4b.maps.bx.b.a.a, r1);
            t.add(r1);
        }
        x.a(true, false);
        return;
        r1;
        linkedlist;
        JVM INSTR monitorexit ;
        throw r1;
    }

    public final void a(u u1)
    {
        S.add(u1);
    }

    public final void a(v v1, x x1)
    {
        e.a(v1, x1);
    }

    public final void a(GL10 gl10)
    {
        com.google.android.m4b.maps.av.a.a();
        q = Process.myTid();
        f();
        com.google.android.m4b.maps.ao.b.a(gl10.glGetString(7937));
        LinkedList linkedlist = s;
        linkedlist;
        JVM INSTR monitorenter ;
        for (Iterator iterator = s.iterator(); iterator.hasNext(); ((r)iterator.next()).a(null)) { }
        break MISSING_BLOCK_LABEL_71;
        gl10;
        linkedlist;
        JVM INSTR monitorexit ;
        throw gl10;
        ad = false;
        linkedlist;
        JVM INSTR monitorexit ;
        if (c != null && c.a != gl10)
        {
            if (B != null)
            {
                e e1 = B;
                for (int i1 = 0; i1 < e1.g.size(); i1++)
                {
                    if ((h)e1.g.get(i1) != null)
                    {
                        ((h)e1.g.get(i1)).c(e1.e);
                    }
                }

                e1.a.b.a(0);
                e1.c.a(0);
            }
            if (c != null)
            {
                c.A.a();
                Object obj = c.C;
                com.google.android.m4b.maps.bm.j aj1[] = ((k) (obj)).a;
                int l1 = aj1.length;
                for (int k1 = 0; k1 < l1; k1++)
                {
                    com.google.android.m4b.maps.bm.j j1 = aj1[k1];
                    if (j1 != null)
                    {
                        j1.c();
                    }
                }

                obj.a = null;
                c.h();
                obj = c;
                ((d) (obj)).t.c(((d) (obj)));
                ((d) (obj)).q.c(((d) (obj)));
                ((d) (obj)).p.c(((d) (obj)));
                ((d) (obj)).v.c(((d) (obj)));
                ((d) (obj)).r.c(((d) (obj)));
                ((d) (obj)).u.c(((d) (obj)));
                ((d) (obj)).s.c(((d) (obj)));
            }
            c = null;
        }
        if (c == null)
        {
            X = SystemClock.uptimeMillis();
            c = new d(gl10, y, x, al, z);
            c.b.f = Z;
            gl10 = c;
            if (((d) (gl10)).f == null)
            {
                int ai1[] = new int[2];
                ((d) (gl10)).a.glGetIntegerv(33902, ai1, 0);
                gl10.f = Integer.valueOf(ai1[1]);
            }
            com.google.android.m4b.maps.cc.l.a(((d) (gl10)).f.intValue());
            B = new e(n, c, z, ao);
            d.a = B;
            C.a = B;
        }
        x.d();
        O = true;
        if (ab)
        {
            ac = 2;
        }
        ab = true;
        if (com.google.android.m4b.maps.ay.ab.a("Renderer", 3))
        {
            Log.d("Renderer", "Surface created");
        }
        com.google.android.m4b.maps.av.a.b();
        return;
    }

    public final void a(GL10 gl10, int i1, int j1)
    {
        if (c.a != gl10)
        {
            gl10 = new IllegalStateException("GL object has changed since onSurfaceCreated");
            if (com.google.android.m4b.maps.ay.ab.a("Renderer", 6))
            {
                Log.e("Renderer", "OpenGL error during initialization.", gl10);
            }
        }
        if (i1 <= 0 || j1 <= 0)
        {
            return;
        }
        gl10 = w;
        float f1 = A;
        gl10.p = com.google.android.m4b.maps.bi.b.o.incrementAndGet();
        gl10.h = Math.max(1, i1);
        gl10.i = Math.max(1, j1);
        gl10.j = f1;
        gl10.b();
        gl10.a();
        gl10.a(true);
        a(w);
        P = w.g;
        f1 = A;
        aa = Math.max(2.0F, (float)Math.ceil(com.google.android.m4b.maps.bi.b.a((float)Math.ceil((float)(int)Math.ceil(Math.hypot(i1, j1)) / (f1 * 256F)) + 1.0F)));
        if (com.google.android.m4b.maps.ay.ab.a("Renderer", 3))
        {
            Log.d("Renderer", (new StringBuilder(40)).append("Surface changed: ").append(i1).append("x").append(j1).toString());
        }
        x.a(true, false);
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Z = flag;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        c.b.f = flag;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        c.b.a();
        f();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        com.google.android.m4b.maps.bh.a a1 = com.google.android.m4b.maps.bh.a.a();
        if (a1 != null)
        {
            a1.a(c);
        }
    }

    public final void b(i i1)
    {
        if (i1 == R)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        R = i1;
        this;
        JVM INSTR monitorenter ;
        K = true;
        this;
        JVM INSTR monitorexit ;
        if (B != null)
        {
            B.k = true;
            x.a(true, false);
        }
        return;
        i1;
        this;
        JVM INSTR monitorexit ;
        throw i1;
    }

    public final void b(r r1)
    {
        synchronized (s)
        {
            r1 = new b(com.google.android.m4b.maps.bx.b.a.b, r1);
            t.add(r1);
        }
        x.a(true, false);
        return;
        r1;
        linkedlist;
        JVM INSTR monitorexit ;
        throw r1;
    }

    public final void b(GL10 gl10)
    {
        if (c.a != gl10)
        {
            gl10 = new IllegalStateException("GL object has changed since onSurfaceCreated");
            if (com.google.android.m4b.maps.ay.ab.a("Renderer", 6))
            {
                Log.e("Renderer", "OpenGL error during initialization.", gl10);
            }
        }
        gl10 = c;
        com.google.android.m4b.maps.al.a.a();
        com.google.android.m4b.maps.al.a.b();
        gl10.n = false;
        i i1 = R;
        gl10 = c.a;
        int ai1[] = a(i1);
        gl10.glClearColorx(ai1[0], ai1[1], ai1[2], ai1[3]);
        char c1 = '\u4000';
        if (c.k)
        {
            c1 = '\u4100';
            c.k = false;
        }
        int k1 = c1;
        if (c.l)
        {
            gl10.glClearStencil(0);
            k1 = c1 | 0x400;
            c.l = false;
        }
        gl10.glClear(k1);
        if (ac <= 0) goto _L2; else goto _L1
_L1:
        ac = ac - 1;
        x.a(true, true);
_L22:
        return;
_L2:
        if (am == -1L)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        synchronized (an)
        {
            if (am < System.currentTimeMillis())
            {
                am = -1L;
            }
        }
        gl10 = x;
        gl10;
        JVM INSTR monitorenter ;
        if (((af) (gl10)).l == null)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        ((af) (gl10)).l.a();
_L4:
        if (ao.b())
        {
            break MISSING_BLOCK_LABEL_331;
        }
        gl10 = ao;
        if (gl10.b())
        {
            a();
            return;
        }
        break MISSING_BLOCK_LABEL_310;
        exception;
        gl10;
        JVM INSTR monitorexit ;
        throw exception;
        ((af) (gl10)).k.s();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception1;
        exception1;
        gl10;
        JVM INSTR monitorexit ;
        throw exception1;
        gl10;
        JVM INSTR monitorenter ;
        ((com.google.android.m4b.maps.bw.g) (gl10)).a.add(this);
        gl10;
        JVM INSTR monitorexit ;
        return;
        exception1;
        gl10;
        JVM INSTR monitorexit ;
        throw exception1;
        int j1;
        int l1;
        int i2;
        boolean flag;
        boolean flag1;
        i2 = g();
        Object obj;
        IntBuffer intbuffer;
        int j2;
        int k2;
        if ((i2 & 2) != 0 || c.h)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b.e = flag;
        flag = x.e();
        if (w.p != J)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0)
        {
            J = w.p;
            flag = true;
        }
        h();
        gl10 = c;
        obj = ((d) (gl10)).b;
        obj.b = 0;
        obj.c = SystemClock.elapsedRealtime();
        gl10.j = SystemClock.uptimeMillis();
        gl10.h = false;
        if (((d) (gl10)).i != 0L && ((d) (gl10)).j >= ((d) (gl10)).i)
        {
            gl10.i = 0L;
        }
        k();
        U = g;
        if (U != null)
        {
            U.b = this;
            U.d();
        }
        gl10 = V;
        if (w.e <= 1.0F) goto _L6; else goto _L5
_L5:
        a(w, i2, flag);
        gl10 = c.b;
        j2 = (int)(SystemClock.elapsedRealtime() - ((af) (gl10)).c);
        if (((af) (gl10)).e)
        {
            j1 = ((af) (gl10)).a;
        } else
        {
            j1 = ((af) (gl10)).d;
        }
        l1 = j1;
        if (((af) (gl10)).f)
        {
            l1 = j1 + 500;
        }
        j1 = Math.max(l1, 15);
        gl10;
        JVM INSTR monitorenter ;
        l1 = j1;
        if (((af) (gl10)).l == null) goto _L8; else goto _L7
_L7:
        l1 = ((af) (gl10)).l.b;
        if (((af) (gl10)).g) goto _L10; else goto _L9
_L9:
        if (!((af) (gl10)).e) goto _L12; else goto _L11
_L11:
        ((af) (gl10)).l.c();
_L20:
        obj = ((af) (gl10)).l;
        l1 = j1;
        if (((af.a) (obj)).b == j1) goto _L8; else goto _L13
_L13:
        l1 = j1;
        if (j1 <= 15) goto _L8; else goto _L14
_L14:
        obj.b = j1;
        obj.c = true;
        ((af.a) (obj)).interrupt();
        l1 = j1;
_L8:
        gl10;
        JVM INSTR monitorexit ;
        if (!((af) (gl10)).f && !((af) (gl10)).e)
        {
            gl10.h = j2 + 5 + ((af) (gl10)).h;
            gl10.i = l1 + ((af) (gl10)).i;
            j1 = ((af) (gl10)).j + 1;
            gl10.j = j1;
            if (j1 == 20)
            {
                float f1 = (float)(((af) (gl10)).i - ((af) (gl10)).h) / (float)((af) (gl10)).i;
                if (f1 < 0.23F)
                {
                    gl10.a((int)((float)((af) (gl10)).d * 1.1F));
                } else
                if (f1 > 0.37F)
                {
                    gl10.a((int)((float)((af) (gl10)).d * 0.9F));
                }
                gl10.j = 0;
                gl10.h = 0;
                gl10.i = 0;
            }
        }
_L6:
        if (x.f() && (i2 & 2) != 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (aj && (!B.j || !c(R)) && !c.h && j1 == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (U == null)
        {
            break MISSING_BLOCK_LABEL_923;
        }
        gl10 = U;
        if (!gl10.a(flag1)) goto _L16; else goto _L15
_L15:
        ((com.google.android.m4b.maps.bx.g) (gl10)).b.g = null;
        gl10;
        JVM INSTR monitorenter ;
        gl10.a = true;
        gl10.notifyAll();
        gl10;
        JVM INSTR monitorexit ;
_L16:
        U.c = false;
        this;
        JVM INSTR monitorenter ;
        flag1 = M;
        this;
        JVM INSTR monitorexit ;
        if (!flag1) goto _L18; else goto _L17
_L17:
        obj = c.a;
        j1 = w.h;
        l1 = w.i;
        gl10 = N;
        if (gl10 == null || gl10.getWidth() != j1 || gl10.getHeight() != l1)
        {
            gl10 = y.a(j1, l1, android.graphics.Bitmap.Config.ARGB_8888);
        }
        j2 = GLUtils.getInternalFormat(gl10);
        k2 = GLUtils.getType(gl10);
        intbuffer = IntBuffer.allocate(j1 * l1);
        ((GL10) (obj)).glReadPixels(0, 0, j1, l1, j2, k2, intbuffer);
        gl10.setPixels(intbuffer.array(), 0, j1, 0, 0, j1, l1);
        this;
        JVM INSTR monitorenter ;
        N = gl10;
        M = false;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
_L18:
        if (B.j || c.h)
        {
            x.a(false, false);
            return;
        }
        break MISSING_BLOCK_LABEL_1240;
_L12:
        if (((af) (gl10)).l.d() == 0x7fffffffffffffffL) goto _L20; else goto _L19
_L19:
        j1 = (int)(((af) (gl10)).l.d() - SystemClock.uptimeMillis());
          goto _L20
_L10:
        ((af) (gl10)).l.b();
        gl10.g = false;
        l1 = j1;
          goto _L8
        obj;
        gl10;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        gl10;
        JVM INSTR monitorexit ;
        throw obj;
        gl10;
        this;
        JVM INSTR monitorexit ;
        throw gl10;
        gl10;
        this;
        JVM INSTR monitorexit ;
        throw gl10;
        if (android.os.Build.VERSION.SDK_INT < 9 && !flag && i2 == 0)
        {
            long l2 = SystemClock.uptimeMillis();
            if (l2 - Q > 10000L)
            {
                System.gc();
                Q = l2;
            }
        }
        gl10 = c;
        long l3;
        if (((d) (gl10)).i == 0L)
        {
            l3 = -1L;
        } else
        {
            l3 = Math.max(0L, ((d) (gl10)).i - SystemClock.uptimeMillis());
        }
        if (l3 >= 0L)
        {
            x.a(false, false);
            return;
        }
        if (true) goto _L22; else goto _L21
_L21:
    }

    public final void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (flag)
        {
            i1 = 2;
        } else
        {
            i1 = 1;
        }
        Y = i1;
        this;
        JVM INSTR monitorexit ;
        x.a(false, false);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final com.google.android.m4b.maps.bx.d c()
    {
        return new com.google.android.m4b.maps.bx.d(z, e);
    }

    public final ArrayList d()
    {
        ArrayList arraylist = new ArrayList(s.size());
        synchronized (s)
        {
            arraylist.addAll(s);
        }
        return arraylist;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final float e()
    {
        return aa;
    }

}
