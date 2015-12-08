// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.content.Intent;
import android.widget.Button;
import com.fitbit.util.ad;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeDialogFragment

public abstract class ScanAnotherBarcodeFragment extends BarcodeDialogFragment
{

    public static final String h = "com.fitbit.food.barcode.ui.ScanAnotherBarcodeFragment.ACTION_START_SCAN";
    protected Button g;

    public ScanAnotherBarcodeFragment()
    {
    }

    protected void a()
    {
        ad.a(getActivity(), this, 4099);
    }

    public void e()
    {
        z.a(new Intent("com.fitbit.food.barcode.ui.ScanAnotherBarcodeFragment.ACTION_START_SCAN"));
        a();
    }
}
