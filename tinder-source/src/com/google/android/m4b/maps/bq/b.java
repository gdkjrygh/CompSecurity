// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.ay.t;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.ay.v;
import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.be.c;
import com.google.android.m4b.maps.be.k;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ad;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.ap;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bx.o;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            f, j, k, g

public abstract class com.google.android.m4b.maps.bq.b extends Thread
    implements v, f, j
{
    public static abstract class a extends n
    {

        private com.google.android.m4b.maps.bq.b a;
        private final e b;
        final d c[] = new d[8];
        int d;
        final Map e = ax.b();

        static com.google.android.m4b.maps.bq.b a(a a1)
        {
            return a1.a;
        }

        static com.google.android.m4b.maps.bq.b a(a a1, com.google.android.m4b.maps.bq.b b1)
        {
            a1.a = b1;
            return b1;
        }

        static boolean b(a a1)
        {
            return a1.d + 2 <= a1.c.length;
        }

        protected abstract aa a(int i1);

        protected final void a(Pair pair, d d1)
        {
            Pair pair1 = pair;
            if (pair.second == null)
            {
                pair1 = new Pair(pair.first, "");
            }
            if (e.get(pair1) != null)
            {
                pair = String.valueOf(pair1);
                d1 = String.valueOf(d1);
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(pair).length() + 50 + String.valueOf(d1).length())).append("Duplicate tile key: ").append(pair).append(", already exists in batch for ").append(d1).toString());
            } else
            {
                e.put(pair1, Integer.valueOf(d));
                pair = c;
                int i1 = d;
                d = i1 + 1;
                pair[i1] = d1;
                return;
            }
        }

        protected boolean a(d d1)
        {
            return true;
        }

        protected byte[] b(int i1)
        {
            return null;
        }

        protected int h()
        {
            return -1;
        }

        protected a(e e1)
        {
            d = 0;
            b = e1;
        }
    }

    final class b extends Thread
    {

        volatile boolean a;
        volatile boolean b;
        private com.google.android.m4b.maps.bq.b c;

        public final void run()
        {
            Process.setThreadPriority(com.google.android.m4b.maps.bx.o.c() + 1);
_L2:
            Object obj;
            obj = c.a.a();
            if (obj == null)
            {
                return;
            }
            break; /* Loop/switch isn't completed */
            obj;
            if (ab.a("DashServerTileStore", 6))
            {
                Log.e("DashServerTileStore", "Could not set thread priority", ((Throwable) (obj)));
            }
            if (true) goto _L2; else goto _L1
_L1:
            if (a || !com.google.android.m4b.maps.bq.b.e(c)) goto _L4; else goto _L3
_L3:
            com.google.android.m4b.maps.bq.b.f(c);
            ((com.google.android.m4b.maps.be.c) (obj)).k_();
_L8:
            b = true;
            com.google.android.m4b.maps.bq.b.g(c);
            return;
_L4:
            a = false;
            int i1;
            try
            {
                i1 = com.google.android.m4b.maps.bq.b.d(c);
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
_L6:
            if (i1 <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            sleep(1000L);
            if (com.google.android.m4b.maps.bq.b.e(c))
            {
                break; /* Loop/switch isn't completed */
            }
            i1 -= 1000;
            if (true) goto _L6; else goto _L5
_L5:
            if (a) goto _L4; else goto _L7
_L7:
            com.google.android.m4b.maps.bq.b.f(c);
            ((com.google.android.m4b.maps.be.c) (obj)).k_();
              goto _L8
        }

        b()
        {
            c = com.google.android.m4b.maps.bq.b.this;
            String s1 = String.valueOf(getName());
            if (s1.length() != 0)
            {
                s1 = "CacheCommitter:".concat(s1);
            } else
            {
                s1 = new String("CacheCommitter:");
            }
            super(s1);
            if (com.google.android.m4b.maps.bq.b.d(com.google.android.m4b.maps.bq.b.this) < 0)
            {
                b = true;
                return;
            } else
            {
                start();
                return;
            }
        }
    }

    public static final class c
        implements com.google.android.m4b.maps.bd.d
    {

        aa a;

        public final void a(ac ac1, int i1, aa aa1)
        {
            if (i1 == 0)
            {
                a = aa1;
            }
        }

        protected c()
        {
        }
    }

    public static final class d
        implements g.a
    {

        final ac a;
        final com.google.android.m4b.maps.bd.d b;
        final boolean c;
        final a.b d;
        final boolean e;
        final boolean f;
        final boolean g;
        final ah h;
        int i;
        volatile boolean j;
        d k;

        static void a(d d1, int i1, aa aa1)
        {
            d1.b.a(d1.a, i1, aa1);
        }

        public final void a()
        {
            j = true;
        }

        final void a(d d1)
        {
            d1.k = k;
            k = d1;
        }

        public final String toString()
        {
            String s1 = String.valueOf(h);
            String s2 = String.valueOf(a);
            return (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s2).length())).append(s1).append("/").append(s2).toString();
        }

        protected d(ah ah, ac ac1, com.google.android.m4b.maps.bd.d d1)
        {
            this(ah, ac1, d1, a.b.b, false, false, -1, false);
        }

        protected d(ah ah, ac ac1, com.google.android.m4b.maps.bd.d d1, byte byte0)
        {
            this(ah, ac1, d1, a.b.b, false, true, -1, false);
        }

        protected d(ah ah, ac ac1, com.google.android.m4b.maps.bd.d d1, a.b b1, boolean flag, boolean flag1, int i1, 
                boolean flag2)
        {
            boolean flag3 = false;
            super();
            j = false;
            k = null;
            h = ah;
            a = ac1;
            b = d1;
            d = b1;
            if (b1.equals(com.google.android.m4b.maps.bq.a.b.e) || b1.equals(com.google.android.m4b.maps.bq.a.b.d))
            {
                flag3 = true;
            }
            c = flag3;
            e = flag;
            i = i1;
            f = flag1;
            g = flag2;
        }
    }


    protected com.google.android.m4b.maps.bq.k a;
    protected final ah b;
    protected final e c;
    private volatile b e;
    private final ReentrantLock f = new ReentrantLock();
    private final u g;
    private Handler h;
    private Looper i;
    private boolean j;
    private a k;
    private final List l = new LinkedList();
    private final com.google.android.m4b.maps.bw.e m;
    private final Map n = new HashMap();
    private final int o;
    private volatile int p;
    private volatile int q;
    private volatile int r;
    private boolean s;
    private final ArrayList t = new ArrayList();
    private volatile boolean u;
    private final com.google.android.m4b.maps.bd.d v = new com.google.android.m4b.maps.bd.d() {

        private com.google.android.m4b.maps.bq.b a;

        public final void a(ac ac1, int l1, aa aa1)
        {
            if (l1 == 0)
            {
                com.google.android.m4b.maps.bq.b.a(a, aa1);
            }
        }

            
            {
                a = com.google.android.m4b.maps.bq.b.this;
                super();
            }
    };

    protected com.google.android.m4b.maps.bq.b(u u1, ah ah, k k1, com.google.android.m4b.maps.be.c c1, int i1, boolean flag, int j1, 
            Locale locale, File file, e e1)
    {
        s = false;
        u = false;
        b = ah;
        a = new com.google.android.m4b.maps.bq.k(getName(), k1, c1, flag, locale, file);
        o = i1;
        g = u1;
        k = d();
        a.a(k, this);
        m = new com.google.android.m4b.maps.bw.e(j1) {

            private com.google.android.m4b.maps.bq.b d;

            public final void a(Object obj)
            {
                obj = (d)obj;
                d.a(((d) (obj)), 1, null);
            }

            
            {
                d = com.google.android.m4b.maps.bq.b.this;
                super(i1);
            }
        };
        c = e1;
    }

    private Pair a(d d1, boolean flag, boolean flag1)
    {
        boolean flag2 = true;
        Object obj = null;
        d d2 = null;
        Object obj1 = null;
        ac ac1 = d1.a.a(e());
        if (a.a != null)
        {
            aa aa1 = a.a.c(ac1);
            if (aa1 != null)
            {
                com.google.android.m4b.maps.ay.k.a();
                if (!aa1.d())
                {
                    if (a.a.a(aa1))
                    {
                        a(d1, 2, ((aa) (null)));
                        flag = true;
                        d1 = obj1;
                    } else
                    {
                        d2 = a(aa1, d1, flag1);
                        if (!flag1)
                        {
                            if (d1.c)
                            {
                                aa1 = obj;
                            }
                            a(d1, 0, aa1);
                            d1 = d2;
                            flag = true;
                        } else
                        {
                            d1 = d2;
                            flag = false;
                        }
                    }
                    return Pair.create(Boolean.valueOf(flag), d1);
                }
            }
        }
        if (flag)
        {
            com.google.android.m4b.maps.be.c c1 = a.a();
            if (c1 != null)
            {
                if (d1.c)
                {
                    if (c1.b(ac1))
                    {
                        a(d1, 0, ((aa) (null)));
                        return Pair.create(Boolean.valueOf(true), null);
                    }
                } else
                {
                    aa aa2 = c1.c(ac1);
                    if (aa2 != null)
                    {
                        com.google.android.m4b.maps.ay.k.a();
                        if (!aa2.d())
                        {
                            if (c1.a(aa2))
                            {
                                a(d1, ac1);
                                flag = flag2;
                                d1 = d2;
                            } else
                            {
                                if (a.a != null)
                                {
                                    a.a.a(ac1, aa2);
                                }
                                d d3 = a(aa2, d1, flag1);
                                if (!flag1)
                                {
                                    a(d1, 0, aa2);
                                    d1 = d3;
                                    flag = flag2;
                                } else
                                {
                                    flag = false;
                                    d1 = d3;
                                }
                            }
                            return Pair.create(Boolean.valueOf(flag), d1);
                        }
                    }
                }
            }
        }
        d1.i = -1;
        return Pair.create(Boolean.valueOf(false), null);
    }

    private d a(aa aa1, d d1, boolean flag)
    {
        Object obj;
        int i1;
        int j1;
        j1 = -1;
        i1 = a.b();
        obj = null;
        if (i1 == -1 || i1 == aa1.c()) goto _L2; else goto _L1
_L1:
        boolean flag1 = true;
_L4:
        aa1 = obj;
        if (flag1)
        {
            aa1 = new d(b, d1.a.a(b), v, a.b.b, true, false, j1, true);
        }
        return aa1;
_L2:
        if (c.a.a && !d1.c)
        {
            com.google.android.m4b.maps.ay.k.a();
            if (aa1.f() || flag)
            {
                j1 = aa1.e();
                flag1 = true;
                continue; /* Loop/switch isn't completed */
            }
        }
        flag1 = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(int i1)
    {
        com.google.android.m4b.maps.bq.k k1 = a;
        com.google.android.m4b.maps.be.c c2 = k1.a();
        com.google.android.m4b.maps.be.c c1 = c2;
        if (c2 != null)
        {
            c1 = c2;
            if (!c2.a(i1))
            {
                c1 = null;
            }
        }
        k1.d = i1;
        if (k1.e)
        {
            if (c1 != null)
            {
                c1.a();
            }
            if (k1.a != null)
            {
                k1.a.a();
            }
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            f();
        }
    }

    private void a(d d1)
    {
        if (e != null)
        {
            e.a = true;
        }
        d1 = h.obtainMessage(1, d1);
        h.sendMessage(d1);
    }

    private void a(d d1, ac ac1)
    {
        if (a.a != null)
        {
            a.a.a_(ac1);
        }
        a(d1, 2, ((aa) (null)));
    }

    static void a(com.google.android.m4b.maps.bq.b b1)
    {
        b1.j = false;
        b1.g();
    }

    static void a(com.google.android.m4b.maps.bq.b b1, aa aa1)
    {
        ArrayList arraylist = b1.t;
        arraylist;
        JVM INSTR monitorenter ;
        int i1 = 0;
_L2:
        Object obj;
        if (i1 >= b1.t.size())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj = (j.a)((WeakReference)b1.t.get(i1)).get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        ((j.a) (obj)).a(aa1);
        break MISSING_BLOCK_LABEL_88;
        obj = b1.t;
        int j1 = i1 - 1;
        ((ArrayList) (obj)).remove(i1);
        i1 = j1;
        break MISSING_BLOCK_LABEL_88;
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void a(com.google.android.m4b.maps.bq.b b1, ad ad1, a.b b2, com.google.android.m4b.maps.bd.d d1)
    {
        int i1 = com.google.android.m4b.maps.bq.g.a(b2, false);
        b2 = b1.a.a();
        do
        {
            ac ac1 = ad1.a();
            if (ac1 != null)
            {
                if (b2 != null)
                {
                    b2.a(ac1, d1, i1);
                } else
                {
                    d1.a(ac1, 1, null);
                }
            } else
            {
                b1.u = true;
                b1.h();
                return;
            }
        } while (true);
    }

    static void a(com.google.android.m4b.maps.bq.b b1, a a1)
    {
        com.google.android.m4b.maps.be.c c1;
        int i1;
        if (b1.s)
        {
            b1.s = false;
            while (b1.m.a.size() != 0) 
            {
                Object obj = b1.m;
                if (((com.google.android.m4b.maps.bw.e) (obj)).c == null)
                {
                    obj = null;
                } else
                {
                    obj = ((com.google.android.m4b.maps.bw.e) (obj)).d(((com.google.android.m4b.maps.bw.e) (obj)).c.c);
                }
                b1.b((d)obj);
            }
        }
        i1 = a1.h();
        if (i1 != -1 && i1 != b1.a.b())
        {
            if (ab.a(b1.getName(), 3))
            {
                String s1 = b1.getName();
                int j1 = b1.a.b();
                boolean flag = b1.a.e;
                Log.d(s1, (new StringBuilder(70)).append("Received version: ").append(i1).append(" Cached version: ").append(j1).append(" Clear: ").append(flag).toString());
            }
            b1.a(i1);
        }
        if (!b1.l.remove(a1))
        {
            if (ab.a(b1.getName(), 3))
            {
                Log.d(b1.getName(), "Request not found in list of outstanding requests");
            }
            return;
        }
        c1 = b1.a.a();
        i1 = 0;
_L24:
        if (i1 >= a1.d) goto _L2; else goto _L1
_L1:
        d d1;
        Object obj3;
        d1 = a1.c[i1];
        obj3 = d1.a.a(d1.h);
        b1.n.remove(obj3);
        b1.p = b1.p - 1;
        if (!d1.c) goto _L4; else goto _L3
_L3:
        b1.r = b1.r + 1;
_L13:
        byte abyte0[];
        Object obj2;
        obj2 = null;
        abyte0 = ((byte []) (obj2));
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        byte abyte1[] = a1.b(i1);
        abyte0 = ((byte []) (obj2));
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        abyte0 = new byte[abyte1.length];
        System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
        Object obj4;
        obj4 = c(d1);
        obj2 = a1.a(i1);
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        if (b1.a.a != null && !d1.c && (((aa) (obj2)).b() == null || ((aa) (obj2)).b() != obj4))
        {
            b1.a.a.a(((ac) (obj3)), ((aa) (obj2)));
        }
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        if (((aa) (obj2)).b() == null || ((aa) (obj2)).b() != obj4)
        {
            c1.a(((ac) (obj3)), ((aa) (obj2)), abyte0);
        }
        if (((aa) (obj2)).b() == null || ((aa) (obj2)).b() != obj4) goto _L8; else goto _L7
_L7:
        Object obj5;
        ac ac1 = ((ac) (obj3)).a(b1.b);
        obj5 = b1.a.a.c(ac1);
        if (obj5 == null) goto _L10; else goto _L9
_L9:
        if (!b1.a.a.a(((aa) (obj5)))) goto _L11; else goto _L10
_L10:
        if (ab.a("DashServerTileStore", 5))
        {
            String s2 = String.valueOf(obj3);
            obj5 = String.valueOf(obj5);
            obj4 = String.valueOf(obj4);
            Log.w("DashServerTileStore", (new StringBuilder(String.valueOf(s2).length() + 67 + String.valueOf(obj5).length() + String.valueOf(obj4).length())).append(" No base tile for a diff tile: coords: ").append(s2).append(" baseTile: ").append(((String) (obj5))).append(" diff tile type: ").append(((String) (obj4))).toString());
        }
        b1.a(d1, 2, ((aa) (obj2)));
          goto _L12
_L4:
        IOException ioexception;
        b1.q = b1.q + 1;
          goto _L13
_L11:
        Object obj1 = com.google.android.m4b.maps.bo.e.b((ap)obj5, (ap)obj2, b1.c);
_L23:
        if (obj4 == null) goto _L15; else goto _L14
_L14:
        if (((aa) (obj2)).b() == b1.b) goto _L12; else goto _L15
_L15:
        b1.a(d1, 0, ((aa) (obj1)));
          goto _L12
_L6:
        if (!b1.c.a.a) goto _L17; else goto _L16
_L16:
        obj2 = null;
        if (b1.a.a == null || !b1.a.a.b(((ac) (obj3)))) goto _L19; else goto _L18
_L18:
        obj1 = b1.a.a.c(((ac) (obj3)));
_L21:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1101;
        }
        if (((aa) (obj1)).e() == -1)
        {
            break MISSING_BLOCK_LABEL_1101;
        }
        com.google.android.m4b.maps.ay.k.a();
        ((aa) (obj1)).g();
        if (b1.a.a != null && !d1.c)
        {
            b1.a.a.a(((ac) (obj3)), ((aa) (obj1)));
        }
        obj2 = b1.a.a();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_934;
        }
        obj4 = ((com.google.android.m4b.maps.be.c) (obj2)).a(((ac) (obj3)));
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_934;
        }
        ((com.google.android.m4b.maps.be.c) (obj2)).a(((ac) (obj3)), ((aa) (obj1)), ((byte []) (obj4)));
        b1.a(d1, 0, ((aa) (obj1)));
        int k1 = 1;
