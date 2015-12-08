// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.os.Bundle;
import com.soundcloud.android.image.ImagePauseOnScrollListener;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.adapters.MixedPlayableRecyclerItemAdapter;
import rx.b;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfilePlayablePresenter, UserProfileOperations

class UserPlaylistsPresenter extends ProfilePlayablePresenter
{

    private final UserProfileOperations profileOperations;

    UserPlaylistsPresenter(SwipeRefreshAttacher swiperefreshattacher, ImagePauseOnScrollListener imagepauseonscrolllistener, MixedPlayableRecyclerItemAdapter mixedplayablerecycleritemadapter, com.soundcloud.android.view.adapters.MixedItemClickListener.Factory factory, com.soundcloud.android.presentation.PlayableListUpdater.Factory factory1, UserProfileOperations userprofileoperations)
    {
        super(swiperefreshattacher, imagepauseonscrolllistener, mixedplayablerecycleritemadapter, factory, factory1);
        profileOperations = userprofileoperations;
    }

    protected void configureEmptyView(EmptyView emptyview)
    {
        emptyview.setMessageText(0x7f070164);
        emptyview.setImage(0x7f020101);
    }

    protected b getPagedObservable(Urn urn)
    {
        return profileOperations.pagedPlaylists(urn);
    }

    protected com.soundcloud.rx.Pager.PagingFunction getPagingFunction()
    {
        return profileOperations.playlistsPagingFunction();
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        return CollectionBinding.from(getPagedObservable((Urn)bundle.getParcelable("user_urn_key")), pageTransformer).withAdapter(adapter).withPager(getPagingFunction()).build();
    }
}
