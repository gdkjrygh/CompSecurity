// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveBaseApiMethodImpl, DriveApiImpl

private static abstract class <init> extends DriveBaseApiMethodImpl
{

    public final volatile Result createFailedResult(Status status)
    {
        return new nit>(status, null, (byte)0);
    }

    private (GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    (GoogleApiClient googleapiclient, byte byte0)
    {
        this(googleapiclient);
    }
}
