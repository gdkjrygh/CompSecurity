// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtView

class this._cls0
    implements android.view.kListener
{

    final DebtView this$0;

    public void onClick(View view)
    {
        appFlow.goUp();
    }

    ()
    {
        this$0 = DebtView.this;
        super();
    }
}
