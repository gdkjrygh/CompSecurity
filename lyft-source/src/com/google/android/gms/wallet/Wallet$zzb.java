// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public abstract class piClient extends piClient
{

    protected Result b(Status status)
    {
        return d(status);
    }

    protected Status d(Status status)
    {
        return status;
    }

    public piClient(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }
}
