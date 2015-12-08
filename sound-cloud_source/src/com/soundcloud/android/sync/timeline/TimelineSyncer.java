// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.timeline;

import android.net.Uri;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.model.Link;
import com.soundcloud.android.api.model.ModelCollection;
import com.soundcloud.android.commands.Command;
import com.soundcloud.android.sync.ApiSyncResult;
import com.soundcloud.android.sync.SyncStrategy;
import com.soundcloud.android.utils.LocaleProvider;
import com.soundcloud.java.reflect.TypeToken;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.sync.timeline:
//            TimelineSyncStorage

public class TimelineSyncer
    implements SyncStrategy
{

    static final String FUTURE_LINK_REL = "future";
    private final ApiClient apiClient;
    private final TypeToken collectionTypeToken;
    private final Uri contentUri;
    private final ApiEndpoints endpoint;
    private final Command replaceItemsCommand;
    private final Command storeItemsCommand;
    private final TimelineSyncStorage timelineSyncStorage;

    public TimelineSyncer(ApiEndpoints apiendpoints, Uri uri, ApiClient apiclient, Command command, Command command1, TimelineSyncStorage timelinesyncstorage, TypeToken typetoken)
    {
        endpoint = apiendpoints;
        contentUri = uri;
        apiClient = apiclient;
        storeItemsCommand = command;
        replaceItemsCommand = command1;
        timelineSyncStorage = timelinesyncstorage;
        collectionTypeToken = typetoken;
    }

    private ApiSyncResult append()
        throws Exception
    {
        if (timelineSyncStorage.hasNextPageUrl())
        {
            Object obj = ApiRequest.get(timelineSyncStorage.getNextPageUrl()).forPrivateApi(1);
            obj = (ModelCollection)apiClient.fetchMappedResponse(((com.soundcloud.android.api.ApiRequest.Builder) (obj)).build(), collectionTypeToken);
            timelineSyncStorage.storeNextPageUrl(((ModelCollection) (obj)).getNextLink());
            if (((ModelCollection) (obj)).getCollection().isEmpty())
            {
                return ApiSyncResult.fromSuccessWithoutChange(contentUri);
            } else
            {
                storeItemsCommand.call(((ModelCollection) (obj)).getCollection());
                return ApiSyncResult.fromSuccessfulChange(contentUri);
            }
        } else
        {
            return ApiSyncResult.fromSuccessWithoutChange(contentUri);
        }
    }

    private ApiSyncResult prepend()
        throws Exception
    {
        Object obj = ApiRequest.get(timelineSyncStorage.getFuturePageUrl()).forPrivateApi(1);
        obj = (ModelCollection)apiClient.fetchMappedResponse(((com.soundcloud.android.api.ApiRequest.Builder) (obj)).build(), collectionTypeToken);
        Map map = ((ModelCollection) (obj)).getLinks();
        if (map.containsKey("future"))
        {
            timelineSyncStorage.storeFuturePageUrl((Link)map.get("future"));
        }
        if (((ModelCollection) (obj)).getCollection().isEmpty())
        {
            return ApiSyncResult.fromSuccessWithoutChange(contentUri);
        } else
        {
            storeItemsCommand.call(((ModelCollection) (obj)).getCollection());
            return ApiSyncResult.fromSuccessfulChange(contentUri);
        }
    }

    private ApiSyncResult refresh()
        throws Exception
    {
        Object obj = ApiRequest.get(endpoint.path()).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.PAGE_SIZE, new Object[] {
            "30"
        }).forPrivateApi(1);
        String s = LocaleProvider.getFormattedLocale();
        if (!s.isEmpty())
        {
            ((com.soundcloud.android.api.ApiRequest.Builder) (obj)).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.LOCALE, new Object[] {
                s
            });
        }
        obj = (ModelCollection)apiClient.fetchMappedResponse(((com.soundcloud.android.api.ApiRequest.Builder) (obj)).build(), collectionTypeToken);
        replaceItemsCommand.call(((ModelCollection) (obj)).getCollection());
        timelineSyncStorage.storeNextPageUrl(((ModelCollection) (obj)).getNextLink());
        obj = ((ModelCollection) (obj)).getLinks();
        if (((Map) (obj)).containsKey("future"))
        {
            timelineSyncStorage.storeFuturePageUrl((Link)((Map) (obj)).get("future"));
        }
        return ApiSyncResult.fromSuccessfulChange(contentUri);
    }

    private ApiSyncResult safePrepend()
        throws Exception
    {
        ApiSyncResult apisyncresult;
        try
        {
            apisyncresult = prepend();
        }
        catch (ApiRequestException apirequestexception)
        {
            if (!apirequestexception.isNetworkError())
            {
                timelineSyncStorage.clear();
            }
            throw apirequestexception;
        }
        return apisyncresult;
    }

    public ApiSyncResult syncContent(Uri uri, String s)
        throws Exception
    {
        (new StringBuilder("Syncing ")).append(uri).append("; action=").append(s);
        if ("com.soundcloud.android.sync.action.APPEND".equals(s))
        {
            return append();
        }
        if ("com.soundcloud.android.sync.action.HARD_REFRESH".equals(s) || timelineSyncStorage.isMissingFuturePageUrl())
        {
            return refresh();
        } else
        {
            return safePrepend();
        }
    }
}
