// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.Request;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.api.legacy.model.activities.Activities;
import com.soundcloud.android.api.legacy.model.activities.Activity;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.storage.LegacyActivitiesStorage;
import com.soundcloud.android.storage.LegacyUserStorage;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.HttpUtils;
import com.soundcloud.propeller.WriteResult;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.soundcloud.android.sync:
//            LegacySyncStrategy, ApiSyncResult

public class ApiSyncer extends LegacySyncStrategy
{

    private static final int MAX_LOOKUP_COUNT = 100;
    LegacyActivitiesStorage activitiesStorage;
    ApiClient apiClient;
    EventBus eventBus;
    StoreTracksCommand storeTracksCommand;
    LegacyUserStorage userStorage;

    public ApiSyncer(Context context, ContentResolver contentresolver)
    {
        super(context, contentresolver);
        SoundCloudApplication.getObjectGraph().a(this);
    }

    ApiSyncer(Context context, ContentResolver contentresolver, EventBus eventbus, ApiClient apiclient, AccountOperations accountoperations, StoreTracksCommand storetrackscommand)
    {
        super(context, contentresolver, accountoperations);
        activitiesStorage = new LegacyActivitiesStorage();
        userStorage = new LegacyUserStorage();
        eventBus = eventbus;
        apiClient = apiclient;
        storeTracksCommand = storetrackscommand;
    }

    private void appendActivities(ApiSyncResult apisyncresult, Content content)
        throws IOException
    {
        Activity activity;
        Object obj;
        activity = activitiesStorage.getOldestActivity(content);
        obj = (new Request(content.request())).add("limit", Integer.valueOf(30));
        if (activity != null)
        {
            ((Request) (obj)).add("cursor", activity.toGUID());
        }
        obj = Activities.fetch(api, ((Request) (obj)));
        break MISSING_BLOCK_LABEL_59;
        int i;
        if (obj == null || ((Activities) (obj)).isEmpty() || ((Activities) (obj)).size() == 1 && ((Activity)((Activities) (obj)).get(0)).equals(activity) || activitiesStorage.insert(content, ((Activities) (obj))) <= 0)
        {
            i = 0;
        } else
        {
            i = 2;
        }
        apisyncresult.change = i;
        return;
    }

    private ApiSyncResult fetchAndInsertCollection(Content content, Uri uri)
        throws IOException
    {
        ApiSyncResult apisyncresult = new ApiSyncResult(uri);
        log((new StringBuilder("fetchAndInsertCollection(")).append(uri).append(")").toString());
        uri = Request.to(content.remoteUri, new Object[0]).add("ids", uri.getLastPathSegment());
        if (Content.PLAYLIST_LOOKUP.equals(content))
        {
            HttpUtils.addQueryParams(uri, new String[] {
                "representation", "compact"
            });
        }
        uri = api.readFullCollection(uri, com/soundcloud/android/api/legacy/model/PublicApiResource$ResourceHolder);
        (new _cls1(content)).createCollection(uri);
        apisyncresult.setSyncData(true, System.currentTimeMillis(), uri.size(), 2);
        return apisyncresult;
    }

    private void hardRefreshActivities(ApiSyncResult apisyncresult, Content content)
        throws IOException
    {
        Activities activities = Activities.fetchRecent(api, content.request(), 100);
        resolver.delete(content.uri, null, null);
        activitiesStorage.insert(content, activities);
        apisyncresult.setSyncData(true, System.currentTimeMillis(), activities.size(), 2);
    }

    private void prependActivities(ApiSyncResult apisyncresult, Content content)
        throws IOException
    {
        int j = 0;
        Object obj = activitiesStorage.getLatestActivity(content);
        Object obj1 = new Request(content.request());
        if (obj != null)
        {
            ((Request) (obj1)).add("uuid[to]", ((Activity) (obj)).toGUID());
        }
        log((new StringBuilder("activities: performing activity fetch request ")).append(obj1).toString());
        obj = Activities.fetchRecent(api, ((Request) (obj1)), 100);
        if (((Activities) (obj)).moreResourcesExist())
        {
            resolver.delete(content.uri, null, null);
        }
        obj1 = activitiesStorage.getLatestActivity(content);
        int i;
        if (((Activities) (obj)).isEmpty() || ((Activities) (obj)).size() == 1 && ((Activity)((Activities) (obj)).get(0)).equals(obj1))
        {
            i = 0;
        } else
        {
            i = activitiesStorage.insert(content, ((Activities) (obj)));
        }
        apisyncresult.setSyncData(System.currentTimeMillis(), ((Activities) (obj)).size());
        if (i > 0)
        {
            j = 2;
        }
        apisyncresult.change = j;
    }

    private ApiSyncResult safeSyncActivities(Uri uri, String s)
        throws IOException
    {
        try
        {
            uri = syncActivities(uri, s);
            uri.success = true;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            ErrorUtils.handleSilentException(uri);
            throw new IOException((new StringBuilder("Problem syncing activities : ")).append(uri).toString());
        }
        return uri;
    }

