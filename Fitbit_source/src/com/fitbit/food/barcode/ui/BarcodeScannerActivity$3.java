// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.content.Intent;
import com.fitbit.util.threading.c;
import java.util.ArrayList;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeScannerActivity

class a extends c
{

    final BarcodeScannerActivity a;

    protected void a(Intent intent)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        String s;
        byte byte0;
        s = intent.getAction();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 48
    //                   -1603278973: 105
    //                   1438654852: 77
    //                   1499674368: 91;
           goto _L3 _L4 _L5 _L6
_L3:
        byte0;
        JVM INSTR tableswitch 0 2: default 76
    //                   0 119
    //                   1 147
    //                   2 155;
           goto _L2 _L7 _L8 _L9
_L2:
        return;
_L5:
        if (s.equals("com.fitbit.food.barcode.ui.UploadBarcodeFragment.ACTION_SUBMIT_TO_DB"))
        {
            byte0 = 0;
        }
          goto _L3
_L6:
        if (s.equals("com.fitbit.food.barcode.ui.ScanAnotherBarcodeFragment.ACTION_START_SCAN"))
        {
            byte0 = 1;
        }
          goto _L3
_L4:
        if (s.equals("com.fitbit.food.barcode.ui.SubmitToDbFragment.ACTION_TAKE_PICTURE"))
        {
            byte0 = 2;
        }
          goto _L3
_L7:
        com.fitbit.food.barcode.c.c.a(a);
        a.h.clear();
        a.b(anningState.e);
        return;
_L8:
        BarcodeScannerActivity.a(a);
        return;
_L9:
        a.h = intent.getParcelableArrayListExtra("com.fitbit.food.barcode.ui.SubmitCompletedFragment.EXTRA_URI_LIST");
        a.b(anningState.f);
        return;
    }

    anningState(BarcodeScannerActivity barcodescanneractivity)
    {
        a = barcodescanneractivity;
        super();
    }
}
