// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.infrastructure.lyft.payment.TipOptionDTO;

// Referenced classes of package me.lyft.android.domain.ride:
//            TipOption

public class TipOptionMapper
{

    public TipOptionMapper()
    {
    }

    public static TipOption fromTipOptionDTO(TipOptionDTO tipoptiondto)
    {
        return new TipOption(MoneyMapper.fromMoneyDTO(tipoptiondto.getTipMoney()), tipoptiondto.getTitle());
    }
}
