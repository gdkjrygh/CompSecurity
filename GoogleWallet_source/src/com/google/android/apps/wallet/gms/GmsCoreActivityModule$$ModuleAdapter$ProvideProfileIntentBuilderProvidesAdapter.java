// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.gms;

import android.app.Activity;
import com.google.android.gms.wallet.ia.CreateProfileIntentBuilder;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.gms:
//            GmsCoreActivityModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding activity;
    private final GmsCoreActivityModule module;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.app.Activity", com/google/android/apps/wallet/gms/GmsCoreActivityModule, getClass().getClassLoader());
    }

    public final CreateProfileIntentBuilder get()
    {
        GmsCoreActivityModule gmscoreactivitymodule = module;
        return GmsCoreActivityModule.provideProfileIntentBuilder((Activity)activity.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
    }

    public (GmsCoreActivityModule gmscoreactivitymodule)
    {
        super("com.google.android.gms.wallet.ia.CreateProfileIntentBuilder", false, "com.google.android.apps.wallet.gms.GmsCoreActivityModule", "provideProfileIntentBuilder");
        module = gmscoreactivitymodule;
        setLibrary(true);
    }
}
