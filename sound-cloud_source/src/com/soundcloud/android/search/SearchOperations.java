// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.model.Link;
import com.soundcloud.android.associations.LoadFollowingCommand;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.PropertySets;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.java.reflect.TypeToken;
import com.soundcloud.rx.Pager;
import java.util.ArrayList;
import java.util.List;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.search:
//            CacheUniversalSearchCommand, LoadPlaylistLikedStatuses, SearchResult

class SearchOperations
{
    private final class PlaylistSearchStrategy extends SearchStrategy
    {

        final SearchOperations this$0;
        private final TypeToken typeToken = new _cls1();

        protected final b getSearchResultObservable(com.soundcloud.android.api.ApiRequest.Builder builder)
        {
            return apiClientRx.mappedResponse(builder.build(), typeToken).subscribeOn(scheduler).doOnNext(storePlaylistsCommand.toAction()).map(SearchOperations.TO_SEARCH_RESULT).map(mergePlaylistLikeStatus);
        }

        protected PlaylistSearchStrategy()
        {
            this$0 = SearchOperations.this;
            super(ApiEndpoints.SEARCH_PLAYLISTS.path());
            class _cls1 extends TypeToken
            {

                final PlaylistSearchStrategy this$1;

                _cls1()
                {
                    this$1 = PlaylistSearchStrategy.this;
                    super();
                }
            }

        }
    }

    class SearchPagingFunction
        implements com.soundcloud.rx.Pager.PagingFunction
    {

        private final List allUrns = new ArrayList();
        private Urn queryUrn;
        private final int searchType;
        final SearchOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((SearchResult)obj);
        }

        public b call(SearchResult searchresult)
        {
            Optional optional = searchresult.nextHref;
            allUrns.addAll(PropertySets.extractUrns(searchresult.getItems()));
            if (searchresult.queryUrn.isPresent())
            {
                queryUrn = (Urn)searchresult.queryUrn.get();
            }
            if (optional.isPresent())
            {
                return nextResultPage((Link)optional.get(), searchType);
            } else
            {
                return Pager.finish();
            }
        }

        public SearchQuerySourceInfo getSearchQuerySourceInfo()
        {
            return new SearchQuerySourceInfo(queryUrn);
        }

        public SearchQuerySourceInfo getSearchQuerySourceInfo(int i, Urn urn)
        {
            urn = new SearchQuerySourceInfo(queryUrn, i, urn);
            urn.setQueryResults(allUrns);
            return urn;
        }

