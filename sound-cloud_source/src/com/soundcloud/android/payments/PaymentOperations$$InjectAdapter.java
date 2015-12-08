// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.payments.googleplay.BillingService;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.payments:
//            PaymentOperations, TokenStorage

public final class  extends b
    implements Provider
{

    private b api;
    private b playBilling;
    private b tokenStorage;

    public final void attach(l l1)
    {
        api = l1.a("com.soundcloud.android.api.ApiClientRx", com/soundcloud/android/payments/PaymentOperations, getClass().getClassLoader());
        playBilling = l1.a("com.soundcloud.android.payments.googleplay.BillingService", com/soundcloud/android/payments/PaymentOperations, getClass().getClassLoader());
        tokenStorage = l1.a("com.soundcloud.android.payments.TokenStorage", com/soundcloud/android/payments/PaymentOperations, getClass().getClassLoader());
    }

    public final PaymentOperations get()
    {
        return new PaymentOperations((ApiClientRx)api.get(), (BillingService)playBilling.get(), (TokenStorage)tokenStorage.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(api);
        set.add(playBilling);
        set.add(tokenStorage);
    }

    public ()
    {
        super("com.soundcloud.android.payments.PaymentOperations", "members/com.soundcloud.android.payments.PaymentOperations", false, com/soundcloud/android/payments/PaymentOperations);
    }
}
