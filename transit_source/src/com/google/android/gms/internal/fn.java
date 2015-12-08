// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            fp, dl

public class fn
    implements SafeParcelable
{

    public static final fp CREATOR = new fp();
    private final int iM;
    private final String it;
    private final String rA[];
    private final String rB;
    private final String rC;
    private final String rD;
    private final String rE;
    private final String ry[];
    private final String rz[];

    fn(int i, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4)
    {
        iM = i;
        it = s;
        ry = as;
        rz = as1;
        rA = as2;
        rB = s1;
        rC = s2;
        rD = s3;
        rE = s4;
    }

    fn(String s, String as[], String as1[], String as2[], String s1, String s2, String s3, 
            String s4)
    {
        iM = 1;
        it = s;
        ry = as;
        rz = as1;
        rA = as2;
        rB = s1;
        rC = s2;
        rD = s3;
        rE = s4;
    }

    public String[] cZ()
    {
        return ry;
    }

    public String[] da()
    {
        return rz;
    }

    public String[] db()
    {
        return rA;
    }

    public String dc()
    {
        return rB;
    }

    public String dd()
    {
        return rC;
    }

    public String de()
    {
        return rD;
    }

    public int describeContents()
    {
        return 0;
    }

    public String df()
    {
        return rE;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof fn)
        {
            if (iM == ((fn) (obj = (fn)obj)).iM && dl.equal(it, ((fn) (obj)).it) && dl.equal(ry, ((fn) (obj)).ry) && dl.equal(rz, ((fn) (obj)).rz) && dl.equal(rA, ((fn) (obj)).rA) && dl.equal(rB, ((fn) (obj)).rB) && dl.equal(rC, ((fn) (obj)).rC) && dl.equal(rD, ((fn) (obj)).rD) && dl.equal(rE, ((fn) (obj)).rE))
            {
                return true;
            }
        }
        return false;
    }

    public String getAccountName()
    {
        return it;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public int hashCode()
    {
        return dl.hashCode(new Object[] {
            Integer.valueOf(iM), it, ry, rz, rA, rB, rC, rD, rE
        });
    }

    public String toString()
    {
        return dl.d(this).a("versionCode", Integer.valueOf(iM)).a("accountName", it).a("requestedScopes", ry).a("visibleActivities", rz).a("requiredFeatures", rA).a("packageNameForAuth", rB).a("callingPackageName", rC).a("applicationName", rD).a("clientId", rE).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fp.a(this, parcel, i);
    }

}
