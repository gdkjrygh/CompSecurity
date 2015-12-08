// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.plus.internal:
//            f

public class PlusCommonExtras
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    public static String TAG = "PlusCommonExtras";
    private final int BR;
    private String alA;
    private String alB;

    public PlusCommonExtras()
    {
        BR = 1;
        alA = "";
        alB = "";
    }

    PlusCommonExtras(int i, String s, String s1)
    {
        BR = i;
        alA = s;
        alB = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusCommonExtras)
        {
            if (BR == ((PlusCommonExtras) (obj = (PlusCommonExtras)obj)).BR && n.equal(alA, ((PlusCommonExtras) (obj)).alA) && n.equal(alB, ((PlusCommonExtras) (obj)).alB))
            {
                return true;
            }
        }
        return false;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(BR), alA, alB
        });
    }

    public String ne()
    {
        return alA;
    }

    public String nf()
    {
        return alB;
    }

    public void o(Bundle bundle)
    {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", c.a(this));
    }

    public String toString()
    {
        return n.h(this).a("versionCode", Integer.valueOf(BR)).a("Gpsrc", alA).a("ClientCallingPackage", alB).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
