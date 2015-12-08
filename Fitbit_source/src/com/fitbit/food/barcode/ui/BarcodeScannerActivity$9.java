// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import com.fitbit.food.barcode.a.d;
import com.fitbit.food.barcode.b.a;
import com.google.zxing.b;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            b, BarcodeScannerActivity

class a extends com.fitbit.food.barcode.ui.b
{

    final BarcodeScannerActivity a;

    public void a(b b1)
    {
        if (BarcodeScannerActivity.e(a) != null)
        {
            BarcodeScannerActivity.e(a).b();
        }
        com.fitbit.food.barcode.ui.BarcodeScannerActivity.a(a, new a(BarcodeScannerActivity.f(a), BarcodeScannerActivity.g(a)));
        BarcodeScannerActivity.e(a).execute(new b[] {
            b1
        });
    }

    _cls9(BarcodeScannerActivity barcodescanneractivity, d d)
    {
        a = barcodescanneractivity;
        super(d);
    }
}
