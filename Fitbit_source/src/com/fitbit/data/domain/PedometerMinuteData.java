// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            Entity

public class PedometerMinuteData extends Entity
{
    public static final class PedometerMinuteType extends Enum
    {

        private static final PedometerMinuteType $VALUES[];
        public static final PedometerMinuteType RUNNING;
        public static final PedometerMinuteType WALKING;
        private final int code;

        public static PedometerMinuteType valueOf(int i)
        {
            PedometerMinuteType apedometerminutetype[] = values();
            int k = apedometerminutetype.length;
            for (int j = 0; j < k; j++)
            {
                PedometerMinuteType pedometerminutetype = apedometerminutetype[j];
                if (pedometerminutetype.getCode() == i)
                {
                    return pedometerminutetype;
                }
            }

            throw new IllegalArgumentException();
        }

        public static PedometerMinuteType valueOf(String s)
        {
            return (PedometerMinuteType)Enum.valueOf(com/fitbit/data/domain/PedometerMinuteData$PedometerMinuteType, s);
        }

        public static PedometerMinuteType[] values()
        {
            return (PedometerMinuteType[])$VALUES.clone();
        }

        public int getCode()
        {
            return code;
        }

        static 
        {
            WALKING = new PedometerMinuteType("WALKING", 0, 0);
            RUNNING = new PedometerMinuteType("RUNNING", 1, 1);
            $VALUES = (new PedometerMinuteType[] {
                WALKING, RUNNING
            });
        }

        private PedometerMinuteType(String s, int i, int j)
        {
            super(s, i);
            code = j;
        }
    }


    private static final String a = "PedometerMinuteDataEntity";
    private double metsCount;
    private PedometerMinuteType minuteType;
    private int stepsCount;
    private long timeStampMilliSeconds;

    public PedometerMinuteData(long l, int i, double d1, PedometerMinuteType pedometerminutetype)
    {
        a(l);
        a(i);
        a(d1);
        a(pedometerminutetype);
    }

    public long a()
    {
        return timeStampMilliSeconds;
    }

    public void a(double d1)
    {
        metsCount = d1;
    }

    public void a(int i)
    {
        stepsCount = i;
    }

    public void a(long l)
    {
        timeStampMilliSeconds = l;
    }

    public void a(PedometerMinuteType pedometerminutetype)
    {
        minuteType = pedometerminutetype;
    }

    public int b()
    {
        return stepsCount;
    }

    public double c()
    {
        return metsCount;
    }

    public PedometerMinuteType d()
    {
        return minuteType;
    }

    public boolean equals(Object obj)
    {
        if (super.equals(obj) && obj != null && (obj instanceof PedometerMinuteData))
        {
            obj = (PedometerMinuteData)obj;
            if (timeStampMilliSeconds == ((PedometerMinuteData) (obj)).a())
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return (int)(timeStampMilliSeconds % 0x5265c00L);
    }
}
