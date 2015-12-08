// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.api.ApiClient;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            FetchLikesCommand

public final class  extends b
    implements a, Provider
{

    private b apiClient;
    private b supertype;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/likes/FetchLikesCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.LegacyCommand", com/soundcloud/android/sync/likes/FetchLikesCommand, getClass().getClassLoader(), false);
    }

    public final FetchLikesCommand get()
    {
        FetchLikesCommand fetchlikescommand = new FetchLikesCommand((ApiClient)apiClient.get());
        injectMembers(fetchlikescommand);
        return fetchlikescommand;
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

    public final void injectMembers(FetchLikesCommand fetchlikescommand)
    {
        supertype.injectMembers(fetchlikescommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((FetchLikesCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.likes.FetchLikesCommand", "members/com.soundcloud.android.sync.likes.FetchLikesCommand", false, com/soundcloud/android/sync/likes/FetchLikesCommand);
    }
}
