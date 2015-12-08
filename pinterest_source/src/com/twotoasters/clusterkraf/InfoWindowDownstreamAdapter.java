// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import android.view.View;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.twotoasters.clusterkraf:
//            ClusterPoint

public interface InfoWindowDownstreamAdapter
{

    public abstract View getInfoContents(Marker marker, ClusterPoint clusterpoint);

    public abstract View getInfoWindow(Marker marker, ClusterPoint clusterpoint);
}
