// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PickupTimeSelectorDialogView

class this._cls0
    implements Action1
{

    final PickupTimeSelectorDialogView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        PickupTimeSelectorDialogView.access$000(PickupTimeSelectorDialogView.this).notifyDataSetChanged();
    }

    ckupTimesAdapter()
    {
        this$0 = PickupTimeSelectorDialogView.this;
        super();
    }
}
