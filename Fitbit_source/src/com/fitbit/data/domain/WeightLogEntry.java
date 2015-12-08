// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.content.res.Resources;
import com.fitbit.FitBitApplication;
import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.util.o;
import com.fitbit.weight.Weight;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            TrackedValue, Measurable, m, s

public class WeightLogEntry extends TrackedValue
    implements b
{
    public static final class WeightUnits extends Enum
        implements m, s
    {

        private static final WeightUnits $VALUES[];
        public static final WeightUnits GRAMS;
        public static final WeightUnits KG;
        public static final WeightUnits LBS;
        public static final WeightUnits STONE;
        private final WeightUnits child;
        private final int childrenCount;
        private final String measurementSystem;
        private final int resId;
        private final String serializableName;
        private final int shortNameResId;
        private final String unlocalizedName;

        public static WeightUnits valueOf(String s1)
        {
            return (WeightUnits)Enum.valueOf(com/fitbit/data/domain/WeightLogEntry$WeightUnits, s1);
        }

        public static WeightUnits[] values()
        {
            return (WeightUnits[])$VALUES.clone();
        }

        public WeightUnits getChild()
        {
            return child;
        }

        public int getChildrenCount()
        {
            return childrenCount;
        }

        public String getDisplayName()
        {
            return FitBitApplication.a().getResources().getString(resId);
        }

        public String getMeasurementSystem()
        {
            return measurementSystem;
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        public String getShortDisplayName()
        {
            return FitBitApplication.a().getResources().getString(shortNameResId);
        }

        public boolean hasChild()
        {
            return child != null;
        }

        public String toString()
        {
            return unlocalizedName;
        }

        static 
        {
            LBS = new WeightUnits("LBS", 0, 0x7f08038b, 0x7f08038b, "lbs", null, -1, "en_US", "lbs");
            STONE = new WeightUnits("STONE", 1, 0x7f0804f6, 0x7f0804f7, "stone", LBS, 14, "en_GB", "stone");
            KG = new WeightUnits("KG", 2, 0x7f08029f, 0x7f08029f, "kg", null, -1, "METRIC", "kg");
            GRAMS = new WeightUnits("GRAMS", 3, 0x7f08023f, 0x7f080240, "GRAM", null, -1, "METRIC", "grams");
            $VALUES = (new WeightUnits[] {
                LBS, STONE, KG, GRAMS
            });
        }

        private WeightUnits(String s1, int i, int j, int k, String s2, WeightUnits weightunits, int l, 
                String s3, String s4)
        {
            super(s1, i);
            resId = j;
            serializableName = s2;
            shortNameResId = k;
            child = weightunits;
            childrenCount = l;
            measurementSystem = s3;
            unlocalizedName = s4;
        }
    }


    private static final String a = "WEIGHT";
    private double bmi;
    private Weight weight;

    public WeightLogEntry()
    {
    }

    public Weight a()
    {
        return weight;
    }

    public void a(double d1)
    {
        bmi = d1;
    }

    public volatile void a(Measurable measurable)
    {
        a((Weight)measurable);
    }

    public void a(Weight weight1)
    {
        weight = weight1;
    }

    public void a(JSONObject jsonobject, WeightUnits weightunits)
        throws JSONException
    {
        a(new Weight(com.fitbit.d.a.a(jsonobject, "weight", 0.0D), weightunits));
        setServerId(com.fitbit.d.a.b(jsonobject, "logId", -1));
        a(com.fitbit.d.a.a(jsonobject, "bmi", 0.0D));
        if (jsonobject.has("time"))
        {
            jsonobject.put("date-with-time", (new StringBuilder()).append(jsonobject.get("date")).append(" ").append(jsonobject.getString("time")).toString());
            setLogDate(com.fitbit.d.a.f(jsonobject, "date-with-time"));
        } else
        {
            setLogDate(com.fitbit.d.a.e(jsonobject, "date"));
        }
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public double b()
    {
        return bmi;
    }

    public String c()
    {
        return "WEIGHT";
    }

    public Measurable d()
    {
        return a();
    }

    public boolean e()
    {
        return o.l(getLogDate());
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a(jsonobject, WeightUnits.KG);
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" bmi: ").append(b()).toString();
    }
}
