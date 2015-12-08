// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.widget.Button;
import android.widget.TextView;
import com.fitbit.util.ad;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            ScanAnotherBarcodeFragment, NeedSubmitFragment_

public class NeedSubmitFragment extends ScanAnotherBarcodeFragment
{

    public static final String c = "com.fitbit.food.barcode.ui.UploadBarcodeFragment.ACTION_SUBMIT_TO_DB";
    protected Button d;
    protected boolean e;

    public NeedSubmitFragment()
    {
        e = false;
    }

    public static NeedSubmitFragment a(boolean flag)
    {
        return NeedSubmitFragment_.d().a(flag).a();
    }

    protected void b()
    {
        Button button = d;
        int i;
        if (e)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        button.setVisibility(i);
        a.setText(0x7f080078);
        i = getResources().getColor(0x7f0f0022);
        a.setTextColor(i);
        b.setText(0x7f080077);
    }

    public void c()
    {
        z.a(new Intent("com.fitbit.food.barcode.ui.UploadBarcodeFragment.ACTION_SUBMIT_TO_DB"));
        ad.a(getActivity(), this, 4099);
    }
}
