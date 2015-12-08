// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzz

public class Point
    implements SafeParcelable
{

    public static final zzz CREATOR = new zzz();
    private final int a;
    private final android.graphics.Point b;

    public Point(int i, android.graphics.Point point)
    {
        a = i;
        b = point;
    }

    int a()
    {
        return a;
    }

    public android.graphics.Point b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Point))
        {
            return false;
        } else
        {
            obj = (Point)obj;
            return b.equals(((Point) (obj)).b);
        }
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        return b.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzz.a(this, parcel, i);
    }

}
