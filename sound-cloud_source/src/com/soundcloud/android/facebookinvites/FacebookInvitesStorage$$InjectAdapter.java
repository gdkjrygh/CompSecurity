// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import android.content.SharedPreferences;
import com.soundcloud.android.utils.CurrentDateProvider;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.facebookinvites:
//            FacebookInvitesStorage

public final class  extends b
    implements Provider
{

    private b dateProvider;
    private b sharedPreferences;

    public final void attach(l l1)
    {
        sharedPreferences = l1.a("@javax.inject.Named(value=FacebookInvites)/android.content.SharedPreferences", com/soundcloud/android/facebookinvites/FacebookInvitesStorage, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/facebookinvites/FacebookInvitesStorage, getClass().getClassLoader());
    }

    public final FacebookInvitesStorage get()
    {
        return new FacebookInvitesStorage((SharedPreferences)sharedPreferences.get(), (CurrentDateProvider)dateProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(sharedPreferences);
        set.add(dateProvider);
    }

    public ()
    {
        super("com.soundcloud.android.facebookinvites.FacebookInvitesStorage", "members/com.soundcloud.android.facebookinvites.FacebookInvitesStorage", false, com/soundcloud/android/facebookinvites/FacebookInvitesStorage);
    }
}
