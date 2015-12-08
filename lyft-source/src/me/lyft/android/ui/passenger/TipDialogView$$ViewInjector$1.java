// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.passenger:
//            TipDialogView

class val.target extends DebouncingOnClickListener
{

    final n this$0;
    final TipDialogView val$target;

    public void doClick(View view)
    {
        val$target.decrementDonation();
    }

    ()
    {
        this$0 = final_;
        val$target = TipDialogView.this;
        super();
    }
}
