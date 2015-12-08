// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.image.ImagePauseOnScrollListener;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.presentation.CollectionBinding;
import com.soundcloud.android.presentation.RecyclerViewPresenter;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.android.users.UserItem;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.adapters.PrependItemToListSubscriber;
import com.soundcloud.android.view.adapters.RemoveEntityListSubscriber;
import com.soundcloud.android.view.adapters.UserRecyclerItemAdapter;
import rx.Y;
import rx.a.b.a;
import rx.b.f;
import rx.h.b;

// Referenced classes of package com.soundcloud.android.profile:
//            MyProfileOperations

class MyFollowingsPresenter extends RecyclerViewPresenter
{

    private final UserRecyclerItemAdapter adapter;
    private final NextFollowingOperations followingOperations;
    private final ImagePauseOnScrollListener imagePauseOnScrollListener;
    private final Navigator navigator;
    private final f pageTransformer = new _cls1();
    private final MyProfileOperations profileOperations;
    private Screen screen;
    private SearchQuerySourceInfo searchQuerySourceInfo;
    private b updateFollowingsSubscription;

    MyFollowingsPresenter(SwipeRefreshAttacher swiperefreshattacher, ImagePauseOnScrollListener imagepauseonscrolllistener, UserRecyclerItemAdapter userrecycleritemadapter, MyProfileOperations myprofileoperations, NextFollowingOperations nextfollowingoperations, Navigator navigator1)
    {
        super(swiperefreshattacher);
        imagePauseOnScrollListener = imagepauseonscrolllistener;
        adapter = userrecycleritemadapter;
        profileOperations = myprofileoperations;
        followingOperations = nextfollowingoperations;
        navigator = navigator1;
    }

    protected void configureEmptyView(EmptyView emptyview)
    {
        emptyview.setMessageText(0x7f07015b);
        emptyview.setImage(0x7f0200fe);
    }

    protected com.soundcloud.android.view.EmptyView.Status handleError(Throwable throwable)
    {
        return ErrorUtils.emptyViewStatusFromError(throwable);
    }

    protected CollectionBinding onBuildBinding(Bundle bundle)
    {
        return CollectionBinding.from(profileOperations.pagedFollowings(), pageTransformer).withAdapter(adapter).withPager(profileOperations.followingsPagingFunction()).build();
    }

    public void onCreate(Fragment fragment, Bundle bundle)
    {
        super.onCreate(fragment, bundle);
        screen = (Screen)fragment.getArguments().getSerializable("screen_key");
        searchQuerySourceInfo = (SearchQuerySourceInfo)fragment.getArguments().getParcelable("search_query_source_info_key");
        updateFollowingsSubscription = new b(new Y[] {
            followingOperations.onUserFollowed().map(UserItem.fromPropertySet()).observeOn(a.a()).subscribe(new PrependItemToListSubscriber(adapter)), followingOperations.onUserUnfollowed().observeOn(a.a()).subscribe(new RemoveEntityListSubscriber(adapter))
        });
        getBinding().connect();
    }

    public void onDestroy(Fragment fragment)
    {
        updateFollowingsSubscription.unsubscribe();
        super.onDestroy(fragment);
    }

    public void onDestroyView(Fragment fragment)
    {
        getRecyclerView().removeOnScrollListener(imagePauseOnScrollListener);
        super.onDestroyView(fragment);
    }

    protected void onItemClicked(View view, int i)
    {
        navigator.openProfile(view.getContext(), ((UserItem)adapter.getItem(i)).getEntityUrn(), screen, searchQuerySourceInfo);
    }

    protected CollectionBinding onRefreshBinding()
    {
        return CollectionBinding.from(profileOperations.updatedFollowings(), pageTransformer).withAdapter(adapter).withPager(profileOperations.followingsPagingFunction()).build();
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

        final MyFollowingsPresenter this$0;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public List call(List list)
        {
            ArrayList arraylist = new ArrayList();
            for (list = list.iterator(); list.hasNext(); arraylist.add(UserItem.from((PropertySet)list.next()))) { }
            return arraylist;
        }

        _cls1()
        {
            this$0 = MyFollowingsPresenter.this;
            super();
        }
    }

}
