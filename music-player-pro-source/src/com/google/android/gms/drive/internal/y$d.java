// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            q, y

private abstract class iClient extends q
{

    final y Qt;

    public Result c(Status status)
    {
        return u(status);
    }

    public com.google.android.gms.drive.eResource.MetadataResult u(Status status)
    {
        return new <init>(status, null);
    }

    private iClient(y y1, GoogleApiClient googleapiclient)
    {
        Qt = y1;
        super(googleapiclient);
    }

    iClient(y y1, GoogleApiClient googleapiclient, iClient iclient)
    {
        this(y1, googleapiclient);
    }
}
