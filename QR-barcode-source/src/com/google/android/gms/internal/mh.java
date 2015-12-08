// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            mi, mj

public final class mh
    implements SafeParcelable
{

    public static final mi CREATOR = new mi();
    private final int BR;
    private final int aeh;
    private final int afp;
    private final mj afq;

    mh(int i, int j, int k, mj mj1)
    {
        BR = i;
        aeh = j;
        afp = k;
        afq = mj1;
    }

    public int describeContents()
    {
        mi mi1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mh))
            {
                return false;
            }
            obj = (mh)obj;
            if (aeh != ((mh) (obj)).aeh || afp != ((mh) (obj)).afp || !afq.equals(((mh) (obj)).afq))
            {
                return false;
            }
        }
        return true;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(aeh), Integer.valueOf(afp)
        });
    }

    public int mc()
    {
        return aeh;
    }

    public int mg()
    {
        return afp;
    }

    public mj mh()
    {
        return afq;
    }

    public String toString()
    {
        return n.h(this).a("transitionTypes", Integer.valueOf(aeh)).a("loiteringTimeMillis", Integer.valueOf(afp)).a("placeFilter", afq).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mi mi1 = CREATOR;
        mi.a(this, parcel, i);
    }

}
