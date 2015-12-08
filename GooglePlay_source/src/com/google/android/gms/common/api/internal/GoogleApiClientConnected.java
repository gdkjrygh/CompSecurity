// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientState, GoogleApiClientStateHolder, GoogleApiClientImpl

public final class GoogleApiClientConnected
    implements GoogleApiClientState
{

    private final GoogleApiClientStateHolder mHolder;

    public GoogleApiClientConnected(GoogleApiClientStateHolder googleapiclientstateholder)
    {
        mHolder = googleapiclientstateholder;
    }

    public final void begin()
    {
    }

    public final void connect()
    {
    }

    public final void disconnect()
    {
        mHolder.changeToDisconnected(null);
    }

    public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        return execute(apimethodimpl);
    }

    public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
    {
        com.google.android.gms.common.api.Api.Client client;
        mHolder.mApiClient.addUnconsumedRunner(apimethodimpl);
        client = mHolder.mApiClient.getClient(apimethodimpl.getClientKey());
        if (client.isConnected() || !mHolder.mFailedConnections.containsKey(apimethodimpl.getClientKey()))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        apimethodimpl.setFailedResult(new Status(17));
        return apimethodimpl;
        try
        {
            apimethodimpl.run(client);
        }
        catch (DeadObjectException deadobjectexception)
        {
            mHolder.postToHandler(new GoogleApiClientStateHolder.HandlerTask(this) {

                final GoogleApiClientConnected this$0;

                public final void runLocked()
                {
                    onConnectionSuspended(1);
                }

            
            {
                this$0 = GoogleApiClientConnected.this;
                super(googleapiclientstate);
            }
            });
            return apimethodimpl;
        }
        return apimethodimpl;
    }

    public final void onConnected(Bundle bundle)
    {
    }

    public final void onConnectionFailed(ConnectionResult connectionresult, Api api, int i)
    {
    }

    public final void onConnectionSuspended(int i)
    {
        mHolder.changeToDisconnected(null);
        mHolder.mInternalCallbacks.handleOnConnectionSuspended(i);
    }
}
