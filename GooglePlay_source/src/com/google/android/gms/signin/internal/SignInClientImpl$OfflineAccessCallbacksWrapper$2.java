// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.google.android.gms.signin.internal:
//            SignInClientImpl, ISignInService

final class val.signInService
    implements Runnable
{

    final val.signInService this$0;
    final String val$idToken;
    final String val$serverAuthCode;
    final ISignInService val$signInService;

    public final void run()
    {
        try
        {
            boolean flag = cess._mth000(this._cls0.this)._mth16da05f3();
            val$signInService.onUploadServerAuthCode(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
        }
    }

    ()
    {
        this$0 = final_;
        val$idToken = s;
        val$serverAuthCode = s1;
        val$signInService = ISignInService.this;
        super();
    }
}
