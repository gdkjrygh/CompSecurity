// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackStorage

public final class  extends b
    implements Provider
{

    private b propeller;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/tracks/TrackStorage, getClass().getClassLoader());
    }

    public final TrackStorage get()
    {
        return new TrackStorage((PropellerRx)propeller.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
    }

    public ()
    {
        super("com.soundcloud.android.tracks.TrackStorage", "members/com.soundcloud.android.tracks.TrackStorage", false, com/soundcloud/android/tracks/TrackStorage);
    }
}