    private ApiSyncResult syncActivities(Uri uri, String s)
        throws IOException
    {
        ApiSyncResult apisyncresult = new ApiSyncResult(uri);
        log((new StringBuilder("syncActivities(")).append(uri).append("); action=").append(s).toString());
        uri = Content.match(uri);
        if ("com.soundcloud.android.sync.action.APPEND".equals(s))
        {
            appendActivities(apisyncresult, uri);
            return apisyncresult;
        }
        if ("com.soundcloud.android.sync.action.HARD_REFRESH".equals(s))
        {
            hardRefreshActivities(apisyncresult, uri);
            return apisyncresult;
        } else
        {
            prependActivities(apisyncresult, uri);
            return apisyncresult;
        }
    }

    private ApiSyncResult syncMe(Content content)
    {
        ApiSyncResult apisyncresult;
        apisyncresult = new ApiSyncResult(content.uri);
        content = ApiRequest.get(ApiEndpoints.CURRENT_USER.path()).forPublicApi().build();
        content = (PublicApiUser)apiClient.fetchMappedResponse(content, com/soundcloud/android/api/legacy/model/PublicApiUser);
        content.setUpdated();
        SoundCloudApplication.sModelManager.cache(content, com.soundcloud.android.api.legacy.model.PublicApiResource.CacheUpdateMode.FULL);
_L2:
        apisyncresult.synced_at = System.currentTimeMillis();
        if (content != null)
        {
            userStorage.createOrUpdate(content);
            apisyncresult.change = 2;
            apisyncresult.success = true;
        }
        return apisyncresult;
        content;
_L3:
        content.printStackTrace();
        content = null;
        if (true) goto _L2; else goto _L1
_L1:
        content;
          goto _L3
        content;
          goto _L3
    }

    private ApiSyncResult syncSingleTrack(Uri uri)
        throws IOException
    {
        ApiSyncResult apisyncresult;
        Object obj;
        apisyncresult = new ApiSyncResult(uri);
        long l = ContentUris.parseId(uri);
        obj = ApiRequest.get(ApiEndpoints.LEGACY_TRACK.path(new Object[] {
            Long.valueOf(l)
        })).forPublicApi().build();
        obj = (PublicApiTrack)apiClient.fetchMappedResponse(((ApiRequest) (obj)), com/soundcloud/android/api/legacy/model/PublicApiTrack);
        if (((WriteResult)storeTracksCommand.call(Collections.singleton(obj))).success())
        {
            log((new StringBuilder("inserted ")).append(uri.toString()).toString());
            apisyncresult.setSyncData(true, System.currentTimeMillis(), 1, 2);
            return apisyncresult;
        } else
        {
            log((new StringBuilder("failed to create to ")).append(uri).toString());
            apisyncresult.success = false;
            return apisyncresult;
        }
        uri;
_L2:
        throw new IOException(uri);
        uri;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public ApiSyncResult syncContent(Uri uri, String s)
        throws IOException
    {
        Content content;
        ApiSyncResult apisyncresult;
        long l;
        l = accountOperations.getLoggedInUserId();
        content = Content.match(uri);
        apisyncresult = new ApiSyncResult(uri);
        if (l <= 0L || content.remoteUri == null) goto _L2; else goto _L1
_L1:
        _cls2..SwitchMap.com.soundcloud.android.storage.provider.Content[content.ordinal()];
        JVM INSTR tableswitch 1 6: default 84
    //                   1 87
    //                   2 168
    //                   3 168
    //                   4 175
    //                   5 175
    //                   6 182;
           goto _L2 _L3 _L4 _L4 _L5 _L5 _L6
_L2:
        return apisyncresult;
_L3:
        uri = syncMe(content);
        if (((ApiSyncResult) (uri)).success)
        {
            resolver.notifyChange(Content.ME.uri, null);
            s = accountOperations.getLoggedInUser();
            eventBus.publish(EventQueue.CURRENT_USER_CHANGED, CurrentUserChangedEvent.forUserUpdated(s));
        }
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("lastUserSync", System.currentTimeMillis()).apply();
        return uri;
_L4:
        return safeSyncActivities(uri, s);
_L5:
        return fetchAndInsertCollection(content, uri);
_L6:
        return syncSingleTrack(uri);
    }

    private class _cls1 extends BaseDAO
    {

        final ApiSyncer this$0;
        final Content val$content;

        public Content getContent()
        {
            return content;
        }

        _cls1(Content content1)
        {
            this$0 = ApiSyncer.this;
            content = content1;
            super(final_contentresolver);
        }
    }


    private class _cls2
    {

        static final int $SwitchMap$com$soundcloud$android$storage$provider$Content[];

        static 
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content = new int[Content.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_ALL_ACTIVITIES.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_ACTIVITIES.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.TRACK_LOOKUP.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER_LOOKUP.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.TRACK.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
