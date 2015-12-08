// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.text.format.Time;
import com.fitbit.FitBitApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fitbit.data.domain:
//            a

public final class MealType extends Enum
    implements a
{

    private static final MealType $VALUES[];
    public static final MealType AFTERNOONSNACK;
    public static final MealType ALL;
    public static final MealType ANYTIME;
    public static final MealType BREAKFAST;
    public static final MealType DINNER;
    public static final MealType EVENING_SNACK;
    public static final MealType LUNCH;
    public static final MealType MORNINGSNACK;
    public static final MealType UNKNOWN;
    private final int code;
    private final String serverType;

    private MealType(String s, int i, int j, String s1)
    {
        super(s, i);
        code = j;
        serverType = s1;
    }

    public static MealType getByCode(int i)
    {
        MealType amealtype[] = values();
        int k = amealtype.length;
        for (int j = 0; j < k; j++)
        {
            MealType mealtype = amealtype[j];
            if (i == mealtype.code)
            {
                return mealtype;
            }
        }

        return null;
    }

    public static MealType getByServerType(String s, MealType mealtype)
    {
        MealType amealtype[] = values();
        int j = amealtype.length;
        int i = 0;
        do
        {
label0:
            {
                MealType mealtype1 = mealtype;
                if (i < j)
                {
                    mealtype1 = amealtype[i];
                    if (!mealtype1.getServerType().equals(s))
                    {
                        break label0;
                    }
                }
                return mealtype1;
            }
            i++;
        } while (true);
    }

    public static MealType getByTime(Time time)
    {
        int i = time.hour;
        if (i < 6)
        {
            return ANYTIME;
        }
        if (i < 10)
        {
            return BREAKFAST;
        }
        if (i < 12)
        {
            return MORNINGSNACK;
        }
        if (i < 14)
        {
            return LUNCH;
        }
        if (i < 16)
        {
            return AFTERNOONSNACK;
        }
        if (i < 18)
        {
            return DINNER;
        }
        if (i < 20)
        {
            return EVENING_SNACK;
        } else
        {
            return ANYTIME;
        }
    }

    public static MealType[] getReverseValues()
    {
        ArrayList arraylist = new ArrayList(Arrays.asList(values()));
        Collections.reverse(arraylist);
        return (MealType[])arraylist.toArray(new MealType[arraylist.size()]);
    }

    public static MealType valueOf(String s)
    {
        return (MealType)Enum.valueOf(com/fitbit/data/domain/MealType, s);
    }

    public static MealType[] values()
    {
        return (MealType[])$VALUES.clone();
    }

    public int getCode()
    {
        return code;
    }

    public String getServerType()
    {
        return serverType;
    }

    public String toString()
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[MealType.values().length];
                try
                {
                    a[MealType.BREAKFAST.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[MealType.MORNINGSNACK.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[MealType.LUNCH.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[MealType.AFTERNOONSNACK.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[MealType.DINNER.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[MealType.EVENING_SNACK.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[MealType.ANYTIME.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[ordinal()])
        {
        default:
            return super.toString();

        case 1: // '\001'
            return FitBitApplication.a().getString(0x7f08009d);

        case 2: // '\002'
            return FitBitApplication.a().getString(0x7f08040a);

        case 3: // '\003'
            return FitBitApplication.a().getString(0x7f0803b2);

        case 4: // '\004'
            return FitBitApplication.a().getString(0x7f080050);

        case 5: // '\005'
            return FitBitApplication.a().getString(0x7f08015f);

        case 6: // '\006'
            return FitBitApplication.a().getString(0x7f080195);

        case 7: // '\007'
            return FitBitApplication.a().getString(0x7f080058);
        }
    }

    static 
    {
        ALL = new MealType("ALL", 0, -1, "All");
        UNKNOWN = new MealType("UNKNOWN", 1, 0, "Unknown");
        BREAKFAST = new MealType("BREAKFAST", 2, 1, "Breakfast");
        MORNINGSNACK = new MealType("MORNINGSNACK", 3, 2, "Morning Snack");
        LUNCH = new MealType("LUNCH", 4, 3, "Lunch");
        AFTERNOONSNACK = new MealType("AFTERNOONSNACK", 5, 4, "Afternoon Snack");
        DINNER = new MealType("DINNER", 6, 5, "Dinner");
        EVENING_SNACK = new MealType("EVENING_SNACK", 7, 6, "Evening Snack");
        ANYTIME = new MealType("ANYTIME", 8, 7, "Anytime");
        $VALUES = (new MealType[] {
            ALL, UNKNOWN, BREAKFAST, MORNINGSNACK, LUNCH, AFTERNOONSNACK, DINNER, EVENING_SNACK, ANYTIME
        });
    }
}
