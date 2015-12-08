// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import com.soundcloud.android.facebookapi.FacebookApi;
import com.soundcloud.android.facebookapi.FacebookApiHelper;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.facebookinvites:
//            FacebookInvitesOperations, FacebookInvitesStorage

public final class  extends b
    implements Provider
{

    private b facebookApi;
    private b facebookApiHelper;
    private b facebookInvitesStorage;
    private b networkConnectionHelper;
    private b scheduler;

    public final void attach(l l1)
    {
        facebookInvitesStorage = l1.a("com.soundcloud.android.facebookinvites.FacebookInvitesStorage", com/soundcloud/android/facebookinvites/FacebookInvitesOperations, getClass().getClassLoader());
        facebookApi = l1.a("com.soundcloud.android.facebookapi.FacebookApi", com/soundcloud/android/facebookinvites/FacebookInvitesOperations, getClass().getClassLoader());
        facebookApiHelper = l1.a("com.soundcloud.android.facebookapi.FacebookApiHelper", com/soundcloud/android/facebookinvites/FacebookInvitesOperations, getClass().getClassLoader());
        networkConnectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/facebookinvites/FacebookInvitesOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/facebookinvites/FacebookInvitesOperations, getClass().getClassLoader());
    }

    public final FacebookInvitesOperations get()
    {
        return new FacebookInvitesOperations((FacebookInvitesStorage)facebookInvitesStorage.get(), (FacebookApi)facebookApi.get(), (FacebookApiHelper)facebookApiHelper.get(), (NetworkConnectionHelper)networkConnectionHelper.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(facebookInvitesStorage);
        set.add(facebookApi);
        set.add(facebookApiHelper);
        set.add(networkConnectionHelper);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.facebookinvites.FacebookInvitesOperations", "members/com.soundcloud.android.facebookinvites.FacebookInvitesOperations", false, com/soundcloud/android/facebookinvites/FacebookInvitesOperations);
    }
}
