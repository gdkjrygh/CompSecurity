// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            RemoveBankAccountActivity, RemoveBankAccountHelper

public final class nextInjectableAncestor
    implements MembersInjector
{

    private com.google.android.apps.wallet.base.activity.jectMembers nextInjectableAncestor;
    private Binding removeBankAccountHelper;

    public final void attach(Linker linker)
    {
        nextInjectableAncestor.xtInjectableAncestor(linker);
        removeBankAccountHelper = linker.requestBinding("com.google.android.apps.wallet.bankaccount.RemoveBankAccountHelper", com/google/android/apps/wallet/bankaccount/RemoveBankAccountActivity, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(removeBankAccountHelper);
        nextInjectableAncestor.cies(null, set1);
    }

    public final void injectMembers(RemoveBankAccountActivity removebankaccountactivity)
    {
        removebankaccountactivity.removeBankAccountHelper = (RemoveBankAccountHelper)removeBankAccountHelper.get();
        nextInjectableAncestor.rs(removebankaccountactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RemoveBankAccountActivity)obj);
    }

    public ()
    {
        nextInjectableAncestor = new com.google.android.apps.wallet.base.activity.xtInjectableAncestor();
    }
}
