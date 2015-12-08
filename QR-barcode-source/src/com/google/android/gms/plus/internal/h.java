// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            j, PlusCommonExtras

public class h
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    private final int BR;
    private final String Dd;
    private final String alD[];
    private final String alE[];
    private final String alF[];
    private final String alG;
    private final String alH;
    private final String alI;
    private final String alJ;
    private final PlusCommonExtras alK;

    h(int i, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4, PlusCommonExtras pluscommonextras)
    {
        BR = i;
        Dd = s;
        alD = as;
        alE = as1;
        alF = as2;
        alG = s1;
        alH = s2;
        alI = s3;
        alJ = s4;
        alK = pluscommonextras;
    }

    public h(String s, String as[], String as1[], String as2[], String s1, String s2, String s3, 
            PlusCommonExtras pluscommonextras)
    {
        BR = 1;
        Dd = s;
        alD = as;
        alE = as1;
        alF = as2;
        alG = s1;
        alH = s2;
        alI = s3;
        alJ = null;
        alK = pluscommonextras;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof h)
        {
            if (BR == ((h) (obj = (h)obj)).BR && n.equal(Dd, ((h) (obj)).Dd) && Arrays.equals(alD, ((h) (obj)).alD) && Arrays.equals(alE, ((h) (obj)).alE) && Arrays.equals(alF, ((h) (obj)).alF) && n.equal(alG, ((h) (obj)).alG) && n.equal(alH, ((h) (obj)).alH) && n.equal(alI, ((h) (obj)).alI) && n.equal(alJ, ((h) (obj)).alJ) && n.equal(alK, ((h) (obj)).alK))
            {
                return true;
            }
        }
        return false;
    }

    public String getAccountName()
    {
        return Dd;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(BR), Dd, alD, alE, alF, alG, alH, alI, alJ, alK
        });
    }

    public String[] ng()
    {
        return alD;
    }

    public String[] nh()
    {
        return alE;
    }

    public String[] ni()
    {
        return alF;
    }

    public String nj()
    {
        return alG;
    }

    public String nk()
    {
        return alH;
    }

    public String nl()
    {
        return alI;
    }

    public String nm()
    {
        return alJ;
    }

    public PlusCommonExtras nn()
    {
        return alK;
    }

    public Bundle no()
    {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(com/google/android/gms/plus/internal/PlusCommonExtras.getClassLoader());
        alK.o(bundle);
        return bundle;
    }

    public String toString()
    {
        return n.h(this).a("versionCode", Integer.valueOf(BR)).a("accountName", Dd).a("requestedScopes", alD).a("visibleActivities", alE).a("requiredFeatures", alF).a("packageNameForAuth", alG).a("callingPackageName", alH).a("applicationName", alI).a("extra", alK.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
