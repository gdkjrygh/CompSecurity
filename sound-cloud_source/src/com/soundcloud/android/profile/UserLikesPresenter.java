// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.os.Bundle;
import com.soundcloud.android.image.ImagePauseOnScrollListener;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.adapters.MixedPlayableRecyclerItemAdapter;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfilePlayablePresenter, UserProfileOperations

class UserLikesPresenter extends ProfilePlayablePresenter
{

    private final UserProfileOperations profileOperations;

    UserLikesPresenter(SwipeRefreshAttacher swiperefreshattacher, ImagePauseOnScrollListener imagepauseonscrolllistener, MixedPlayableRecyclerItemAdapter mixedplayablerecycleritemadapter, com.soundcloud.android.view.adapters.MixedItemClickListener.Factory factory, com.soundcloud.android.presentation.PlayableListUpdater.Factory factory1, UserProfileOperations userprofileoperations)
    {
        super(swiperefreshattacher, imagepauseonscrolllistener, mixedplayablerecycleritemadapter, factory, factory1);
        profileOperations = userprofileoperations;
    }

    protected void configureEmptyView(EmptyView emptyview)
    {
        emptyview.setMessageText(0x7f070163);
        emptyview.setImage(0x7f020100);
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        bundle = (Urn)bundle.getParcelable("user_urn_key");
        return CollectionBinding.from(profileOperations.pagedLikes(bundle), pageTransformer).withAdapter(adapter).withPager(profileOperations.likesPagingFunction()).build();
    }
}
