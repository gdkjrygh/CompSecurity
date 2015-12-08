// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections.tasks;

import android.content.Context;
import android.net.Uri;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.InvalidTokenException;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.model.activities.Activities;
import com.soundcloud.android.storage.LegacyActivitiesStorage;
import com.soundcloud.android.sync.ApiSyncResult;
import com.soundcloud.android.sync.ApiSyncer;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.collections.tasks:
//            CollectionLoader, CollectionParams, ReturnData

public class ActivitiesLoader
    implements CollectionLoader
{

    public ActivitiesLoader()
    {
    }

    private Activities getOlderActivities(LegacyActivitiesStorage legacyactivitiesstorage, CollectionParams collectionparams)
    {
        return legacyactivitiesstorage.getCollectionBefore(collectionparams.contentUri.buildUpon().appendQueryParameter("limit", String.valueOf(collectionparams.maxToLoad)).build(), collectionparams.timestamp);
    }

    public ReturnData load(PublicApi publicapi, CollectionParams collectionparams)
    {
        Object obj;
        char c;
        boolean flag1;
        flag1 = true;
        obj = new LegacyActivitiesStorage();
        c = '\310';
        if (!collectionparams.isRefresh) goto _L2; else goto _L1
_L1:
        boolean flag;
        publicapi = ((LegacyActivitiesStorage) (obj)).getCollectionSince(collectionparams.contentUri, collectionparams.timestamp);
        flag = true;
        flag1 = true;
_L5:
        return new ReturnData(((Activities) (publicapi)).collection, collectionparams, null, c, flag1, flag);
_L2:
        publicapi = getOlderActivities(((LegacyActivitiesStorage) (obj)), collectionparams);
        if (publicapi.size() >= collectionparams.maxToLoad) goto _L4; else goto _L3
_L3:
        SoundCloudApplication soundcloudapplication = SoundCloudApplication.instance;
        flag = (new ApiSyncer(soundcloudapplication, soundcloudapplication.getContentResolver())).syncContent(collectionparams.contentUri, "com.soundcloud.android.sync.action.APPEND").success;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj = getOlderActivities(((LegacyActivitiesStorage) (obj)), collectionparams);
        publicapi = ((PublicApi) (obj));
        flag = true;
_L7:
        if (!flag || publicapi.size() <= 0) goto _L6; else goto _L5
        Object obj1;
        obj1;
        flag = false;
_L9:
        c = '\u0191';
          goto _L7
        obj1;
        flag = false;
_L8:
        obj1 = SoundCloudApplication.TAG;
          goto _L7
_L4:
        flag = true;
          goto _L7
_L6:
        flag1 = false;
          goto _L5
        obj1;
        flag = true;
          goto _L8
        obj1;
        flag = true;
          goto _L9
        flag = false;
          goto _L7
    }
}
