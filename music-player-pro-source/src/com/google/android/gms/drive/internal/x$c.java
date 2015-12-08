// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            q, x

private abstract class iClient extends q
{

    final x Qq;

    protected Result c(Status status)
    {
        return t(status);
    }

    protected com.google.android.gms.drive.ePreferencesApi.FileUploadPreferencesResult t(Status status)
    {
        return new <init>(Qq, status, null, null);
    }

    public iClient(x x1, GoogleApiClient googleapiclient)
    {
        Qq = x1;
        super(googleapiclient);
    }
}
