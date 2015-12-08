// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.image.ImagePauseOnScrollListener;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.PlayableListUpdater;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.adapters.MixedItemClickListener;
import com.soundcloud.android.view.adapters.MixedPlayableRecyclerItemAdapter;
import rx.b.f;

abstract class ProfilePlayablePresenter extends RecyclerViewPresenter
{

    final MixedPlayableRecyclerItemAdapter adapter;
    protected MixedItemClickListener clickListener;
    private final com.soundcloud.android.view.adapters.MixedItemClickListener.Factory clickListenerFactory;
    private final ImagePauseOnScrollListener imagePauseOnScrollListener;
    final PlayableListUpdater listUpdater;
    protected final f pageTransformer = new _cls1();

    protected ProfilePlayablePresenter(SwipeRefreshAttacher swiperefreshattacher, ImagePauseOnScrollListener imagepauseonscrolllistener, MixedPlayableRecyclerItemAdapter mixedplayablerecycleritemadapter, com.soundcloud.android.view.adapters.MixedItemClickListener.Factory factory, com.soundcloud.android.presentation.PlayableListUpdater.Factory factory1)
    {
        super(swiperefreshattacher);
        imagePauseOnScrollListener = imagepauseonscrolllistener;
        adapter = mixedplayablerecycleritemadapter;
        clickListenerFactory = factory;
        listUpdater = factory1.create(mixedplayablerecycleritemadapter, mixedplayablerecycleritemadapter.getTrackRenderer());
    }

    private MixedItemClickListener createClickListener(Bundle bundle)
    {
        Screen screen = (Screen)bundle.getSerializable("screen_key");
        bundle = (SearchQuerySourceInfo)bundle.getParcelable("search_query_source_info_key");
        return clickListenerFactory.create(screen, bundle);
    }

    protected abstract void configureEmptyView(EmptyView emptyview);

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        clickListener = createClickListener(fragment.getArguments());
        getBinding().connect();
    }

    public void onDestroyView(Fragment fragment)
    {
        getRecyclerView().removeOnScrollListener(imagePauseOnScrollListener);
        super.onDestroyView(fragment);
    }

    protected void onItemClicked(View view, int i)
    {
        clickListener.onItemClick(adapter.getItems(), view, i);
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        getRecyclerView().addOnScrollListener(imagePauseOnScrollListener);
        configureEmptyView(getEmptyView());
    }

    private class _cls1
        implements f
    {

        final ProfilePlayablePresenter this$0;

        public volatile Object call(Object obj)
        {
            return call((Iterable)obj);
        }

        public List call(Iterable iterable)
        {
            ArrayList arraylist = new ArrayList();
            iterable = iterable.iterator();
            do
            {
                if (!iterable.hasNext())
                {
                    break;
                }
                PropertySet propertyset = (PropertySet)iterable.next();
                Urn urn = (Urn)propertyset.get(EntityProperty.URN);
                if (urn.isTrack())
                {
                    arraylist.add(TrackItem.from(propertyset));
                } else
                if (urn.isPlaylist())
                {
                    arraylist.add(PlaylistItem.from(propertyset));
                }
            } while (true);
            return arraylist;
        }

        _cls1()
        {
            this$0 = ProfilePlayablePresenter.this;
            super();
        }
    }

}
