// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.twotoasters.clusterkraf:
//            ClusterPoint, InputPoint, Options

class ClustersBuilder
{

    private final Options a;
    private final ArrayList b = new ArrayList();
    private final HashSet c = new HashSet();
    private final WeakReference d;
    private final WeakReference e;

    ClustersBuilder(Projection projection, Options options, ArrayList arraylist)
    {
        a = options;
        d = new WeakReference(projection);
        e = new WeakReference(projection.getVisibleRegion());
        if (arraylist != null)
        {
            b(arraylist);
        }
    }

    private Projection b()
    {
        return (Projection)d.get();
    }

    private void b(ArrayList arraylist)
    {
        ClusterPoint clusterpoint;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); a(clusterpoint.d()))
        {
            clusterpoint = (ClusterPoint)arraylist.next();
            clusterpoint.c();
        }

    }

    final ArrayList a()
    {
        ArrayList arraylist;
        Projection projection;
        projection = b();
        arraylist = null;
        if (projection == null) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        arraylist = new ArrayList(b.size());
        iterator = b.iterator();
_L3:
        InputPoint inputpoint;
        boolean flag;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        inputpoint = (InputPoint)iterator.next();
        Iterator iterator1 = arraylist.iterator();
        ClusterPoint clusterpoint;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_137;
            }
            clusterpoint = (ClusterPoint)iterator1.next();
        } while (clusterpoint.a(inputpoint) > (double)a.c());
        clusterpoint.a(inputpoint);
        flag = true;
_L4:
        if (!flag)
        {
            arraylist.add(new ClusterPoint(inputpoint, projection, false));
        }
        if (true) goto _L3; else goto _L2
_L2:
        return arraylist;
        flag = false;
          goto _L4
    }

    final void a(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            Projection projection = b();
            Object obj = (VisibleRegion)e.get();
            if (projection != null && obj != null)
            {
                obj = ((VisibleRegion) (obj)).latLngBounds;
                if (obj != null && a != null)
                {
                    double d2 = a.d();
                    double d1;
                    double d3;
                    double d4;
                    Object obj1;
                    boolean flag;
                    if (((LatLngBounds) (obj)).northeast.longitude < ((LatLngBounds) (obj)).southwest.longitude)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    d3 = ((LatLngBounds) (obj)).northeast.latitude;
                    d4 = ((LatLngBounds) (obj)).southwest.latitude;
                    if (!flag)
                    {
                        d1 = ((LatLngBounds) (obj)).northeast.longitude - ((LatLngBounds) (obj)).southwest.longitude;
                    } else
                    {
                        d1 = ((LatLngBounds) (obj)).northeast.longitude + 180D + (180D - ((LatLngBounds) (obj)).southwest.longitude);
                    }
                    d3 = (d3 - d4) * d2;
                    d1 *= d2;
                    obj1 = new LatLng(((LatLngBounds) (obj)).northeast.latitude + d3, ((LatLngBounds) (obj)).northeast.longitude + d1);
                    obj = new LatLngBounds(new LatLng(((LatLngBounds) (obj)).southwest.latitude - d3, ((LatLngBounds) (obj)).southwest.longitude - d1), ((LatLng) (obj1)));
                } else
                {
                    obj = null;
                }
                arraylist = arraylist.iterator();
                do
                {
                    if (!arraylist.hasNext())
                    {
                        break;
                    }
                    obj1 = (InputPoint)arraylist.next();
                    if (obj != null && ((LatLngBounds) (obj)).contains(((InputPoint) (obj1)).a()) && !c.contains(obj1))
                    {
                        ((InputPoint) (obj1)).a(projection);
                        b.add(obj1);
                        c.add(obj1);
                    }
                } while (true);
            }
        }
    }
}
