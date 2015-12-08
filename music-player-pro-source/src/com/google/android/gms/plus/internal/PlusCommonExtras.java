// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.plus.internal:
//            f

public class PlusCommonExtras
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    public static String TAG = "PlusCommonExtras";
    private final int CK;
    private String anN;
    private String anO;

    public PlusCommonExtras()
    {
        CK = 1;
        anN = "";
        anO = "";
    }

    PlusCommonExtras(int i, String s, String s1)
    {
        CK = i;
        anN = s;
        anO = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusCommonExtras)
        {
            if (CK == ((PlusCommonExtras) (obj = (PlusCommonExtras)obj)).CK && jv.equal(anN, ((PlusCommonExtras) (obj)).anN) && jv.equal(anO, ((PlusCommonExtras) (obj)).anO))
            {
                return true;
            }
        }
        return false;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(CK), anN, anO
        });
    }

    public String ox()
    {
        return anN;
    }

    public String oy()
    {
        return anO;
    }

    public void q(Bundle bundle)
    {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", c.a(this));
    }

    public String toString()
    {
        return jv.h(this).a("versionCode", Integer.valueOf(CK)).a("Gpsrc", anN).a("ClientCallingPackage", anO).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
