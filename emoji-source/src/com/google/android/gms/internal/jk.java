// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jl, jm, hk

public final class jk
    implements SafeParcelable
{

    public static final jl CREATOR = new jl();
    private final int Va;
    private final int Wa;
    private final jm Wb;
    private final int xM;

    jk(int i, int j, int k, jm jm1)
    {
        xM = i;
        Va = j;
        Wa = k;
        Wb = jm1;
    }

    public int describeContents()
    {
        jl jl1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jk))
            {
                return false;
            }
            obj = (jk)obj;
            if (Va != ((jk) (obj)).Va || Wa != ((jk) (obj)).Wa || !Wb.equals(((jk) (obj)).Wb))
            {
                return false;
            }
        }
        return true;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            Integer.valueOf(Va), Integer.valueOf(Wa)
        });
    }

    public int jc()
    {
        return Va;
    }

    public int je()
    {
        return Wa;
    }

    public jm jf()
    {
        return Wb;
    }

    public String toString()
    {
        return hk.e(this).a("transitionTypes", Integer.valueOf(Va)).a("loiteringTimeMillis", Integer.valueOf(Wa)).a("placeFilter", Wb).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jl jl1 = CREATOR;
        jl.a(this, parcel, i);
    }

}
