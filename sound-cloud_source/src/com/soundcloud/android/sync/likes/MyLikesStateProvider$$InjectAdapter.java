// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            MyLikesStateProvider, LoadLikesPendingAdditionCommand, LoadLikesPendingRemovalCommand

public final class  extends b
    implements Provider
{

    private b loadLikesPendingAdditionCommand;
    private b loadLikesPendingRemovalCommand;

    public final void attach(l l1)
    {
        loadLikesPendingAdditionCommand = l1.a("com.soundcloud.android.sync.likes.LoadLikesPendingAdditionCommand", com/soundcloud/android/sync/likes/MyLikesStateProvider, getClass().getClassLoader());
        loadLikesPendingRemovalCommand = l1.a("com.soundcloud.android.sync.likes.LoadLikesPendingRemovalCommand", com/soundcloud/android/sync/likes/MyLikesStateProvider, getClass().getClassLoader());
    }

    public final MyLikesStateProvider get()
    {
        return new MyLikesStateProvider((LoadLikesPendingAdditionCommand)loadLikesPendingAdditionCommand.get(), (LoadLikesPendingRemovalCommand)loadLikesPendingRemovalCommand.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(loadLikesPendingAdditionCommand);
        set.add(loadLikesPendingRemovalCommand);
    }

    public ()
    {
        super("com.soundcloud.android.sync.likes.MyLikesStateProvider", "members/com.soundcloud.android.sync.likes.MyLikesStateProvider", false, com/soundcloud/android/sync/likes/MyLikesStateProvider);
    }
}
