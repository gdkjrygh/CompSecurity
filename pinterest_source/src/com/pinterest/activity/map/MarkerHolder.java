// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.map;

import com.google.android.gms.maps.model.Marker;
import com.twotoasters.clusterkraf.ClusterPoint;

public interface MarkerHolder
{

    public abstract boolean hasMarker();

    public abstract void setCluster(ClusterPoint clusterpoint);

    public abstract void setMarker(Marker marker);
}
