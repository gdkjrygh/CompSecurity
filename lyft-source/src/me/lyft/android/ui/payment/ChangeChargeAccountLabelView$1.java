// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            ChangeChargeAccountLabelView

class this._cls0
    implements Action1
{

    final ChangeChargeAccountLabelView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        ChangeChargeAccountLabelView.access$002(ChangeChargeAccountLabelView.this, false);
        ChangeChargeAccountLabelView.access$200(ChangeChargeAccountLabelView.this, ChangeChargeAccountLabelView.access$100(ChangeChargeAccountLabelView.this).getCardLabelType(), ChangeChargeAccountLabelView.access$100(ChangeChargeAccountLabelView.this).getCardLabel(), ChangeChargeAccountLabelView.access$000(ChangeChargeAccountLabelView.this));
    }

    LabelScreen()
    {
        this$0 = ChangeChargeAccountLabelView.this;
        super();
    }
}
