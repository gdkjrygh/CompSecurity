// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.map;

import android.view.animation.LinearInterpolator;
import java.io.Serializable;

public class MapOptions
    implements Serializable
{

    private static final long serialVersionUID = 0x67fb771a62725058L;
    public com.twotoasters.clusterkraf.Options.ClusterClickBehavior clusterClickBehavior;
    public com.twotoasters.clusterkraf.Options.ClusterInfoWindowClickBehavior clusterInfoWindowClickBehavior;
    public int dipDistanceToJoinCluster;
    public double expandBoundsFactor;
    public int pointCount;
    public int showInfoWindowAnimationDuration;
    public com.twotoasters.clusterkraf.Options.SinglePointClickBehavior singlePointClickBehavior;
    public int transitionDuration;
    public String transitionInterpolator;
    public int zoomToBoundsAnimationDuration;

    public MapOptions()
    {
        pointCount = 100;
        transitionDuration = 300;
        transitionInterpolator = android/view/animation/LinearInterpolator.getCanonicalName();
        dipDistanceToJoinCluster = 100;
        zoomToBoundsAnimationDuration = 500;
        showInfoWindowAnimationDuration = 500;
        expandBoundsFactor = 0.5D;
        singlePointClickBehavior = com.twotoasters.clusterkraf.Options.SinglePointClickBehavior.a;
        clusterClickBehavior = com.twotoasters.clusterkraf.Options.ClusterClickBehavior.a;
        clusterInfoWindowClickBehavior = com.twotoasters.clusterkraf.Options.ClusterInfoWindowClickBehavior.a;
    }
}