_L25:
        if (k1 == 0)
        {
            try
            {
                b1.a(d1, ((ac) (obj3)));
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                if (ab.a("DashServerTileStore", 6))
                {
                    obj2 = String.valueOf(b1.getName());
                    obj3 = String.valueOf(obj3);
                    Log.e("DashServerTileStore", (new StringBuilder(String.valueOf(obj2).length() + 24 + String.valueOf(obj3).length())).append(((String) (obj2))).append(": Could not parse tile: ").append(((String) (obj3))).toString(), ioexception);
                }
                b1.a(d1, 1, ((aa) (null)));
            }
        }
          goto _L12
_L19:
        obj4 = b1.a.a();
        obj1 = obj2;
        if (obj4 == null) goto _L21; else goto _L20
_L20:
        obj1 = obj2;
        if (!((com.google.android.m4b.maps.be.c) (obj4)).b(((ac) (obj3)))) goto _L21; else goto _L22
_L22:
        obj1 = ((com.google.android.m4b.maps.be.c) (obj4)).c(((ac) (obj3)));
          goto _L21
_L17:
        b1.a(d1, ((ac) (obj3)));
          goto _L12
_L2:
        if (ab.a(b1.getName(), 3))
        {
            a1 = b1.getName();
            i1 = b1.r;
            k1 = b1.q;
            Log.d(a1, (new StringBuilder(73)).append("Response received. Total tiles: prefetch: ").append(i1).append(" normal: ").append(k1).toString());
        }
        b1.h();
        return;
