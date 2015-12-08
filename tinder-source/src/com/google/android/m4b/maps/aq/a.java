// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.content.res.Resources;
import android.os.Handler;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bx.e;
import com.google.android.m4b.maps.bx.p;
import com.google.android.m4b.maps.bx.z;
import com.google.android.m4b.maps.cg.bp;
import com.google.android.m4b.maps.cg.cb;
import com.google.android.m4b.maps.df.aa;
import com.google.android.m4b.maps.df.r;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.y.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            u, b, v, p

public final class a
    implements e, com.google.android.m4b.maps.bx.p.e, z, bp
{

    private static final double b = 1.0D / Math.log(2D);
    private final u c;
    private final v d;
    private final Handler e;
    private r f;
    private aa g;
    private final Collection h = new ArrayList();
    private int i;

    public a(v v1, u u1, Handler handler)
    {
        d = v1;
        c = u1;
        e = handler;
        c.e.a(this);
        c.e.a(this);
        c.e.a(this);
    }

    private static int a(int k)
    {
        if (k == -1)
        {
            return 330;
        } else
        {
            return Math.max(0, k);
        }
    }

    static u a(a a1)
    {
        return a1.c;
    }

    private static c a(LatLngBounds latlngbounds, double d1, double d2, double d3)
    {
        d3 = 256D * d3;
        g g1 = com.google.android.m4b.maps.aq.b.b(latlngbounds.c);
        latlngbounds = com.google.android.m4b.maps.aq.b.b(latlngbounds.b);
        int k;
        int l;
        int i1;
        if (g1.a < ((g) (latlngbounds)).a)
        {
            k = (0x40000000 - ((g) (latlngbounds)).a) + g1.a;
        } else
        {
            k = g1.a - ((g) (latlngbounds)).a;
        }
        l = g1.b - ((g) (latlngbounds)).b;
        d1 = Math.log(Math.max(((double)k * d3) / d1, (d3 * (double)l) / d2));
        d2 = b;
        i1 = ((g) (latlngbounds)).a;
        return new c(new g((k / 2 + i1) % 0x40000000, ((g) (latlngbounds)).b + l / 2), (float)(30D - d1 * d2), 0.0F, 0.0F, 0.0F);
    }

    static void a(a a1, CameraPosition cameraposition)
    {
        if (a1.f != null)
        {
            try
            {
                a1.f().a();
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                throw new RuntimeRemoteException(a1);
            }
        }
        if (a1.g == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        a1.g.a(cameraposition);
        return;
        a1;
        throw new RuntimeRemoteException(a1);
    }

    private static int b(int k)
    {
        if (k == -1)
        {
            return -1;
        } else
        {
            return Math.max(0, k);
        }
    }

    static void b(a a1, CameraPosition cameraposition)
    {
        for (a1 = a1.h.iterator(); a1.hasNext();)
        {
            aa aa1 = (aa)a1.next();
            try
            {
                aa1.a(cameraposition);
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                throw new RuntimeRemoteException(a1);
            }
        }

    }

    private r f()
    {
        r r1 = f;
        f = null;
        return r1;
    }

    public final float a(LatLng latlng)
    {
        Object obj = c;
        latlng = com.google.android.m4b.maps.aq.b.b(latlng);
        obj = ((u) (obj)).e.b.b;
        if (obj == null)
        {
            return p.a;
        } else
        {
            return ((com.google.android.m4b.maps.bi.e.a) (obj)).a(latlng);
        }
    }

    public final CameraPosition a(LatLngBounds latlngbounds)
    {
        return com.google.android.m4b.maps.aq.b.a(a(latlngbounds, d.getWidth() - c.a(), d.getHeight() - c.b(), d.getResources().getDisplayMetrics().density));
    }

    public final void a()
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "Camera stopped during a cancellation");
        c.e.a(0.0F, 0.0F);
    }

    public final void a(float f1)
    {
        float f2 = Math.min(a(c().b), Math.max(c.e(), c.e.d));
        c.a(f2 + f1, a(-1));
    }

    public final void a(float f1, float f2, int k)
    {
        c c1 = p.a(c.d(), d.p(), f1, f2);
        k = b(k);
        c.a(c1, k, k);
    }

    public final void a(float f1, int k)
    {
        u u1 = c;
        k = a(k);
        u1.c();
        u1.a(f1, u1.a, u1.b, k);
    }

    public final void a(float f1, int k, int l, int i1)
    {
        c.a(f1, k, l, a(i1));
    }

    public final void a(int k, int l, int i1, int j1)
    {
        u u1 = c;
        u1.c[0] = k;
        u1.c[1] = l;
        u1.c[2] = i1;
        u1.c[3] = j1;
        d.b();
    }

    public final void a(c c1)
    {
        e.post(new Runnable(c1) {

            private c a;
            private a b;

            public final void run()
            {
                a.a(b, com.google.android.m4b.maps.aq.b.a(a.a(b).a(a, -1F)));
            }

            
            {
                b = a.this;
                a = c1;
                super();
            }
        });
    }

    public final void a(com.google.android.m4b.maps.cg.bp.a a1, int k, r r1, cb cb)
    {
        boolean flag1 = true;
        boolean flag;
        if (k != 0 || r1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag, "Callback supplied with instantaneous camera movement");
        if (i == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        j.b(flag, "Camera moved during a cancellation");
        a1.a(this, k, cb);
        if (i != 0)
        {
            throw new AssertionError();
        } else
        {
            f = r1;
            return;
        }
    }

    public final void a(aa aa1)
    {
        g = aa1;
    }

    public final void a(CameraPosition cameraposition, int k)
    {
        k = b(k);
        c.a(new c(com.google.android.m4b.maps.aq.b.a(cameraposition.b), cameraposition.c, cameraposition.d, cameraposition.e, 0.0F), k, k);
    }

    public final void a(LatLng latlng, float f1, int k)
    {
        c c1 = c.d();
        latlng = new c(com.google.android.m4b.maps.aq.b.a(latlng), f1, c1.c, c1.d, c1.e);
        k = b(k);
        c.a(latlng, k, k);
    }

    public final void a(LatLng latlng, int k)
    {
        c c1 = c.d();
        latlng = new c(com.google.android.m4b.maps.aq.b.a(latlng), c1.b, c1.c, c1.d, c1.e);
        k = b(k);
        c.a(latlng, k, k);
    }

    public final void a(LatLngBounds latlngbounds, int k, int l)
    {
        int i1 = d.getWidth();
        int j1 = d.getHeight();
        boolean flag;
        if (i1 != 0 && j1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "Error using newLatLngBounds(LatLngBounds, int): Map size can't be 0. Most likely, layout has not yet occured for the map view.  Either wait until layout has occurred or use newLatLngBounds(LatLngBounds, int, int, int) which allows you to specify the map's dimensions.");
        a(latlngbounds, i1, j1, k, l);
    }

    public final void a(LatLngBounds latlngbounds, int k, int l, int i1, int j1)
    {
        double d2 = k;
        double d1 = l;
        d2 -= i1 * 2;
        d1 -= i1 * 2;
        boolean flag;
        if (d2 > 0.0D && d1 > 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "View size is too small after padding");
        latlngbounds = a(latlngbounds, d2 - (double)c.a(), d1 - (double)c.b(), d.getResources().getDisplayMetrics().density);
        k = b(j1);
        c.a(latlngbounds, k, k);
    }

    public final void b()
    {
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        i = i + 1;
        f().b();
        i = i - 1;
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
        i = i - 1;
        throw obj;
    }

    public final void b(float f1, int k)
    {
        c.a(f1, a(k));
    }

    public final void b(c c1)
    {
        e.post(new Runnable(c1) {

            private c a;
            private a b;

            public final void run()
            {
                a.b(b, com.google.android.m4b.maps.aq.b.a(a.a(b).a(a, -1F)));
            }

            
            {
                b = a.this;
                a = c1;
                super();
            }
        });
    }

    public final void b(aa aa1)
    {
        h.add(aa1);
    }

    public final CameraPosition c()
    {
        return com.google.android.m4b.maps.aq.b.a(c.d());
    }

    public final void c(aa aa1)
    {
        h.remove(aa1);
    }

    public final float d()
    {
        return c.e();
    }

    public final com.google.android.m4b.maps.cg.al.a e()
    {
        int ai[] = c.c;
        return new com.google.android.m4b.maps.aq.p(d.p(), ai[0], ai[1], ai[2], ai[3]);
    }

}
