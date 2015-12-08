// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.content.SharedPreferences;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import java.util.concurrent.TimeUnit;
import rx.b;
import rx.b.f;

class DiscoverySyncer
{

    private static final long CACHE_EXPIRATION_TIME;
    private static final f FROM_SYNC_RESULT = new _cls1();
    private static final String KEY_LAST_SYNC_TIME = "last_recommendations_sync_time";
    private final DateProvider dateProvider;
    private final rx.b.b setLastSyncTime = new _cls2();
    private final SharedPreferences sharedPreferences;
    private final SyncInitiator syncInitiator;

    DiscoverySyncer(SyncInitiator syncinitiator, SharedPreferences sharedpreferences, CurrentDateProvider currentdateprovider)
    {
        syncInitiator = syncinitiator;
        sharedPreferences = sharedpreferences;
        dateProvider = currentdateprovider;
    }

    private long getLastSyncTime()
    {
        return sharedPreferences.getLong("last_recommendations_sync_time", 0L);
    }

    private boolean isRecommendationsCacheExpired()
    {
        return dateProvider.getCurrentTime() - getLastSyncTime() > CACHE_EXPIRATION_TIME;
    }

    private void updateLastSyncTime()
    {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong("last_recommendations_sync_time", dateProvider.getCurrentTime());
        editor.apply();
    }

    void clearLastSyncTime()
    {
        sharedPreferences.edit().clear().apply();
    }

    b syncRecommendations()
    {
        if (isRecommendationsCacheExpired())
        {
            return syncInitiator.syncRecommendations().doOnNext(setLastSyncTime).map(FROM_SYNC_RESULT);
        } else
        {
            return b.just(Boolean.valueOf(false));
        }
    }

    static 
    {
        CACHE_EXPIRATION_TIME = TimeUnit.DAYS.toMillis(1L);
    }


    private class _cls2
        implements rx.b.b
    {

        final DiscoverySyncer this$0;

        public void call(SyncResult syncresult)
        {
            if (syncresult.wasSuccess())
            {
                updateLastSyncTime();
            }
        }

        public volatile void call(Object obj)
        {
            call((SyncResult)obj);
        }

        _cls2()
        {
            this$0 = DiscoverySyncer.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final Boolean call(SyncResult syncresult)
        {
            return Boolean.valueOf(syncresult.wasSuccess());
        }

        public final volatile Object call(Object obj)
        {
            return call((SyncResult)obj);
        }

        _cls1()
        {
        }
    }

}
