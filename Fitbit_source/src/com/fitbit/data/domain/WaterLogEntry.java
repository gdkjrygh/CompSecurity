// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.FitBitApplication;
import com.fitbit.activity.ui.charts.views.d;
import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.util.al;
import com.fitbit.water.Water;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            TrackedValue, r, Measurable, g, 
//            m, q, s

public class WaterLogEntry extends TrackedValue
    implements Parcelable, d, b
{
    public static final class WaterUnits extends Enum
        implements g, m, q, s
    {

        private static final WaterUnits $VALUES[];
        public static final WaterUnits CUP;
        public static final WaterUnits ML;
        public static final WaterUnits OZ;
        private String fitbitName;
        private int pluralNameResId;
        private String serName;
        private int shortNameResId;
        private int userStringResId;

        public static WaterUnits parse(String s1)
        {
            WaterUnits awaterunits[] = values();
            int j = awaterunits.length;
            for (int i = 0; i < j; i++)
            {
                WaterUnits waterunits = awaterunits[i];
                if (s1.equalsIgnoreCase(waterunits.name()) || s1.equalsIgnoreCase(waterunits.getSerializableName()) || s1.equalsIgnoreCase(waterunits.getFitbitName()) || s1.equalsIgnoreCase(waterunits.getDisplayName()) || s1.equalsIgnoreCase(waterunits.getShortDisplayName()))
                {
                    return waterunits;
                }
            }

            return null;
        }

        public static WaterUnits valueOf(String s1)
        {
            return (WaterUnits)Enum.valueOf(com/fitbit/data/domain/WaterLogEntry$WaterUnits, s1);
        }

        public static WaterUnits[] values()
        {
            return (WaterUnits[])$VALUES.clone();
        }

        public String getDisplayName()
        {
            return FitBitApplication.a().getResources().getString(userStringResId);
        }

        public String getFitbitName()
        {
            return fitbitName;
        }

        public String getQuantityDisplayName(String s1)
        {
            String s2;
            Object obj;
            obj = null;
            s2 = obj;
            if (pluralNameResId == 0)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            com.a.a.a.a a1 = FitBitApplication.a().e();
            s2 = obj;
            if (a1 != null)
            {
                s2 = obj;
                try
                {
                    if (pluralNameResId != 0)
                    {
                        s2 = a1.a(pluralNameResId, s1, al.j());
                    }
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s2 = obj;
                }
            }
            if (s2 != null)
            {
                return s2;
            } else
            {
                return getDisplayName();
            }
        }

        public String getSerializableName()
        {
            return serName;
        }

        public String getShortDisplayName()
        {
            return FitBitApplication.a().getResources().getString(shortNameResId);
        }

        public String toString()
        {
            return fitbitName;
        }

        static 
        {
            OZ = new WaterUnits("OZ", 0, 0x7f080437, 0x7f080437, 0, "OZ", "fl oz");
            CUP = new WaterUnits("CUP", 1, 0x7f08011b, 0x7f08011b, 0x7f0b0008, "CUPS", "cup");
            ML = new WaterUnits("ML", 2, 0x7f0803e7, 0x7f0803e7, 0, "MILLILITER", "ml");
            $VALUES = (new WaterUnits[] {
                OZ, CUP, ML
            });
        }

        private WaterUnits(String s1, int i, int j, int k, int l, String s2, String s3)
        {
            super(s1, i);
            userStringResId = j;
            shortNameResId = k;
            pluralNameResId = l;
            serName = s2;
            fitbitName = s3;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public WaterLogEntry a(Parcel parcel)
        {
            return new WaterLogEntry(parcel);
        }

        public WaterLogEntry[] a(int i)
        {
            return new WaterLogEntry[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private static final String a = "WATER";
    private Water water;

    public WaterLogEntry()
    {
        water = new Water(0.0D, WaterUnits.CUP);
    }

    private WaterLogEntry(Parcel parcel)
    {
        setLogDate(new Date(parcel.readLong()));
        water = new Water(parcel.readDouble(), a(parcel.readString()));
        setEntityId(Long.valueOf(parcel.readLong()));
    }


    private WaterUnits a(String s)
    {
        if (s == WaterUnits.CUP.toString())
        {
            return WaterUnits.CUP;
        }
        if (s == WaterUnits.ML.toString())
        {
            return WaterUnits.ML;
        } else
        {
            return WaterUnits.OZ;
        }
    }

    public Date a()
    {
        return getLogDate();
    }

    public volatile void a(Measurable measurable)
    {
        a((Water)measurable);
    }

    public void a(Water water1)
    {
        water = water1;
    }

    public double b()
    {
        return e().a(r.e()).b();
    }

    public String c()
    {
        return "WATER";
    }

    public Measurable d()
    {
        return e();
    }

    public int describeContents()
    {
        return 0;
    }

    public Water e()
    {
        return water;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a(new Water(com.fitbit.d.a.a(jsonobject, "amount", 0.0D), WaterUnits.ML));
        setServerId(com.fitbit.d.a.b(jsonobject, "logId", -1));
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(getLogDate().getTime());
        parcel.writeDouble(water.b());
        parcel.writeString(((WaterUnits)water.a()).toString());
        parcel.writeLong(getEntityId().longValue());
    }

}
