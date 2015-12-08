// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.config.G;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable

public final class ApiRateLimitUtil
{

    private static Clock sClock = DefaultClock.getInstance();
    private static final SparseArray sLastUpdateTimesMillis = new SparseArray();

    public static void clearSyncTimestamp(Lockable lockable)
    {
        clearTimestamp(lockable);
    }

    private static void clearTimestamp(Object obj)
    {
        sLastUpdateTimesMillis.remove(obj.hashCode());
    }

    public static void clearUriTimestamp(Uri uri)
    {
        clearTimestamp(uri);
    }

    private static boolean isRateLimited(Object obj, long l, boolean flag)
    {
        if (flag || ((Boolean)G.ignoreRateLimitChecks.get()).booleanValue())
        {
            return false;
        }
        long l1 = sClock.elapsedRealtime();
        obj = (Long)sLastUpdateTimesMillis.get(obj.hashCode());
        if (obj == null)
        {
            return false;
        }
        return l1 - ((Long) (obj)).longValue() <= l;
    }

    public static boolean isSyncRateLimited(Lockable lockable, long l, boolean flag)
    {
        return isRateLimited(lockable, l, flag);
    }

    public static boolean isUriRateLimited(Uri uri, long l, boolean flag)
    {
        return isRateLimited(uri, l, flag);
    }

    public static void updateSyncTimestamp(Lockable lockable)
    {
        updateTimestamp(lockable);
    }

    private static void updateTimestamp(Object obj)
    {
        sLastUpdateTimesMillis.put(obj.hashCode(), Long.valueOf(sClock.elapsedRealtime()));
    }

    public static void updateUriTimestamp(Uri uri)
    {
        updateTimestamp(uri);
    }

}
