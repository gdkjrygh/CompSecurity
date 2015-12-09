// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.appcert;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.auth.appcert:
//            AppCertServiceClient, IAppCertService

final class val.packageNameToCertify
    implements ll
{

    final AppCertServiceClient this$0;
    final String val$packageNameToCertify;

    public final volatile Object exec(IAppCertService iappcertservice)
        throws RemoteException
    {
        return iappcertservice.getAppCert(val$packageNameToCertify);
    }

    ll()
    {
        this$0 = final_appcertserviceclient;
        val$packageNameToCertify = String.this;
        super();
    }
}
