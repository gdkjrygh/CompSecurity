// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.domain.ride.TipOption;
import me.lyft.android.domain.ride.TipOptionMapper;
import me.lyft.android.infrastructure.lyft.payment.TipOptionDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerPayView

class this._cls0
    implements Func1
{

    final PassengerPayView this$0;

    public volatile Object call(Object obj)
    {
        return call((TipOptionDTO)obj);
    }

    public TipOption call(TipOptionDTO tipoptiondto)
    {
        return TipOptionMapper.fromTipOptionDTO(tipoptiondto);
    }

    ptionDTO()
    {
        this$0 = PassengerPayView.this;
        super();
    }
}
