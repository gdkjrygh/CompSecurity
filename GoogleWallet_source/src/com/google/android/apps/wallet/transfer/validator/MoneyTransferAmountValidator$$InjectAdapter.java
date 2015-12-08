// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer.validator;

import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.transfer.validator:
//            MoneyTransferAmountValidator

public final class  extends Binding
    implements Provider
{

    private Binding analyticsUtil;

    public final void attach(Linker linker)
    {
        analyticsUtil = linker.requestBinding("com.google.android.apps.wallet.analytics.AnalyticsUtil", com/google/android/apps/wallet/transfer/validator/MoneyTransferAmountValidator, getClass().getClassLoader());
    }

    public final MoneyTransferAmountValidator get()
    {
        return new MoneyTransferAmountValidator((AnalyticsUtil)analyticsUtil.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(analyticsUtil);
    }

    public ()
    {
        super("com.google.android.apps.wallet.transfer.validator.MoneyTransferAmountValidator", "members/com.google.android.apps.wallet.transfer.validator.MoneyTransferAmountValidator", false, com/google/android/apps/wallet/transfer/validator/MoneyTransferAmountValidator);
    }
}
