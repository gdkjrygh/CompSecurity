// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.fitness.data:
//            j

public final class Field
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    public static final Field FIELD_ACCURACY = bs("accuracy");
    public static final Field FIELD_ACTIVITY = br("activity");
    public static final Field FIELD_ALTITUDE = bs("altitude");
    public static final Field FIELD_AVERAGE = bs("average");
    public static final Field FIELD_BPM = bs("bpm");
    public static final Field FIELD_CALORIES = bs("calories");
    public static final Field FIELD_CONFIDENCE = bs("confidence");
    public static final Field FIELD_DISTANCE = bs("distance");
    public static final Field FIELD_DURATION = br("duration");
    public static final Field FIELD_HEIGHT = bs("height");
    public static final Field FIELD_HIGH_LATITUDE = bs("high_latitude");
    public static final Field FIELD_HIGH_LONGITUDE = bs("high_longitude");
    public static final Field FIELD_LATITUDE = bs("latitude");
    public static final Field FIELD_LONGITUDE = bs("longitude");
    public static final Field FIELD_LOW_LATITUDE = bs("low_latitude");
    public static final Field FIELD_LOW_LONGITUDE = bs("low_longitude");
    public static final Field FIELD_MAX = bs("max");
    public static final Field FIELD_MIN = bs("min");
    public static final Field FIELD_NUM_SEGMENTS = br("num_segments");
    public static final Field FIELD_REVOLUTIONS = br("revolutions");
    public static final Field FIELD_RPM = bs("rpm");
    public static final Field FIELD_SPEED = bs("speed");
    public static final Field FIELD_STEPS = br("steps");
    public static final Field FIELD_WATTS = bs("watts");
    public static final Field FIELD_WEIGHT = bs("weight");
    public static final int FORMAT_FLOAT = 2;
    public static final int FORMAT_INT32 = 1;
    public static final Field Td = br("edge_type");
    public static final Field Te = bs("x");
    public static final Field Tf = bs("y");
    public static final Field Tg = bs("z");
    private final int BR;
    private final int Th;
    private final String mName;

    Field(int i, String s, int k)
    {
        BR = i;
        mName = s;
        Th = k;
    }

    public Field(String s, int i)
    {
        this(1, s, i);
    }

    private boolean a(Field field)
    {
        return mName.equals(field.mName) && Th == field.Th;
    }

    private static Field br(String s)
    {
        return new Field(s, 1);
    }

    private static Field bs(String s)
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
        return Th;
    }

    public String getName()
    {
        return mName;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return mName.hashCode();
    }

    public String toString()
    {
        String s1 = mName;
        String s;
        if (Th == 1)
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
