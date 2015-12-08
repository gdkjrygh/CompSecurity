// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.passenger:
//            TipSelectorWidget

class val.amount
    implements android.view.
{

    final TipSelectorWidget this$0;
    final int val$amount;

    public void onClick(View view)
    {
        TipSelectorWidget.access$100(TipSelectorWidget.this).onNext(Integer.valueOf(val$amount));
    }

    ()
    {
        this$0 = final_tipselectorwidget;
        val$amount = I.this;
        super();
    }
}
