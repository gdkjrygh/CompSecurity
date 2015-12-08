// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.df.al;
import com.google.android.m4b.maps.df.am;
import com.google.android.m4b.maps.df.w;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bp, ad, cb, bx, 
//            ab, ap

public final class ae extends com.google.android.m4b.maps.df.ad.a
    implements android.view.View.OnClickListener
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(Location location);

        public abstract void b();
    }


    final w a;
    final a b;
    Location c;
    w d;
    boolean e;
    boolean f;
    am g;
    al h;
    private final bp i;
    private final ad j;
    private final Context k;
    private final Resources l;
    private final cb m;
    private final m n;

    public ae(Context context, Resources resources, bp bp1, ad ad1, a a1, w w1, cb cb1, 
            m m1)
    {
        k = (Context)com.google.android.m4b.maps.y.j.a(context);
        l = (Resources)com.google.android.m4b.maps.y.j.a(resources);
        i = (bp)com.google.android.m4b.maps.y.j.a(bp1);
        j = (ad)com.google.android.m4b.maps.y.j.a(ad1);
        b = (a)com.google.android.m4b.maps.y.j.a(a1);
        a = (w)com.google.android.m4b.maps.y.j.a(w1);
        d = (w)com.google.android.m4b.maps.y.j.a(w1);
        m = (cb)com.google.android.m4b.maps.y.j.a(cb1);
        f = true;
        n = m1;
    }

    private float a(LatLng latlng, float f1)
    {
        float f3 = i.c().c;
        float f2 = f3;
        if (f3 <= 10F)
        {
            f2 = 15F;
        }
        bp bp1 = i;
        double d1 = (double)f1 * 2D;
        f1 = bp1.a(bx.a(latlng, 0.5D, 0.5D, bx.a(d1), bx.a(latlng, d1))).c;
        if (f1 == -1F)
        {
            return f2;
        } else
        {
            return Math.min(f2, f1);
        }
    }

    static Resources a(ae ae1)
    {
        return ae1.l;
    }

    final void a()
    {
        ae ae1;
        ad ad1;
        boolean flag;
        if (f && e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
        ad1 = j;
        if (flag)
        {
            ae1 = this;
        } else
        {
            ae1 = null;
        }
        ad1.a.setOnClickListener(ae1);
    }

    public final void a(Location location)
    {
        b.a(location);
        if (g != null)
        {
            try
            {
                Location location1 = new Location(location);
                g.a(com.google.android.m4b.maps.da.d.a(location1));
            }
            // Misplaced declaration of an exception variable
            catch (Location location)
            {
                throw new RuntimeRemoteException(location);
            }
        }
        c = location;
    }

    public final void a(b b1)
    {
        a((Location)com.google.android.m4b.maps.da.d.a(b1));
    }

    final void a(boolean flag)
    {
label0:
        {
            if (f && e)
            {
                ad ad1 = j;
                boolean flag1;
                if (!flag)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                ad1.a(flag1);
                if (!flag)
                {
                    break label0;
                }
                b.b();
            }
            return;
        }
        b.a();
    }

    public final void onClick(View view)
    {
        m.a(cb.a.bh);
        if (h == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            flag = h.a();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            throw new RuntimeRemoteException(view);
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        return;
_L2:
        com.google.android.m4b.maps.y.j.b(e, "MyLocation layer not enabled");
        if (c != null)
        {
            Object obj = new LatLng(c.getLatitude(), c.getLongitude());
            float f1 = a(((LatLng) (obj)), c.getAccuracy());
            com.google.android.m4b.maps.model.CameraPosition.a a1 = CameraPosition.a(i.c());
            a1.a = ((LatLng) (obj));
            a1.b = f1;
            obj = a1.a();
            i.a(((CameraPosition) (obj)), -1);
        }
        if (ab.a(k) && c != null)
        {
            Object obj1 = new LatLng(c.getLatitude(), c.getLongitude());
            obj1 = new ap(((LatLng) (obj1)), a(((LatLng) (obj1)), c.getAccuracy()));
            obj1.a = new ap.a(view) {

                private View a;
                private ae b;

                public final void a(ap ap1)
                {
                    if (ap1.i() > 0)
                    {
                        Object obj2 = ap1.h();
                        ap1 = String.valueOf(ae.a(b).getString(com.google.android.m4b.maps.h.h.maps_YOUR_LOCATION));
                        obj2 = ((ap.b) (obj2)).a();
                        ap1 = (new StringBuilder(String.valueOf(ap1).length() + 2 + String.valueOf(obj2).length())).append(ap1).append(": ").append(((String) (obj2))).toString();
                        ab.a(a, ap1);
                    }
                }

            
            {
                b = ae.this;
                a = view;
                super();
            }
            };
            n.c(((com.google.android.m4b.maps.ay.t) (obj1)));
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }
}
