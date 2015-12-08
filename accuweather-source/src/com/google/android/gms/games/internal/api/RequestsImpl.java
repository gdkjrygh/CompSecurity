// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class RequestsImpl
    implements Requests
{
    private static abstract class LoadRequestSummariesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.request.Requests.LoadRequestSummariesResult V(Status status)
        {
            return new com.google.android.gms.games.request.Requests.LoadRequestSummariesResult(this, status) {

                final LoadRequestSummariesImpl QB;
                final Status yG;

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                QB = loadrequestsummariesimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return V(status);
        }

        private LoadRequestSummariesImpl()
        {
        }
    }

    private static abstract class LoadRequestsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.request.Requests.LoadRequestsResult W(Status status)
        {
            return new com.google.android.gms.games.request.Requests.LoadRequestsResult(this, status) {

                final LoadRequestsImpl QC;
                final Status yG;

                public GameRequestBuffer getRequests(int i)
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                QC = loadrequestsimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return W(status);
        }

        private LoadRequestsImpl()
        {
        }

    }

    private static abstract class SendRequestImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.request.Requests.SendRequestResult X(Status status)
        {
            return new com.google.android.gms.games.request.Requests.SendRequestResult(this, status) {

                final SendRequestImpl QD;
                final Status yG;

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                QD = sendrequestimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return X(status);
        }

        private SendRequestImpl()
        {
        }
    }

    private static abstract class UpdateRequestsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.request.Requests.UpdateRequestsResult Y(Status status)
        {
            return new com.google.android.gms.games.request.Requests.UpdateRequestsResult(this, status) {

                final UpdateRequestsImpl QE;
                final Status yG;

                public Set getRequestIds()
                {
                    return null;
                }

                public int getRequestOutcome(String s)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Unknown request ID ").append(s).toString());
                }

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                QE = updaterequestsimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return Y(status);
        }

        private UpdateRequestsImpl()
        {
        }

    }


    public RequestsImpl()
    {
    }

    public PendingResult acceptRequest(GoogleApiClient googleapiclient, String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        return acceptRequests(googleapiclient, arraylist);
    }

    public PendingResult acceptRequests(GoogleApiClient googleapiclient, List list)
    {
        if (list == null)
        {
            list = null;
        } else
        {
            list = (String[])list.toArray(new String[list.size()]);
        }
        return googleapiclient.b(new UpdateRequestsImpl(list) {

            final String Qt[];
            final RequestsImpl Qu;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, Qt);
            }

            
            {
                Qu = RequestsImpl.this;
                Qt = as;
                super();
            }
        });
    }

    public PendingResult dismissRequest(GoogleApiClient googleapiclient, String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        return dismissRequests(googleapiclient, arraylist);
    }

    public PendingResult dismissRequests(GoogleApiClient googleapiclient, List list)
    {
        if (list == null)
        {
            list = null;
        } else
        {
            list = (String[])list.toArray(new String[list.size()]);
        }
        return googleapiclient.b(new UpdateRequestsImpl(list) {

            final String Qt[];
            final RequestsImpl Qu;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(this, Qt);
            }

            
            {
                Qu = RequestsImpl.this;
                Qt = as;
                super();
            }
        });
    }

    public ArrayList getGameRequestsFromBundle(Bundle bundle)
    {
        if (bundle == null || !bundle.containsKey("requests"))
        {
            return new ArrayList();
        }
        bundle = (ArrayList)bundle.get("requests");
        ArrayList arraylist = new ArrayList();
        int j = bundle.size();
        for (int i = 0; i < j; i++)
        {
            arraylist.add((GameRequest)bundle.get(i));
        }

        return arraylist;
    }

    public ArrayList getGameRequestsFromInboxResponse(Intent intent)
    {
        if (intent == null)
        {
            return new ArrayList();
        } else
        {
            return getGameRequestsFromBundle(intent.getExtras());
        }
    }

    public Intent getInboxIntent(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).hl();
    }

    public int getMaxLifetimeDays(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).hn();
    }

    public int getMaxPayloadSize(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).hm();
    }

    public Intent getSendIntent(GoogleApiClient googleapiclient, int i, byte abyte0[], int j, Bitmap bitmap, String s)
    {
        return Games.c(googleapiclient).a(i, abyte0, j, bitmap, s);
    }

    public PendingResult loadRequests(GoogleApiClient googleapiclient, int i, int j, int k)
    {
        return googleapiclient.a(new LoadRequestsImpl(i, j, k) {

            final int PB;
            final RequestsImpl Qu;
            final int Qv;
            final int Qw;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Qv, Qw, PB);
            }

            
            {
                Qu = RequestsImpl.this;
                Qv = i;
                Qw = j;
                PB = k;
                super();
            }
        });
    }

    public void registerRequestListener(GoogleApiClient googleapiclient, OnRequestReceivedListener onrequestreceivedlistener)
    {
        Games.c(googleapiclient).a(onrequestreceivedlistener);
    }

    public void unregisterRequestListener(GoogleApiClient googleapiclient)
    {
        Games.c(googleapiclient).hf();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$4

/* anonymous class */
    class _cls4 extends SendRequestImpl
    {

        final String Pe;
        final int QA;
        final String Qx[];
        final int Qy;
        final byte Qz[];

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pe, Qx, Qy, Qz, QA);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$5

/* anonymous class */
    class _cls5 extends SendRequestImpl
    {

        final String Pe;
        final int QA;
        final String Qx[];
        final int Qy;
        final byte Qz[];

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pe, Qx, Qy, Qz, QA);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$6

/* anonymous class */
    class _cls6 extends UpdateRequestsImpl
    {

        final String Pe;
        final String Qp;
        final String Qt[];

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pe, Qp, Qt);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$7

/* anonymous class */
    class _cls7 extends LoadRequestsImpl
    {

        final int PB;
        final String Pe;
        final String Qp;
        final int Qv;
        final int Qw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pe, Qp, Qv, Qw, PB);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$8

/* anonymous class */
    class _cls8 extends LoadRequestSummariesImpl
    {

        final String Qp;
        final int Qw;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.f(this, Qp, Qw);
        }
    }

}
