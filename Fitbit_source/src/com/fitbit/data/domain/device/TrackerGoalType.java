// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.fitbit.util.al;

public final class TrackerGoalType extends Enum
{

    private static final TrackerGoalType $VALUES[];
    public static final TrackerGoalType ACTIVE_MINUTES;
    public static final TrackerGoalType CALORIES;
    public static final TrackerGoalType DISTANCE;
    public static final TrackerGoalType FLOORS;
    public static final TrackerGoalType STEPS;
    private static final String TAG = "TrackerGoalType";
    public static final TrackerGoalType UNKNOWN;
    private final int goalIconIds[];
    private final String name;
    private final int nameResId;
    private final int unitPluralsResId;
    private final int unitResId;

    private TrackerGoalType(String s, int i, String s1, int j, int k, int l, int ai[])
    {
        super(s, i);
        name = s1;
        nameResId = j;
        unitResId = k;
        unitPluralsResId = l;
        goalIconIds = ai;
    }

    public static TrackerGoalType parse(String s)
    {
        TrackerGoalType atrackergoaltype[] = values();
        for (int i = 0; i < atrackergoaltype.length; i++)
        {
            TrackerGoalType trackergoaltype = atrackergoaltype[i];
            if (trackergoaltype.name.equalsIgnoreCase(s))
            {
                return trackergoaltype;
            }
        }

        return UNKNOWN;
    }

    public static TrackerGoalType safeRestoreFromString(String s)
    {
        TrackerGoalType trackergoaltype = UNKNOWN;
        TrackerGoalType trackergoaltype1 = valueOf(s);
        trackergoaltype = trackergoaltype1;
_L2:
        TrackerGoalType trackergoaltype2 = trackergoaltype;
        if (UNKNOWN == trackergoaltype)
        {
            trackergoaltype2 = parse(s);
        }
        return trackergoaltype2;
        Exception exception;
        exception;
        a.a("TrackerGoalType", "Probably migration issue: %s", new Object[] {
            a.a(exception)
        });
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static TrackerGoalType valueOf(String s)
    {
        return (TrackerGoalType)Enum.valueOf(com/fitbit/data/domain/device/TrackerGoalType, s);
    }

    public static TrackerGoalType[] values()
    {
        return (TrackerGoalType[])$VALUES.clone();
    }

    public String getGoalUnit(Context context, String s)
    {
        Object obj = null;
        com.a.a.a.a a1 = FitBitApplication.a().e();
        String s1 = obj;
        if (a1 != null)
        {
            s1 = obj;
            try
            {
                if (unitPluralsResId != 0)
                {
                    s1 = a1.a(unitPluralsResId, s, al.j());
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s1 = obj;
            }
        }
        if (s1 != null)
        {
            return s1;
        } else
        {
            return context.getString(unitResId);
        }
    }

    public Bitmap getIcon(Context context, int i)
    {
        if (i >= 0 && i < goalIconIds.length)
        {
            return BitmapFactory.decodeResource(context.getResources(), goalIconIds[i]);
        } else
        {
            return null;
        }
    }

    public String getLocalizedName()
    {
        if (nameResId > 0)
        {
            return FitBitApplication.a().getString(nameResId);
        } else
        {
            return "";
        }
    }

    public String getName()
    {
        return name;
    }

    static 
    {
        STEPS = new TrackerGoalType("STEPS", 0, "steps", 0x7f080555, 0x7f08056c, 0x7f0b001d, new int[] {
            0x7f020379, 0x7f02037a, 0x7f020378, 0x7f020375
        });
        DISTANCE = new TrackerGoalType("DISTANCE", 1, "distance", 0x7f080553, 0x7f080162, 0, new int[] {
            0x7f0201a6, 0x7f0201a7, 0x7f0201a5, 0x7f0201a2
        });
        CALORIES = new TrackerGoalType("CALORIES", 2, "calories", 0x7f080552, 0x7f0802be, 0x7f0b0003, new int[] {
            0x7f020110, 0x7f020111, 0x7f02010f, 0x7f020108
        });
        ACTIVE_MINUTES = new TrackerGoalType("ACTIVE_MINUTES", 3, "activeMinutes", 0x7f080551, 0x7f08056a, 0x7f0b001e, new int[] {
            0x7f020040, 0x7f020041, 0x7f02003f, 0x7f02003d
        });
        FLOORS = new TrackerGoalType("FLOORS", 4, "floors", 0x7f080554, 0x7f08056b, 0x7f0b000b, new int[] {
            0x7f0201e9, 0x7f0201ea, 0x7f0201e8, 0x7f0201e5
        });
        UNKNOWN = new TrackerGoalType("UNKNOWN", 5, "", 0, 0, 0, new int[] {
            0, 0, 0, 0
        });
        $VALUES = (new TrackerGoalType[] {
            STEPS, DISTANCE, CALORIES, ACTIVE_MINUTES, FLOORS, UNKNOWN
        });
    }
}
