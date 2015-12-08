// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.playlists.ApiPlaylistCollection;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.java.collections.MoreCollections;
import com.soundcloud.java.functions.Predicates;
import java.util.Collection;
import java.util.List;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistTagStorage

public class PlaylistDiscoveryOperations
{

    private final ApiClientRx apiClientRx;
    private final rx.b.b cachePopularTags = new _cls2();
    private final f collectionToList = new _cls1();
    private final NetworkConnectionHelper connectionHelper;
    private final R scheduler;
    private final StorePlaylistsCommand storePlaylistsCommand;
    private final PlaylistTagStorage tagStorage;

    PlaylistDiscoveryOperations(ApiClientRx apiclientrx, NetworkConnectionHelper networkconnectionhelper, PlaylistTagStorage playlisttagstorage, StorePlaylistsCommand storeplaylistscommand, R r)
    {
        apiClientRx = apiclientrx;
        connectionHelper = networkconnectionhelper;
        tagStorage = playlisttagstorage;
        storePlaylistsCommand = storeplaylistscommand;
        scheduler = r;
    }

    private com.soundcloud.android.api.ApiRequest.Builder createPlaylistResultsRequest(String s)
    {
        return ApiRequest.get(s).forPrivateApi(1);
    }

    private b fetchAndCachePopularTags()
    {
        ApiRequest apirequest = ApiRequest.get(ApiEndpoints.PLAYLIST_DISCOVERY_TAGS.path()).forPrivateApi(1).build();
        _cls4 _lcls4 = new _cls4();
        return apiClientRx.mappedResponse(apirequest, _lcls4).subscribeOn(scheduler).doOnNext(cachePopularTags).map(collectionToList);
    }

    private b getCachedPlaylistTags()
    {
        return tagStorage.getPopularTagsAsync();
    }

    private b getPlaylistResultsNextPage(String s, String s1)
    {
        return getPlaylistResultsPage(s, createPlaylistResultsRequest(s1).build());
    }

    private b getPlaylistResultsPage(String s, ApiRequest apirequest)
    {
        return apiClientRx.mappedResponse(apirequest, com/soundcloud/android/playlists/ApiPlaylistCollection).subscribeOn(scheduler).doOnNext(storePlaylistsCommand.toAction()).map(withSearchTag(s));
    }

    private Collection removeItemIgnoreCase(List list, String s)
    {
        return MoreCollections.filter(list, Predicates.containsPattern((new StringBuilder("(?i)^(?!")).append(s).append("$).*$").toString()));
    }

    private f withSearchTag(final String searchTag)
    {
        return new _cls7();
    }

    public void clearData()
    {
        tagStorage.clear();
    }

    com.soundcloud.rx.Pager.PagingFunction pager(final String searchTag)
    {
        return new _cls6();
    }

    b playlistsForTag(final String tag)
    {
        return getPlaylistResultsPage(tag, createPlaylistResultsRequest(ApiEndpoints.PLAYLIST_DISCOVERY.path()).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.PAGE_SIZE, new Object[] {
            "20"
        }).addQueryParam("tag", new Object[] {
            tag
        }).build()).finallyDo(new _cls5());
    }

    public b popularPlaylistTags()
    {
        return getCachedPlaylistTags().flatMap(new _cls3());
    }

    public b recentPlaylistTags()
    {
        return tagStorage.getRecentTagsAsync();
    }






    private class _cls1
        implements f
    {

        final PlaylistDiscoveryOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((ModelCollection)obj);
        }

        public List call(ModelCollection modelcollection)
        {
            return modelcollection.getCollection();
        }

        _cls1()
        {
            this$0 = PlaylistDiscoveryOperations.this;
            super();
        }
    }


    private class _cls2
        implements rx.b.b
    {

        final PlaylistDiscoveryOperations this$0;

        public void call(ModelCollection modelcollection)
        {
            tagStorage.cachePopularTags(modelcollection.getCollection());
        }

        public volatile void call(Object obj)
        {
            call((ModelCollection)obj);
        }

        _cls2()
        {
            this$0 = PlaylistDiscoveryOperations.this;
            super();
        }
    }


    private class _cls4 extends TypeToken
    {

        final PlaylistDiscoveryOperations this$0;

        _cls4()
        {
            this$0 = PlaylistDiscoveryOperations.this;
            super();
        }
    }


    private class _cls7
        implements f
    {

        final PlaylistDiscoveryOperations this$0;
        final String val$searchTag;

        public ApiPlaylistCollection call(ApiPlaylistCollection apiplaylistcollection)
        {
            ApiPlaylist apiplaylist;
            LinkedList linkedlist;
            for (Iterator iterator = apiplaylistcollection.iterator(); iterator.hasNext(); apiplaylist.setTags(linkedlist))
            {
                apiplaylist = (ApiPlaylist)iterator.next();
                linkedlist = new LinkedList(removeItemIgnoreCase(apiplaylist.getTags(), searchTag));
                linkedlist.addFirst(searchTag);
            }

            return apiplaylistcollection;
        }

        public volatile Object call(Object obj)
        {
            return call((ApiPlaylistCollection)obj);
        }

        _cls7()
        {
            this$0 = PlaylistDiscoveryOperations.this;
            searchTag = s;
            super();
        }
    }


    private class _cls6
        implements com.soundcloud.rx.Pager.PagingFunction
    {

        final PlaylistDiscoveryOperations this$0;
        final String val$searchTag;

        public volatile Object call(Object obj)
        {
            return call((ApiPlaylistCollection)obj);
        }

        public b call(ApiPlaylistCollection apiplaylistcollection)
        {
            apiplaylistcollection = apiplaylistcollection.getNextLink();
            if (apiplaylistcollection.isPresent())
            {
                return getPlaylistResultsNextPage(searchTag, ((Link)apiplaylistcollection.get()).getHref());
            } else
            {
                return Pager.finish();
            }
        }

        _cls6()
        {
            this$0 = PlaylistDiscoveryOperations.this;
            searchTag = s;
            super();
        }
    }


    private class _cls5
        implements a
    {

        final PlaylistDiscoveryOperations this$0;
        final String val$tag;

        public void call()
        {
            tagStorage.addRecentTag(tag);
        }

        _cls5()
        {
            this$0 = PlaylistDiscoveryOperations.this;
            tag = s;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final PlaylistDiscoveryOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public b call(List list)
        {
            if ((list.isEmpty() || tagStorage.isTagsCacheExpired()) && connectionHelper.isNetworkConnected())
            {
                return fetchAndCachePopularTags();
            } else
            {
                return b.just(list);
            }
        }

        _cls3()
        {
            this$0 = PlaylistDiscoveryOperations.this;
            super();
        }
    }

}
