// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ProfileScrollHelper;
import com.soundcloud.android.utils.UriUtils;
import com.soundcloud.lightcycle.ActivityLightCycleDispatcher;
import com.soundcloud.lightcycle.LightCycleBinder;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;
import rx.a.b.a;
import rx.b;
import rx.b.f;
import rx.g.m;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfilePagerAdapter, UserProfileOperations, ProfileHeaderPresenter, ProfileUser

class ProfilePresenter extends ActivityLightCycleDispatcher
{
    private final class RefreshUserSubscriber extends DefaultSubscriber
    {

        final ProfilePresenter this$0;

        public final void onNext(EntityStateChangedEvent entitystatechangedevent)
        {
            refreshUser();
        }

        public final volatile void onNext(Object obj)
        {
            onNext((EntityStateChangedEvent)obj);
        }

        private RefreshUserSubscriber()
        {
            this$0 = ProfilePresenter.this;
            super();
        }

        RefreshUserSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class UserDetailsSubscriber extends DefaultSubscriber
    {

        final ProfilePresenter this$0;

        public final void onNext(ProfileUser profileuser)
        {
            headerPresenter.setUserDetails(profileuser);
        }

        public final volatile void onNext(Object obj)
        {
            onNext((ProfileUser)obj);
        }

        private UserDetailsSubscriber()
        {
            this$0 = ProfilePresenter.this;
            super();
        }

        UserDetailsSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private final AccountOperations accountOperations;
    private final EventBus eventBus;
    private ProfileHeaderPresenter headerPresenter;
    private final f isProfileUser = new _cls1();
    private ViewPager pager;
    private final ProfileHeaderPresenter.ProfileHeaderPresenterFactory profileHeaderPresenterFactory;
    private final UserProfileOperations profileOperations;
    final ProfileScrollHelper scrollHelper;
    private Urn user;
    private Y userSubscription;
    private Y userUpdatedSubscription;

    public ProfilePresenter(ProfileScrollHelper profilescrollhelper, ProfileHeaderPresenter.ProfileHeaderPresenterFactory profileheaderpresenterfactory, UserProfileOperations userprofileoperations, EventBus eventbus, AccountOperations accountoperations)
    {
        userSubscription = RxUtils.invalidSubscription();
        userUpdatedSubscription = RxUtils.invalidSubscription();
        scrollHelper = profilescrollhelper;
        profileHeaderPresenterFactory = profileheaderpresenterfactory;
        profileOperations = userprofileoperations;
        eventBus = eventbus;
        accountOperations = accountoperations;
        LightCycleBinder.bind(this);
    }

    private Urn getUserUrnFromIntent(Intent intent)
    {
        if (intent.hasExtra("userUrn"))
        {
            return (Urn)intent.getParcelableExtra("userUrn");
        }
        if (intent.getData() != null)
        {
            return Urn.forUser(UriUtils.getLastSegmentAsLong(intent.getData()));
        } else
        {
            throw new IllegalStateException("User identifier not provided to Profile activity");
        }
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        super.onCreate(appcompatactivity, bundle);
        user = getUserUrnFromIntent(appcompatactivity.getIntent());
        int i;
        if (accountOperations.isLoggedInUser(user))
        {
            i = 0x7f0701e9;
        } else
        {
            i = 0x7f0701e6;
        }
        appcompatactivity.setTitle(i);
        headerPresenter = profileHeaderPresenterFactory.create(appcompatactivity, user);
        pager = (ViewPager)appcompatactivity.findViewById(0x7f0f00b7);
        pager.setAdapter(new ProfilePagerAdapter(appcompatactivity, user, accountOperations.isLoggedInUser(user), scrollHelper, (SearchQuerySourceInfo)appcompatactivity.getIntent().getParcelableExtra("searchQuerySourceInfo")));
        pager.setPageMarginDrawable(0x7f0200fa);
        pager.setPageMargin(appcompatactivity.getResources().getDimensionPixelOffset(0x7f0b0110));
        ((TabLayout)appcompatactivity.findViewById(0x7f0f0169)).setupWithViewPager(pager);
        pager.setCurrentItem(1);
        refreshUser();
        userUpdatedSubscription = eventBus.queue(EventQueue.ENTITY_STATE_CHANGED).filter(isProfileUser).subscribe(new RefreshUserSubscriber(null));
    }

    public volatile void onDestroy(Activity activity)
    {
        onDestroy((AppCompatActivity)activity);
    }

    public void onDestroy(AppCompatActivity appcompatactivity)
    {
        pager = null;
        userUpdatedSubscription.unsubscribe();
        userSubscription.unsubscribe();
        super.onDestroy(appcompatactivity);
    }

    public void refreshUser()
    {
        userSubscription.unsubscribe();
        userSubscription = profileOperations.getLocalProfileUser(user).observeOn(a.a()).subscribe(new UserDetailsSubscriber(null));
    }



    private class _cls1
        implements f
    {

        final ProfilePresenter this$0;

        public Boolean call(EntityStateChangedEvent entitystatechangedevent)
        {
            return Boolean.valueOf(entitystatechangedevent.getChangeMap().containsKey(user));
        }

        public volatile Object call(Object obj)
        {
            return call((EntityStateChangedEvent)obj);
        }

        _cls1()
        {
            this$0 = ProfilePresenter.this;
            super();
        }
    }

}
