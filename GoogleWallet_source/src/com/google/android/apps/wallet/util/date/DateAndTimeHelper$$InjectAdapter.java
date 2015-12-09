// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.date;

import android.app.Application;
import com.google.android.apps.wallet.base.java.System;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.util.date:
//            DateAndTimeHelper

public final class  extends Binding
    implements Provider
{

    private Binding application;
    private Binding system;

    public final void attach(Linker linker)
    {
        system = linker.requestBinding("com.google.android.apps.wallet.base.java.System", com/google/android/apps/wallet/util/date/DateAndTimeHelper, getClass().getClassLoader());
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/util/date/DateAndTimeHelper, getClass().getClassLoader());
    }

    public final DateAndTimeHelper get()
    {
        return new DateAndTimeHelper((System)system.get(), (Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(system);
        set.add(application);
    }

    public ()
    {
        super("com.google.android.apps.wallet.util.date.DateAndTimeHelper", "members/com.google.android.apps.wallet.util.date.DateAndTimeHelper", false, com/google/android/apps/wallet/util/date/DateAndTimeHelper);
    }
}
