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
//            d, au

public final class ah
    implements NodeApi
{
    public static class a
        implements com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult
    {

        private final List alW;
        private final Status yw;

        public List getNodes()
        {
            return alW;
        }

        public Status getStatus()
        {
            return yw;
        }

        public a(Status status, List list)
        {
            yw = status;
            alW = list;
        }
    }

    public static class b
        implements com.google.android.gms.wearable.NodeApi.GetLocalNodeResult
    {

        private final Node alX;
        private final Status yw;

        public Node getNode()
        {
            return alX;
        }

        public Status getStatus()
        {
            return yw;
        }

        public b(Status status, Node node)
        {
            yw = status;
            alX = node;
        }
    }


    public ah()
    {
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.a(new d(nodelistener) {

            final ah alU;
            final com.google.android.gms.wearable.NodeApi.NodeListener alV;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.a(this, alV);
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
                alU = ah.this;
                alV = nodelistener;
                super();
            }
        });
    }

    public PendingResult getConnectedNodes(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new d() {

            final ah alU;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.q(this);
            }

            protected com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult aw(Status status)
            {
                return new a(status, null);
            }

            protected Result c(Status status)
            {
                return aw(status);
            }

            
            {
                alU = ah.this;
                super();
            }
        });
    }

    public PendingResult getLocalNode(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new d() {

            final ah alU;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.p(this);
            }

            protected com.google.android.gms.wearable.NodeApi.GetLocalNodeResult av(Status status)
            {
                return new b(status, null);
            }

            protected Result c(Status status)
            {
                return av(status);
            }

            
            {
                alU = ah.this;
                super();
            }
        });
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
    {
        return googleapiclient.a(new d(nodelistener) {

            final ah alU;
            final com.google.android.gms.wearable.NodeApi.NodeListener alV;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((au)a1);
            }

            protected void a(au au1)
                throws RemoteException
            {
                au1.b(this, alV);
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
                alU = ah.this;
                alV = nodelistener;
                super();
            }
        });
    }
}
