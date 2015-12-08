// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            LoadOfflineContentUpdatesCommand

public final class  extends b
    implements a, Provider
{

    private b dateProvider;
    private b propellerDatabase;
    private b supertype;

    public final void attach(l l1)
    {
        propellerDatabase = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/offline/LoadOfflineContentUpdatesCommand, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/offline/LoadOfflineContentUpdatesCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.Command", com/soundcloud/android/offline/LoadOfflineContentUpdatesCommand, getClass().getClassLoader(), false);
    }

    public final LoadOfflineContentUpdatesCommand get()
    {
        LoadOfflineContentUpdatesCommand loadofflinecontentupdatescommand = new LoadOfflineContentUpdatesCommand((PropellerDatabase)propellerDatabase.get(), (CurrentDateProvider)dateProvider.get());
        injectMembers(loadofflinecontentupdatescommand);
        return loadofflinecontentupdatescommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propellerDatabase);
        set.add(dateProvider);
        set1.add(supertype);
    }

    public final void injectMembers(LoadOfflineContentUpdatesCommand loadofflinecontentupdatescommand)
    {
        supertype.injectMembers(loadofflinecontentupdatescommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LoadOfflineContentUpdatesCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.offline.LoadOfflineContentUpdatesCommand", "members/com.soundcloud.android.offline.LoadOfflineContentUpdatesCommand", false, com/soundcloud/android/offline/LoadOfflineContentUpdatesCommand);
    }
}
