// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import me.lyft.android.common.Objects;
import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.infrastructure.lyft.ride.FareDTO;

// Referenced classes of package me.lyft.android.domain.ride:
//            FixedFare

public class FixedFareMapper
{

    public FixedFareMapper()
    {
    }

    public static FixedFare fromDTO(FareDTO faredto)
    {
        return FixedFare.create(MoneyMapper.fromMoneyDTO(faredto.totalMoney), ((Integer)Objects.firstNonNull(faredto.numSeats, Integer.valueOf(0))).intValue(), ((Boolean)Objects.firstNonNull(faredto.isSelected, Boolean.valueOf(false))).booleanValue(), ((Long)Objects.firstNonNull(faredto.dispatchTimeout, Long.valueOf(60L))).longValue(), MoneyMapper.fromMoneyDTO(faredto.comparisonMoney), faredto.comparisonText, faredto.buttonText, faredto.confirmationButtonText, faredto.confirmationTitle, faredto.confirmationSubtitle, faredto.descriptionText, faredto.fixedFareToken, faredto);
    }
}
