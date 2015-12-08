// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.support.v4.app.FragmentActivity;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycAddressAdapter

public final class I extends Binding
    implements Provider
{

    private Binding activity;

    public final void attach(Linker linker)
    {
        activity = linker.requestBinding("android.support.v4.app.FragmentActivity", com/google/android/apps/wallet/kyc/KycAddressAdapter, getClass().getClassLoader());
    }

    public final KycAddressAdapter get()
    {
        return new KycAddressAdapter((FragmentActivity)activity.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(activity);
    }

    public I()
    {
        super("com.google.android.apps.wallet.kyc.KycAddressAdapter", "members/com.google.android.apps.wallet.kyc.KycAddressAdapter", false, com/google/android/apps/wallet/kyc/KycAddressAdapter);
    }
}
