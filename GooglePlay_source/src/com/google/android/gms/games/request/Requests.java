// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.request:
//            OnRequestReceivedListener, GameRequestBuffer

public interface Requests
{
    public static interface LoadRequestsResult
        extends Releasable, Result
    {

        public abstract GameRequestBuffer getRequests(int i);
    }

    public static interface SendRequestResult
        extends Result
    {
    }

    public static interface UpdateRequestsResult
        extends Releasable, Result
    {
    }


    public abstract PendingResult dismissRequest(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult dismissRequestFirstParty(GoogleApiClient googleapiclient, String s, String s1, String s2);

    public abstract int getMaxPayloadSize(GoogleApiClient googleapiclient);

    public abstract Intent getPublicRequestListIntentRestricted(GoogleApiClient googleapiclient, GameRequestCluster gamerequestcluster, String s);

    public abstract PendingResult loadRequests$7e4fe440(GoogleApiClient googleapiclient, int i);

    public abstract PendingResult loadRequestsFirstParty$2c3ee1ac(GoogleApiClient googleapiclient, String s, String s1, int i, int j);

    public abstract void registerRequestListener(GoogleApiClient googleapiclient, OnRequestReceivedListener onrequestreceivedlistener);

    public abstract void registerRequestListenerFirstParty(GoogleApiClient googleapiclient, OnRequestReceivedListener onrequestreceivedlistener, String s);

    public abstract PendingResult sendRequestRestricted(GoogleApiClient googleapiclient, String s, List list, int i, byte abyte0[], int j);

    public abstract void unregisterRequestListener(GoogleApiClient googleapiclient);

    public abstract void unregisterRequestListenerFirstParty(GoogleApiClient googleapiclient, String s);
}
