// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.graphics.Point;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.internal:
//            cu

public class zzy
    implements SafeParcelable
{

    public static final cu CREATOR = new cu();
    private final int a;
    private final Point b;

    public zzy(int i, Point point)
    {
        a = i;
        b = point;
    }

    final int a()
    {
        return a;
    }

    public final Point b()
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
        if (!(obj instanceof zzy))
        {
            return false;
        } else
        {
            obj = (zzy)obj;
            return b.equals(((zzy) (obj)).b);
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
        cu.a(this, parcel, i);
    }

}
