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

        public com.google.android.gms.games.request.Requests.LoadRequestSummariesResult N(Status status)
        {
            return new com.google.android.gms.games.request.Requests.LoadRequestSummariesResult(this, status) {

                final LoadRequestSummariesImpl KX;
                final Status wz;

                public Status getStatus()
                {
                    return wz;
                }

                public void release()
                {
                }

            
            {
                KX = loadrequestsummariesimpl;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return N(status);
        }

        private LoadRequestSummariesImpl()
        {
        }
    }

    private static abstract class LoadRequestsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.request.Requests.LoadRequestsResult O(Status status)
        {
            return new com.google.android.gms.games.request.Requests.LoadRequestsResult(this, status) {

                final LoadRequestsImpl KY;
                final Status wz;

                public GameRequestBuffer getRequests(int i)
                {
                    return null;
                }

                public Status getStatus()
                {
                    return wz;
                }

                public void release()
                {
                }

            
            {
                KY = loadrequestsimpl;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return O(status);
        }

        private LoadRequestsImpl()
        {
        }

    }

    private static abstract class SendRequestImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.request.Requests.SendRequestResult P(Status status)
        {
            return new com.google.android.gms.games.request.Requests.SendRequestResult(this, status) {

                final SendRequestImpl KZ;
                final Status wz;

                public Status getStatus()
                {
                    return wz;
                }

            
            {
                KZ = sendrequestimpl;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return P(status);
        }

        private SendRequestImpl()
        {
        }
    }

    private static abstract class UpdateRequestsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.request.Requests.UpdateRequestsResult Q(Status status)
        {
            return new com.google.android.gms.games.request.Requests.UpdateRequestsResult(this, status) {

                final UpdateRequestsImpl La;
                final Status wz;

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
                    return wz;
                }

                public void release()
                {
                }

            
            {
                La = updaterequestsimpl;
                wz = status;
                super();
            }
            };
        }

        public Result d(Status status)
        {
            return Q(status);
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

            final String KO[];
            final RequestsImpl KP;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, KO);
            }

            
            {
                KP = RequestsImpl.this;
                KO = as;
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

            final String KO[];
            final RequestsImpl KP;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(this, KO);
            }

            
            {
                KP = RequestsImpl.this;
                KO = as;
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
        return Games.c(googleapiclient).gB();
    }

    public int getMaxLifetimeDays(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).gD();
    }

    public int getMaxPayloadSize(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).gC();
    }

    public Intent getSendIntent(GoogleApiClient googleapiclient, int i, byte abyte0[], int j, Bitmap bitmap, String s)
    {
        return Games.c(googleapiclient).a(i, abyte0, j, bitmap, s);
    }

    public PendingResult loadRequests(GoogleApiClient googleapiclient, int i, int j, int k)
    {
        return googleapiclient.a(new LoadRequestsImpl(i, j, k) {

            final RequestsImpl KP;
            final int KQ;
            final int KR;
            final int Kk;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, KQ, KR, Kk);
            }

            
            {
                KP = RequestsImpl.this;
                KQ = i;
                KR = j;
                Kk = k;
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
        Games.c(googleapiclient).gv();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$4

/* anonymous class */
    class _cls4 extends SendRequestImpl
    {

        final String JT;
        final String KS[];
        final int KT;
        final byte KU[];
        final int KV;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, JT, KS, KT, KU, KV);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$5

/* anonymous class */
    class _cls5 extends SendRequestImpl
    {

        final String JT;
        final String KS[];
        final int KT;
        final byte KU[];
        final int KV;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, JT, KS, KT, KU, KV);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$6

/* anonymous class */
    class _cls6 extends UpdateRequestsImpl
    {

        final String JT;
        final String KO[];
        final String KW;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, JT, KW, KO);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$7

/* anonymous class */
    class _cls7 extends LoadRequestsImpl
    {

        final String JT;
        final int KQ;
        final int KR;
        final String KW;
        final int Kk;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, JT, KW, KQ, KR, Kk);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$8

/* anonymous class */
    class _cls8 extends LoadRequestSummariesImpl
    {

        final int KR;
        final String KW;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.d(this, KW, KR);
        }
    }

}
