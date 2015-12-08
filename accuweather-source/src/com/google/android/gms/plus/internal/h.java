// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hl;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            j, PlusCommonExtras

public class h
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    private final String abQ[];
    private final String abR[];
    private final String abS[];
    private final String abT;
    private final String abU;
    private final String abV;
    private final String abW;
    private final PlusCommonExtras abX;
    private final int xJ;
    private final String yN;

    h(int i, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4, PlusCommonExtras pluscommonextras)
    {
        xJ = i;
        yN = s;
        abQ = as;
        abR = as1;
        abS = as2;
        abT = s1;
        abU = s2;
        abV = s3;
        abW = s4;
        abX = pluscommonextras;
    }

    public h(String s, String as[], String as1[], String as2[], String s1, String s2, String s3, 
            PlusCommonExtras pluscommonextras)
    {
        xJ = 1;
        yN = s;
        abQ = as;
        abR = as1;
        abS = as2;
        abT = s1;
        abU = s2;
        abV = s3;
        abW = null;
        abX = pluscommonextras;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof h)
        {
            if (xJ == ((h) (obj = (h)obj)).xJ && hl.equal(yN, ((h) (obj)).yN) && Arrays.equals(abQ, ((h) (obj)).abQ) && Arrays.equals(abR, ((h) (obj)).abR) && Arrays.equals(abS, ((h) (obj)).abS) && hl.equal(abT, ((h) (obj)).abT) && hl.equal(abU, ((h) (obj)).abU) && hl.equal(abV, ((h) (obj)).abV) && hl.equal(abW, ((h) (obj)).abW) && hl.equal(abX, ((h) (obj)).abX))
            {
                return true;
            }
        }
        return false;
    }

    public String getAccountName()
    {
        return yN;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Integer.valueOf(xJ), yN, abQ, abR, abS, abT, abU, abV, abW, abX
        });
    }

    public String[] jU()
    {
        return abQ;
    }

    public String[] jV()
    {
        return abR;
    }

    public String[] jW()
    {
        return abS;
    }

    public String jX()
    {
        return abT;
    }

    public String jY()
    {
        return abU;
    }

    public String jZ()
    {
        return abV;
    }

    public String ka()
    {
        return abW;
    }

    public PlusCommonExtras kb()
    {
        return abX;
    }

    public Bundle kc()
    {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(com/google/android/gms/plus/internal/PlusCommonExtras.getClassLoader());
        abX.n(bundle);
        return bundle;
    }

    public String toString()
    {
        return hl.e(this).a("versionCode", Integer.valueOf(xJ)).a("accountName", yN).a("requestedScopes", abQ).a("visibleActivities", abR).a("requiredFeatures", abS).a("packageNameForAuth", abT).a("callingPackageName", abU).a("applicationName", abV).a("extra", abX.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
