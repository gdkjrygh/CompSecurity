// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.graphics.Point;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.internal:
//            z

public class y
    implements SafeParcelable
{

    public static final z CREATOR = new z();
    private final Point azP;
    private final int versionCode;

    public y(int i, Point point)
    {
        versionCode = i;
        azP = point;
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
        if (!(obj instanceof y))
        {
            return false;
        } else
        {
            obj = (y)obj;
            return azP.equals(((y) (obj)).azP);
        }
    }

    final int getVersionCode()
    {
        return versionCode;
    }

    public int hashCode()
    {
        return azP.hashCode();
    }

    public final Point qo()
    {
        return azP;
    }

    public String toString()
    {
        return azP.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        z.a(this, parcel, i);
    }

}
