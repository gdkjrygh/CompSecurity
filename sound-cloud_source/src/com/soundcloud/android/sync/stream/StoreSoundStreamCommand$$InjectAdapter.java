// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.stream;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.stream:
//            StoreSoundStreamCommand

public final class  extends b
    implements a, Provider
{

    private b propeller;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/sync/stream/StoreSoundStreamCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.DefaultWriteStorageCommand", com/soundcloud/android/sync/stream/StoreSoundStreamCommand, getClass().getClassLoader(), false);
    }

    public final StoreSoundStreamCommand get()
    {
        StoreSoundStreamCommand storesoundstreamcommand = new StoreSoundStreamCommand((PropellerDatabase)propeller.get());
        injectMembers(storesoundstreamcommand);
        return storesoundstreamcommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set1.add(supertype);
    }

    public final void injectMembers(StoreSoundStreamCommand storesoundstreamcommand)
    {
        supertype.injectMembers(storesoundstreamcommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((StoreSoundStreamCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.stream.StoreSoundStreamCommand", "members/com.soundcloud.android.sync.stream.StoreSoundStreamCommand", false, com/soundcloud/android/sync/stream/StoreSoundStreamCommand);
    }
}
