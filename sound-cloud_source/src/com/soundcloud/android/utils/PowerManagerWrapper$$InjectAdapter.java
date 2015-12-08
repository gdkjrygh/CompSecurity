// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.os.PowerManager;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.utils:
//            PowerManagerWrapper

public final class  extends b
    implements Provider
{

    private b powerManager;

    public final void attach(l l1)
    {
        powerManager = l1.a("android.os.PowerManager", com/soundcloud/android/utils/PowerManagerWrapper, getClass().getClassLoader());
    }

    public final PowerManagerWrapper get()
    {
        return new PowerManagerWrapper((PowerManager)powerManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(powerManager);
    }

    public ()
    {
        super("com.soundcloud.android.utils.PowerManagerWrapper", "members/com.soundcloud.android.utils.PowerManagerWrapper", false, com/soundcloud/android/utils/PowerManagerWrapper);
    }
}
