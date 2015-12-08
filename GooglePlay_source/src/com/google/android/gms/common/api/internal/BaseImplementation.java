// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            BasePendingResult

public final class BaseImplementation
{
    public static abstract class ApiMethodImpl extends BasePendingResult
        implements ResultHolder, GoogleApiClientImpl.Runner
    {

        final com.google.android.gms.common.api.Api.ClientKey mClientKey;
        private AtomicReference mConsumedCallback;

        private void setFailedResult(RemoteException remoteexception)
        {
            setFailedResult(new Status(8, remoteexception.getLocalizedMessage(), null));
        }

        public abstract void doExecute(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException;

        public final com.google.android.gms.common.api.Api.ClientKey getClientKey()
        {
            return mClientKey;
        }

        protected final void onResultConsumed()
        {
            GoogleApiClientImpl.ResultConsumedCallback resultconsumedcallback = (GoogleApiClientImpl.ResultConsumedCallback)mConsumedCallback.getAndSet(null);
            if (resultconsumedcallback != null)
            {
                resultconsumedcallback.onConsumed(this);
            }
        }

        public final void run(com.google.android.gms.common.api.Api.Client client)
            throws DeadObjectException
        {
            try
            {
                doExecute(client);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.common.api.Api.Client client)
            {
                setFailedResult(client);
                throw client;
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.common.api.Api.Client client)
            {
                setFailedResult(client);
            }
        }

        public final void setFailedResult(Status status)
        {
            boolean flag;
            if (!status.isSuccess())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Failed result must not be success");
            setResult(createFailedResult(status));
        }

        public final volatile void setResult(Object obj)
        {
            super.setResult((Result)obj);
        }

        public final void setResultConsumedCallback(GoogleApiClientImpl.ResultConsumedCallback resultconsumedcallback)
        {
            mConsumedCallback.set(resultconsumedcallback);
        }

        public ApiMethodImpl(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(((GoogleApiClient)Preconditions.checkNotNull(googleapiclient, "GoogleApiClient must not be null")).getLooper());
            mConsumedCallback = new AtomicReference();
            mClientKey = (com.google.android.gms.common.api.Api.ClientKey)Preconditions.checkNotNull(clientkey);
        }
    }

    public static interface ResultHolder
    {

        public abstract void setResult(Object obj);
    }

}
