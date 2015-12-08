// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            Node

public interface NodeApi
{
    public static interface GetConnectedNodesResult
        extends Result
    {

        public abstract List getNodes();
    }

    public static interface GetLocalNodeResult
        extends Result
    {

        public abstract Node getNode();
    }

    public static interface NodeListener
    {

        public abstract void onPeerConnected(Node node);

        public abstract void onPeerDisconnected(Node node);
    }


    public abstract PendingResult addListener(GoogleApiClient googleapiclient, NodeListener nodelistener);

    public abstract PendingResult getConnectedNodes(GoogleApiClient googleapiclient);

    public abstract PendingResult getLocalNode(GoogleApiClient googleapiclient);

    public abstract PendingResult removeListener(GoogleApiClient googleapiclient, NodeListener nodelistener);
}
