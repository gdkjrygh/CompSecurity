// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;

public interface ConfigApi
{

    public abstract PendingResult createCustomDataType(GoogleApiClient googleapiclient, DataTypeCreateRequest datatypecreaterequest);

    public abstract PendingResult disableFit(GoogleApiClient googleapiclient);

    public abstract PendingResult readDataType(GoogleApiClient googleapiclient, String s);
}
