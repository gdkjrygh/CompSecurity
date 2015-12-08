// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, ba

public final class ak
    implements NodeApi
{
    private static final class a extends d
    {

        private com.google.android.gms.wearable.NodeApi.NodeListener axZ;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((ba)a1);
        }

        protected void a(ba ba1)
            throws RemoteException
        {
            ba1.a(this, axZ);
            axZ = null;
        }

        public Status b(Status status)
        {
            axZ = null;
            return status;
        }

        public Result c(Status status)
        {
            return b(status);
        }

        private a(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
        {
            super(googleapiclient);
            axZ = nodelistener;
        }

    }

    public static class b
        implements com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult
    {

        private final Status Eb;
        private final List aya;

        public List getNodes()
        {
            return aya;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public b(Status status, List list)
        {
            Eb = status;
            aya = list;
        }
    }

    public static class c
        implements com.google.android.gms.wearable.NodeApi.GetLocalNodeResult
    {

        private final Status Eb;
        private final Node ayb;

        public Node getNode()
        {
            return ayb;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public c(Status status, Node node)
        {
            Eb = status;
            ayb = node;
        }
    }


    public ak()
    {
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.a(new a(googleapiclient, nodelistener));
    }

    public PendingResult getConnectedNodes(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new d(googleapiclient) {

            final ak axX;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.p(this);
            }

            protected com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult aK(Status status)
            {
                return new b(status, null);
            }

            protected Result c(Status status)
            {
                return aK(status);
            }

            
            {
                axX = ak.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult getLocalNode(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new d(googleapiclient) {

            final ak axX;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.o(this);
            }

            protected com.google.android.gms.wearable.NodeApi.GetLocalNodeResult aJ(Status status)
            {
                return new c(status, null);
            }

            protected Result c(Status status)
            {
                return aJ(status);
            }

            
            {
                axX = ak.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.a(new d(googleapiclient, nodelistener) {

            final ak axX;
            final com.google.android.gms.wearable.NodeApi.NodeListener axY;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ba)a1);
            }

            protected void a(ba ba1)
                throws RemoteException
            {
                ba1.b(this, axY);
            }

            public Status b(Status status)
            {
                return status;
            }

            public Result c(Status status)
            {
                return b(status);
            }

            
            {
                axX = ak.this;
                axY = nodelistener;
                super(googleapiclient);
            }
        });
    }
}
