// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.modules;

import com.google.android.apps.wallet.bankaccount.BankAccountTile;
import com.google.android.apps.wallet.geofencing.LocationServicesTeachingTile;
import com.google.android.apps.wallet.hce.setup.ui.NfcTile;
import com.google.android.apps.wallet.hce.setup.ui.SetupNfcPaymentTile;
import com.google.android.apps.wallet.p2p.ClaimMoneyTile;
import com.google.android.apps.wallet.p2p.IncomingMoneyRequestsTile;
import com.google.android.apps.wallet.plastic.PlasticCardTile;
import com.google.android.apps.wallet.purchaserecord.LatestTransactionsTile;
import com.google.android.apps.wallet.storedvalue.BalanceHeader;
import com.google.common.collect.Multimap;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.app.modules:
//            NativeTilesModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding claimMoneyTile;
    private Binding incomingMoneyRequestsTile;
    private Binding latestTransactionsTile;
    private Binding locationServicesTeachingTile;
    private final NativeTilesModule module;
    private Binding nfcTile;
    private Binding pendingBankAccountTile;
    private Binding plasticCardTile;
    private Binding setupNfcPaymentsTile;
    private Binding storedValueAndP2pTile;

    public final void attach(Linker linker)
    {
        storedValueAndP2pTile = linker.requestBinding("com.google.android.apps.wallet.storedvalue.BalanceHeader", com/google/android/apps/wallet/app/modules/NativeTilesModule, getClass().getClassLoader());
        setupNfcPaymentsTile = linker.requestBinding("com.google.android.apps.wallet.hce.setup.ui.SetupNfcPaymentTile", com/google/android/apps/wallet/app/modules/NativeTilesModule, getClass().getClassLoader());
        nfcTile = linker.requestBinding("com.google.android.apps.wallet.hce.setup.ui.NfcTile", com/google/android/apps/wallet/app/modules/NativeTilesModule, getClass().getClassLoader());
        plasticCardTile = linker.requestBinding("com.google.android.apps.wallet.plastic.PlasticCardTile", com/google/android/apps/wallet/app/modules/NativeTilesModule, getClass().getClassLoader());
        locationServicesTeachingTile = linker.requestBinding("com.google.android.apps.wallet.geofencing.LocationServicesTeachingTile", com/google/android/apps/wallet/app/modules/NativeTilesModule, getClass().getClassLoader());
        claimMoneyTile = linker.requestBinding("com.google.android.apps.wallet.p2p.ClaimMoneyTile", com/google/android/apps/wallet/app/modules/NativeTilesModule, getClass().getClassLoader());
        incomingMoneyRequestsTile = linker.requestBinding("com.google.android.apps.wallet.p2p.IncomingMoneyRequestsTile", com/google/android/apps/wallet/app/modules/NativeTilesModule, getClass().getClassLoader());
        pendingBankAccountTile = linker.requestBinding("com.google.android.apps.wallet.bankaccount.BankAccountTile", com/google/android/apps/wallet/app/modules/NativeTilesModule, getClass().getClassLoader());
        latestTransactionsTile = linker.requestBinding("com.google.android.apps.wallet.purchaserecord.LatestTransactionsTile", com/google/android/apps/wallet/app/modules/NativeTilesModule, getClass().getClassLoader());
    }

    public final Multimap get()
    {
        NativeTilesModule nativetilesmodule = module;
        return NativeTilesModule.getNativeTiles((BalanceHeader)storedValueAndP2pTile.get(), (SetupNfcPaymentTile)setupNfcPaymentsTile.get(), (NfcTile)nfcTile.get(), (PlasticCardTile)plasticCardTile.get(), (LocationServicesTeachingTile)locationServicesTeachingTile.get(), (ClaimMoneyTile)claimMoneyTile.get(), (IncomingMoneyRequestsTile)incomingMoneyRequestsTile.get(), (BankAccountTile)pendingBankAccountTile.get(), (LatestTransactionsTile)latestTransactionsTile.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(storedValueAndP2pTile);
        set.add(setupNfcPaymentsTile);
        set.add(nfcTile);
        set.add(plasticCardTile);
        set.add(locationServicesTeachingTile);
        set.add(claimMoneyTile);
        set.add(incomingMoneyRequestsTile);
        set.add(pendingBankAccountTile);
        set.add(latestTransactionsTile);
    }

    public (NativeTilesModule nativetilesmodule)
    {
        super("com.google.common.collect.Multimap<java.lang.Integer, com.google.android.apps.wallet.tile.Tile>", false, "com.google.android.apps.wallet.app.modules.NativeTilesModule", "getNativeTiles");
        module = nativetilesmodule;
        setLibrary(true);
    }
}
