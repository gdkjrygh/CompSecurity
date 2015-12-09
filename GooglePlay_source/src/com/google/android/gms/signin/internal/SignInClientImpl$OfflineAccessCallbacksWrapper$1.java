// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.signin.internal:
//            SignInClientImpl, CheckServerAuthResult, ISignInService

final class val.signInService
    implements Runnable
{

    final val.signInService this$0;
    final String val$idToken;
    final List val$scopes;
    final ISignInService val$signInService;

    public final void run()
    {
        try
        {
            com.google.android.gms.common.api.er _tmp = cess._mth000(this._cls0.this);
            Collections.unmodifiableSet(new HashSet(val$scopes));
            CheckServerAuthResult checkserverauthresult = new CheckServerAuthResult(false, null);
            val$signInService.onCheckServerAuthorization(checkserverauthresult);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
        }
    }

    ()
    {
        this$0 = final_;
        val$scopes = list;
        val$idToken = s;
        val$signInService = ISignInService.this;
        super();
    }
}