        public SearchPagingFunction(int i)
        {
            this$0 = SearchOperations.this;
            super();
            queryUrn = Urn.NOT_SET;
            searchType = i;
        }
    }

    private abstract class SearchStrategy
    {

        private final String apiEndpoint;
        final SearchOperations this$0;

        private b nextResultPage(Link link)
        {
            return getSearchResultObservable(ApiRequest.get(link.getHref()).forPrivateApi(1));
        }

        private b searchResult(String s)
        {
            return getSearchResultObservable(ApiRequest.get(apiEndpoint).addQueryParam(com.soundcloud.android.api.ApiRequest.Param.PAGE_SIZE, new Object[] {
                "30"
            }).addQueryParam("q", new Object[] {
                s
            }).forPrivateApi(1));
        }

        protected abstract b getSearchResultObservable(com.soundcloud.android.api.ApiRequest.Builder builder);



        protected SearchStrategy(String s)
        {
            this$0 = SearchOperations.this;
            super();
            apiEndpoint = s;
        }
    }

    private final class TrackSearchStrategy extends SearchStrategy
    {

        final SearchOperations this$0;
        private final TypeToken typeToken = new _cls1();

        protected final b getSearchResultObservable(com.soundcloud.android.api.ApiRequest.Builder builder)
        {
            return apiClientRx.mappedResponse(builder.build(), typeToken).subscribeOn(scheduler).doOnNext(storeTracksCommand.toAction()).map(SearchOperations.TO_SEARCH_RESULT);
        }

        protected TrackSearchStrategy()
        {
            this$0 = SearchOperations.this;
            super(ApiEndpoints.SEARCH_TRACKS.path());
            class _cls1 extends TypeToken
            {

                final TrackSearchStrategy this$1;

                _cls1()
                {
                    this$1 = TrackSearchStrategy.this;
                    super();
                }
            }

        }
    }

    private final class UniversalSearchStrategy extends SearchStrategy
    {

        final SearchOperations this$0;
        private final TypeToken typeToken = new _cls1();

        protected final b getSearchResultObservable(com.soundcloud.android.api.ApiRequest.Builder builder)
        {
            return apiClientRx.mappedResponse(builder.build(), typeToken).subscribeOn(scheduler).doOnNext(cacheUniversalSearchCommand.toAction()).map(SearchOperations.TO_SEARCH_RESULT).map(mergePlaylistLikeStatus).map(mergeFollowings);
        }

        protected UniversalSearchStrategy()
        {
            this$0 = SearchOperations.this;
            super(ApiEndpoints.SEARCH_ALL.path());
            class _cls1 extends TypeToken
            {

                final UniversalSearchStrategy this$1;

                _cls1()
                {
                    this$1 = UniversalSearchStrategy.this;
                    super();
                }
            }

        }
    }

    private final class UserSearchStrategy extends SearchStrategy
    {

        final SearchOperations this$0;
        private final TypeToken typeToken = new _cls1();

        protected final b getSearchResultObservable(com.soundcloud.android.api.ApiRequest.Builder builder)
        {
            return apiClientRx.mappedResponse(builder.build(), typeToken).subscribeOn(scheduler).doOnNext(storeUsersCommand.toAction()).map(SearchOperations.TO_SEARCH_RESULT).map(mergeFollowings);
        }

        protected UserSearchStrategy()
        {
            this$0 = SearchOperations.this;
            super(ApiEndpoints.SEARCH_USERS.path());
            class _cls1 extends TypeToken
            {

                final UserSearchStrategy this$1;

                _cls1()
                {
                    this$1 = UserSearchStrategy.this;
                    super();
                }
            }

        }
    }


    static final f TO_SEARCH_RESULT = new _cls1();
    static final int TYPE_ALL = 0;
    static final int TYPE_PLAYLISTS = 2;
    static final int TYPE_TRACKS = 1;
    static final int TYPE_USERS = 3;
    private final ApiClientRx apiClientRx;
    private final CacheUniversalSearchCommand cacheUniversalSearchCommand;
    private final LoadFollowingCommand loadFollowingCommand;
    private final LoadPlaylistLikedStatuses loadPlaylistLikedStatuses;
    private final f mergeFollowings = new _cls3();
    private final f mergePlaylistLikeStatus = new _cls2();
    private final R scheduler;
    private final StorePlaylistsCommand storePlaylistsCommand;
    private final StoreTracksCommand storeTracksCommand;
    private final StoreUsersCommand storeUsersCommand;

    SearchOperations(ApiClientRx apiclientrx, StoreTracksCommand storetrackscommand, StorePlaylistsCommand storeplaylistscommand, StoreUsersCommand storeuserscommand, CacheUniversalSearchCommand cacheuniversalsearchcommand, LoadPlaylistLikedStatuses loadplaylistlikedstatuses, LoadFollowingCommand loadfollowingcommand, 
            R r)
    {
        apiClientRx = apiclientrx;
        storeTracksCommand = storetrackscommand;
        storePlaylistsCommand = storeplaylistscommand;
        storeUsersCommand = storeuserscommand;
        cacheUniversalSearchCommand = cacheuniversalsearchcommand;
        loadPlaylistLikedStatuses = loadplaylistlikedstatuses;
        loadFollowingCommand = loadfollowingcommand;
        scheduler = r;
    }

    private SearchStrategy getSearchStrategy(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException("Unknown search type");

        case 0: // '\0'
            return new UniversalSearchStrategy();

        case 1: // '\001'
            return new TrackSearchStrategy();

        case 2: // '\002'
            return new PlaylistSearchStrategy();

        case 3: // '\003'
            return new UserSearchStrategy();
        }
    }

    private b nextResultPage(Link link, int i)
    {
        return getSearchStrategy(i).nextResultPage(link);
    }

    SearchPagingFunction pagingFunction(int i)
    {
        return new SearchPagingFunction(i);
    }

    b searchResult(String s, int i)
    {
        return getSearchStrategy(i).searchResult(s);
    }













    private class _cls2
        implements f
    {

        final SearchOperations this$0;

        public SearchResult call(SearchResult searchresult)
        {
            Map map = loadPlaylistLikedStatuses.call(searchresult);
            Iterator iterator = searchresult.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                PropertySet propertyset = (PropertySet)iterator.next();
                Urn urn = (Urn)propertyset.getOrElse(PlaylistProperty.URN, Urn.NOT_SET);
                if (map.containsKey(urn))
                {
                    propertyset.update((PropertySet)map.get(urn));
                }
            } while (true);
            return searchresult;
        }

        public volatile Object call(Object obj)
        {
            return call((SearchResult)obj);
        }

        _cls2()
        {
            this$0 = SearchOperations.this;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final SearchOperations this$0;

        public SearchResult call(SearchResult searchresult)
        {
            Map map = loadFollowingCommand.call(searchresult);
            Iterator iterator = searchresult.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                PropertySet propertyset = (PropertySet)iterator.next();
                Urn urn = (Urn)propertyset.getOrElse(UserProperty.URN, Urn.NOT_SET);
                if (map.containsKey(urn))
                {
                    propertyset.update((PropertySet)map.get(urn));
                }
            } while (true);
            return searchresult;
        }

        public volatile Object call(Object obj)
        {
            return call((SearchResult)obj);
        }

        _cls3()
        {
            this$0 = SearchOperations.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final SearchResult call(SearchCollection searchcollection)
        {
            return new SearchResult(searchcollection.getCollection(), searchcollection.getNextLink(), searchcollection.getQueryUrn());
        }

        public final volatile Object call(Object obj)
        {
            return call((SearchCollection)obj);
        }

        _cls1()
        {
        }
    }

}
