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
//            ReplaceActivitiesCommand

public final class  extends b
    implements a, Provider
{

    private b propeller;
    private b storeCommentCommand;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/sync/activities/ReplaceActivitiesCommand, getClass().getClassLoader());
        storeCommentCommand = l1.a("com.soundcloud.android.comments.StoreCommentCommand", com/soundcloud/android/sync/activities/ReplaceActivitiesCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.sync.activities.StoreActivitiesCommand", com/soundcloud/android/sync/activities/ReplaceActivitiesCommand, getClass().getClassLoader(), false);
    }

    public final ReplaceActivitiesCommand get()
    {
        ReplaceActivitiesCommand replaceactivitiescommand = new ReplaceActivitiesCommand((PropellerDatabase)propeller.get(), (StoreCommentCommand)storeCommentCommand.get());
        injectMembers(replaceactivitiescommand);
        return replaceactivitiescommand;
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

    public final void injectMembers(ReplaceActivitiesCommand replaceactivitiescommand)
    {
        supertype.injectMembers(replaceactivitiescommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ReplaceActivitiesCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.activities.ReplaceActivitiesCommand", "members/com.soundcloud.android.sync.activities.ReplaceActivitiesCommand", false, com/soundcloud/android/sync/activities/ReplaceActivitiesCommand);
    }
}
