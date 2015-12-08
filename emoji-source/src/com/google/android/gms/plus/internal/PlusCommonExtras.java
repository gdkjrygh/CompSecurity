// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.hk;

// Referenced classes of package com.google.android.gms.plus.internal:
//            f

public class PlusCommonExtras
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    public static String TAG = "PlusCommonExtras";
    private String abQ;
    private String abR;
    private final int xM;

    public PlusCommonExtras()
    {
        xM = 1;
        abQ = "";
        abR = "";
    }

    PlusCommonExtras(int i, String s, String s1)
    {
        xM = i;
        abQ = s;
        abR = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusCommonExtras)
        {
            if (xM == ((PlusCommonExtras) (obj = (PlusCommonExtras)obj)).xM && hk.equal(abQ, ((PlusCommonExtras) (obj)).abQ) && hk.equal(abR, ((PlusCommonExtras) (obj)).abR))
            {
                return true;
            }
        }
        return false;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            Integer.valueOf(xM), abQ, abR
        });
    }

    public String jX()
    {
        return abQ;
    }

    public String jY()
    {
        return abR;
    }

    public void n(Bundle bundle)
    {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", c.a(this));
    }

    public String toString()
    {
        return hk.e(this).a("versionCode", Integer.valueOf(xM)).a("Gpsrc", abQ).a("ClientCallingPackage", abR).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
