// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.telephony.TelephonyManager;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.utils:
//            TelphonyBasedCountryProvider

public final class  extends b
    implements Provider
{

    private b telephonyManager;

    public final void attach(l l1)
    {
        telephonyManager = l1.a("android.telephony.TelephonyManager", com/soundcloud/android/utils/TelphonyBasedCountryProvider, getClass().getClassLoader());
    }

    public final TelphonyBasedCountryProvider get()
    {
        return new TelphonyBasedCountryProvider((TelephonyManager)telephonyManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(telephonyManager);
    }

    public ()
    {
        super("com.soundcloud.android.utils.TelphonyBasedCountryProvider", "members/com.soundcloud.android.utils.TelphonyBasedCountryProvider", false, com/soundcloud/android/utils/TelphonyBasedCountryProvider);
    }
}
