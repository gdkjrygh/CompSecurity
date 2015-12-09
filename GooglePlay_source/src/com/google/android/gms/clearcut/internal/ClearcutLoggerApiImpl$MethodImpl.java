// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.clearcut.internal:
//            ClearcutLoggerApiImpl, ClearcutLoggerClientImpl, IClearcutLoggerService

final class mLogEvent extends tLoggerApiMethodImpl
{

    private final LogEventParcelable mLogEvent;
    final ClearcutLoggerApiImpl this$0;

    protected final volatile Result createFailedResult(Status status)
    {
        return status;
    }

    protected final volatile void doExecute(com.google.android.gms.common.api.odImpl odimpl)
        throws RemoteException
    {
        odimpl = (ClearcutLoggerClientImpl)odimpl;
        tLoggerApiMethodImpl tloggerapimethodimpl = new IClearcutLoggerCallbacks.Stub() {

            final ClearcutLoggerApiImpl.MethodImpl this$1;

            public final void onLogEvent(Status status)
            {
                setResult(status);
            }

            
            {
                this$1 = ClearcutLoggerApiImpl.MethodImpl.this;
                super();
            }
        };
        LogEventParcelable logeventparcelable;
        try
        {
            ClearcutLoggerApiImpl.access$800(mLogEvent);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.odImpl odimpl)
        {
            Log.e("ClearcutLoggerApiImpl", (new StringBuilder("MessageNanoProducer ")).append(mLogEvent.extensionProducer.toString()).append(" threw: ").append(odimpl.toString()).toString());
            return;
        }
        logeventparcelable = mLogEvent;
        ((IClearcutLoggerService)odimpl.getService()).logEvent(tloggerapimethodimpl, logeventparcelable);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof ce))
        {
            return false;
        } else
        {
            obj = (ce)obj;
            return mLogEvent.equals(((mLogEvent) (obj)).mLogEvent);
        }
    }

    public final String toString()
    {
        return (new StringBuilder("MethodImpl(")).append(mLogEvent).append(")").toString();
    }

    it>(LogEventParcelable logeventparcelable, GoogleApiClient googleapiclient)
    {
        this$0 = ClearcutLoggerApiImpl.this;
        super(googleapiclient);
        mLogEvent = logeventparcelable;
    }
}
