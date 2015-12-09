// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.content.res.Resources;
import android.os.Parcel;
import android.util.Pair;
import com.a.a.a.a;
import com.fitbit.FitBitApplication;
import com.fitbit.util.al;

// Referenced classes of package com.fitbit.data.domain:
//            Measurable, m, q, s

public class Length extends Measurable
{
    public static final class LengthUnits extends Enum
        implements m, q, s
    {

        private static final LengthUnits $VALUES[];
        public static final LengthUnits CM;
        public static final LengthUnits FEET;
        public static final LengthUnits INCH;
        public static final LengthUnits KM;
        public static final LengthUnits METERS;
        public static final LengthUnits MILES;
        public static final LengthUnits MM;
        private final double cmInUnit;
        private final int quantityNameResId;
        private final int resId;
        private final String serializableName;
        private final int shortNameResId;

        public static LengthUnits valueOf(String s1)
        {
            return (LengthUnits)Enum.valueOf(com/fitbit/data/domain/Length$LengthUnits, s1);
        }

        public static LengthUnits[] values()
        {
            return (LengthUnits[])$VALUES.clone();
        }

        public double convert(double d, LengthUnits lengthunits)
        {
            return (lengthunits.cmInUnit * d) / cmInUnit;
        }

        public String getDisplayName()
        {
            return FitBitApplication.a().getResources().getString(resId);
        }

        public String getQuantityDisplayName(String s1)
        {
            Object obj = null;
            a a1 = FitBitApplication.a().e();
            String s2 = obj;
            if (a1 != null)
            {
                s2 = obj;
                try
                {
                    if (quantityNameResId != 0)
                    {
                        s2 = a1.a(quantityNameResId, s1, al.j());
                    }
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s2 = obj;
                }
            }
            if (quantityNameResId > 0 && s2 != null)
            {
                return s2;
            } else
            {
                return getShortDisplayName();
            }
        }

        public String getSerializableName()
        {
            return serializableName;
        }

        public String getShortDisplayName()
        {
            return FitBitApplication.a().getResources().getString(shortNameResId);
        }

        public String toString()
        {
            return getSerializableName();
        }

        static 
        {
            FEET = new LengthUnits("FEET", 0, 0x7f0801ba, 0x7f0801bb, 0, "feet", 30.479999953670397D);
            CM = new LengthUnits("CM", 1, 0x7f080104, 0x7f080104, 0, "cm", 1.0D);
            MM = new LengthUnits("MM", 2, 0x7f0803e8, 0x7f0803e8, 0, "mm", 0.10000000000000001D);
            INCH = new LengthUnits("INCH", 3, 0x7f080283, 0x7f080284, 0, "inch", 2.5400000025908001D);
            MILES = new LengthUnits("MILES", 4, 0x7f0803d3, 0x7f0803d5, 0x7f0b000d, "miles", 160934.39999999999D);
            KM = new LengthUnits("KM", 5, 0x7f0802a1, 0x7f0802a1, 0, "km", 100000D);
            METERS = new LengthUnits("METERS", 6, 0x7f0803d0, 0x7f0803d1, 0, "meters", 100D);
            $VALUES = (new LengthUnits[] {
                FEET, CM, MM, INCH, MILES, KM, METERS
            });
        }

        private LengthUnits(String s1, int i, int j, int k, int l, String s2, double d)
        {
            super(s1, i);
            cmInUnit = d;
            resId = j;
            shortNameResId = k;
            quantityNameResId = l;
            serializableName = s2;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Length a(Parcel parcel)
        {
            parcel = com.fitbit.data.domain.Measurable.a(parcel);
            return new Length(((Double)((Pair) (parcel)).first).doubleValue(), (LengthUnits)((Pair) (parcel)).second);
        }

        public Length[] a(int i)
        {
            return new Length[i];
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
    private static final long serialVersionUID = 0x41c69d44b295b759L;

    public Length()
    {
        this(0.0D, LengthUnits.CM);
    }

    public Length(double d, LengthUnits lengthunits)
    {
        a(d);
        b(lengthunits);
    }

    public Length a(LengthUnits lengthunits)
    {
        Length length = this;
        if (lengthunits != null)
        {
            length = this;
            if (lengthunits != a())
            {
                length = new Length(lengthunits.convert(b(), (LengthUnits)a()), lengthunits);
            }
        }
        return length;
    }

    public volatile Measurable a(Enum enum)
    {
        return a((LengthUnits)enum);
    }

}
