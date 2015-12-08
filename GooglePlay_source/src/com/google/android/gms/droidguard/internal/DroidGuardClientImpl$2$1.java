// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import android.os.RemoteException;
import com.google.android.gms.droidguard.DroidGuardResultsCallback;

// Referenced classes of package com.google.android.gms.droidguard.internal:
//            DroidGuardClientImpl, AbstractDroidGuardCallbacks

final class ._cls0 extends com.google.android.gms.common.internal._cls1
{

    final onnect this$1;
    final byte val$results[];

    protected final volatile void deliverCallback(Object obj)
    {
        obj = (DroidGuardResultsCallback)obj;
        if (obj != null)
        {
            ((DroidGuardResultsCallback) (obj)).onDroidGuardResults(DroidGuardClientImpl.responseToString(val$results));
        }
        disconnect();
    }

    protected final void onDeliverCallbackFailed()
    {
        disconnect();
    }

    ks(byte abyte0[])
    {
        this$1 = final_ks;
        val$results = abyte0;
        super(final_ks._fld0, DroidGuardResultsCallback.this);
    }

    // Unreferenced inner class com/google/android/gms/droidguard/internal/DroidGuardClientImpl$2

/* anonymous class */
    final class DroidGuardClientImpl._cls2 extends AbstractDroidGuardCallbacks
    {

        final DroidGuardClientImpl this$0;
        final DroidGuardResultsCallback val$onceCallback;

        public final void onDroidGuardResults(byte abyte0[])
            throws RemoteException
        {
            abyte0 = onceCallback. new DroidGuardClientImpl._cls2._cls1(abyte0);
            doCallbackDEPRECATED(abyte0);
        }

            
            {
                this$0 = final_droidguardclientimpl;
                onceCallback = DroidGuardResultsCallback.this;
                super();
            }
    }

}
