// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            gf, gi, hk

public class ge
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gf();
    private String BC;
    private final int xM;

    public ge()
    {
        this(1, null);
    }

    ge(int i, String s)
    {
        xM = i;
        BC = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String ec()
    {
        return BC;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ge))
        {
            return false;
        } else
        {
            obj = (ge)obj;
            return gi.a(BC, ((ge) (obj)).BC);
        }
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            BC
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gf.a(this, parcel, i);
    }

}
