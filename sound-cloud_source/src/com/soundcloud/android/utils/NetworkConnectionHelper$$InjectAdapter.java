// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.utils:
//            NetworkConnectionHelper

public final class I extends b
    implements Provider
{

    private b connectivityManager;
    private b telephonyManager;

    public final void attach(l l1)
    {
        connectivityManager = l1.a("android.net.ConnectivityManager", com/soundcloud/android/utils/NetworkConnectionHelper, getClass().getClassLoader());
        telephonyManager = l1.a("android.telephony.TelephonyManager", com/soundcloud/android/utils/NetworkConnectionHelper, getClass().getClassLoader());
    }

    public final NetworkConnectionHelper get()
    {
        return new NetworkConnectionHelper((ConnectivityManager)connectivityManager.get(), (TelephonyManager)telephonyManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(connectivityManager);
        set.add(telephonyManager);
    }

    public I()
    {
        super("com.soundcloud.android.utils.NetworkConnectionHelper", "members/com.soundcloud.android.utils.NetworkConnectionHelper", false, com/soundcloud/android/utils/NetworkConnectionHelper);
    }
}
