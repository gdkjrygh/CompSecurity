// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import com.soundcloud.android.facebookapi.FacebookApi;
import com.soundcloud.android.facebookapi.FacebookApiHelper;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.java.optional.Optional;
import java.util.concurrent.TimeUnit;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.facebookinvites:
//            FacebookInvitesStorage

public class FacebookInvitesOperations
{

    public static final long CLICK_INTERVAL_MS;
    public static final long DISMISS_INTERVAL_MS;
    private static final b NO_INVITES = b.just(Optional.absent());
    public static final int REST_AFTER_DISMISS_COUNT = 2;
    public static final int SHOW_AFTER_OPENS_COUNT = 5;
    private final FacebookApi facebookApi;
    private final FacebookApiHelper facebookApiHelper;
    private final FacebookInvitesStorage facebookInvitesStorage;
    private final NetworkConnectionHelper networkConnectionHelper;
    private final R scheduler;

    public FacebookInvitesOperations(FacebookInvitesStorage facebookinvitesstorage, FacebookApi facebookapi, FacebookApiHelper facebookapihelper, NetworkConnectionHelper networkconnectionhelper, R r)
    {
        facebookInvitesStorage = facebookinvitesstorage;
        facebookApi = facebookapi;
        facebookApiHelper = facebookapihelper;
        networkConnectionHelper = networkconnectionhelper;
        scheduler = r;
    }

    private f buildItemWithPictureUrls()
    {
        return new _cls1();
    }

    private boolean canShowAfterLastClick()
    {
        return facebookInvitesStorage.getMillisSinceLastClick() >= CLICK_INTERVAL_MS;
    }

    private boolean canShowAfterLastDismisses()
    {
        int i = facebookInvitesStorage.getTimesDismissed();
        long l = facebookInvitesStorage.getMillisSinceLastDismiss();
        if (i != 0)
        {
            if (l < CLICK_INTERVAL_MS)
            {
                return false;
            }
            if (i >= 2)
            {
                if (l < DISMISS_INTERVAL_MS)
                {
                    return false;
                } else
                {
                    facebookInvitesStorage.resetDismissed();
                    return true;
                }
            }
        }
        return true;
    }

    private boolean canShowAfterLastOpen()
    {
        return facebookInvitesStorage.getTimesAppOpened() >= 5;
    }

    public boolean canShow()
    {
        return canShowAfterLastClick() && canShowAfterLastOpen() && canShowAfterLastDismisses() && facebookApiHelper.canShowAppInviteDialog() && networkConnectionHelper.isNetworkConnected();
    }

    public b loadWithPictures()
    {
        if (canShow())
        {
            return facebookApi.friendPictureUrls().subscribeOn(scheduler).map(buildItemWithPictureUrls()).onErrorResumeNext(NO_INVITES);
        } else
        {
            return NO_INVITES;
        }
    }

    static 
    {
        CLICK_INTERVAL_MS = TimeUnit.DAYS.toMillis(14L);
        DISMISS_INTERVAL_MS = TimeUnit.DAYS.toMillis(60L);
    }

    private class _cls1
        implements f
    {

        final FacebookInvitesOperations this$0;

        public Optional call(List list)
        {
            return Optional.of(new FacebookInvitesItem(list));
        }

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        _cls1()
        {
            this$0 = FacebookInvitesOperations.this;
            super();
        }
    }

}
