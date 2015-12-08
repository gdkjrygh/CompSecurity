// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;

// Referenced classes of package com.google.android.gms.wearable:
//            d

public class c
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final int AT;
    private final String YL;
    private final int ali;
    private final boolean alj;
    private final String mName;
    final int xM;

    c(int i, String s, String s1, int j, int k, boolean flag)
    {
        xM = i;
        mName = s;
        YL = s1;
        AT = j;
        ali = k;
        alj = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof c)
        {
            if (hk.equal(Integer.valueOf(xM), Integer.valueOf(((c) (obj = (c)obj)).xM)) && hk.equal(mName, ((c) (obj)).mName) && hk.equal(YL, ((c) (obj)).YL) && hk.equal(Integer.valueOf(AT), Integer.valueOf(((c) (obj)).AT)) && hk.equal(Integer.valueOf(ali), Integer.valueOf(((c) (obj)).ali)) && hk.equal(Boolean.valueOf(alj), Boolean.valueOf(((c) (obj)).alj)))
            {
                return true;
            }
        }
        return false;
    }

    public String getAddress()
    {
        return YL;
    }

    public String getName()
    {
        return mName;
    }

    public int getRole()
    {
        return ali;
    }

    public int getType()
    {
        return AT;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            Integer.valueOf(xM), mName, YL, Integer.valueOf(AT), Integer.valueOf(ali), Boolean.valueOf(alj)
        });
    }

    public boolean isEnabled()
    {
        return alj;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringbuilder.append((new StringBuilder()).append("mName=").append(mName).toString());
        stringbuilder.append((new StringBuilder()).append(", mAddress=").append(YL).toString());
        stringbuilder.append((new StringBuilder()).append(", mType=").append(AT).toString());
        stringbuilder.append((new StringBuilder()).append(", mRole=").append(ali).toString());
        stringbuilder.append((new StringBuilder()).append(", mEnabled=").append(alj).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
