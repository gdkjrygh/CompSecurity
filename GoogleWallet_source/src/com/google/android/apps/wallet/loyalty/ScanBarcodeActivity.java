// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo;
import com.google.android.libraries.commerce.ocr.loyalty.fragments.BarcodeFragment;
import com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrCaptureListener;
import com.google.common.collect.Lists;
import java.util.List;

public class ScanBarcodeActivity extends WalletActivity
    implements OcrCaptureListener
{

    private static final String BARCODE_FRAGMENT_TAG;
    private static final String TAG;

    public ScanBarcodeActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_container);
    }

    public final void doOnCreate(Bundle bundle)
    {
        getSupportActionBar().hide();
        if (bundle == null)
        {
            bundle = new BarcodeFragment();
            getSupportFragmentManager().beginTransaction().add(0x1020002, bundle, BARCODE_FRAGMENT_TAG).commit();
            bundle.startProcessing();
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final void onRecognized(List list, int i, DebugInfo debuginfo)
    {
        setResult(i, (new Intent()).putExtra("extra_scan_barcode_result", Lists.newArrayList(list)));
        finish();
    }

    public final void onUnrecognized(int i, DebugInfo debuginfo)
    {
        setResult(i);
        finish();
    }

    protected final void onUpPressed()
    {
        setResult(0);
        finish();
    }

    static 
    {
        String s = com/google/android/apps/wallet/loyalty/ScanBarcodeActivity.getName();
        TAG = s;
        String s1 = String.valueOf(com/google/android/libraries/commerce/ocr/loyalty/fragments/BarcodeFragment.getSimpleName());
        BARCODE_FRAGMENT_TAG = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("-").append(s1).toString();
    }
}
