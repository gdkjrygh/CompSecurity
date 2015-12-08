// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.signin.internal:
//            AuthAccountResult

public class BaseSignInCallbacks extends ISignInCallbacks.Stub
{

    public BaseSignInCallbacks()
    {
    }

    public void onAuthAccountComplete(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
    {
    }

    public final void onGetCurrentAccountComplete(Status status, GoogleSignInAccount googlesigninaccount)
        throws RemoteException
    {
    }

    public final void onRecordConsentComplete(Status status)
        throws RemoteException
    {
    }

    public final void onSaveAccountToSessionStoreComplete(Status status)
        throws RemoteException
    {
    }
}
