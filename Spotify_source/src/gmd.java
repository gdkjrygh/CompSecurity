// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.core.internal.ConnectivityListener;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class gmd
{

    public ConnectivityListener A;
    public boolean B;
    public long C;
    public List D;
    public long E;
    private long F;
    private List G;
    private Map H;
    private long I;
    private List J;
    private List K;
    public final Context a;
    public gfi b;
    boolean c;
    public long d;
    public long e;
    public bad f;
    public bad g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public gmb l;
    public int m;
    public long n;
    public long o;
    public int p;
    public int q;
    public boolean r;
    public long s;
    public boolean t;
    public boolean u;
    public long v;
    public long w;
    public long x;
    public int y;
    public long z;

    public gmd(Context context)
    {
        t = true;
        v = -1L;
        w = -1L;
        x = -1L;
        y = -1;
        G = new LinkedList();
        D = new LinkedList();
        J = new LinkedList();
        K = new LinkedList();
        H = new HashMap();
        a = context;
        dmz.a(ggb);
        ggb.a();
        c();
        A = new ConnectivityListener(null, context);
    }

    public final gma a()
    {
        if (!b())
        {
            return gma.d();
        } else
        {
            return d();
        }
    }

    public final void a(long l1, long l2)
    {
        l2 -= l1;
        I = I + l2;
        if (l2 > 0L)
        {
            G.add(new gmc(l1, l2));
        }
    }

    public final void a(long l1, long l2, bad bad1)
    {
        l1 = l2 - l1;
        if (bad1 != null)
        {
            if (H.containsKey(bad1.a))
            {
                H.put(bad1.a, new glz(bad1, l1 + ((glz)H.get(bad1.a)).b));
                return;
            } else
            {
                H.put(bad1.a, new glz(bad1, l1));
                return;
            }
        } else
        {
            F = F + l1;
            return;
        }
    }

    public final boolean b()
    {
        return k;
    }

    public final void c()
    {
        l = null;
        G.clear();
        H.clear();
        J.clear();
        K.clear();
        D.clear();
        C = -1L;
        B = false;
        I = 0L;
        n = 0L;
        m = 0;
        o = 0L;
        p = 0;
        q = 0;
        e = 0L;
        d = 0L;
        h = 0L;
        f = null;
        g = null;
        r = true;
        u = false;
        v = -1L;
        w = -1L;
        s = -1L;
        z = 0L;
        x = -1L;
        E = 0L;
    }

    public final gma d()
    {
        long l2 = I;
        long l3 = F;
        Object obj = H.values().iterator();
        double d1;
        double d2;
        glz glz1;
        long l1;
        for (l1 = 0L; ((Iterator) (obj)).hasNext(); l1 = (long)(((double)glz1.b / (double)(l2 - l3)) * d2 + d1))
        {
            glz1 = (glz)((Iterator) (obj)).next();
            d1 = l1;
            d2 = glz1.a.c;
        }

        l.E = l1;
        Collections.sort(G, gmc.a);
        obj = G.iterator();
        l2 = 0L;
        l3 = 0L;
        l1 = 0L;
        while (((Iterator) (obj)).hasNext()) 
        {
            gmc gmc1 = (gmc)((Iterator) (obj)).next();
            long l4 = gmc1.b;
            long l6 = gmc1.c;
            l1 = Math.max(l1, l6);
            if (l4 >= l3)
            {
                l2 += l6;
                l3 = l4 + l6;
            } else
            {
                l2 += Math.max(0L, (l4 + l6) - l3);
                l3 = Math.max(l3, l4 + l6);
            }
        }
        obj = J.iterator();
        long l5 = 0L;
        gmc gmc2;
        for (l3 = 0L; ((Iterator) (obj)).hasNext(); l3 = Math.max(l3, gmc2.c))
        {
            gmc2 = (gmc)((Iterator) (obj)).next();
            l5 += gmc2.c;
        }

        obj = K.iterator();
        long l8 = 0L;
        gmc gmc3;
        long l7;
        for (l7 = 0L; ((Iterator) (obj)).hasNext(); l7 = Math.max(l7, gmc3.c))
        {
            gmc3 = (gmc)((Iterator) (obj)).next();
            l8 += gmc3.c;
        }

        obj = D.iterator();
        long l9;
        for (l9 = 0L; ((Iterator) (obj)).hasNext(); l9 = ((gmc)((Iterator) (obj)).next()).c + l9) { }
        String s1;
        if (g != null)
        {
            obj = g.f;
            gmb gmb1;
            int i1;
            if (obj == null)
            {
                obj = "";
            }
            obj = (String)obj;
        } else
        {
            obj = "";
        }
        if (f != null)
        {
            s1 = f.f;
            if (s1 == null)
            {
                s1 = "";
            }
            s1 = (String)s1;
        } else
        {
            s1 = "";
        }
        l.H = k;
        gmb1 = l;
        gmb1.B = l1;
        gmb1.C = l2;
        gmb1.v = n;
        gmb1.u = m;
        gmb1.x = o;
        gmb1.w = p;
        gmb1.D = q;
        gmb1.r = I;
        gmb1.A = r;
        gmb1.I = l5;
        gmb1.N = l3;
        gmb1.L = l8;
        gmb1.M = l7;
        gmb1.O = z;
        gmb1.p = s1;
        gmb1.q = ((String) (obj));
        gmb1.Q = l9;
        gmb1.P = x;
        i1 = y;
        gmb1.F = (String)gmb.T.get(Integer.valueOf(i1));
        if (gmb1.F == null)
        {
            gmb1.F = "unknown";
        }
        i1 = A.getConnectionType();
        gmb1.G = (String)gmb.T.get(Integer.valueOf(i1));
        if (gmb1.G == null)
        {
            gmb1.G = "unknown";
        }
        gmb1.o = c;
        return gmb1.a();
    }

    public final boolean e()
    {
        return w != -1L;
    }

    public final void f()
    {
        if (w >= 0L)
        {
            long l1 = gcf.b();
            long l2 = w;
            K.add(new gmc(w, l1 - l2));
            w = -1L;
        }
    }

    public final boolean g()
    {
        return s != -1L;
    }

    public final void h()
    {
        if (s >= 0L)
        {
            long l1 = gcf.b();
            long l2 = s;
            J.add(new gmc(s, l1 - l2));
            s = -1L;
        }
    }
}
