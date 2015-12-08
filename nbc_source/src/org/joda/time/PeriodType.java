// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.field.FieldUtils;

// Referenced classes of package org.joda.time:
//            DurationFieldType, ReadablePeriod

public class PeriodType
    implements Serializable
{

    static int DAY_INDEX = 0;
    static int HOUR_INDEX = 0;
    static int MILLI_INDEX = 0;
    static int MINUTE_INDEX = 0;
    static int MONTH_INDEX = 0;
    static int SECOND_INDEX = 0;
    static int WEEK_INDEX = 0;
    static int YEAR_INDEX = 0;
    private static PeriodType cDTime;
    private static PeriodType cDays;
    private static PeriodType cHours;
    private static PeriodType cMillis;
    private static PeriodType cMinutes;
    private static PeriodType cMonths;
    private static PeriodType cSeconds;
    private static PeriodType cStandard;
    private static PeriodType cTime;
    private static final Map cTypes = new HashMap(32);
    private static PeriodType cWeeks;
    private static PeriodType cYD;
    private static PeriodType cYDTime;
    private static PeriodType cYMD;
    private static PeriodType cYMDTime;
    private static PeriodType cYWD;
    private static PeriodType cYWDTime;
    private static PeriodType cYears;
    private static final long serialVersionUID = 0x1f900670aab2350eL;
    private final int iIndices[];
    private final String iName;
    private final DurationFieldType iTypes[];

    protected PeriodType(String s, DurationFieldType adurationfieldtype[], int ai[])
    {
        iName = s;
        iTypes = adurationfieldtype;
        iIndices = ai;
    }

    public static PeriodType dayTime()
    {
        PeriodType periodtype1 = cDTime;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("DayTime", new DurationFieldType[] {
                DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()
            }, new int[] {
                -1, -1, -1, 0, 1, 2, 3, 4
            });
            cDTime = periodtype;
        }
        return periodtype;
    }

    public static PeriodType days()
    {
        PeriodType periodtype1 = cDays;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("Days", new DurationFieldType[] {
                DurationFieldType.days()
            }, new int[] {
                -1, -1, -1, 0, -1, -1, -1, -1
            });
            cDays = periodtype;
        }
        return periodtype;
    }

    public static PeriodType forFields(DurationFieldType adurationfieldtype[])
    {
        org/joda/time/PeriodType;
        JVM INSTR monitorenter ;
        if (adurationfieldtype == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        if (adurationfieldtype.length != 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        throw new IllegalArgumentException("Types array must not be null or empty");
        adurationfieldtype;
        org/joda/time/PeriodType;
        JVM INSTR monitorexit ;
        throw adurationfieldtype;
        int i = 0;
_L9:
        if (i >= adurationfieldtype.length) goto _L2; else goto _L1
_L1:
        if (adurationfieldtype[i] != null) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException("Types array must not contain null");
_L2:
        Object obj;
        Map map;
        PeriodType periodtype;
        map = cTypes;
        if (map.isEmpty())
        {
            map.put(standard(), standard());
            map.put(yearMonthDayTime(), yearMonthDayTime());
            map.put(yearMonthDay(), yearMonthDay());
            map.put(yearWeekDayTime(), yearWeekDayTime());
            map.put(yearWeekDay(), yearWeekDay());
            map.put(yearDayTime(), yearDayTime());
            map.put(yearDay(), yearDay());
            map.put(dayTime(), dayTime());
            map.put(time(), time());
            map.put(years(), years());
            map.put(months(), months());
            map.put(weeks(), weeks());
            map.put(days(), days());
            map.put(hours(), hours());
            map.put(minutes(), minutes());
            map.put(seconds(), seconds());
            map.put(millis(), millis());
        }
        periodtype = new PeriodType(null, adurationfieldtype, null);
        obj = map.get(periodtype);
        if (!(obj instanceof PeriodType)) goto _L6; else goto _L5
_L5:
        adurationfieldtype = (PeriodType)obj;
_L7:
        org/joda/time/PeriodType;
        JVM INSTR monitorexit ;
        return adurationfieldtype;
_L6:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        throw new IllegalArgumentException((new StringBuilder()).append("PeriodType does not support fields: ").append(obj).toString());
        ArrayList arraylist;
        obj = standard();
        arraylist = new ArrayList(Arrays.asList(adurationfieldtype));
        adurationfieldtype = ((DurationFieldType []) (obj));
        if (!arraylist.remove(DurationFieldType.years()))
        {
            adurationfieldtype = ((PeriodType) (obj)).withYearsRemoved();
        }
        obj = adurationfieldtype;
        if (!arraylist.remove(DurationFieldType.months()))
        {
            obj = adurationfieldtype.withMonthsRemoved();
        }
        adurationfieldtype = ((DurationFieldType []) (obj));
        if (!arraylist.remove(DurationFieldType.weeks()))
        {
            adurationfieldtype = ((PeriodType) (obj)).withWeeksRemoved();
        }
        obj = adurationfieldtype;
        if (!arraylist.remove(DurationFieldType.days()))
        {
            obj = adurationfieldtype.withDaysRemoved();
        }
        adurationfieldtype = ((DurationFieldType []) (obj));
        if (!arraylist.remove(DurationFieldType.hours()))
        {
            adurationfieldtype = ((PeriodType) (obj)).withHoursRemoved();
        }
        obj = adurationfieldtype;
        if (!arraylist.remove(DurationFieldType.minutes()))
        {
            obj = adurationfieldtype.withMinutesRemoved();
        }
        Object obj1 = obj;
        if (!arraylist.remove(DurationFieldType.seconds()))
        {
            obj1 = ((PeriodType) (obj)).withSecondsRemoved();
        }
        adurationfieldtype = ((DurationFieldType []) (obj1));
        if (!arraylist.remove(DurationFieldType.millis()))
        {
            adurationfieldtype = ((PeriodType) (obj1)).withMillisRemoved();
        }
        if (arraylist.size() > 0)
        {
            map.put(periodtype, arraylist);
            throw new IllegalArgumentException((new StringBuilder()).append("PeriodType does not support fields: ").append(arraylist).toString());
        }
        obj1 = new PeriodType(null, ((PeriodType) (adurationfieldtype)).iTypes, null);
        obj = (PeriodType)map.get(obj1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_627;
        }
        map.put(obj1, obj);
        adurationfieldtype = ((DurationFieldType []) (obj));
        continue; /* Loop/switch isn't completed */
        map.put(obj1, adurationfieldtype);
        if (true) goto _L7; else goto _L4
_L4:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static PeriodType hours()
    {
        PeriodType periodtype1 = cHours;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("Hours", new DurationFieldType[] {
                DurationFieldType.hours()
            }, new int[] {
                -1, -1, -1, -1, 0, -1, -1, -1
            });
            cHours = periodtype;
        }
        return periodtype;
    }

    public static PeriodType millis()
    {
        PeriodType periodtype1 = cMillis;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("Millis", new DurationFieldType[] {
                DurationFieldType.millis()
            }, new int[] {
                -1, -1, -1, -1, -1, -1, -1, 0
            });
            cMillis = periodtype;
        }
        return periodtype;
    }

    public static PeriodType minutes()
    {
        PeriodType periodtype1 = cMinutes;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("Minutes", new DurationFieldType[] {
                DurationFieldType.minutes()
            }, new int[] {
                -1, -1, -1, -1, -1, 0, -1, -1
            });
            cMinutes = periodtype;
        }
        return periodtype;
    }

    public static PeriodType months()
    {
        PeriodType periodtype1 = cMonths;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("Months", new DurationFieldType[] {
                DurationFieldType.months()
            }, new int[] {
                -1, 0, -1, -1, -1, -1, -1, -1
            });
            cMonths = periodtype;
        }
        return periodtype;
    }

    public static PeriodType seconds()
    {
        PeriodType periodtype1 = cSeconds;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("Seconds", new DurationFieldType[] {
                DurationFieldType.seconds()
            }, new int[] {
                -1, -1, -1, -1, -1, -1, 0, -1
            });
            cSeconds = periodtype;
        }
        return periodtype;
    }

    public static PeriodType standard()
    {
        PeriodType periodtype1 = cStandard;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("Standard", new DurationFieldType[] {
                DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()
            }, new int[] {
                0, 1, 2, 3, 4, 5, 6, 7
            });
            cStandard = periodtype;
        }
        return periodtype;
    }

    public static PeriodType time()
    {
        PeriodType periodtype1 = cTime;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("Time", new DurationFieldType[] {
                DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()
            }, new int[] {
                -1, -1, -1, -1, 0, 1, 2, 3
            });
            cTime = periodtype;
        }
        return periodtype;
    }

    public static PeriodType weeks()
    {
        PeriodType periodtype1 = cWeeks;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("Weeks", new DurationFieldType[] {
                DurationFieldType.weeks()
            }, new int[] {
                -1, -1, 0, -1, -1, -1, -1, -1
            });
            cWeeks = periodtype;
        }
        return periodtype;
    }

    private PeriodType withFieldRemoved(int i, String s)
    {
        boolean flag = false;
        int l = iIndices[i];
        if (l == -1)
        {
            return this;
        }
        DurationFieldType adurationfieldtype[] = new DurationFieldType[size() - 1];
        int j = 0;
        while (j < iTypes.length) 
        {
            if (j < l)
            {
                adurationfieldtype[j] = iTypes[j];
            } else
            if (j > l)
            {
                adurationfieldtype[j - 1] = iTypes[j];
            }
            j++;
        }
        int ai[] = new int[8];
        j = ((flag) ? 1 : 0);
        while (j < ai.length) 
        {
            if (j < i)
            {
                ai[j] = iIndices[j];
            } else
            if (j > i)
            {
                int k;
                if (iIndices[j] == -1)
                {
                    k = -1;
                } else
                {
                    k = iIndices[j] - 1;
                }
                ai[j] = k;
            } else
            {
                ai[j] = -1;
            }
            j++;
        }
        return new PeriodType((new StringBuilder()).append(getName()).append(s).toString(), adurationfieldtype, ai);
    }

    public static PeriodType yearDay()
    {
        PeriodType periodtype1 = cYD;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("YearDay", new DurationFieldType[] {
                DurationFieldType.years(), DurationFieldType.days()
            }, new int[] {
                0, -1, -1, 1, -1, -1, -1, -1
            });
            cYD = periodtype;
        }
        return periodtype;
    }

    public static PeriodType yearDayTime()
    {
        PeriodType periodtype1 = cYDTime;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("YearDayTime", new DurationFieldType[] {
                DurationFieldType.years(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()
            }, new int[] {
                0, -1, -1, 1, 2, 3, 4, 5
            });
            cYDTime = periodtype;
        }
        return periodtype;
    }

    public static PeriodType yearMonthDay()
    {
        PeriodType periodtype1 = cYMD;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("YearMonthDay", new DurationFieldType[] {
                DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.days()
            }, new int[] {
                0, 1, -1, 2, -1, -1, -1, -1
            });
            cYMD = periodtype;
        }
        return periodtype;
    }

    public static PeriodType yearMonthDayTime()
    {
        PeriodType periodtype1 = cYMDTime;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("YearMonthDayTime", new DurationFieldType[] {
                DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()
            }, new int[] {
                0, 1, -1, 2, 3, 4, 5, 6
            });
            cYMDTime = periodtype;
        }
        return periodtype;
    }

    public static PeriodType yearWeekDay()
    {
        PeriodType periodtype1 = cYWD;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("YearWeekDay", new DurationFieldType[] {
                DurationFieldType.years(), DurationFieldType.weeks(), DurationFieldType.days()
            }, new int[] {
                0, -1, 1, 2, -1, -1, -1, -1
            });
            cYWD = periodtype;
        }
        return periodtype;
    }

    public static PeriodType yearWeekDayTime()
    {
        PeriodType periodtype1 = cYWDTime;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("YearWeekDayTime", new DurationFieldType[] {
                DurationFieldType.years(), DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()
            }, new int[] {
                0, -1, 1, 2, 3, 4, 5, 6
            });
            cYWDTime = periodtype;
        }
        return periodtype;
    }

    public static PeriodType years()
    {
        PeriodType periodtype1 = cYears;
        PeriodType periodtype = periodtype1;
        if (periodtype1 == null)
        {
            periodtype = new PeriodType("Years", new DurationFieldType[] {
                DurationFieldType.years()
            }, new int[] {
                0, -1, -1, -1, -1, -1, -1, -1
            });
            cYears = periodtype;
        }
        return periodtype;
    }

    boolean addIndexedField(ReadablePeriod readableperiod, int i, int ai[], int j)
    {
        if (j == 0)
        {
            return false;
        }
        i = iIndices[i];
        if (i == -1)
        {
            throw new UnsupportedOperationException("Field is not supported");
        } else
        {
            ai[i] = FieldUtils.safeAdd(ai[i], j);
            return true;
        }
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof PeriodType))
        {
            return false;
        } else
        {
            obj = (PeriodType)obj;
            return Arrays.equals(iTypes, ((PeriodType) (obj)).iTypes);
        }
    }

    public DurationFieldType getFieldType(int i)
    {
        return iTypes[i];
    }

    int getIndexedField(ReadablePeriod readableperiod, int i)
    {
        i = iIndices[i];
        if (i == -1)
        {
            return 0;
        } else
        {
            return readableperiod.getValue(i);
        }
    }

    public String getName()
    {
        return iName;
    }

    public int hashCode()
    {
        int i = 0;
        int j = 0;
        for (; i < iTypes.length; i++)
        {
            j += iTypes[i].hashCode();
        }

        return j;
    }

    public int indexOf(DurationFieldType durationfieldtype)
    {
        int i = 0;
        for (int j = size(); i < j; i++)
        {
            if (iTypes[i] == durationfieldtype)
            {
                return i;
            }
        }

        return -1;
    }

    public boolean isSupported(DurationFieldType durationfieldtype)
    {
        return indexOf(durationfieldtype) >= 0;
    }

    boolean setIndexedField(ReadablePeriod readableperiod, int i, int ai[], int j)
    {
        i = iIndices[i];
        if (i == -1)
        {
            throw new UnsupportedOperationException("Field is not supported");
        } else
        {
            ai[i] = j;
            return true;
        }
    }

    public int size()
    {
        return iTypes.length;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PeriodType[").append(getName()).append("]").toString();
    }

    public PeriodType withDaysRemoved()
    {
        return withFieldRemoved(3, "NoDays");
    }

    public PeriodType withHoursRemoved()
    {
        return withFieldRemoved(4, "NoHours");
    }

    public PeriodType withMillisRemoved()
    {
        return withFieldRemoved(7, "NoMillis");
    }

    public PeriodType withMinutesRemoved()
    {
        return withFieldRemoved(5, "NoMinutes");
    }

    public PeriodType withMonthsRemoved()
    {
        return withFieldRemoved(1, "NoMonths");
    }

    public PeriodType withSecondsRemoved()
    {
        return withFieldRemoved(6, "NoSeconds");
    }

    public PeriodType withWeeksRemoved()
    {
        return withFieldRemoved(2, "NoWeeks");
    }

    public PeriodType withYearsRemoved()
    {
        return withFieldRemoved(0, "NoYears");
    }

    static 
    {
        YEAR_INDEX = 0;
        MONTH_INDEX = 1;
        WEEK_INDEX = 2;
        DAY_INDEX = 3;
        HOUR_INDEX = 4;
        MINUTE_INDEX = 5;
        SECOND_INDEX = 6;
        MILLI_INDEX = 7;
    }
}
