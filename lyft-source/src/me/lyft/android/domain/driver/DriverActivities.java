// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.MoneyMapper;
import me.lyft.android.infrastructure.lyft.driver.DriverActivitiesDTO;

public class DriverActivities
    implements INullable
{

    Money amountEarned;
    Integer rideCount;
    String subtitle;
    Integer timeDrivenSeconds;
    String title;
    private Type type;

    public DriverActivities(Type type1, Money money, Integer integer, Integer integer1, String s, String s1)
    {
        type = type1;
        amountEarned = money;
        rideCount = integer;
        timeDrivenSeconds = integer1;
        title = s;
        subtitle = s1;
    }

    public static DriverActivities empty()
    {
        return NullDriverActivities.instance;
    }

    public static DriverActivities fromDTO(DriverActivitiesDTO driveractivitiesdto)
    {
        if (driveractivitiesdto == null)
        {
            return empty();
        } else
        {
            return new DriverActivities(getType(driveractivitiesdto.type), (Money)Objects.firstNonNull(MoneyMapper.fromMoneyDTO(driveractivitiesdto.amountEarned), empty().getAmountEarned()), (Integer)Objects.firstNonNull(driveractivitiesdto.rideCount, empty().getRideCount()), (Integer)Objects.firstNonNull(driveractivitiesdto.timeDrivenSeconds, empty().getTimeDrivenSeconds()), Strings.nullOrEmptyToDefault(driveractivitiesdto.title, empty().getTitle()), Strings.nullOrEmptyToDefault(driveractivitiesdto.subtitle, empty().getSubtitle()));
        }
    }

    private static Type getType(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 32
    //                   -791707519: 74
    //                   95346201: 60;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_74;
_L4:
        switch (byte0)
        {
        default:
            return Type.NONE;

        case 0: // '\0'
            return Type.DAILY;

        case 1: // '\001'
            return Type.WEEKLY;
        }
_L3:
        if (s.equals("daily"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("weekly"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public Money getAmountEarned()
    {
        return amountEarned;
    }

    public Integer getRideCount()
    {
        return rideCount;
    }

    public String getSubtitle()
    {
        return subtitle;
    }

    public Integer getTimeDrivenSeconds()
    {
        return timeDrivenSeconds;
    }

    public String getTitle()
    {
        return title;
    }

    public Type getType()
    {
        return type;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullDriverActivities extends DriverActivities
    {
        private class Type extends Enum
        {

            private static final Type $VALUES[];
            public static final Type DAILY;
            public static final Type NONE;
            public static final Type WEEKLY;

            public static Type valueOf(String s)
            {
                return (Type)Enum.valueOf(me/lyft/android/domain/driver/DriverActivities$Type, s);
            }

            public static Type[] values()
            {
                return (Type[])$VALUES.clone();
            }

            static 
            {
                DAILY = new Type("DAILY", 0);
                WEEKLY = new Type("WEEKLY", 1);
                NONE = new Type("NONE", 2);
                $VALUES = (new Type[] {
                    DAILY, WEEKLY, NONE
                });
            }

            private Type(String s, int i)
            {
                super(s, i);
            }
        }


        private static final DriverActivities instance = new NullDriverActivities();

        public boolean isNull()
        {
            return true;
        }



        private NullDriverActivities()
        {
            super(Type.NONE, NullMoney.getInstance(), Integer.valueOf(0), Integer.valueOf(0), "", "");
        }
    }

}
