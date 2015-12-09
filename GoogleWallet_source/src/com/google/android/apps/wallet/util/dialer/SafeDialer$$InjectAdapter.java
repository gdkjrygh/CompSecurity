// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.dialer;

import android.support.v4.app.FragmentActivity;
import android.telephony.TelephonyManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.dialer:
//            SafeDialer

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding telephonyManager;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/util/dialer/SafeDialer, getClass().getClassLoader());
        telephonyManager = linker.requestBinding("android.telephony.TelephonyManager", com/google/android/apps/wallet/util/dialer/SafeDialer, getClass().getClassLoader());
    }

    public final SafeDialer get()
    {
        return new SafeDialer((FragmentActivity)activity.get(), (TelephonyManager)telephonyManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(telephonyManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.util.dialer.SafeDialer", "members/com.google.android.apps.wallet.util.dialer.SafeDialer", false, com/google/android/apps/wallet/util/dialer/SafeDialer);
    }
}
