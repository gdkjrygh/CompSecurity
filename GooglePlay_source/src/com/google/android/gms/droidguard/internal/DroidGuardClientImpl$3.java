// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.droidguard.DroidGuardResultsCallback;
import java.util.Map;

// Referenced classes of package com.google.android.gms.droidguard.internal:
//            DroidGuardClientImpl, IDroidGuardService, AbstractDroidGuardCallbacks

final class val.onceCallback
    implements com.google.android.gms.common.api.ionCallbacks
{

    final DroidGuardClientImpl this$0;
    final Map val$args;
    final AbstractDroidGuardCallbacks val$binderCallbacks;
    final String val$flowName;
    final DroidGuardResultsCallback val$onceCallback;

    public final void onConnected(Bundle bundle)
    {
        try
        {
            DroidGuardClientImpl.access$000(DroidGuardClientImpl.this);
            ((IDroidGuardService)getService()).getResults(val$binderCallbacks, val$flowName, val$args);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            val$onceCallback.onDroidGuardResults(DroidGuardClientImpl.getErrorResponse((new StringBuilder("RemoteException: ")).append(bundle).toString()));
        }
    }

    public final void onConnectionSuspended(int i)
    {
        val$onceCallback.onDroidGuardResults(DroidGuardClientImpl.getErrorResponse("Disconnected."));
    }

    acks()
    {
        this$0 = final_droidguardclientimpl;
        val$binderCallbacks = abstractdroidguardcallbacks;
        val$flowName = s;
        val$args = map;
        val$onceCallback = DroidGuardResultsCallback.this;
        super();
    }
}
