// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.database;

import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.database:
//            HceLibraryDatabase, HceWalletDatabaseHelper, PayPassMagStripeTable, RotatingAtcTable

public final class  extends Binding
    implements Provider
{

    private Binding atcTable;
    private Binding featureManager;
    private Binding hceLibrarySQLiteOpenHelper;
    private Binding ppmsTable;

    public final void attach(Linker linker)
    {
        hceLibrarySQLiteOpenHelper = linker.requestBinding("com.google.android.apps.wallet.hce.database.HceWalletDatabaseHelper", com/google/android/apps/wallet/hce/database/HceLibraryDatabase, getClass().getClassLoader());
        ppmsTable = linker.requestBinding("com.google.android.apps.wallet.hce.database.PayPassMagStripeTable", com/google/android/apps/wallet/hce/database/HceLibraryDatabase, getClass().getClassLoader());
        atcTable = linker.requestBinding("com.google.android.apps.wallet.hce.database.RotatingAtcTable", com/google/android/apps/wallet/hce/database/HceLibraryDatabase, getClass().getClassLoader());
        featureManager = linker.requestBinding("com.google.android.apps.wallet.config.featurecontrol.FeatureManager", com/google/android/apps/wallet/hce/database/HceLibraryDatabase, getClass().getClassLoader());
    }

    public final HceLibraryDatabase get()
    {
        return new HceLibraryDatabase((HceWalletDatabaseHelper)hceLibrarySQLiteOpenHelper.get(), (PayPassMagStripeTable)ppmsTable.get(), (RotatingAtcTable)atcTable.get(), (FeatureManager)featureManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(hceLibrarySQLiteOpenHelper);
        set.add(ppmsTable);
        set.add(atcTable);
        set.add(featureManager);
    }

    public ()
    {
        super("com.google.android.apps.wallet.hce.database.HceLibraryDatabase", "members/com.google.android.apps.wallet.hce.database.HceLibraryDatabase", true, com/google/android/apps/wallet/hce/database/HceLibraryDatabase);
    }
}
