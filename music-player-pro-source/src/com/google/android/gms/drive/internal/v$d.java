// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            q, v

static abstract class iClient extends q
{

    public Result c(Status status)
    {
        return r(status);
    }

    public com.google.android.gms.drive.eFolder.DriveFileResult r(Status status)
    {
        return new <init>(status, null);
    }

    iClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
