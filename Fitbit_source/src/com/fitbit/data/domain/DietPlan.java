// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.fitbit.util.e;
import com.fitbit.weight.Weight;
import java.io.Serializable;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, PendingPlan, s

public class DietPlan extends Entity
    implements Serializable
{
    public static final class IntensityLevel extends Enum
        implements s
    {

        private static final IntensityLevel $VALUES[];
        public static final IntensityLevel EASIER;
        public static final IntensityLevel HARDER;
        public static final IntensityLevel KINDA_HARD;
        public static final IntensityLevel MAINTENANCE;
        public static final IntensityLevel MEDIUM;
        private final String apiName;
        private final int nameResId;
        private final String serializableName;

        public static IntensityLevel parseByApiName(String s1)
        {
            IntensityLevel aintensitylevel[] = values();
            int j = aintensitylevel.length;
            for (int i = 0; i < j; i++)
            {
                IntensityLevel intensitylevel = aintensitylevel[i];
                if (intensitylevel.getApiName().equals(s1))
                {
                    return intensitylevel;
                }
            }

            return null;
        }

        public static IntensityLevel valueOf(String s1)
        {
            return (IntensityLevel)Enum.valueOf(com/fitbit/data/domain/DietPlan$IntensityLevel, s1);
        }

        public static IntensityLevel[] values()
        {
            return (IntensityLevel[])$VALUES.clone();
        }

        public String getApiName()
        {
            return apiName;
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        public String toString()
        {
            return FitBitApplication.a().getString(nameResId);
        }

        static 
        {
            MAINTENANCE = new IntensityLevel("MAINTENANCE", 0, 0x7f08028d, "Maintenance", "MAINTENANCE");
            EASIER = new IntensityLevel("EASIER", 1, 0x7f080287, "Low", "EASIER");
            MEDIUM = new IntensityLevel("MEDIUM", 2, 0x7f08028e, "Medium", "MEDIUM");
            KINDA_HARD = new IntensityLevel("KINDA_HARD", 3, 0x7f080289, "High", "KINDAHARD");
            HARDER = new IntensityLevel("HARDER", 4, 0x7f080288, "Extreme", "HARDER");
            $VALUES = (new IntensityLevel[] {
                MAINTENANCE, EASIER, MEDIUM, KINDA_HARD, HARDER
            });
        }

        private IntensityLevel(String s1, int i, int j, String s2, String s3)
        {
            super(s1, i);
            nameResId = j;
            serializableName = s2;
            apiName = s3;
        }
    }

    public static final class WeightObjective extends Enum
        implements s
    {

        private static final WeightObjective $VALUES[];
        public static final WeightObjective GAIN;
        public static final WeightObjective LOSE;
        public static final WeightObjective MAINTAIN;
        private final String serializableName;

        public static WeightObjective valueOf(String s1)
        {
            return (WeightObjective)Enum.valueOf(com/fitbit/data/domain/DietPlan$WeightObjective, s1);
        }

        public static WeightObjective[] values()
        {
            return (WeightObjective[])$VALUES.clone();
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        static 
        {
            LOSE = new WeightObjective("LOSE", 0, "LOSE");
            MAINTAIN = new WeightObjective("MAINTAIN", 1, "MAINTAIN");
            GAIN = new WeightObjective("GAIN", 2, "GAIN");
            $VALUES = (new WeightObjective[] {
                LOSE, MAINTAIN, GAIN
            });
        }

        private WeightObjective(String s1, int i, String s2)
        {
            super(s1, i);
            serializableName = s2;
        }
    }


    private static final long serialVersionUID = 0x7050ea24d9e20159L;
    private int caloriesDeficitPerDay;
    private Date estimatedDate;
    private boolean personalized;
    private IntensityLevel planIntensity;
    private Weight weightPerWeek;

    public DietPlan()
    {
    }

    public Weight a()
    {
        boolean flag = false;
        if (weightPerWeek.a() == null)
        {
            com.fitbit.e.a.a("Plan", "getWeightPerWeek: it happened again!", new Object[0]);
            f();
        }
        if (weightPerWeek.a() != null)
        {
            flag = true;
        }
        com.fitbit.util.e.a(flag);
        return weightPerWeek;
    }

    public void a(int i)
    {
        caloriesDeficitPerDay = i;
    }

    public void a(IntensityLevel intensitylevel)
    {
        planIntensity = intensitylevel;
    }

    public void a(Weight weight)
    {
        weightPerWeek = weight;
    }

    public void a(Date date)
    {
        estimatedDate = date;
    }

    public void a(JSONObject jsonobject)
        throws JSONException
    {
        setEntityStatus(Entity.EntityStatus.SYNCED);
        jsonobject = jsonobject.optJSONObject("foodPlan");
        if (jsonobject != null)
        {
            a(IntensityLevel.parseByApiName(jsonobject.getString("intensity")));
            a(com.fitbit.d.a.e(jsonobject, "estimatedDate"));
            a(jsonobject.getBoolean("personalized"));
            f();
        }
    }

    public void a(boolean flag)
    {
        personalized = flag;
    }

    public Date b()
    {
        return estimatedDate;
    }

    public int c()
    {
        return caloriesDeficitPerDay;
    }

    public IntensityLevel d()
    {
        return planIntensity;
    }

    public WeightObjective e()
    {
        if (planIntensity == IntensityLevel.MAINTENANCE)
        {
            return WeightObjective.MAINTAIN;
        } else
        {
            return WeightObjective.LOSE;
        }
    }

    public void f()
    {
        DietPlan dietplan = com.fitbit.data.domain.PendingPlan.a(planIntensity);
        a(dietplan.a());
        a(dietplan.c());
    }

    public boolean g()
    {
        return personalized;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" planIntensity: ").append(d());
        stringbuilder.append(" isPersonalized: ").append(g());
        return stringbuilder.toString();
    }
}
