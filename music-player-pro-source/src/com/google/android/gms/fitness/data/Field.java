// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.fitness.data:
//            j

public final class Field
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    public static final Field FIELD_ACCURACY = bv("accuracy");
    public static final Field FIELD_ACTIVITY = bu("activity");
    public static final Field FIELD_ALTITUDE = bv("altitude");
    public static final Field FIELD_AVERAGE = bv("average");
    public static final Field FIELD_BPM = bv("bpm");
    public static final Field FIELD_CALORIES = bv("calories");
    public static final Field FIELD_CONFIDENCE = bv("confidence");
    public static final Field FIELD_DISTANCE = bv("distance");
    public static final Field FIELD_DURATION = bu("duration");
    public static final Field FIELD_HEIGHT = bv("height");
    public static final Field FIELD_HIGH_LATITUDE = bv("high_latitude");
    public static final Field FIELD_HIGH_LONGITUDE = bv("high_longitude");
    public static final Field FIELD_LATITUDE = bv("latitude");
    public static final Field FIELD_LONGITUDE = bv("longitude");
    public static final Field FIELD_LOW_LATITUDE = bv("low_latitude");
    public static final Field FIELD_LOW_LONGITUDE = bv("low_longitude");
    public static final Field FIELD_MAX = bv("max");
    public static final Field FIELD_MIN = bv("min");
    public static final Field FIELD_NUM_SEGMENTS = bu("num_segments");
    public static final Field FIELD_REVOLUTIONS = bu("revolutions");
    public static final Field FIELD_RPM = bv("rpm");
    public static final Field FIELD_SPEED = bv("speed");
    public static final Field FIELD_STEPS = bu("steps");
    public static final Field FIELD_WATTS = bv("watts");
    public static final Field FIELD_WEIGHT = bv("weight");
    public static final int FORMAT_FLOAT = 2;
    public static final int FORMAT_INT32 = 1;
    public static final Field UA = bu("edge_type");
    public static final Field UB = bv("x");
    public static final Field UC = bv("y");
    public static final Field UD = bv("z");
    private final int CK;
    private final int UE;
    private final String mName;

    Field(int i, String s, int k)
    {
        CK = i;
        mName = (String)jx.i(s);
        UE = k;
    }

    public Field(String s, int i)
    {
        this(1, s, i);
    }

    private boolean a(Field field)
    {
        return mName.equals(field.mName) && UE == field.UE;
    }

    private static Field bu(String s)
    {
        return new Field(s, 1);
    }

    private static Field bv(String s)
    {
        return new Field(s, 2);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Field) && a((Field)obj);
    }

    public int getFormat()
    {
        return UE;
    }

    public String getName()
    {
        return mName;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return mName.hashCode();
    }

    public String toString()
    {
        String s1 = mName;
        String s;
        if (UE == 1)
        {
            s = "i";
        } else
        {
            s = "f";
        }
        return String.format("%s(%s)", new Object[] {
            s1, s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
