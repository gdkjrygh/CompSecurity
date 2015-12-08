// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            i, PlusCommonExtras

public class h
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    private final int CK;
    private final String DZ;
    private final String anQ[];
    private final String anR[];
    private final String anS[];
    private final String anT;
    private final String anU;
    private final String anV;
    private final String anW;
    private final PlusCommonExtras anX;

    h(int j, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4, PlusCommonExtras pluscommonextras)
    {
        CK = j;
        DZ = s;
        anQ = as;
        anR = as1;
        anS = as2;
        anT = s1;
        anU = s2;
        anV = s3;
        anW = s4;
        anX = pluscommonextras;
    }

    public h(String s, String as[], String as1[], String as2[], String s1, String s2, String s3, 
            PlusCommonExtras pluscommonextras)
    {
        CK = 1;
        DZ = s;
        anQ = as;
        anR = as1;
        anS = as2;
        anT = s1;
        anU = s2;
        anV = s3;
        anW = null;
        anX = pluscommonextras;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof h)
        {
            if (CK == ((h) (obj = (h)obj)).CK && jv.equal(DZ, ((h) (obj)).DZ) && Arrays.equals(anQ, ((h) (obj)).anQ) && Arrays.equals(anR, ((h) (obj)).anR) && Arrays.equals(anS, ((h) (obj)).anS) && jv.equal(anT, ((h) (obj)).anT) && jv.equal(anU, ((h) (obj)).anU) && jv.equal(anV, ((h) (obj)).anV) && jv.equal(anW, ((h) (obj)).anW) && jv.equal(anX, ((h) (obj)).anX))
            {
                return true;
            }
        }
        return false;
    }

    public String getAccountName()
    {
        return DZ;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(CK), DZ, anQ, anR, anS, anT, anU, anV, anW, anX
        });
    }

    public String[] oA()
    {
        return anR;
    }

    public String[] oB()
    {
        return anS;
    }

    public String oC()
    {
        return anT;
    }

    public String oD()
    {
        return anU;
    }

    public String oE()
    {
        return anV;
    }

    public String oF()
    {
        return anW;
    }

    public PlusCommonExtras oG()
    {
        return anX;
    }

    public Bundle oH()
    {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(com/google/android/gms/plus/internal/PlusCommonExtras.getClassLoader());
        anX.q(bundle);
        return bundle;
    }

    public String[] oz()
    {
        return anQ;
    }

    public String toString()
    {
        return jv.h(this).a("versionCode", Integer.valueOf(CK)).a("accountName", DZ).a("requestedScopes", anQ).a("visibleActivities", anR).a("requiredFeatures", anS).a("packageNameForAuth", anT).a("callingPackageName", anU).a("applicationName", anV).a("extra", anX.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
