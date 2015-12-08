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
//            d, aw

public final class aj
    implements NodeApi
{
    public static class a
        implements com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult
    {

        private final Status CM;
        private final List avL;

        public List getNodes()
        {
            return avL;
        }

        public Status getStatus()
        {
            return CM;
        }

        public a(Status status, List list)
        {
            CM = status;
            avL = list;
        }
    }

    public static class b
        implements com.google.android.gms.wearable.NodeApi.GetLocalNodeResult
    {

        private final Status CM;
        private final Node avM;

        public Node getNode()
        {
            return avM;
        }

        public Status getStatus()
        {
            return CM;
        }

        public b(Status status, Node node)
        {
            CM = status;
            avM = node;
        }
    }


    public aj()
    {
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.a(new d(nodelistener) {

            final aj avJ;
            final com.google.android.gms.wearable.NodeApi.NodeListener avK;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.a(this, avK);
            }

            public Result c(Status status)
            {
                return d(status);
            }

            public Status d(Status status)
            {
                return new Status(13);
            }

            
            {
                avJ = aj.this;
                avK = nodelistener;
                super();
            }
        });
    }

    public PendingResult getConnectedNodes(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new d() {

            final aj avJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.q(this);
            }

            protected com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult aL(Status status)
            {
                return new a(status, null);
            }

            protected Result c(Status status)
            {
                return aL(status);
            }

            
            {
                avJ = aj.this;
                super();
            }
        });
    }

    public PendingResult getLocalNode(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new d() {

            final aj avJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.p(this);
            }

            protected com.google.android.gms.wearable.NodeApi.GetLocalNodeResult aK(Status status)
            {
                return new b(status, null);
            }

            protected Result c(Status status)
            {
                return aK(status);
            }

            
            {
                avJ = aj.this;
                super();
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.a(new d(nodelistener) {

            final aj avJ;
            final com.google.android.gms.wearable.NodeApi.NodeListener avK;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((aw)a1);
            }

            protected void a(aw aw1)
                throws RemoteException
            {
                aw1.b(this, avK);
            }

            public Result c(Status status)
            {
                return d(status);
            }

            public Status d(Status status)
            {
                return new Status(13);
            }

            
            {
                avJ = aj.this;
                avK = nodelistener;
                super();
            }
        });
    }
}
