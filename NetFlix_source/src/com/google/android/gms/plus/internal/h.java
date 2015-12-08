// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fo;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            j, PlusCommonExtras

public class h
    implements SafeParcelable
{

    public static final j CREATOR = new j();
    private final String Uk[];
    private final String Ul[];
    private final String Um[];
    private final String Un;
    private final String Uo;
    private final String Up;
    private final String Uq;
    private final PlusCommonExtras Ur;
    private final String wG;
    private final int xH;

    h(int i, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4, PlusCommonExtras pluscommonextras)
    {
        xH = i;
        wG = s;
        Uk = as;
        Ul = as1;
        Um = as2;
        Un = s1;
        Uo = s2;
        Up = s3;
        Uq = s4;
        Ur = pluscommonextras;
    }

    public h(String s, String as[], String as1[], String as2[], String s1, String s2, String s3, 
            PlusCommonExtras pluscommonextras)
    {
        xH = 1;
        wG = s;
        Uk = as;
        Ul = as1;
        Um = as2;
        Un = s1;
        Uo = s2;
        Up = s3;
        Uq = null;
        Ur = pluscommonextras;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof h)
        {
            if (xH == ((h) (obj = (h)obj)).xH && fo.equal(wG, ((h) (obj)).wG) && Arrays.equals(Uk, ((h) (obj)).Uk) && Arrays.equals(Ul, ((h) (obj)).Ul) && Arrays.equals(Um, ((h) (obj)).Um) && fo.equal(Un, ((h) (obj)).Un) && fo.equal(Uo, ((h) (obj)).Uo) && fo.equal(Up, ((h) (obj)).Up) && fo.equal(Uq, ((h) (obj)).Uq) && fo.equal(Ur, ((h) (obj)).Ur))
            {
                return true;
            }
        }
        return false;
    }

    public String getAccountName()
    {
        return wG;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            Integer.valueOf(xH), wG, Uk, Ul, Um, Un, Uo, Up, Uq, Ur
        });
    }

    public String[] iP()
    {
        return Uk;
    }

    public String[] iQ()
    {
        return Ul;
    }

    public String[] iR()
    {
        return Um;
    }

    public String iS()
    {
        return Un;
    }

    public String iT()
    {
        return Uo;
    }

    public String iU()
    {
        return Up;
    }

    public String iV()
    {
        return Uq;
    }

    public PlusCommonExtras iW()
    {
        return Ur;
    }

    public Bundle iX()
    {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(com/google/android/gms/plus/internal/PlusCommonExtras.getClassLoader());
        Ur.m(bundle);
        return bundle;
    }

    public String toString()
    {
        return fo.e(this).a("versionCode", Integer.valueOf(xH)).a("accountName", wG).a("requestedScopes", Uk).a("visibleActivities", Ul).a("requiredFeatures", Um).a("packageNameForAuth", Un).a("callingPackageName", Uo).a("applicationName", Up).a("extra", Ur.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel, i);
    }

}
