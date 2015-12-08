// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.SyncResult;
import android.content.SyncStats;
import android.net.Uri;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ApiSyncResult
{

    public static final int CHANGED = 2;
    protected static final int GENERAL_ERROR_DELAY_RANGE = 20;
    protected static final int GENERAL_ERROR_MINIMUM_DELAY = 10;
    public static final int REORDERED = 1;
    public static final int UNCHANGED = 0;
    public int change;
    public String extra;
    public int new_size;
    public boolean success;
    public final SyncResult syncResult = new SyncResult();
    public long synced_at;
    public final Uri uri;

    public ApiSyncResult(Uri uri1)
    {
        uri = uri1;
    }

    public static ApiSyncResult fromAuthException(Uri uri1)
    {
        uri1 = new ApiSyncResult(uri1);
        SyncStats syncstats = ((ApiSyncResult) (uri1)).syncResult.stats;
        syncstats.numAuthExceptions = syncstats.numAuthExceptions + 1L;
        return uri1;
    }

    public static ApiSyncResult fromClientError(Uri uri1)
    {
        return new ApiSyncResult(uri1);
    }

    public static ApiSyncResult fromGeneralFailure(Uri uri1)
    {
        return fromGeneralFailure(uri1, new Random());
    }

    static ApiSyncResult fromGeneralFailure(Uri uri1, Random random)
    {
        uri1 = new ApiSyncResult(uri1);
        ((ApiSyncResult) (uri1)).syncResult.delayUntil = getRandomizedDelayTime(random, 10, 20);
        return uri1;
    }

    public static ApiSyncResult fromIOException(Uri uri1)
    {
        uri1 = new ApiSyncResult(uri1);
        SyncStats syncstats = ((ApiSyncResult) (uri1)).syncResult.stats;
        syncstats.numIoExceptions = syncstats.numIoExceptions + 1L;
        return uri1;
    }

    public static ApiSyncResult fromServerError(Uri uri1)
    {
        uri1 = new ApiSyncResult(uri1);
        setDelayUntilToOneSyncInterval(uri1);
        return uri1;
    }

    public static ApiSyncResult fromSuccessWithoutChange(Uri uri1)
    {
        uri1 = new ApiSyncResult(uri1);
        uri1.success = true;
        uri1.synced_at = System.currentTimeMillis();
        uri1.change = 0;
        return uri1;
    }

    public static ApiSyncResult fromSuccessfulChange(Uri uri1)
    {
        uri1 = new ApiSyncResult(uri1);
        uri1.success = true;
        uri1.synced_at = System.currentTimeMillis();
        uri1.change = 2;
        return uri1;
    }

    public static ApiSyncResult fromUnexpectedResponse(Uri uri1, int i)
    {
        uri1 = new ApiSyncResult(uri1);
        if (i >= 500)
        {
            setDelayUntilToOneSyncInterval(uri1);
        }
        return uri1;
    }

    private static long getRandomizedDelayTime(Random random, int i, int j)
    {
        return TimeUnit.MINUTES.toSeconds(random.nextInt(j + 1) + i);
    }

    private static void setDelayUntilToOneSyncInterval(ApiSyncResult apisyncresult)
    {
        apisyncresult.syncResult.delayUntil = 3600L;
    }

    public void setSyncData(long l, int i)
    {
        synced_at = l;
        new_size = i;
    }

    public void setSyncData(boolean flag, long l, int i, int j)
    {
        success = flag;
        synced_at = l;
        new_size = i;
        change = j;
    }

    public String toString()
    {
        return (new StringBuilder("Result{uri=")).append(uri).append(", syncResult=").append(syncResult).append(", change=").append(change).append(", success=").append(success).append(", synced_at=").append(synced_at).append(", new_size=").append(new_size).append(", extra='").append(extra).append('\'').append('}').toString();
    }
}
