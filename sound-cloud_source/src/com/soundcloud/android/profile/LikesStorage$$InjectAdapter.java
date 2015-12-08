// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            LikesStorage

public final class  extends b
    implements Provider
{

    private b propellerRx;

    public final void attach(l l1)
    {
        propellerRx = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/profile/LikesStorage, getClass().getClassLoader());
    }

    public final LikesStorage get()
    {
        return new LikesStorage((PropellerRx)propellerRx.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propellerRx);
    }

    public ()
    {
        super("com.soundcloud.android.profile.LikesStorage", "members/com.soundcloud.android.profile.LikesStorage", false, com/soundcloud/android/profile/LikesStorage);
    }
}
