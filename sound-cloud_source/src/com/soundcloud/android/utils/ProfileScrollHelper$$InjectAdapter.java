// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.res.Resources;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.utils:
//            ProfileScrollHelper

public final class  extends b
    implements a, Provider
{

    private b resources;
    private b supertype;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/utils/ProfileScrollHelper, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/utils/ProfileScrollHelper, getClass().getClassLoader(), false);
    }

    public final ProfileScrollHelper get()
    {
        ProfileScrollHelper profilescrollhelper = new ProfileScrollHelper((Resources)resources.get());
        injectMembers(profilescrollhelper);
        return profilescrollhelper;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set1.add(supertype);
    }

    public final void injectMembers(ProfileScrollHelper profilescrollhelper)
    {
        supertype.injectMembers(profilescrollhelper);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ProfileScrollHelper)obj);
    }

    public ()
    {
        super("com.soundcloud.android.utils.ProfileScrollHelper", "members/com.soundcloud.android.utils.ProfileScrollHelper", false, com/soundcloud/android/utils/ProfileScrollHelper);
    }
}
