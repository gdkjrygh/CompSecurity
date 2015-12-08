// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            gg, gj, hl

public class gf
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gg();
    private String Bz;
    private final int xJ;

    public gf()
    {
        this(1, null);
    }

    gf(int i, String s)
    {
        xJ = i;
        Bz = s;
    }

    public String dX()
    {
        return Bz;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof gf))
        {
            return false;
        } else
        {
            obj = (gf)obj;
            return gj.a(Bz, ((gf) (obj)).Bz);
        }
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Bz
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gg.a(this, parcel, i);
    }

}
