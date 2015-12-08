// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            RemoveLikesCommand

public final class I extends b
    implements a, Provider
{

    private b database;
    private b supertype;
    private b type;

    public final void attach(l l1)
    {
        database = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/sync/likes/RemoveLikesCommand, getClass().getClassLoader());
        type = l1.a("java.lang.Integer", com/soundcloud/android/sync/likes/RemoveLikesCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.DefaultWriteStorageCommand", com/soundcloud/android/sync/likes/RemoveLikesCommand, getClass().getClassLoader(), false);
    }

    public final RemoveLikesCommand get()
    {
        RemoveLikesCommand removelikescommand = new RemoveLikesCommand((PropellerDatabase)database.get(), ((Integer)type.get()).intValue());
        injectMembers(removelikescommand);
        return removelikescommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(database);
        set.add(type);
        set1.add(supertype);
    }

    public final void injectMembers(RemoveLikesCommand removelikescommand)
    {
        supertype.injectMembers(removelikescommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RemoveLikesCommand)obj);
    }

    public I()
    {
        super("com.soundcloud.android.sync.likes.RemoveLikesCommand", "members/com.soundcloud.android.sync.likes.RemoveLikesCommand", false, com/soundcloud/android/sync/likes/RemoveLikesCommand);
    }
}
