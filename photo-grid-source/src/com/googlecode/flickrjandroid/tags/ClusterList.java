// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.tags;

import java.util.ArrayList;

// Referenced classes of package com.googlecode.flickrjandroid.tags:
//            Cluster

public class ClusterList
{

    private static final long serialVersionUID = 0xb699a7b7b0383cd1L;
    ArrayList clusters;

    public ClusterList()
    {
        clusters = new ArrayList();
    }

    public void addCluster(Cluster cluster)
    {
        clusters.add(cluster);
    }

    public ArrayList getClusters()
    {
        return clusters;
    }
}
