// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            nt, nu, jv

public final class ns
    implements SafeParcelable
{

    public static final nt CREATOR = new nt();
    private final int CK;
    private final int agd;
    private final int ahp;
    private final nu ahq;

    ns(int i, int j, int k, nu nu1)
    {
        CK = i;
        agd = j;
        ahp = k;
        ahq = nu1;
    }

    public int describeContents()
    {
        nt nt1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ns))
            {
                return false;
            }
            obj = (ns)obj;
            if (agd != ((ns) (obj)).agd || ahp != ((ns) (obj)).ahp || !ahq.equals(((ns) (obj)).ahq))
            {
                return false;
            }
        }
        return true;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(agd), Integer.valueOf(ahp)
        });
    }

    public int np()
    {
        return agd;
    }

    public int ns()
    {
        return ahp;
    }

    public nu nt()
    {
        return ahq;
    }

    public String toString()
    {
        return jv.h(this).a("transitionTypes", Integer.valueOf(agd)).a("loiteringTimeMillis", Integer.valueOf(ahp)).a("placeFilter", ahq).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nt nt1 = CREATOR;
        com.google.android.gms.internal.nt.a(this, parcel, i);
    }

}
