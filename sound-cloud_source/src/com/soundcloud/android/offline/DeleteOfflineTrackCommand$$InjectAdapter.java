// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            DeleteOfflineTrackCommand, SecureFileStorage

public final class  extends b
    implements a, Provider
{

    private b database;
    private b fileStorage;
    private b supertype;

    public final void attach(l l1)
    {
        fileStorage = l1.a("com.soundcloud.android.offline.SecureFileStorage", com/soundcloud/android/offline/DeleteOfflineTrackCommand, getClass().getClassLoader());
        database = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/offline/DeleteOfflineTrackCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.Command", com/soundcloud/android/offline/DeleteOfflineTrackCommand, getClass().getClassLoader(), false);
    }

    public final DeleteOfflineTrackCommand get()
    {
        DeleteOfflineTrackCommand deleteofflinetrackcommand = new DeleteOfflineTrackCommand((SecureFileStorage)fileStorage.get(), (PropellerDatabase)database.get());
        injectMembers(deleteofflinetrackcommand);
        return deleteofflinetrackcommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(fileStorage);
        set.add(database);
        set1.add(supertype);
    }

    public final void injectMembers(DeleteOfflineTrackCommand deleteofflinetrackcommand)
    {
        supertype.injectMembers(deleteofflinetrackcommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DeleteOfflineTrackCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.offline.DeleteOfflineTrackCommand", "members/com.soundcloud.android.offline.DeleteOfflineTrackCommand", false, com/soundcloud/android/offline/DeleteOfflineTrackCommand);
    }
}
