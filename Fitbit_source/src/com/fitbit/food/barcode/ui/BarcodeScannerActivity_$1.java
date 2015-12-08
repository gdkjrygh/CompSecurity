// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.widget.CompoundButton;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeScannerActivity_

class a
    implements android.widget.angeListener
{

    final BarcodeScannerActivity_ a;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        a.a(compoundbutton, flag);
    }

    (BarcodeScannerActivity_ barcodescanneractivity_)
    {
        a = barcodescanneractivity_;
        super();
    }
}
