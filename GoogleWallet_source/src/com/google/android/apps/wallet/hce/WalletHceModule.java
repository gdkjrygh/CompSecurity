// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import android.app.Application;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.hce.database.HceWalletDatabaseHelper;
import com.google.android.apps.wallet.hce.database.RotatingAtcTable;
import com.google.android.apps.wallet.hce.tap.TapListener;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.hce:
//            RotatingAtcListener, WalletHceTapListener

public class WalletHceModule
{

    public WalletHceModule()
    {
    }

    static CardEmulation getCardEmulationManager(NfcAdapter nfcadapter)
    {
        return CardEmulation.getInstance(nfcadapter);
    }

    static Boolean getIsHceSupported(PackageManager packagemanager)
    {
        boolean flag;
        if (packagemanager.hasSystemFeature("android.hardware.nfc") && packagemanager.hasSystemFeature("android.hardware.nfc.hce"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    static NfcAdapter getNfcAdapter(Application application, boolean flag)
    {
        Preconditions.checkState(flag);
        return NfcAdapter.getDefaultAdapter(application);
    }

    static RotatingAtcTable getRotatingAtcTable(HceWalletDatabaseHelper hcewalletdatabasehelper, RotatingAtcListener rotatingatclistener)
    {
        return new RotatingAtcTable(rotatingatclistener, new System(), hcewalletdatabasehelper);
    }

    static TapListener getTapListener(WalletHceTapListener wallethcetaplistener)
    {
        return wallethcetaplistener;
    }
}
