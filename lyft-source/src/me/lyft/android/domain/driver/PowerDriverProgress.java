// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.driver.PowerDriverProgressDTO;

public class PowerDriverProgress
    implements INullable
{

    Integer currentProgress;
    Boolean goalMet;
    Integer maxProgress;

    public PowerDriverProgress()
    {
    }

    public static PowerDriverProgress fromDTO(PowerDriverProgressDTO powerdriverprogressdto)
    {
        if (powerdriverprogressdto == null)
        {
            return NUllPowerDriverProgress.getInstance();
        } else
        {
            PowerDriverProgress powerdriverprogress = new PowerDriverProgress();
            powerdriverprogress.currentProgress = powerdriverprogressdto.currentProgress;
            powerdriverprogress.maxProgress = powerdriverprogressdto.maxProgress;
            powerdriverprogress.goalMet = powerdriverprogressdto.goalMet;
            return powerdriverprogress;
        }
    }

    public Integer getCurrentProgress()
    {
        return (Integer)Objects.firstNonNull(currentProgress, NUllPowerDriverProgress.getInstance().getCurrentProgress());
    }

    public Integer getMaxProgress()
    {
        return (Integer)Objects.firstNonNull(maxProgress, NUllPowerDriverProgress.getInstance().getMaxProgress());
    }

    public Boolean isGoalMet()
    {
        return (Boolean)Objects.firstNonNull(goalMet, NUllPowerDriverProgress.getInstance().isGoalMet());
    }

    public boolean isNull()
    {
        return false;
    }

    private class NUllPowerDriverProgress extends PowerDriverProgress
    {

        private static PowerDriverProgress instance = new NUllPowerDriverProgress();

        public static PowerDriverProgress getInstance()
        {
            return instance;
        }

        public Integer getCurrentProgress()
        {
            return Integer.valueOf(0);
        }

        public Integer getMaxProgress()
        {
            return Integer.valueOf(0);
        }

        public Boolean isGoalMet()
        {
            return Boolean.valueOf(false);
        }

        public boolean isNull()
        {
            return true;
        }


        private NUllPowerDriverProgress()
        {
        }
    }

}
