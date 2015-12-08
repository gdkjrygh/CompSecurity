// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.database:
//            PayPassMagStripeTable, RotatingAtcTable, HceWalletDatabaseHelper

public final class  extends Binding
    implements Provider
{

    private Binding atcTable;
    private Binding helper;

    public final void attach(Linker linker)
    {
        atcTable = linker.requestBinding("com.google.android.apps.wallet.hce.database.RotatingAtcTable", com/google/android/apps/wallet/hce/database/PayPassMagStripeTable, getClass().getClassLoader());
        helper = linker.requestBinding("com.google.android.apps.wallet.hce.database.HceWalletDatabaseHelper", com/google/android/apps/wallet/hce/database/PayPassMagStripeTable, getClass().getClassLoader());
    }

    public final PayPassMagStripeTable get()
    {
        return new PayPassMagStripeTable((RotatingAtcTable)atcTable.get(), (HceWalletDatabaseHelper)helper.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(atcTable);
        set.add(helper);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.database.PayPassMagStripeTable", "members/com.google.android.apps.wallet.hce.database.PayPassMagStripeTable", false, com/google/android/apps/wallet/hce/database/PayPassMagStripeTable);
    }
}
