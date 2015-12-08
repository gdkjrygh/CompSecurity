// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.image.ImagePauseOnScrollListener;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.users.UserItem;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.adapters.UserRecyclerItemAdapter;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            UserProfileOperations

class UserFollowersPresenter extends RecyclerViewPresenter
{

    private final UserRecyclerItemAdapter adapter;
    private final ImagePauseOnScrollListener imagePauseOnScrollListener;
    private final Navigator navigator;
    private final f pageTransformer = new _cls1();
    private final UserProfileOperations profileOperations;

    UserFollowersPresenter(ImagePauseOnScrollListener imagepauseonscrolllistener, SwipeRefreshAttacher swiperefreshattacher, UserProfileOperations userprofileoperations, UserRecyclerItemAdapter userrecycleritemadapter, Navigator navigator1)
    {
        super(swiperefreshattacher);
        imagePauseOnScrollListener = imagepauseonscrolllistener;
        profileOperations = userprofileoperations;
        adapter = userrecycleritemadapter;
        navigator = navigator1;
    }

    private void setEmtpyViewMessage(Fragment fragment)
    {
        if (fragment.getArguments().getBoolean("is_current_user", false))
        {
            getEmptyView().setMessageText(0x7f070159);
            getEmptyView().setSecondaryText(0x7f07015a);
            return;
        } else
        {
            getEmptyView().setMessageText(0x7f070161);
            return;
        }
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        bundle = (Urn)bundle.getParcelable("user_urn_key");
        return CollectionBinding.from(profileOperations.pagedFollowers(bundle), pageTransformer).withAdapter(adapter).withPager(profileOperations.followersPagingFunction()).build();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        getBinding().connect();
    }

    public void onDestroyView(Fragment fragment)
    {
        getRecyclerView().removeOnScrollListener(imagePauseOnScrollListener);
        super.onDestroyView(fragment);
    }

    protected void onItemClicked(View view, int i)
    {
        navigator.openProfile(view.getContext(), ((UserItem)adapter.getItem(i)).getEntityUrn());
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        getRecyclerView().addOnScrollListener(imagePauseOnScrollListener);
        getEmptyView().setImage(0x7f0200fd);
        setEmtpyViewMessage(fragment);
    }

    private class _cls1
        implements f
    {

        final UserFollowersPresenter this$0;

        public volatile Object call(Object obj)
        {
            return call((PagedRemoteCollection)obj);
        }

        public List call(PagedRemoteCollection pagedremotecollection)
        {
            ArrayList arraylist = new ArrayList();
            for (pagedremotecollection = pagedremotecollection.iterator(); pagedremotecollection.hasNext(); arraylist.add(UserItem.from((PropertySet)pagedremotecollection.next()))) { }
            return arraylist;
        }

        _cls1()
        {
            this$0 = UserFollowersPresenter.this;
            super();
        }
    }

}
