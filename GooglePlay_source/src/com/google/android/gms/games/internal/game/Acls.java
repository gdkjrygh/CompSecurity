// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public interface Acls
{
    public static interface LoadAclResult
        extends Releasable, Result
    {

        public abstract DataHolder getDataHolder();
    }

    public static interface OnGameplayAclLoadedCallback
    {

        public abstract void onGameplayAclLoaded(LoadAclResult loadaclresult);
    }

    public static interface OnGameplayAclUpdatedCallback
    {

        public abstract void onGameplayAclUpdated(Status status);
    }


    public abstract PendingResult loadNotifyAclInternal(GoogleApiClient googleapiclient);

    public abstract PendingResult updateNotifyAclInternal(GoogleApiClient googleapiclient, String s);
}
