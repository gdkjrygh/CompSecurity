// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.wearable:
//            d

public class c
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final int CK;
    private final int Gt;
    private final String TW;
    private final int axc;
    private final boolean axd;
    private boolean axe;
    private String axf;
    private final String mName;

    c(int i, String s, String s1, int j, int k, boolean flag, boolean flag1, 
            String s2)
    {
        CK = i;
        mName = s;
        TW = s1;
        Gt = j;
        axc = k;
        axd = flag;
        axe = flag1;
        axf = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof c)
        {
            if (jv.equal(Integer.valueOf(CK), Integer.valueOf(((c) (obj = (c)obj)).CK)) && jv.equal(mName, ((c) (obj)).mName) && jv.equal(TW, ((c) (obj)).TW) && jv.equal(Integer.valueOf(Gt), Integer.valueOf(((c) (obj)).Gt)) && jv.equal(Integer.valueOf(axc), Integer.valueOf(((c) (obj)).axc)) && jv.equal(Boolean.valueOf(axd), Boolean.valueOf(((c) (obj)).axd)))
            {
                return true;
            }
        }
        return false;
    }

    public String getAddress()
    {
        return TW;
    }

    public String getName()
    {
        return mName;
    }

    public int getRole()
    {
        return axc;
    }

    public int getType()
    {
        return Gt;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Integer.valueOf(CK), mName, TW, Integer.valueOf(Gt), Integer.valueOf(axc), Boolean.valueOf(axd)
        });
    }

    public boolean isConnected()
    {
        return axe;
    }

    public boolean isEnabled()
    {
        return axd;
    }

    public String rj()
    {
        return axf;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringbuilder.append((new StringBuilder()).append("mName=").append(mName).toString());
        stringbuilder.append((new StringBuilder()).append(", mAddress=").append(TW).toString());
        stringbuilder.append((new StringBuilder()).append(", mType=").append(Gt).toString());
        stringbuilder.append((new StringBuilder()).append(", mRole=").append(axc).toString());
        stringbuilder.append((new StringBuilder()).append(", mEnabled=").append(axd).toString());
        stringbuilder.append((new StringBuilder()).append(", mIsConnected=").append(axe).toString());
        stringbuilder.append((new StringBuilder()).append(", mEnabled=").append(axf).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
