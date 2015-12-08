// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.pinterest.activity.map.MarkerHolder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.twotoasters.clusterkraf:
//            BasePoint, InputPoint

public class ClusterPoint extends BasePoint
{

    private final ArrayList b;
    private final HashSet c;
    private final boolean d;
    private LatLngBounds e;

    protected ClusterPoint(InputPoint inputpoint, Projection projection, LatLng latlng)
    {
        this(inputpoint, projection, true);
        a = latlng;
    }

    protected ClusterPoint(InputPoint inputpoint, Projection projection, boolean flag)
    {
        b = new ArrayList();
        c = new HashSet();
        a = inputpoint.a();
        d = flag;
        a(inputpoint);
        a(projection);
    }

    public final volatile LatLng a()
    {
        return super.a();
    }

    public final InputPoint a(int i)
    {
        return (InputPoint)b.get(i);
    }

    public final void a(Marker marker)
    {
        if (b.size() > 0)
        {
            Object obj = a(0).d();
            if (obj instanceof MarkerHolder)
            {
                obj = (MarkerHolder)obj;
                ((MarkerHolder) (obj)).setMarker(marker);
                ((MarkerHolder) (obj)).setCluster(this);
            }
        }
    }

    final void a(InputPoint inputpoint)
    {
        b.add(inputpoint);
        c.add(inputpoint);
        e = null;
    }

    public final boolean b(InputPoint inputpoint)
    {
        return c.contains(inputpoint);
    }

    final void c()
    {
        super.c();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((InputPoint)iterator.next()).c()) { }
    }

    final ArrayList d()
    {
        return b;
    }

    public final int e()
    {
        return b.size();
    }

    final LatLngBounds f()
    {
        if (e == null)
        {
            com.google.android.gms.maps.model.LatLngBounds.Builder builder = LatLngBounds.builder();
            for (Iterator iterator = b.iterator(); iterator.hasNext(); builder.include(((InputPoint)iterator.next()).a())) { }
            e = builder.build();
        }
        return e;
    }
}
