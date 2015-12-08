// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import java.lang.ref.WeakReference;

// Referenced classes of package com.twotoasters.clusterkraf:
//            MarkerOptionsChooser, ClusterPoint

public class Host extends MarkerOptionsChooser
{

    private final WeakReference a;

    public void choose(MarkerOptions markeroptions, ClusterPoint clusterpoint)
    {
        class Host
        {

            public abstract int getIconResource(ClusterPoint clusterpoint1);
        }

        Host host = (Host)a.get();
        if (host != null)
        {
            markeroptions.icon(BitmapDescriptorFactory.fromResource(host.getIconResource(clusterpoint)));
        }
    }
}
