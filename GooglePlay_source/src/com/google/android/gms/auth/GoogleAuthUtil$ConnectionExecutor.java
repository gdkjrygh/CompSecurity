// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.auth:
//            GoogleAuthUtil, GoogleAuthException

private static interface 
{

    public abstract Object exec(IBinder ibinder)
        throws RemoteException, IOException, GoogleAuthException;
}
