// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount.api;

import com.google.android.apps.wallet.datastore.WalletDatabaseHelper;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.bankaccount.api:
//            BankAccountProtoManager

public final class  extends Binding
    implements Provider
{

    private Binding dbHelper;

    public final void attach(Linker linker)
    {
        dbHelper = linker.requestBinding("com.google.android.apps.wallet.datastore.WalletDatabaseHelper", com/google/android/apps/wallet/bankaccount/api/BankAccountProtoManager, getClass().getClassLoader());
    }

    public final BankAccountProtoManager get()
    {
        return new BankAccountProtoManager((WalletDatabaseHelper)dbHelper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(dbHelper);
    }

    public ()
    {
        super("com.google.android.apps.wallet.bankaccount.api.BankAccountProtoManager", "members/com.google.android.apps.wallet.bankaccount.api.BankAccountProtoManager", false, com/google/android/apps/wallet/bankaccount/api/BankAccountProtoManager);
    }
}
