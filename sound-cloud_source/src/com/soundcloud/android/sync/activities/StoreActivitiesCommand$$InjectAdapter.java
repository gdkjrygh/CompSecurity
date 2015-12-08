// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.activities;

import com.soundcloud.android.comments.StoreCommentCommand;
import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.activities:
//            StoreActivitiesCommand

public final class  extends b
    implements a, Provider
{

    private b propeller;
    private b storeCommentCommand;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/sync/activities/StoreActivitiesCommand, getClass().getClassLoader());
        storeCommentCommand = l1.a("com.soundcloud.android.comments.StoreCommentCommand", com/soundcloud/android/sync/activities/StoreActivitiesCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.DefaultWriteStorageCommand", com/soundcloud/android/sync/activities/StoreActivitiesCommand, getClass().getClassLoader(), false);
    }

    public final StoreActivitiesCommand get()
    {
        StoreActivitiesCommand storeactivitiescommand = new StoreActivitiesCommand((PropellerDatabase)propeller.get(), (StoreCommentCommand)storeCommentCommand.get());
        injectMembers(storeactivitiescommand);
        return storeactivitiescommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set.add(storeCommentCommand);
        set1.add(supertype);
    }

    public final void injectMembers(StoreActivitiesCommand storeactivitiescommand)
    {
        supertype.injectMembers(storeactivitiescommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((StoreActivitiesCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.activities.StoreActivitiesCommand", "members/com.soundcloud.android.sync.activities.StoreActivitiesCommand", false, com/soundcloud/android/sync/activities/StoreActivitiesCommand);
    }
}
