// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import com.google.android.apps.wallet.hce.database.HceWalletDatabaseHelper;
import com.google.android.apps.wallet.hce.database.RotatingAtcTable;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce:
//            WalletHceModule, RotatingAtcListener

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding listener;
    private final WalletHceModule module;
    private Binding sqliteHelper;

    public final void attach(Linker linker)
    {
        sqliteHelper = linker.requestBinding("com.google.android.apps.wallet.hce.database.HceWalletDatabaseHelper", com/google/android/apps/wallet/hce/WalletHceModule, getClass().getClassLoader());
        listener = linker.requestBinding("com.google.android.apps.wallet.hce.RotatingAtcListener", com/google/android/apps/wallet/hce/WalletHceModule, getClass().getClassLoader());
    }

    public final RotatingAtcTable get()
    {
        WalletHceModule wallethcemodule = module;
        return WalletHceModule.getRotatingAtcTable((HceWalletDatabaseHelper)sqliteHelper.get(), (RotatingAtcListener)listener.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(sqliteHelper);
        set.add(listener);
    }

    public (WalletHceModule wallethcemodule)
    {
        super("com.google.android.apps.wallet.hce.database.RotatingAtcTable", true, "com.google.android.apps.wallet.hce.WalletHceModule", "getRotatingAtcTable");
        module = wallethcemodule;
        setLibrary(true);
    }
}
