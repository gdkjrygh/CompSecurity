// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import android.os.RemoteException;
import com.google.android.gms.droidguard.DroidGuardResultsCallback;

// Referenced classes of package com.google.android.gms.droidguard.internal:
//            AbstractDroidGuardCallbacks, DroidGuardClientImpl

final class acks extends AbstractDroidGuardCallbacks
{

    final DroidGuardClientImpl this$0;
    final DroidGuardResultsCallback val$onceCallback;

    public final void onDroidGuardResults(byte abyte0[])
        throws RemoteException
    {
        abyte0 = new com.google.android.gms.common.internal.GmsClient.CallbackProxy(abyte0) {

            final DroidGuardClientImpl._cls2 this$1;
            final byte val$results[];

            protected final volatile void deliverCallback(Object obj)
            {
                obj = (DroidGuardResultsCallback)obj;
                if (obj != null)
                {
                    ((DroidGuardResultsCallback) (obj)).onDroidGuardResults(DroidGuardClientImpl.responseToString(results));
                }
                disconnect();
            }

            protected final void onDeliverCallbackFailed()
            {
                disconnect();
            }

            
            {
                this$1 = DroidGuardClientImpl._cls2.this;
                results = abyte0;
                super(this$0, final_droidguardresultscallback);
            }
        };
        doCallbackDEPRECATED(abyte0);
    }

    this._cls0()
    {
        this$0 = final_droidguardclientimpl;
        val$onceCallback = DroidGuardResultsCallback.this;
        super();
    }
}
