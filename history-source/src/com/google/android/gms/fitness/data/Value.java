// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.fitness.data:
//            u

public final class Value
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new u();
    private final int CK;
    private final int UE;
    private boolean US;
    private float UT;

    Value(int i)
    {
        this(1, i, false, 0.0F);
    }

    Value(int i, int j, boolean flag, float f)
    {
        CK = i;
        UE = j;
        US = flag;
        UT = f;
    }

    private boolean a(Value value)
    {
        if (UE != value.UE || US != value.US) goto _L2; else goto _L1
_L1:
        UE;
        JVM INSTR tableswitch 1 2: default 48
    //                   1 62
    //                   2 75;
           goto _L3 _L4 _L5
_L3:
        if (UT != value.UT) goto _L7; else goto _L6
_L6:
        return true;
_L4:
        if (asInt() != value.asInt())
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (asFloat() != value.asFloat())
        {
            return false;
        }
        if (true) goto _L6; else goto _L7
_L7:
        return false;
_L2:
        return false;
    }

    public String asActivity()
    {
        String s;
        try
        {
            s = FitnessActivities.getName(asInt());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return "unknown";
        }
        return s;
    }

    public float asFloat()
    {
        boolean flag;
        if (UE == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Value is not in float format");
        return UT;
    }

    public int asInt()
    {
        boolean flag = true;
        if (UE != 1)
        {
            flag = false;
        }
        jx.a(flag, "Value is not in int format");
        return Float.floatToRawIntBits(UT);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Value) && a((Value)obj);
    }

    public int getFormat()
    {
        return UE;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Float.valueOf(UT), Integer.valueOf(UE), Boolean.valueOf(US)
        });
    }

    public boolean isSet()
    {
        return US;
    }

    float jL()
    {
        return UT;
    }

    public void setActivity(String s)
    {
        setInt(FitnessActivities.bs(s));
    }

    public void setFloat(float f)
    {
        boolean flag;
        if (UE == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        US = true;
        UT = f;
    }

    public void setInt(int i)
    {
        boolean flag;
        if (UE == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        US = true;
        UT = Float.intBitsToFloat(i);
    }

    public String toString()
    {
        if (!US)
        {
            return "unset";
        }
        switch (UE)
        {
        default:
            return "unknown";

        case 1: // '\001'
            return Integer.toString(asInt());

        case 2: // '\002'
            return Float.toString(asFloat());
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        u.a(this, parcel, i);
    }

}
