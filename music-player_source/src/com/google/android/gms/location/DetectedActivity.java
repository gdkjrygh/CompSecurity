// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            c

public class DetectedActivity
    implements SafeParcelable
{

    public static final c a = new c();
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
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("DetectedActivity [type=");
        int j = b;
        int i = j;
        if (j > 6)
        {
            i = 4;
        }
        return stringbuilder.append(i).append(", confidence=").append(c).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.c.a(this, parcel);
    }

}
