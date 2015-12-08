// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PickupTimeSelectorDialogView

class val.target
    implements android.widget.iewInjector._cls1
{

    final lected this$0;
    final PickupTimeSelectorDialogView val$target;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        val$target.onPickupOffsetSelected(i);
    }

    ()
    {
        this$0 = final_;
        val$target = PickupTimeSelectorDialogView.this;
        super();
    }
}
