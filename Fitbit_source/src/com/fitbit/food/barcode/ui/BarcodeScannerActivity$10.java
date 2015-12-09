// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import com.fitbit.e.a;
import com.fitbit.food.barcode.a.h;
import com.fitbit.food.barcode.a.l;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeScannerActivity

class a extends l
{

    final BarcodeScannerActivity a;

    public void a(Exception exception)
    {
        com.fitbit.e.a.f("BarcodeScannerActivity", "Show internal error dialog", exception, new Object[0]);
        com.fitbit.food.barcode.ui.BarcodeScannerActivity.h(a);
    }

    (BarcodeScannerActivity barcodescanneractivity, h h, String s)
    {
        a = barcodescanneractivity;
        super(h, s);
    }
}
