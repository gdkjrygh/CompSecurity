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
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class NativeTilesModule
{

    public NativeTilesModule()
    {
    }

    public static Multimap getNativeTiles(BalanceHeader balanceheader, SetupNfcPaymentTile setupnfcpaymenttile, NfcTile nfctile, PlasticCardTile plasticcardtile, LocationServicesTeachingTile locationservicesteachingtile, ClaimMoneyTile claimmoneytile, IncomingMoneyRequestsTile incomingmoneyrequeststile, BankAccountTile bankaccounttile, 
            LatestTransactionsTile latesttransactionstile)
    {
        ArrayListMultimap arraylistmultimap = ArrayListMultimap.create();
        arraylistmultimap.put(Integer.valueOf(16), balanceheader);
        arraylistmultimap.put(Integer.valueOf(5), setupnfcpaymenttile);
        arraylistmultimap.put(Integer.valueOf(5), nfctile);
        arraylistmultimap.put(Integer.valueOf(9), claimmoneytile);
        arraylistmultimap.put(Integer.valueOf(17), incomingmoneyrequeststile);
        arraylistmultimap.put(Integer.valueOf(4), bankaccounttile);
        arraylistmultimap.put(Integer.valueOf(10), plasticcardtile);
        arraylistmultimap.put(Integer.valueOf(15), locationservicesteachingtile);
        arraylistmultimap.put(Integer.valueOf(14), latesttransactionstile);
        return arraylistmultimap;
    }
}
