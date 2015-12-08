// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            gl, hl

public class gk
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gl();
    private double AM;
    private boolean AN;
    private int BO;
    private final int xJ;

    public gk()
    {
        this(1, (0.0D / 0.0D), false, -1);
    }

    gk(int i, double d, boolean flag, int j)
    {
        xJ = i;
        AM = d;
        AN = flag;
        BO = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public double ec()
    {
        return AM;
    }

    public boolean ei()
    {
        return AN;
    }

    public int ej()
    {
        return BO;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof gk))
            {
                return false;
            }
            obj = (gk)obj;
            if (AM != ((gk) (obj)).AM || AN != ((gk) (obj)).AN || BO != ((gk) (obj)).BO)
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
            Double.valueOf(AM), Boolean.valueOf(AN), Integer.valueOf(BO)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gl.a(this, parcel, i);
    }

}
