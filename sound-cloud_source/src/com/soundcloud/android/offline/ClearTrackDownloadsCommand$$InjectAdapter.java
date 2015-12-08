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
//            ClearTrackDownloadsCommand, SecureFileStorage, OfflineSettingsStorage

public final class  extends b
    implements a, Provider
{

    private b offlineSettingsStorage;
    private b propeller;
    private b secureFileStorage;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/offline/ClearTrackDownloadsCommand, getClass().getClassLoader());
        secureFileStorage = l1.a("com.soundcloud.android.offline.SecureFileStorage", com/soundcloud/android/offline/ClearTrackDownloadsCommand, getClass().getClassLoader());
        offlineSettingsStorage = l1.a("com.soundcloud.android.offline.OfflineSettingsStorage", com/soundcloud/android/offline/ClearTrackDownloadsCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.Command", com/soundcloud/android/offline/ClearTrackDownloadsCommand, getClass().getClassLoader(), false);
    }

    public final ClearTrackDownloadsCommand get()
    {
        ClearTrackDownloadsCommand cleartrackdownloadscommand = new ClearTrackDownloadsCommand((PropellerDatabase)propeller.get(), (SecureFileStorage)secureFileStorage.get(), (OfflineSettingsStorage)offlineSettingsStorage.get());
        injectMembers(cleartrackdownloadscommand);
        return cleartrackdownloadscommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set.add(secureFileStorage);
        set.add(offlineSettingsStorage);
        set1.add(supertype);
    }

    public final void injectMembers(ClearTrackDownloadsCommand cleartrackdownloadscommand)
    {
        supertype.injectMembers(cleartrackdownloadscommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ClearTrackDownloadsCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.offline.ClearTrackDownloadsCommand", "members/com.soundcloud.android.offline.ClearTrackDownloadsCommand", false, com/soundcloud/android/offline/ClearTrackDownloadsCommand);
    }
}
