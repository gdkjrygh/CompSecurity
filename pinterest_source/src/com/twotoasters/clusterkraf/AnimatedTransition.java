// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.twotoasters.clusterkraf:
//            ClusterPoint, InputPoint

class AnimatedTransition
{

    private final ClusterPoint a;
    private final ClusterPoint b;
    private final ClusterPoint c;
    private final boolean d;

    AnimatedTransition(Projection projection, ClusterPoint clusterpoint, InputPoint inputpoint, ClusterPoint clusterpoint1)
    {
        clusterpoint.c();
        clusterpoint.a(projection);
        a = clusterpoint;
        b = new ClusterPoint(inputpoint, projection, clusterpoint.a());
        b.a(clusterpoint.b());
        c = clusterpoint1;
        boolean flag;
        if (Math.abs(clusterpoint.a().longitude - clusterpoint1.a().longitude) > 180D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    final ClusterPoint a()
    {
        return b;
    }

    final boolean a(InputPoint inputpoint)
    {
        return a != null && a.b(inputpoint);
    }

    final ClusterPoint b()
    {
        return c;
    }

    final boolean b(InputPoint inputpoint)
    {
        return c != null && c.b(inputpoint);
    }

    final void c(InputPoint inputpoint)
    {
        b.a(inputpoint);
    }

    final boolean c()
    {
        return d;
    }
}
