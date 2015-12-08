// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.ApiClient;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            UpdateAgeCommand

public final class  extends b
    implements a, Provider
{

    private b apiClient;
    private b supertype;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/profile/UpdateAgeCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.LegacyCommand", com/soundcloud/android/profile/UpdateAgeCommand, getClass().getClassLoader(), false);
    }

    public final UpdateAgeCommand get()
    {
        UpdateAgeCommand updateagecommand = new UpdateAgeCommand((ApiClient)apiClient.get());
        injectMembers(updateagecommand);
        return updateagecommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClient);
        set1.add(supertype);
    }

    public final void injectMembers(UpdateAgeCommand updateagecommand)
    {
        supertype.injectMembers(updateagecommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((UpdateAgeCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.UpdateAgeCommand", "members/com.soundcloud.android.profile.UpdateAgeCommand", false, com/soundcloud/android/profile/UpdateAgeCommand);
    }
}
