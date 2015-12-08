// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            gx, ey, hv

public class ew
    implements SafeParcelable
{

    public static final gx a = new gx();
    private final int b;
    private final ey c;

    ew(int i, ey ey1)
    {
        b = i;
        c = ey1;
    }

    private ew(ey ey1)
    {
        b = 1;
        c = ey1;
    }

    public static ew a(hv hv)
    {
        if (hv instanceof ey)
        {
            return new ew((ey)hv);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    final int a()
    {
        return b;
    }

    final ey b()
    {
        return c;
    }

    public final hv c()
    {
        if (c != null)
        {
            return c;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

    public int describeContents()
    {
        gx gx1 = a;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gx gx1 = a;
        gx.a(this, parcel, i);
    }

}
