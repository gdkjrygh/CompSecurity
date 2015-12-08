// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.twotoasters.clusterkraf:
//            AnimatedTransition, ClusterPoint, ClusterTransitionsAnimation

class <init>
{

    final ClusterTransitionsAnimation a;
    private final ArrayList b;
    private float c;

    static LatLng[] a(<init> <init>1)
    {
        LatLng alatlng[] = new LatLng[<init>1.b.size()];
        Iterator iterator = <init>1.b.iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            AnimatedTransition animatedtransition = (AnimatedTransition)iterator.next();
            LatLng latlng = animatedtransition.a().a();
            LatLng latlng1 = animatedtransition.b().a();
            double d3 = latlng.latitude;
            double d4 = <init>1.c;
            double d5 = latlng1.latitude;
            double d6 = latlng.latitude;
            double d;
            if (!animatedtransition.c())
            {
                d = latlng.longitude;
                double d1 = <init>1.c;
                d = (latlng1.longitude - latlng.longitude) * d1 + d;
            } else
            {
                double d2;
                if (latlng.longitude < 0.0D)
                {
                    d = latlng.longitude + 360D;
                } else
                {
                    d = latlng.longitude;
                }
                if (latlng1.longitude < 0.0D)
                {
                    d2 = latlng1.longitude + 360D;
                } else
                {
                    d2 = latlng1.longitude;
                }
                d = (d + (d2 - d) * (double)<init>1.c) - 360D;
            }
            alatlng[i] = new LatLng(d3 + d4 * (d5 - d6), d);
            i++;
        }
        return alatlng;
    }

    public final ArrayList a()
    {
        return b;
    }

    private (ClusterTransitionsAnimation clustertransitionsanimation, ArrayList arraylist)
    {
        a = clustertransitionsanimation;
        super();
        b = arraylist;
    }

    b(ClusterTransitionsAnimation clustertransitionsanimation, ArrayList arraylist, byte byte0)
    {
        this(clustertransitionsanimation, arraylist);
    }
}
