// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.utils:
//            PowerManagerWakeLockWrapper

public final class  extends b
    implements Provider
{

    private b wakeLock;

    public final void attach(l l1)
    {
        wakeLock = l1.a("android.os.PowerManager$WakeLock", com/soundcloud/android/utils/PowerManagerWakeLockWrapper, getClass().getClassLoader());
    }

    public final PowerManagerWakeLockWrapper get()
    {
        return new PowerManagerWakeLockWrapper((android.os.er)wakeLock.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(wakeLock);
    }

    public ()
    {
        super("com.soundcloud.android.utils.PowerManagerWakeLockWrapper", "members/com.soundcloud.android.utils.PowerManagerWakeLockWrapper", false, com/soundcloud/android/utils/PowerManagerWakeLockWrapper);
    }
}
