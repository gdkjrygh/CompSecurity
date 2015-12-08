// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            hz

private static abstract class gleApiClient extends gleApiClient
{

    protected Status b(Status status)
    {
        return status;
    }

    protected Result c(Status status)
    {
        return b(status);
    }

    gleApiClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
