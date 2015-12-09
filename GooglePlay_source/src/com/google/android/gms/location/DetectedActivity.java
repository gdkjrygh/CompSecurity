// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.location:
//            DetectedActivityCreator

public class DetectedActivity
    implements SafeParcelable
{

    public static final DetectedActivityCreator CREATOR = new DetectedActivityCreator();
    public static final Comparator HIGHEST_CONFIDENCE_COMPARATOR = new Comparator() {

        public final volatile int compare(Object obj, Object obj1)
        {
            obj = (DetectedActivity)obj;
            obj1 = (DetectedActivity)obj1;
            int j = Integer.valueOf(((DetectedActivity) (obj1)).confidence).compareTo(Integer.valueOf(((DetectedActivity) (obj)).confidence));
            int i = j;
            if (j == 0)
            {
                i = Integer.valueOf(((DetectedActivity) (obj)).getType()).compareTo(Integer.valueOf(((DetectedActivity) (obj1)).getType()));
            }
            return i;
        }

    };
    int activityType;
    int confidence;
    final int mVersionCode;

    public DetectedActivity(int i, int j, int k)
    {
        mVersionCode = i;
        activityType = j;
        confidence = k;
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
            if (activityType != ((DetectedActivity) (obj)).activityType || confidence != ((DetectedActivity) (obj)).confidence)
            {
                return false;
            }
        }
        return true;
    }

    public final int getType()
    {
        int j = activityType;
        int i = j;
        if (j > 15)
        {
            i = 4;
        }
        return i;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(activityType), Integer.valueOf(confidence)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder("DetectedActivity [type=");
        i = getType();
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
        return stringbuilder.append(s).append(", confidence=").append(confidence).append("]").toString();
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
        DetectedActivityCreator.writeToParcel$120025c7(this, parcel);
    }

}
