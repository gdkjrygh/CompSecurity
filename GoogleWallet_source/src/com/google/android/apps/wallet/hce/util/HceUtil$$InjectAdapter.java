// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.util;

import android.app.Activity;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.util:
//            HceUtil

public final class  extends Binding
    implements Provider
{

    private Binding activity;
    private Binding cardEmulationManager;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/hce/util/HceUtil, getClass().getClassLoader());
        cardEmulationManager = linker.requestBinding("dagger.Lazy<android.nfc.cardemulation.CardEmulation>", com/google/android/apps/wallet/hce/util/HceUtil, getClass().getClassLoader());
    }

    public final HceUtil get()
    {
        return new HceUtil((Activity)activity.get(), (Lazy)cardEmulationManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
        set.add(cardEmulationManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.util.HceUtil", "members/com.google.android.apps.wallet.hce.util.HceUtil", true, com/google/android/apps/wallet/hce/util/HceUtil);
    }
}
