// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hv, hw

public class hu
    implements SafeParcelable
{

    public static final hv CREATOR = new hv();
    private final hw GS;
    private final int xJ;

    hu(int i, hw hw1)
    {
        xJ = i;
        GS = hw1;
    }

    private hu(hw hw1)
    {
        xJ = 1;
        GS = hw1;
    }

    public static hu a(hz.b b)
    {
        if (b instanceof hw)
        {
            return new hu((hw)b);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    public int describeContents()
    {
        hv hv1 = CREATOR;
        return 0;
    }

    hw fw()
    {
        return GS;
    }

    public hz.b fx()
    {
        if (GS != null)
        {
            return GS;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

    int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hv hv1 = CREATOR;
        hv.a(this, parcel, i);
    }

}
