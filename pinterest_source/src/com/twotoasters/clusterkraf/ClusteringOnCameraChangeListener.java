// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import com.google.android.gms.maps.model.CameraPosition;
import java.lang.ref.WeakReference;

// Referenced classes of package com.twotoasters.clusterkraf:
//            Options

class ClusteringOnCameraChangeListener
    implements com.google.android.gms.maps.GoogleMap.OnCameraChangeListener
{

    private final Options a;
    private final WeakReference b;
    private long c;

    public ClusteringOnCameraChangeListener(Host host, Options options)
    {
        c = 0L;
        b = new WeakReference(host);
        a = options;
    }

    public final void a(long l)
    {
        c = l;
    }

    public void onCameraChange(CameraPosition cameraposition)
    {
        long l = System.currentTimeMillis();
        long l1 = a.p();
        if (c < l - l1)
        {
            cameraposition = (Host)b.get();
            if (cameraposition != null)
            {
                c = l;
                cameraposition.onClusteringCameraChange();
            }
        }
    }

    private class Host
    {

        public abstract void onClusteringCameraChange();
    }

}
