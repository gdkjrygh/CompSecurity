// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.commands;

import com.soundcloud.android.api.ApiClient;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.commands:
//            FetchTracksCommand

public final class  extends b
    implements a, Provider
{

    private b apiClient;
    private b supertype;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/commands/FetchTracksCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.BulkFetchCommand", com/soundcloud/android/sync/commands/FetchTracksCommand, getClass().getClassLoader(), false);
    }

    public final FetchTracksCommand get()
    {
        FetchTracksCommand fetchtrackscommand = new FetchTracksCommand((ApiClient)apiClient.get());
        injectMembers(fetchtrackscommand);
        return fetchtrackscommand;
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

    public final void injectMembers(FetchTracksCommand fetchtrackscommand)
    {
        supertype.injectMembers(fetchtrackscommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((FetchTracksCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.commands.FetchTracksCommand", "members/com.soundcloud.android.sync.commands.FetchTracksCommand", false, com/soundcloud/android/sync/commands/FetchTracksCommand);
    }
}
