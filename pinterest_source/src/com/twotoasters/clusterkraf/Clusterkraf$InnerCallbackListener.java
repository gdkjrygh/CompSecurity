// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import android.os.Handler;
import android.view.View;
import com.google.android.gms.maps.model.Marker;
import com.pinterest.kit.log.PLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;

// Referenced classes of package com.twotoasters.clusterkraf:
//            ClusteringOnCameraChangeListener, Clusterkraf, ClusterPoint, Options, 
//            InfoWindowDownstreamAdapter, ClusterTransitionsAnimation, OnInfoWindowClickDownstreamListener, OnMarkerClickDownstreamListener

class <init>
    implements com.google.android.gms.maps.<init>, com.google.android.gms.maps.r, com.google.android.gms.maps.r, r, ost
{

    private final WeakReference a;
    private final Handler b;
    private final ClusteringOnCameraChangeListener c;

    static ClusteringOnCameraChangeListener a(ost ost)
    {
        return ost.c;
    }

    static Handler b(c c1)
    {
        return c1.b;
    }

    public View getInfoContents(Marker marker)
    {
        Object obj = (Clusterkraf)a.get();
        if (obj != null)
        {
            ClusterPoint clusterpoint = (ClusterPoint)Clusterkraf.c(((Clusterkraf) (obj))).get(marker);
            obj = Clusterkraf.a(((Clusterkraf) (obj))).h();
            if (obj != null)
            {
                return ((InfoWindowDownstreamAdapter) (obj)).getInfoContents(marker, clusterpoint);
            }
        }
        return null;
    }

    public View getInfoWindow(Marker marker)
    {
        Object obj = (Clusterkraf)a.get();
        if (obj != null)
        {
            ClusterPoint clusterpoint = (ClusterPoint)Clusterkraf.c(((Clusterkraf) (obj))).get(marker);
            obj = Clusterkraf.a(((Clusterkraf) (obj))).h();
            if (obj != null)
            {
                return ((InfoWindowDownstreamAdapter) (obj)).getInfoWindow(marker, clusterpoint);
            }
        }
        return null;
    }

    public void onClusterTransitionFinished()
    {
        Clusterkraf clusterkraf = (Clusterkraf)a.get();
        if (clusterkraf != null)
        {
            Clusterkraf.l(clusterkraf);
            try
            {
                Clusterkraf.i(clusterkraf).b();
            }
            catch (Exception exception)
            {
                PLog.error(exception, "exception occurred", new Object[0]);
            }
        }
        c.a(0L);
    }

    public void onClusterTransitionStarted()
    {
        Clusterkraf clusterkraf = (Clusterkraf)a.get();
        if (clusterkraf != null)
        {
            Clusterkraf.k(clusterkraf);
        }
    }

    public void onClusterTransitionStarting()
    {
        c.a(System.currentTimeMillis());
    }

    public void onClusteringCameraChange()
    {
        Clusterkraf clusterkraf = (Clusterkraf)a.get();
        if (clusterkraf != null)
        {
            if (Clusterkraf.e(clusterkraf) != null)
            {
                Clusterkraf.e(clusterkraf).a();
                Clusterkraf.f(clusterkraf);
            }
            if (Clusterkraf.g(clusterkraf) != null)
            {
                Clusterkraf.g(clusterkraf).a();
                Clusterkraf.h(clusterkraf);
            }
            Clusterkraf.i(clusterkraf).a();
            Clusterkraf.j(clusterkraf);
        }
    }

    public void onInfoWindowClick(Marker marker)
    {
        Clusterkraf clusterkraf = (Clusterkraf)a.get();
        if (clusterkraf == null) goto _L2; else goto _L1
_L1:
        ClusterPoint clusterpoint;
        boolean flag;
        flag = false;
        clusterpoint = (ClusterPoint)Clusterkraf.c(clusterkraf).get(marker);
        OnInfoWindowClickDownstreamListener oninfowindowclickdownstreamlistener = Clusterkraf.a(clusterkraf).g();
        if (oninfowindowclickdownstreamlistener != null)
        {
            flag = oninfowindowclickdownstreamlistener.onInfoWindowClick(marker, clusterpoint);
        }
        if (flag || clusterpoint == null) goto _L2; else goto _L3
_L3:
        if (clusterpoint.e() <= 1) goto _L5; else goto _L4
_L4:
        r.onInfoWindowClick[Clusterkraf.a(clusterkraf).j().ordinal()];
        JVM INSTR tableswitch 1 2: default 108
    //                   1 109
    //                   2 115;
           goto _L2 _L6 _L7
_L2:
        return;
_L6:
        clusterkraf.a(clusterpoint);
        return;
_L7:
        marker.hideInfoWindow();
        return;
_L5:
        switch (vior.ordinal[Clusterkraf.a(clusterkraf).o().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            marker.hideInfoWindow();
            break;
        }
        return;
    }

    public boolean onMarkerClick(Marker marker)
    {
        Clusterkraf clusterkraf;
        boolean flag4;
        flag4 = false;
        clusterkraf = (Clusterkraf)a.get();
        if (clusterkraf == null) goto _L2; else goto _L1
_L1:
        boolean flag1;
        boolean flag2;
        ClusterPoint clusterpoint = (ClusterPoint)Clusterkraf.c(clusterkraf).get(marker);
        OnMarkerClickDownstreamListener onmarkerclickdownstreamlistener;
        boolean flag;
        boolean flag3;
        if (clusterpoint == null)
        {
            if (Clusterkraf.i(clusterkraf).a(marker) != null)
            {
                flag = true;
            } else
            {
                clusterpoint = Clusterkraf.i(clusterkraf).b(marker);
                flag = false;
            }
        } else
        {
            flag = false;
        }
        onmarkerclickdownstreamlistener = Clusterkraf.a(clusterkraf).f();
        if (!flag && onmarkerclickdownstreamlistener != null)
        {
            flag3 = onmarkerclickdownstreamlistener.onMarkerClick(marker, clusterpoint);
        } else
        {
            flag3 = false;
        }
        flag1 = flag;
        flag2 = flag3;
        if (flag) goto _L4; else goto _L3
_L3:
        flag1 = flag;
        flag2 = flag3;
        if (flag3) goto _L4; else goto _L5
_L5:
        flag1 = flag;
        flag2 = flag3;
        if (clusterpoint == null) goto _L4; else goto _L6
_L6:
        if (clusterpoint.e() <= 1) goto _L8; else goto _L7
_L7:
        MarkerClick[Clusterkraf.a(clusterkraf).i().al()];
        JVM INSTR tableswitch 1 2: default 160
    //                   1 203
    //                   2 218;
           goto _L9 _L10 _L11
_L9:
        flag2 = flag3;
_L14:
        flag1 = flag;
_L4:
label0:
        {
            if (!flag2)
            {
                flag2 = flag4;
                if (!flag1)
                {
                    break label0;
                }
            }
            flag2 = true;
        }
        return flag2;
_L10:
        clusterkraf.a(clusterpoint);
        flag2 = true;
        flag1 = flag;
        if (true) goto _L4; else goto _L11
_L11:
        clusterkraf.a(marker, clusterpoint);
        flag2 = true;
        continue; /* Loop/switch isn't completed */
_L8:
        switch (al[Clusterkraf.a(clusterkraf).n().rdinal()])
        {
        default:
            flag1 = flag;
            flag2 = flag3;
            break;

        case 1: // '\001'
            clusterkraf.a(marker, clusterpoint);
            flag2 = true;
            flag1 = flag;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        flag1 = false;
        flag2 = false;
        if (true) goto _L4; else goto _L12
_L12:
        if (true) goto _L14; else goto _L13
_L13:
    }

    private ost(Clusterkraf clusterkraf)
    {
        b = new Handler();
        a = new WeakReference(clusterkraf);
        c = new ClusteringOnCameraChangeListener(this, Clusterkraf.a(clusterkraf));
    }

    ost(Clusterkraf clusterkraf, byte byte0)
    {
        this(clusterkraf);
    }
}