_L8:
        obj1 = obj2;
          goto _L23
_L12:
        i1++;
          goto _L24
        k1 = 0;
          goto _L25
    }

    static void a(com.google.android.m4b.maps.bq.b b1, d d1)
    {
        b1.b(d1);
    }

    private void b(d d1)
    {
        ac ac1;
        boolean flag2;
        flag2 = false;
        ac1 = d1.a.a(b);
        if (!com.google.android.m4b.maps.bq.j.d.equals(ac1)) goto _L2; else goto _L1
_L1:
        a(d1, 3, ((aa) (null)));
_L5:
        return;
_L2:
        Object obj;
        ah ah;
        d d3;
        boolean flag3;
        boolean flag4;
        d3 = (d)n.get(ac1);
        ah = c(d1);
        if (ah != null)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (!d1.f) goto _L4; else goto _L3
_L3:
        if (d1.e && ab.a(getName(), 3))
        {
            Log.d(getName(), "Local tile request shouldn't be have 'mMustSkipCache = true'.");
        }
        obj = a(d1, true, false);
        flag3 = ((Boolean)((Pair) (obj)).first).booleanValue();
        obj = (d)((Pair) (obj)).second;
_L6:
        if (!flag3)
        {
            a(d1, 3, ((aa) (null)));
        }
        boolean flag;
        if (obj != null)
        {
            if (d3 != null)
            {
                if (!((d) (obj)).g)
                {
                    d3.a(((d) (obj)));
                    return;
                }
            } else
            {
                if (s && !n.isEmpty() && !((d) (obj)).c)
                {
                    d1 = (d)m.c(ac1);
                    if (d1 != null)
                    {
                        d1.a(((d) (obj)));
                        return;
                    } else
                    {
                        m.b(ac1, obj);
                        return;
                    }
                }
                n.put(ac1, obj);
                if (!k.a(((d) (obj))) || flag4 && !a.b(k))
                {
                    g();
                }
                k.a(com.google.android.m4b.maps.al.b.a(e(), ac1), ((d) (obj)));
                if (flag4)
                {
                    d1 = d1.a.a(ah);
                    d d2 = new d(ah, d1, ((d) (obj)).b, ((d) (obj)).d, ((d) (obj)).e, ((d) (obj)).f, ((d) (obj)).i, ((d) (obj)).g);
                    k.a(com.google.android.m4b.maps.al.b.a(d2.h, d1), d2);
                }
                p = p + 1;
                d1 = k;
                boolean flag1 = flag2;
                if (((a) (d1)).d == ((a) (d1)).c.length)
                {
                    flag1 = true;
                }
                if (flag1 || ((d) (obj)).e)
                {
                    g();
                    return;
                }
                if (!j)
                {
                    d1 = h.obtainMessage(2);
                    h.sendMessageDelayed(d1, 50L);
                    j = true;
                    return;
                }
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (d1.e)
        {
            flag3 = false;
        } else
        {
label0:
            {
                if (d3 == null)
                {
                    break label0;
                }
                if (d3.k != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag && d3.g)
                {
                    break label0;
                }
                flag3 = false;
            }
        }
_L8:
        obj = d1;
          goto _L6
        obj = a(d1, true, flag4);
        flag3 = ((Boolean)((Pair) (obj)).first).booleanValue();
        if (!flag3) goto _L8; else goto _L7
_L7:
        obj = (d)((Pair) (obj)).second;
          goto _L6
    }

    static void b(com.google.android.m4b.maps.bq.b b1)
    {
        b1.s = true;
    }

    private static ah c(d d1)
    {
        for (d1 = d1.a.d.a().iterator(); d1.hasNext();)
        {
            com.google.android.m4b.maps.bo.bd.a a1 = (com.google.android.m4b.maps.bo.bd.a)d1.next();
            if (a1.a() != null)
            {
                return a1.a();
            }
        }

        return null;
    }

    static void c(com.google.android.m4b.maps.bq.b b1)
    {
        Object obj = new LinkedList(b1.l);
        b1.l.clear();
        for (obj = ((LinkedList) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            a a1 = (a)((Iterator) (obj)).next();
            int i1 = 0;
            while (i1 < a1.d) 
            {
                d d1 = a1.c[i1];
                b1.n.remove(d1.a);
                b1.p = b1.p - 1;
                b1.b(a1.c[i1]);
                i1++;
            }
        }

    }

    static int d(com.google.android.m4b.maps.bq.b b1)
    {
        return b1.o;
    }

    static boolean e(com.google.android.m4b.maps.bq.b b1)
    {
        return b1.u;
    }

    private void f()
    {
        ArrayList arraylist = t;
        arraylist;
        JVM INSTR monitorenter ;
        int i1 = 0;
_L2:
        Object obj;
        if (i1 >= t.size())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj = (j.a)((WeakReference)t.get(i1)).get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        ((j.a) (obj)).a();
        break MISSING_BLOCK_LABEL_81;
        obj = t;
        int j1 = i1 - 1;
        ((ArrayList) (obj)).remove(i1);
        i1 = j1;
        break MISSING_BLOCK_LABEL_81;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static boolean f(com.google.android.m4b.maps.bq.b b1)
    {
        b1.u = false;
        return false;
    }

    private void g()
    {
        if (k.d > 0)
        {
            g.c(k);
            l.add(k);
            k = d();
            a.a(k, this);
        }
    }

    static void g(com.google.android.m4b.maps.bq.b b1)
    {
        b1.h();
    }

    private void h()
    {
        f.lock();
        if (a.b != null && a.b.b() && (e == null || e.b))
        {
            e = new b();
        }
        f.unlock();
        return;
        Exception exception;
        exception;
        f.unlock();
        throw exception;
    }

    public aa a(ac ac1, boolean flag)
    {
        c c1 = new c();
        ac1 = (d)a(new d(b, ac1, c1), flag, false).second;
        if (ac1 != null)
        {
            h.sendMessage(h.obtainMessage(1, ac1));
        }
        return c1.a;
    }

    public final g.a a(ac ac1, com.google.android.m4b.maps.bd.d d1, a.b b1)
    {
        ac1 = new d(b, ac1, d1, b1, false, false, -1, false);
        d1 = h.obtainMessage(1, ac1);
        h.sendMessage(d1);
        return ac1;
    }

    public final void a()
    {
        com.google.android.m4b.maps.bq.k k1 = a;
        if (k1.a != null)
        {
            k1.a.a();
        }
        com.google.android.m4b.maps.be.c c1 = k1.a();
        if (c1 != null && !c1.a())
        {
            c1.e();
            if (ab.a(k1.g, 6))
            {
                Log.e(k1.g, "Unable to clear disk cache");
            }
            k1.b = null;
        }
        f();
    }

    public final void a(int i1, String s1)
    {
        if (ab.a("DashServerTileStore", 6))
        {
            if (s1 != null)
            {
                s1 = String.valueOf(s1);
                if (s1.length() != 0)
                {
                    s1 = " : ".concat(s1);
                } else
                {
                    s1 = new String(" : ");
                }
            } else
            {
                s1 = "";
            }
            Log.e("DashServerTileStore", (new StringBuilder(String.valueOf(s1).length() + 29)).append("Network Error! ").append(i1).append(" : ").append(s1).toString());
        }
        h.sendMessage(h.obtainMessage(4));
    }

    public final void a(t t1)
    {
        if ((t1 instanceof a) && a.a((a)t1) == this)
        {
            h.sendMessage(h.obtainMessage(3, t1));
        }
    }

    public void a(ac ac1, com.google.android.m4b.maps.bd.d d1)
    {
        a(new d(b, ac1, d1));
    }

    final void a(d d1, int i1, aa aa1)
    {
        boolean flag = false;
        d d2 = d1;
        while (d2 != null) 
        {
            if (i1 == 0 && !d2.j && com.google.android.m4b.maps.bq.g.a(d2.d))
            {
                if (aa1.h())
                {
                    a.a().a(d1.a, d2.b, com.google.android.m4b.maps.bq.g.a(d2.d, true));
                    flag = true;
                } else
                {
                    d.a(d2, 4, aa1);
                }
            } else
            {
                d.a(d2, i1, aa1);
            }
            d2 = d2.k;
        }
        if (flag)
        {
            u = true;
            h();
        }
    }

    public final void a(j.a a1)
    {
        synchronized (t)
        {
            t.add(new WeakReference(a1));
        }
        return;
        a1;
        arraylist;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void b()
    {
        g.a(this);
        start();
        this;
        JVM INSTR monitorenter ;
        while (h == null) 
        {
            wait();
        }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
        }
        return;
        this;
        JVM INSTR monitorexit ;
    }

    public final void b(t t1)
    {
    }

    public final void b(ac ac1, com.google.android.m4b.maps.bd.d d1)
    {
        a(new d(b, ac1, d1, (byte)0));
    }

    public final void c()
    {
        com.google.android.m4b.maps.bq.k k1 = a;
        if (k1.a != null)
        {
            k1.a.a();
        }
    }

    protected abstract a d();

    public ah e()
    {
        return b;
    }

    public void run()
    {
        Process.setThreadPriority(com.google.android.m4b.maps.bx.o.c());
_L2:
        Looper.prepare();
        i = Looper.myLooper();
        h = new Handler() {

            private com.google.android.m4b.maps.bq.b a;

            public final void handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    return;

                case 1: // '\001'
                    com.google.android.m4b.maps.bq.b.a(a, (d)message.obj);
                    return;

                case 2: // '\002'
                    com.google.android.m4b.maps.bq.b.a(a);
                    return;

                case 3: // '\003'
                    com.google.android.m4b.maps.bq.b.a(a, (a)message.obj);
                    return;

                case 4: // '\004'
                    com.google.android.m4b.maps.bq.b.b(a);
                    return;

                case 5: // '\005'
                    synchronized (message.obj)
                    {
                        message.obj.notify();
                    }
                    com.google.android.m4b.maps.bq.b.c(a);
                    return;

                case 6: // '\006'
                    message = (Pair)message.obj;
                    com.google.android.m4b.maps.bq.b.a(a, (ad)((Pair)((Pair) (message)).first).first, (a.b)((Pair)((Pair) (message)).first).second, (com.google.android.m4b.maps.bd.d)((Pair) (message)).second);
                    return;
                }
                message;
                obj1;
                JVM INSTR monitorexit ;
                throw message;
            }

            
            {
                a = com.google.android.m4b.maps.bq.b.this;
                super();
            }
        };
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        Object obj;
        obj = a;
        if (((com.google.android.m4b.maps.bq.k) (obj)).b != null && !((com.google.android.m4b.maps.bq.k) (obj)).b.a(((com.google.android.m4b.maps.bq.k) (obj)).h))
        {
            if (ab.a(((com.google.android.m4b.maps.bq.k) (obj)).g, 3))
            {
                Log.d(((com.google.android.m4b.maps.bq.k) (obj)).g, "Unable to init disk cache");
            }
            obj.b = null;
        }
        if (((com.google.android.m4b.maps.bq.k) (obj)).b == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if (!((com.google.android.m4b.maps.bq.k) (obj)).f.equals(((com.google.android.m4b.maps.bq.k) (obj)).b.d()))
        {
            ((com.google.android.m4b.maps.bq.k) (obj)).b.a(((com.google.android.m4b.maps.bq.k) (obj)).f);
        }
        obj.c = true;
        obj;
        JVM INSTR monitorenter ;
        obj.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        Looper.loop();
        return;
        obj;
        if (ab.a("DashServerTileStore", 6))
        {
            Log.e("DashServerTileStore", "Could not set thread priority", ((Throwable) (obj)));
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
