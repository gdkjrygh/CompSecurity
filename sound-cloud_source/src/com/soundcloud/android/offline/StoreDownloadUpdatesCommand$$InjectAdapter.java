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
//            StoreDownloadUpdatesCommand

public final class  extends b
    implements a, Provider
{

    private b dateProvider;
    private b propeller;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/offline/StoreDownloadUpdatesCommand, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/offline/StoreDownloadUpdatesCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.DefaultWriteStorageCommand", com/soundcloud/android/offline/StoreDownloadUpdatesCommand, getClass().getClassLoader(), false);
    }

    public final StoreDownloadUpdatesCommand get()
    {
        StoreDownloadUpdatesCommand storedownloadupdatescommand = new StoreDownloadUpdatesCommand((PropellerDatabase)propeller.get(), (CurrentDateProvider)dateProvider.get());
        injectMembers(storedownloadupdatescommand);
        return storedownloadupdatescommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set.add(dateProvider);
        set1.add(supertype);
    }

    public final void injectMembers(StoreDownloadUpdatesCommand storedownloadupdatescommand)
    {
        supertype.injectMembers(storedownloadupdatescommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((StoreDownloadUpdatesCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.offline.StoreDownloadUpdatesCommand", "members/com.soundcloud.android.offline.StoreDownloadUpdatesCommand", false, com/soundcloud/android/offline/StoreDownloadUpdatesCommand);
    }
}
