// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface Account
{

    public abstract void clearDefaultAccount(GoogleApiClient googleapiclient);

    public abstract String getAccountName(GoogleApiClient googleapiclient);

    public abstract PendingResult revokeAccessAndDisconnect(GoogleApiClient googleapiclient);
}
