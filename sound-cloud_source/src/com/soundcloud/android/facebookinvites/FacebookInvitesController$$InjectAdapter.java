// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookinvites;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.facebookinvites:
//            FacebookInvitesController, FacebookInvitesStorage

public final class  extends b
    implements a, Provider
{

    private b facebookInvitesStorage;
    private b supertype;

    public final void attach(l l1)
    {
        facebookInvitesStorage = l1.a("com.soundcloud.android.facebookinvites.FacebookInvitesStorage", com/soundcloud/android/facebookinvites/FacebookInvitesController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/facebookinvites/FacebookInvitesController, getClass().getClassLoader(), false);
    }

    public final FacebookInvitesController get()
    {
        FacebookInvitesController facebookinvitescontroller = new FacebookInvitesController((FacebookInvitesStorage)facebookInvitesStorage.get());
        injectMembers(facebookinvitescontroller);
        return facebookinvitescontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(facebookInvitesStorage);
        set1.add(supertype);
    }

    public final void injectMembers(FacebookInvitesController facebookinvitescontroller)
    {
        supertype.injectMembers(facebookinvitescontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((FacebookInvitesController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.facebookinvites.FacebookInvitesController", "members/com.soundcloud.android.facebookinvites.FacebookInvitesController", false, com/soundcloud/android/facebookinvites/FacebookInvitesController);
    }
}
