// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            q

static abstract class iClient extends q
{

    protected Status b(Status status)
    {
        return status;
    }

    protected Result c(Status status)
    {
        return b(status);
    }

    iClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
