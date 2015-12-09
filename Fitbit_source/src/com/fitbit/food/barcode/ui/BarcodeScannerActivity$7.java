// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;


// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeScannerActivity, BarcodeStatusView

class a
    implements Runnable
{

    final BarcodeScannerActivity a;

    public void run()
    {
        if (anningState.b == a.e())
        {
            a.d.a(tatus.c);
        }
    }

    tatus(BarcodeScannerActivity barcodescanneractivity)
    {
        a = barcodescanneractivity;
        super();
    }
}
