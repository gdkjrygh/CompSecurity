// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.location:
//            b, c

public class DetectedActivity
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    public static final Comparator a = new b();
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
        if (j > 9)
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

    public String toString()
    {
        return (new StringBuilder("DetectedActivity [type=")).append(a()).append(", confidence=").append(c).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.c.a(this, parcel);
    }

}
