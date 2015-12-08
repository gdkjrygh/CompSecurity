// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            ol, on

private static abstract class gleApiClient extends gleApiClient
{

    protected com.google.android.gms.panorama.amaApi.PanoramaResult ay(Status status)
    {
        return new on(status, null);
    }

    protected Result c(Status status)
    {
        return ay(status);
    }

    public gleApiClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
