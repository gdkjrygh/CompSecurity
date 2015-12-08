// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.fitness.data:
//            u

public final class Value
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new u();
    private final int BR;
    private final int Th;
    private boolean Tv;
    private float Tw;

    Value(int i)
    {
        this(1, i, false, 0.0F);
    }

    Value(int i, int j, boolean flag, float f)
    {
        BR = i;
        Th = j;
        Tv = flag;
        Tw = f;
    }

    private boolean a(Value value)
    {
        if (Th != value.Th || Tv != value.Tv) goto _L2; else goto _L1
_L1:
        Th;
        JVM INSTR tableswitch 1 2: default 48
    //                   1 62
    //                   2 75;
           goto _L3 _L4 _L5
_L3:
        if (Tw != value.Tw) goto _L7; else goto _L6
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

    public float asFloat()
    {
        boolean flag;
        if (Th == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Value is not in float format");
        return Tw;
    }

    public int asInt()
    {
        boolean flag = true;
        if (Th != 1)
        {
            flag = false;
        }
        o.a(flag, "Value is not in int format");
        return Float.floatToRawIntBits(Tw);
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
        return Th;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Float.valueOf(Tw), Integer.valueOf(Th), Boolean.valueOf(Tv)
        });
    }

    public boolean isSet()
    {
        return Tv;
    }

    float ja()
    {
        return Tw;
    }

    public void setFloat(float f)
    {
        boolean flag;
        if (Th == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        Tv = true;
        Tw = f;
    }

    public void setInt(int i)
    {
        boolean flag;
        if (Th == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        Tv = true;
        Tw = Float.intBitsToFloat(i);
    }

    public String toString()
    {
        if (!Tv)
        {
            return "unset";
        }
        switch (Th)
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
