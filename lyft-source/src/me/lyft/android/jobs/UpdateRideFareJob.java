// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import java.util.Collections;
import java.util.List;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.payment.CouponMapper;
import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.domain.ride.RideFare;
import me.lyft.android.infrastructure.lyft.constants.RideTypeMeta;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class UpdateRideFareJob
    implements Job
{

    IConstantsProvider constantsProvider;
    final RideDTO ride;
    IRideFareRepository rideFareRepository;

    public UpdateRideFareJob(RideDTO ridedto)
    {
        ride = ridedto;
    }

    public void execute()
    {
        Object obj = ride.getRideTypeId();
        obj = new RideFare(((Integer)Objects.firstNonNull(constantsProvider.getRideTypeMetaById(((String) (obj))).getMaximumContributors(), Integer.valueOf(0))).intValue(), MoneyMapper.fromMoneyDTO(ride.getTotalMoney()), CouponMapper.fromCouponDTOs((List)Objects.firstNonNull(ride.getValidCoupons(), Collections.EMPTY_LIST)));
        rideFareRepository.update(((RideFare) (obj)));
    }
}
