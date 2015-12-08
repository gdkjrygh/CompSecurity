// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import me.lyft.android.application.driver.IDailyTotalsRepository;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class DriverDailyTotalsJob
    implements Job
{

    private final AppStateDTO currentAppState;
    IDailyTotalsRepository dailyTotalsRepository;

    public DriverDailyTotalsJob(AppStateDTO appstatedto)
    {
        currentAppState = appstatedto;
    }

    public void execute()
    {
        if (currentAppState == null)
        {
            return;
        } else
        {
            dailyTotalsRepository.updateDailyTotal(MoneyMapper.fromMoneyDTO(((UserDTO)Objects.firstNonNull(currentAppState.getUser(), NullUserDTO.getInstance())).getDailyTotalFares()));
            return;
        }
    }
}
