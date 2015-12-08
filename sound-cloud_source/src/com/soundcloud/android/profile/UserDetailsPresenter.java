// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;
import rx.Y;
import rx.a.b.a;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            UserDetailsView, ProfileUser, UserDetailsFragment, UserProfileOperations

class UserDetailsPresenter extends DefaultSupportFragmentLightCycle
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{
    private class ProfileUserSubscriber extends DefaultSubscriber
    {

        final UserDetailsPresenter this$0;

        public void onCompleted()
        {
            emptyViewStatus = com.soundcloud.android.view.EmptyView.Status.OK;
            configureEmptyView();
            if (refreshLayout != null)
            {
                refreshLayout.setRefreshing(false);
            }
        }

        public void onError(Throwable throwable)
        {
            super.onError(throwable);
            emptyViewStatus = ErrorUtils.emptyViewStatusFromError(throwable);
            configureEmptyView();
            if (refreshLayout != null)
            {
                refreshLayout.setRefreshing(false);
            }
        }

        public void onNext(ProfileUser profileuser)
        {
            profileUser = profileuser;
            updateViews(profileuser);
            configureEmptyView();
        }

        public volatile void onNext(Object obj)
        {
            onNext((ProfileUser)obj);
        }

        private ProfileUserSubscriber()
        {
            this$0 = UserDetailsPresenter.this;
            super();
        }

        ProfileUserSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private com.soundcloud.android.view.EmptyView.Status emptyViewStatus;
    private final f hasDetails = new _cls1();
    private boolean isNotEmpty;
    private final UserProfileOperations profileOperations;
    private ProfileUser profileUser;
    private MultiSwipeRefreshLayout refreshLayout;
    private Y subscription;
    private b userDetailsObservable;
    private final UserDetailsView userDetailsView;
    private Urn userUrn;

    public UserDetailsPresenter(UserProfileOperations userprofileoperations, UserDetailsView userdetailsview)
    {
        emptyViewStatus = com.soundcloud.android.view.EmptyView.Status.WAITING;
        subscription = RxUtils.invalidSubscription();
        profileOperations = userprofileoperations;
        userDetailsView = userdetailsview;
    }

    private void configureEmptyView()
    {
        if (!isNotEmpty)
        {
            userDetailsView.showEmptyView(emptyViewStatus);
            return;
        } else
        {
            userDetailsView.hideEmptyView();
            return;
        }
    }

    private void configureRefreshLayout(View view)
    {
        refreshLayout = (MultiSwipeRefreshLayout)view.findViewById(0x7f0f0153);
        refreshLayout.setColorSchemeResources(new int[] {
            0x7f0e000d
        });
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setSwipeableChildren(new int[] {
            0x7f0f029c, 0x1020004
        });
    }

    private void loadUser()
    {
        subscription.unsubscribe();
        subscription = userDetailsObservable.observeOn(a.a()).subscribe(new ProfileUserSubscriber(null));
    }

    private void setupDescription(ProfileUser profileuser)
    {
        if (Strings.isNotBlank(profileuser.getDescription()))
        {
            userDetailsView.showDescription(profileuser.getDescription());
            return;
        } else
        {
            userDetailsView.hideDescription();
            return;
        }
    }

    private void setupDiscogs(ProfileUser profileuser)
    {
        if (Strings.isNotBlank(profileuser.getDiscogsName()))
        {
            userDetailsView.showDiscogs(profileuser.getDiscogsName());
            return;
        } else
        {
            userDetailsView.hideDiscogs();
            return;
        }
    }

    private void setupMyspace(ProfileUser profileuser)
    {
        if (Strings.isNotBlank(profileuser.getMyspaceName()))
        {
            userDetailsView.showMyspace(profileuser.getMyspaceName());
            return;
        } else
        {
            userDetailsView.hideMyspace();
            return;
        }
    }

    private void setupWebsite(ProfileUser profileuser)
    {
        String s = profileuser.getWebsiteUrl();
        if (Strings.isNotBlank(s))
        {
            userDetailsView.showWebsite(s, profileuser.getWebsiteName());
            return;
        } else
        {
            userDetailsView.hideWebsite();
            return;
        }
    }

    private void updateViews(ProfileUser profileuser)
    {
        isNotEmpty = profileuser.hasDetails();
        setupWebsite(profileuser);
        setupDiscogs(profileuser);
        setupMyspace(profileuser);
        setupDescription(profileuser);
    }

    public volatile void onCreate(Fragment fragment, Bundle bundle)
    {
        onCreate((UserDetailsFragment)fragment, bundle);
    }

    public void onCreate(UserDetailsFragment userdetailsfragment, Bundle bundle)
    {
        super.onCreate(userdetailsfragment, bundle);
        userUrn = (Urn)userdetailsfragment.getArguments().getParcelable("user_urn_key");
        userDetailsObservable = profileOperations.getLocalAndSyncedProfileUser(userUrn).filter(hasDetails).cache();
    }

    public volatile void onDestroyView(Fragment fragment)
    {
        onDestroyView((UserDetailsFragment)fragment);
    }

    public void onDestroyView(UserDetailsFragment userdetailsfragment)
    {
        refreshLayout = null;
        userDetailsView.setListener(null);
        userDetailsView.clearViews();
        subscription.unsubscribe();
        super.onDestroyView(userdetailsfragment);
    }

    public void onRefresh()
    {
        userDetailsObservable = profileOperations.getSyncedProfileUser(userUrn).filter(hasDetails).cache();
        loadUser();
    }

    public volatile void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        onViewCreated((UserDetailsFragment)fragment, view, bundle);
    }

    public void onViewCreated(final UserDetailsFragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        userDetailsView.setView(view);
        userDetailsView.setListener(new _cls2());
        configureEmptyView();
        configureRefreshLayout(view);
        if (profileUser != null)
        {
            updateViews(profileUser);
        }
        loadUser();
    }


/*
    static com.soundcloud.android.view.EmptyView.Status access$102(UserDetailsPresenter userdetailspresenter, com.soundcloud.android.view.EmptyView.Status status)
    {
        userdetailspresenter.emptyViewStatus = status;
        return status;
    }

*/




/*
    static ProfileUser access$402(UserDetailsPresenter userdetailspresenter, ProfileUser profileuser)
    {
        userdetailspresenter.profileUser = profileuser;
        return profileuser;
    }

*/


    private class _cls1
        implements f
    {

        final UserDetailsPresenter this$0;

        public Boolean call(ProfileUser profileuser)
        {
            return Boolean.valueOf(profileuser.hasDescription());
        }

        public volatile Object call(Object obj)
        {
            return call((ProfileUser)obj);
        }

        _cls1()
        {
            this$0 = UserDetailsPresenter.this;
            super();
        }
    }


    private class _cls2
        implements UserDetailsView.UserDetailsListener
    {

        final UserDetailsPresenter this$0;
        final UserDetailsFragment val$fragment;

        public void onViewUri(Uri uri)
        {
            fragment.startActivity(new Intent("android.intent.action.VIEW", uri));
        }

        _cls2()
        {
            this$0 = UserDetailsPresenter.this;
            fragment = userdetailsfragment;
            super();
        }
    }

}
