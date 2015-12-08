// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.app.Activity;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            ResetPinDialog

public final class  extends Binding
    implements Provider
{

    private Binding accountName;
    private Binding activity;
    private Binding appControl;
    private Binding userEventLogger;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/pin/ResetPinDialog, getClass().getClassLoader());
        appControl = linker.requestBinding("com.google.android.apps.wallet.config.appcontrol.AppControl", com/google/android/apps/wallet/pin/ResetPinDialog, getClass().getClassLoader());
        accountName = linker.requestBinding("@com.google.android.apps.wallet.userscope.api.BindingAnnotations$AccountName()/java.lang.String", com/google/android/apps/wallet/pin/ResetPinDialog, getClass().getClassLoader());
        userEventLogger = linker.requestBinding("com.google.android.apps.wallet.userevents.UserEventLogger", com/google/android/apps/wallet/pin/ResetPinDialog, getClass().getClassLoader());
    }

    public final ResetPinDialog get()
    {
        return new ResetPinDialog((Activity)activity.get(), (AppControl)appControl.get(), (String)accountName.get(), (UserEventLogger)userEventLogger.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(appControl);
        set.add(accountName);
        set.add(userEventLogger);
    }

    public ()
    {
        super("com.google.android.apps.wallet.pin.ResetPinDialog", "members/com.google.android.apps.wallet.pin.ResetPinDialog", false, com/google/android/apps/wallet/pin/ResetPinDialog);
    }
}
