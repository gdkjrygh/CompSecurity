// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            BaseCreditCardView

class this._cls0
    implements Action1
{

    final BaseCreditCardView this$0;

    public volatile void call(Object obj)
    {
        call((belView.ResponseData)obj);
    }

    public void call(belView.ResponseData responsedata)
    {
        if (!responsedata.consume())
        {
            labelType.onNext(responsedata.labelType);
            label.onNext(responsedata.label);
        }
    }

    belView.ResponseData()
    {
        this$0 = BaseCreditCardView.this;
        super();
    }
}
