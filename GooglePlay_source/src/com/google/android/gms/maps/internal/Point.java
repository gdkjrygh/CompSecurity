// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.internal:
//            PointCreator

public class Point
    implements SafeParcelable
{

    public static final PointCreator CREATOR = new PointCreator();
    final android.graphics.Point point;
    final int versionCode;

    public Point(int i, android.graphics.Point point1)
    {
        versionCode = i;
        point = point1;
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
            return point.equals(((Point) (obj)).point);
        }
    }

    public int hashCode()
    {
        return point.hashCode();
    }

    public String toString()
    {
        return point.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PointCreator.writeToParcel(this, parcel, i);
    }

}
