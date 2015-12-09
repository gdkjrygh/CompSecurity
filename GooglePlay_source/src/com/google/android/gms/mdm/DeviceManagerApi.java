// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.mdm;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

public interface DeviceManagerApi
{
    public static interface DeviceNameResult
        extends Result
    {

        public abstract String getModel();

        public abstract String getName();
    }


    public abstract PendingResult getDeviceName(GoogleApiClient googleapiclient);
}
