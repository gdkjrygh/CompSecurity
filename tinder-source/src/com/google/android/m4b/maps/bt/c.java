// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.content.res.Resources;
import android.os.Handler;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.cg.bp;
import com.google.android.m4b.maps.cg.cb;
import com.google.android.m4b.maps.df.aa;
import com.google.android.m4b.maps.df.r;
import com.google.android.m4b.maps.m.a;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.y.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            d, a, k

public final class c
    implements bp
{

    private final d b;
    private final double c;
    private final Handler d;
    private CameraPosition e;
    private aa f;
    private final Collection g = new ArrayList();
    private int h;
    private int i;
    private int j;
    private int k;

    public c(d d1, Resources resources, Handler handler)
    {
        e = b(new CameraPosition(new LatLng(0.0D, 0.0D), 3F, 0.0F, 0.0F));
        b = d1;
        d = handler;
        c = Math.max(1.0D, Math.floor(resources.getDisplayMetrics().density));
    }

    private void a(CameraPosition cameraposition)
    {
        e = b(cameraposition);
        b.a.a();
        for (cameraposition = g.iterator(); cameraposition.hasNext();)
        {
            aa aa1 = (aa)cameraposition.next();
            try
            {
                aa1.a(e);
            }
            // Misplaced declaration of an exception variable
            catch (CameraPosition cameraposition)
            {
                throw new RuntimeRemoteException(cameraposition);
            }
        }

        if (f == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        f.a(e);
        return;
        cameraposition;
        throw new RuntimeRemoteException(cameraposition);
    }

    private static CameraPosition b(CameraPosition cameraposition)
    {
        if (cameraposition.d != 0.0F || cameraposition.e != 0.0F)
        {
            ab.a(5, "Non zero bearing and tilt are not supported in Lite Mode");
        }
        if (!com.google.android.m4b.maps.m.a.a(cameraposition.c))
        {
            ab.a(5, "Non integer zooms are not supported in Lite Mode");
        }
        int l = Math.round(Math.max(0.0F, Math.min(22F, cameraposition.c)));
        return new CameraPosition(cameraposition.b, l, 0.0F, 0.0F);
    }

    public final float a(LatLng latlng)
    {
        return 22F;
    }

    public final CameraPosition a(LatLngBounds latlngbounds)
    {
        int l = b.getWidth();
        int i1 = b.getHeight();
        double d2 = c;
        latlngbounds.b();
        double d1 = 22D;
        k.a a2 = com.google.android.m4b.maps.bt.k.a(latlngbounds.b, 22D, d2);
        k.a a1 = com.google.android.m4b.maps.bt.k.a(latlngbounds.c, 22D, d2);
        if (latlngbounds.b.c > latlngbounds.c.c)
        {
            long l1 = a1.a;
            a1 = new k.a((long)(int)com.google.android.m4b.maps.bt.k.a(22D, d2) + l1, a1.b);
        }
        long l3 = a1.a - a2.a;
        for (long l2 = a2.b - a1.b; l3 > (long)l || l2 > (long)i1; l2 >>= 1)
        {
            d1--;
            l3 >>= 1;
        }

        return new CameraPosition(latlngbounds.b(), (float)d1, 0.0F, 0.0F);
    }

    public final void a()
    {
    }

    public final void a(float f1)
    {
        ab.a(5, "zoomByCumulative is not supported in Lite Mode");
    }

    public final void a(float f1, float f2, int l)
    {
        ab.a(5, "scrollBy is not supported in Lite Mode");
    }

    public final void a(float f1, int l)
    {
        a(new CameraPosition(e.b, e.c + f1, e.d, e.e));
    }

    public final void a(float f1, int l, int i1, int j1)
    {
        ab.a(5, "zoomBy with focus is not supported in Lite Mode");
    }

    public final void a(int l, int i1, int j1, int k1)
    {
        h = l;
        i = i1;
        j = j1;
        k = k1;
    }

    public final void a(com.google.android.m4b.maps.cg.bp.a a1, int l, r r, cb cb)
    {
        boolean flag;
        if (l != 0 || r == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.y.j.a(flag, "Callback supplied with instantaneous camera movement");
        com.google.android.m4b.maps.y.j.b(true, "Camera moved during a cancellation");
        a1.a(this, l, cb);
    }

    public final void a(aa aa1)
    {
        f = aa1;
    }

    public final void a(CameraPosition cameraposition, int l)
    {
        a(cameraposition);
    }

    public final void a(LatLng latlng, float f1, int l)
    {
        a(new CameraPosition(latlng, f1, e.d, e.e));
    }

    public final void a(LatLng latlng, int l)
    {
        a(new CameraPosition(latlng, e.c, e.d, e.e));
    }

    public final void a(LatLngBounds latlngbounds, int l, int i1)
    {
        a(a(latlngbounds));
    }

    public final void a(LatLngBounds latlngbounds, int l, int i1, int j1, int k1)
    {
        ab.a(5, "newLatLngBounds with size is not supported in Lite Mode");
    }

    public final k b()
    {
        return new k(e, b.getWidth(), b.getHeight(), c, h, i, j, k);
    }

    public final void b(float f1, int l)
    {
        a(new CameraPosition(e.b, f1, e.d, e.e));
    }

    public final void b(aa aa1)
    {
        g.add(aa1);
    }

    public final CameraPosition c()
    {
        return e;
    }

    public final void c(aa aa1)
    {
        g.remove(aa1);
    }

    public final float d()
    {
        return 0.0F;
    }

    public final com.google.android.m4b.maps.cg.al.a e()
    {
        return b();
    }
}
