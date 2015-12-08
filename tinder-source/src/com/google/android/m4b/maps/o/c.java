// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.o:
//            e

public final class c
    implements com.google.android.m4b.maps.k.c
{

    public static final e CREATOR = new e();
    private static Comparator d = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (c)obj;
            obj1 = (c)obj1;
            int j = Integer.valueOf(((c) (obj1)).c).compareTo(Integer.valueOf(((c) (obj)).c));
            int i = j;
            if (j == 0)
            {
                i = Integer.valueOf(((c) (obj)).a()).compareTo(Integer.valueOf(((c) (obj1)).a()));
            }
            return i;
        }

    };
    final int a;
    int b;
    int c;

    public c(int i, int j, int k)
    {
        a = i;
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

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        int i = a();
        i;
        JVM INSTR tableswitch 0 8: default 56
    //                   0 110
    //                   1 116
    //                   2 122
    //                   3 128
    //                   4 134
    //                   5 140
    //                   6 56
    //                   7 146
    //                   8 152;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L1 _L8 _L9
_L1:
        String s = Integer.toString(i);
_L11:
        int j = c;
        return (new StringBuilder(String.valueOf(s).length() + 48)).append("DetectedActivity [type=").append(s).append(", confidence=").append(j).append("]").toString();
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

    public final void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel);
    }

}
