// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.utils:
//            SystemClockDateProvider

public final class I extends b
    implements Provider
{

    public final SystemClockDateProvider get()
    {
        return new SystemClockDateProvider();
    }

    public final volatile Object get()
    {
        return get();
    }

    public I()
    {
        super("com.soundcloud.android.utils.SystemClockDateProvider", "members/com.soundcloud.android.utils.SystemClockDateProvider", false, com/soundcloud/android/utils/SystemClockDateProvider);
    }
}
