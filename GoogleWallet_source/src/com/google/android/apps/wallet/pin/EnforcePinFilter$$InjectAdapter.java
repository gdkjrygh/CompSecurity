// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.app.Activity;
import com.google.android.apps.wallet.analytics.AppStartTimeLogger;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            EnforcePinFilter, CloudPinManager

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding appStartTimeLogger;
    private Binding cloudPinManager;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/pin/EnforcePinFilter, getClass().getClassLoader());
        cloudPinManager = linker.requestBinding("com.google.android.apps.wallet.pin.CloudPinManager", com/google/android/apps/wallet/pin/EnforcePinFilter, getClass().getClassLoader());
        appStartTimeLogger = linker.requestBinding("com.google.android.apps.wallet.analytics.AppStartTimeLogger", com/google/android/apps/wallet/pin/EnforcePinFilter, getClass().getClassLoader());
    }

    public final EnforcePinFilter get()
    {
        return new EnforcePinFilter((Activity)activity.get(), (CloudPinManager)cloudPinManager.get(), (AppStartTimeLogger)appStartTimeLogger.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(cloudPinManager);
        set.add(appStartTimeLogger);
    }

    public ()
    {
        super("com.google.android.apps.wallet.pin.EnforcePinFilter", "members/com.google.android.apps.wallet.pin.EnforcePinFilter", false, com/google/android/apps/wallet/pin/EnforcePinFilter);
    }
}
