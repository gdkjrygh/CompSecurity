// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.SearchEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.tracks.LegacyUpdatePlayingTrackSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.EmptyViewBuilder;
import com.soundcloud.android.view.adapters.MixedItemClickListener;
import com.soundcloud.android.view.adapters.UpdateEntityListSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.search:
//            SearchOperations, SearchResultsAdapter

public class SearchResultsPresenter extends RecyclerViewPresenter
{

    private static final f TO_PRESENTATION_MODELS = new _cls1();
    private final SearchResultsAdapter adapter;
    private final com.soundcloud.android.view.adapters.MixedItemClickListener.Factory clickListenerFactory;
    private final EventBus eventBus;
    private SearchOperations.SearchPagingFunction pagingFunction;
    private final rx.b.b publishOnFirstPage = new _cls2();
    private Boolean publishSearchSubmissionEvent;
    private final SearchOperations searchOperations;
    private String searchQuery;
    private int searchType;
    private rx.h.b viewLifeCycle;

    SearchResultsPresenter(SwipeRefreshAttacher swiperefreshattacher, SearchOperations searchoperations, SearchResultsAdapter searchresultsadapter, com.soundcloud.android.view.adapters.MixedItemClickListener.Factory factory, EventBus eventbus)
    {
        super(swiperefreshattacher, com.soundcloud.android.presentation.RecyclerViewPresenter.Options.list().build());
        searchOperations = searchoperations;
        adapter = searchresultsadapter;
        clickListenerFactory = factory;
        eventBus = eventbus;
    }

    private CollectionBinding createCollectionBinding()
    {
        pagingFunction = searchOperations.pagingFunction(searchType);
        return CollectionBinding.from(searchOperations.searchResult(searchQuery, searchType).doOnNext(publishOnFirstPage), TO_PRESENTATION_MODELS).withAdapter(adapter).withPager(pagingFunction).build();
    }

    private Screen getTrackingScreen()
    {
        switch (searchType)
        {
        default:
            throw new IllegalArgumentException("Query type not valid");

        case 0: // '\0'
            return Screen.SEARCH_EVERYTHING;

        case 1: // '\001'
            return Screen.SEARCH_TRACKS;

        case 2: // '\002'
            return Screen.SEARCH_PLAYLISTS;

        case 3: // '\003'
            return Screen.SEARCH_USERS;
        }
    }

    private void trackSearchItemClick(Urn urn, SearchQuerySourceInfo searchquerysourceinfo)
    {
        if (urn.isTrack())
        {
            eventBus.publish(EventQueue.TRACKING, SearchEvent.tapTrackOnScreen(getTrackingScreen(), searchquerysourceinfo));
        } else
        {
            if (urn.isPlaylist())
            {
                eventBus.publish(EventQueue.TRACKING, SearchEvent.tapPlaylistOnScreen(getTrackingScreen(), searchquerysourceinfo));
                return;
            }
            if (urn.isUser())
            {
                eventBus.publish(EventQueue.TRACKING, SearchEvent.tapUserOnScreen(getTrackingScreen(), searchquerysourceinfo));
                return;
            }
        }
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        searchType = bundle.getInt("type");
        searchQuery = bundle.getString("query");
        publishSearchSubmissionEvent = Boolean.valueOf(bundle.getBoolean("publishSearchSubmissionEvent"));
        return createCollectionBinding();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        getBinding().connect();
    }

    public void onDestroyView(Fragment fragment)
    {
        viewLifeCycle.unsubscribe();
        super.onDestroyView(fragment);
    }

    protected void onItemClicked(View view, int i)
    {
        Urn urn = ((ListItem)adapter.getItem(i)).getEntityUrn();
        SearchQuerySourceInfo searchquerysourceinfo = pagingFunction.getSearchQuerySourceInfo(i, urn);
        trackSearchItemClick(urn, searchquerysourceinfo);
        clickListenerFactory.create(getTrackingScreen(), searchquerysourceinfo).onItemClick(adapter.getItems(), view, i);
    }

    protected CollectionBinding onRefreshBinding()
    {
        return createCollectionBinding();
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        viewLifeCycle = new rx.h.b(new Y[] {
            eventBus.subscribe(EventQueue.CURRENT_PLAY_QUEUE_ITEM, new LegacyUpdatePlayingTrackSubscriber(adapter, adapter.getTrackRenderer())), eventBus.subscribe(EventQueue.ENTITY_STATE_CHANGED, new UpdateEntityListSubscriber(adapter))
        });
        (new EmptyViewBuilder()).configureForSearch(getEmptyView());
    }




/*
    static Boolean access$002(SearchResultsPresenter searchresultspresenter, Boolean boolean1)
    {
        searchresultspresenter.publishSearchSubmissionEvent = boolean1;
        return boolean1;
    }

*/




    private class _cls2
        implements rx.b.b
    {

        final SearchResultsPresenter this$0;

        public void call(SearchResult searchresult)
        {
            if (publishSearchSubmissionEvent.booleanValue())
            {
                publishSearchSubmissionEvent = Boolean.valueOf(false);
                eventBus.publish(EventQueue.TRACKING, SearchEvent.searchStart(getTrackingScreen(), pagingFunction.getSearchQuerySourceInfo()));
            }
        }

        public volatile void call(Object obj)
        {
            call((SearchResult)obj);
        }

        _cls2()
        {
            this$0 = SearchResultsPresenter.this;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final volatile Object call(Object obj)
        {
            return call((SearchResult)obj);
        }

        public final List call(SearchResult searchresult)
        {
            Object obj = searchresult.getItems();
            searchresult = new ArrayList(((List) (obj)).size());
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                PropertySet propertyset = (PropertySet)((Iterator) (obj)).next();
                Urn urn = (Urn)propertyset.get(EntityProperty.URN);
                if (urn.isTrack())
                {
                    searchresult.add(TrackItem.from(propertyset));
                } else
                if (urn.isPlaylist())
                {
                    searchresult.add(PlaylistItem.from(propertyset));
                } else
                if (urn.isUser())
                {
                    searchresult.add(UserItem.from(propertyset));
                }
            } while (true);
            return searchresult;
        }

        _cls1()
        {
        }
    }

}
