// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.timeline.TimelineSyncStorage;
import com.soundcloud.android.sync.timeline.TimelineSyncer;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            StoreActivitiesCommand, ReplaceActivitiesCommand

public class ActivitiesSyncer extends TimelineSyncer
{

    public ActivitiesSyncer(ApiClient apiclient, StoreActivitiesCommand storeactivitiescommand, ReplaceActivitiesCommand replaceactivitiescommand, TimelineSyncStorage timelinesyncstorage)
    {
        super(ApiEndpoints.ACTIVITIES, Content.ME_ACTIVITIES.uri, apiclient, storeactivitiescommand, replaceactivitiescommand, timelinesyncstorage, new _cls1());
    }

    private class _cls1 extends TypeToken
    {

        _cls1()
        {
        }
    }

}
