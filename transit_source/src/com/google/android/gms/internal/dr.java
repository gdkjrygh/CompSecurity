// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ds, dt

public class dr
    implements SafeParcelable
{

    public static final ds CREATOR = new ds();
    private final int iM;
    private final dt lt;

    dr(int i, dt dt1)
    {
        iM = i;
        lt = dt1;
    }

    private dr(dt dt1)
    {
        iM = 1;
        lt = dt1;
    }

    public static dr a(dw.b b)
    {
        if (b instanceof dt)
        {
            return new dr((dt)b);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    dt bk()
    {
        return lt;
    }

    public dw.b bl()
    {
        if (lt != null)
        {
            return lt;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

    public int describeContents()
    {
        ds ds1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return iM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ds ds1 = CREATOR;
        ds.a(this, parcel, i);
    }

}
