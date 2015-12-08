// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.utils:
//            LockUtil, PowerManagerWrapper

public final class  extends b
    implements Provider
{

    private b powerManager;

    public final void attach(l l1)
    {
        powerManager = l1.a("com.soundcloud.android.utils.PowerManagerWrapper", com/soundcloud/android/utils/LockUtil, getClass().getClassLoader());
    }

    public final LockUtil get()
    {
        return new LockUtil((PowerManagerWrapper)powerManager.get());
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
        super("com.soundcloud.android.utils.LockUtil", "members/com.soundcloud.android.utils.LockUtil", false, com/soundcloud/android/utils/LockUtil);
    }
}
