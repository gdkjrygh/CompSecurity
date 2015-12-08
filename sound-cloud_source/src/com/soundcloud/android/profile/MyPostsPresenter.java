// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.image.ImagePauseOnScrollListener;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.adapters.MixedItemClickListener;
import com.soundcloud.android.view.adapters.MixedPlayableRecyclerItemAdapter;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfilePlayablePresenter, MyProfileOperations, PostsRecyclerItemAdapter

class MyPostsPresenter extends ProfilePlayablePresenter
{

    private final MyProfileOperations profileOperations;

    MyPostsPresenter(SwipeRefreshAttacher swiperefreshattacher, ImagePauseOnScrollListener imagepauseonscrolllistener, PostsRecyclerItemAdapter postsrecycleritemadapter, com.soundcloud.android.view.adapters.MixedItemClickListener.Factory factory, com.soundcloud.android.presentation.PlayableListUpdater.Factory factory1, MyProfileOperations myprofileoperations)
    {
        super(swiperefreshattacher, imagepauseonscrolllistener, postsrecycleritemadapter, factory, factory1);
        profileOperations = myprofileoperations;
    }

    protected void configureEmptyView(EmptyView emptyview)
    {
        emptyview.setMessageText(0x7f07015e);
        emptyview.setImage(0x7f020104);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        return CollectionBinding.from(profileOperations.pagedPostItems(), pageTransformer).withAdapter(adapter).withPager(profileOperations.postsPagingFunction()).build();
    }

    protected void onItemClicked(View view, int i)
    {
        clickListener.onPostClick(profileOperations.postsForPlayback(), view, i, (ListItem)adapter.getItem(i));
    }

    protected CollectionBinding onRefreshBinding()
    {
        return CollectionBinding.from(profileOperations.updatedPosts(), pageTransformer).withAdapter(adapter).withPager(profileOperations.postsPagingFunction()).build();
    }
}
