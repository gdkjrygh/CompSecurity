// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.maps;

import android.app.LocalActivityManager;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.h;
import com.facebook.location.ab;
import com.google.android.maps.MapController;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.facebook.maps:
//            MapFragment, g, a, h, 
//            d, i, e, c, 
//            j, f, n, m, 
//            k

public class GoogleMapFragment extends MapFragment
{

    private Location Z;
    private LocalActivityManager a;
    private android.view.View.OnTouchListener aa;
    private n ab;
    private m ac;
    private String ad;
    private boolean ae;
    private List af;
    private LinkedList ag;
    private boolean ah;
    private boolean ai;
    private d b;
    private a c;
    private FrameLayout d;
    private c e;
    private g f;
    private com.facebook.maps.i g;
    private boolean h;
    private int i;

    public GoogleMapFragment()
    {
        e = null;
        h = true;
        i = -1;
        Z = null;
        aa = null;
        ad = null;
        ae = false;
        af = new CopyOnWriteArrayList();
        ag = hq.b();
        ah = false;
        ai = true;
    }

    static a a(GoogleMapFragment googlemapfragment)
    {
        return googlemapfragment.c;
    }

    private k a(com.facebook.maps.i k)
    {
        if (b != null)
        {
            f.a(k);
            c.invalidate();
        } else
        {
            ag.add(k);
        }
        return new com.facebook.maps.h(this, k, null);
    }

    static List a(GoogleMapFragment googlemapfragment, List list)
    {
        googlemapfragment.af = list;
        return list;
    }

    private void a()
    {
        if (b == null && com.facebook.location.ab.a())
        {
            Object obj = (new Intent()).setClass(l(), com/facebook/maps/d);
            ((Intent) (obj)).putExtra("API_KEY", ad);
            obj = a.startActivity("map", ((Intent) (obj)));
            b = (d)a.getActivity("map");
            c = b.a();
            f = new g(o().getDrawable(h.orca_marker_red), ai);
            for (Iterator iterator = ag.iterator(); iterator.hasNext(); a((com.facebook.maps.i)iterator.next())) { }
            f.setOnFocusChangeListener(new e(this));
            ag.clear();
            ag = null;
            c.getOverlays().add(f);
            d.addView(((Window) (obj)).getDecorView());
            a(h);
            if (i != -1)
            {
                a(i);
            }
            if (Z != null)
            {
                a(Z);
            }
            if (aa != null)
            {
                a(aa);
            }
            if (ab != null)
            {
                c.setOnMovementListener(ab);
            }
            if (ae)
            {
                b(true);
            }
            if (ab != null)
            {
                c.setOnMovementListener(ab);
            }
            if (ac != null)
            {
                f.a(ac);
                return;
            }
        }
    }

    static void a(GoogleMapFragment googlemapfragment, com.facebook.maps.i k)
    {
        googlemapfragment.b(k);
    }

    static c b(GoogleMapFragment googlemapfragment)
    {
        return googlemapfragment.e;
    }

    private void b(com.facebook.maps.i k)
    {
        if (k == null)
        {
            if (g != null)
            {
                g.b();
                g = null;
            }
            return;
        }
        if (g != null)
        {
            g.b();
        }
        k.a();
        g = k;
    }

    static List c(GoogleMapFragment googlemapfragment)
    {
        return googlemapfragment.af;
    }

    public void A()
    {
        super.A();
        ah = true;
        if (e != null)
        {
            e.enableMyLocation();
        }
        if (!w())
        {
            a();
            a.dispatchResume();
        }
    }

    public void B()
    {
        super.B();
        ah = false;
        if (e != null)
        {
            e.disableMyLocation();
        }
        if (!w())
        {
            a.dispatchPause(l().isFinishing());
        }
    }

    public void C()
    {
        super.C();
        if (f != null)
        {
            f.setOnFocusChangeListener(null);
        }
        a.dispatchDestroy(l().isFinishing());
        af = null;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        d = new FrameLayout(l());
        a();
        return d;
    }

    public void a(double d1)
    {
        int k = (int)d1;
        if (b == null)
        {
            i = k;
            return;
        } else
        {
            c.getController().setZoom(k);
            return;
        }
    }

    public void a(Location location)
    {
        if (b == null)
        {
            Z = location;
            return;
        } else
        {
            c.getController().setCenter(j.a(location));
            return;
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        ad = (String)Preconditions.checkNotNull(k().getString("apiKey"), "Must call #setMapApiKey with a valid key before instantiating the fragment");
        ai = k().getBoolean("overlayShadowDrawingEnabled");
        Bundle bundle1 = null;
        if (bundle != null)
        {
            bundle1 = bundle.getBundle("activityManagerSavedInstanceState");
            h = bundle.getBoolean("clickable");
            ae = bundle.getBoolean("showLocation");
            i = bundle.getInt("latestMapZoom");
            Z = (Location)bundle.getParcelable("latestMapCenter");
        }
        a = new LocalActivityManager(l(), false);
        a.dispatchCreate(bundle1);
    }

    public void a(android.view.View.OnTouchListener ontouchlistener)
    {
        if (b == null)
        {
            aa = ontouchlistener;
            return;
        } else
        {
            c.setOnTouchListener(ontouchlistener);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (b == null)
        {
            h = flag;
            return;
        } else
        {
            c.setClickable(flag);
            return;
        }
    }

    public void b(boolean flag)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        ae = flag;
_L4:
        return;
_L2:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        e = new c(b, c);
        if (af != null && af.size() > 0)
        {
            e.runOnFirstFix(new f(this));
        }
        c.getOverlays().add(e);
        c.postInvalidate();
        if (!ah) goto _L4; else goto _L3
_L3:
        e.enableMyLocation();
        return;
        if (e == null) goto _L4; else goto _L5
_L5:
        if (ah)
        {
            e.disableMyLocation();
        }
        e = null;
        return;
    }

    public void c(boolean flag)
    {
label0:
        {
            if (u())
            {
                if (!flag)
                {
                    break label0;
                }
                a.dispatchPause(false);
            }
            return;
        }
        a();
        a.dispatchResume();
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBundle("activityManagerSavedInstanceState", a.saveInstanceState());
        bundle.putBoolean("clickable", h);
        bundle.putBoolean("showLocation", ae);
        Location location;
        int k;
        if (c == null)
        {
            k = i;
        } else
        {
            k = c.getZoomLevel();
        }
        bundle.putInt("latestMapZoom", k);
        if (c == null)
        {
            location = Z;
        } else
        {
            location = j.a(c.getMapCenter());
        }
        bundle.putParcelable("latestMapCenter", location);
    }

    public void g()
    {
        super.g();
        a.dispatchStop();
    }
}
