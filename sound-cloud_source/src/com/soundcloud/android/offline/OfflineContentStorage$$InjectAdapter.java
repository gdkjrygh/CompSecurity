// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentStorage

public final class I extends b
    implements Provider
{

    private b propellerRx;

    public final void attach(l l1)
    {
        propellerRx = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/offline/OfflineContentStorage, getClass().getClassLoader());
    }

    public final OfflineContentStorage get()
    {
        return new OfflineContentStorage((PropellerRx)propellerRx.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propellerRx);
    }

    public I()
    {
        super("com.soundcloud.android.offline.OfflineContentStorage", "members/com.soundcloud.android.offline.OfflineContentStorage", false, com/soundcloud/android/offline/OfflineContentStorage);
    }
}
