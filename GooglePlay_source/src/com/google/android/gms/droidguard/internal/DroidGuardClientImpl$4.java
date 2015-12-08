// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.droidguard.DroidGuardResultsCallback;

// Referenced classes of package com.google.android.gms.droidguard.internal:
//            DroidGuardClientImpl

final class val.onceCallback
    implements com.google.android.gms.common.api.ctionFailedListener
{

    final DroidGuardClientImpl this$0;
    final DroidGuardResultsCallback val$onceCallback;

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        val$onceCallback.onDroidGuardResults(DroidGuardClientImpl.getErrorResponse((new StringBuilder("Connection failed: ")).append(connectionresult).toString()));
    }

    edListener()
    {
        this$0 = final_droidguardclientimpl;
        val$onceCallback = DroidGuardResultsCallback.this;
        super();
    }
}
