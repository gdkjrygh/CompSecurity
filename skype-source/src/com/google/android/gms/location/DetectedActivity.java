// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.location:
//            b

public class DetectedActivity
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    public static final Comparator a = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (DetectedActivity)obj;
            obj1 = (DetectedActivity)obj1;
            int j = Integer.valueOf(((DetectedActivity) (obj1)).c).compareTo(Integer.valueOf(((DetectedActivity) (obj)).c));
            int i = j;
            if (j == 0)
            {
                i = Integer.valueOf(((DetectedActivity) (obj)).a()).compareTo(Integer.valueOf(((DetectedActivity) (obj1)).a()));
            }
            return i;
        }

    };
    int b;
    int c;
    private final int d;

    public DetectedActivity(int i, int j, int k)
    {
        d = i;
        b = j;
        c = k;
    }

    public final int a()
    {
        int j = b;
        int i = j;
        if (j > 15)
        {
            i = 4;
        }
        return i;
    }

    public final int b()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (DetectedActivity)obj;
            if (b != ((DetectedActivity) (obj)).b || c != ((DetectedActivity) (obj)).c)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder("DetectedActivity [type=");
        i = a();
        i;
        JVM INSTR tableswitch 0 8: default 68
    //                   0 99
    //                   1 105
    //                   2 111
    //                   3 117
    //                   4 123
    //                   5 129
    //                   6 68
    //                   7 135
    //                   8 141;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L1 _L8 _L9
_L1:
        String s = Integer.toString(i);
_L11:
        return stringbuilder.append(s).append(", confidence=").append(c).append("]").toString();
_L2:
        s = "IN_VEHICLE";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "ON_BICYCLE";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "ON_FOOT";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "STILL";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "UNKNOWN";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "TILTING";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "WALKING";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "RUNNING";
        if (true) goto _L11; else goto _L10
_L10:
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.b.a(this, parcel);
    }

}
