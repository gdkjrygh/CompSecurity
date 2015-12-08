// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jm, jn, hl

public final class jl
    implements SafeParcelable
{

    public static final jm CREATOR = new jm();
    private final int UX;
    private final int VX;
    private final jn VY;
    private final int xJ;

    jl(int i, int j, int k, jn jn1)
    {
        xJ = i;
        UX = j;
        VX = k;
        VY = jn1;
    }

    public int describeContents()
    {
        jm jm1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jl))
            {
                return false;
            }
            obj = (jl)obj;
            if (UX != ((jl) (obj)).UX || VX != ((jl) (obj)).VX || !VY.equals(((jl) (obj)).VY))
            {
                return false;
            }
        }
        return true;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Integer.valueOf(UX), Integer.valueOf(VX)
        });
    }

    public int iX()
    {
        return UX;
    }

    public int iZ()
    {
        return VX;
    }

    public jn ja()
    {
        return VY;
    }

    public String toString()
    {
        return hl.e(this).a("transitionTypes", Integer.valueOf(UX)).a("loiteringTimeMillis", Integer.valueOf(VX)).a("placeFilter", VY).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jm jm1 = CREATOR;
        jm.a(this, parcel, i);
    }

}
