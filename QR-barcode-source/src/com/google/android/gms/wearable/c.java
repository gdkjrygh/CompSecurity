// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            d

public class c
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final int BR;
    private final int FD;
    private final String Sz;
    private final int auS;
    private final boolean auT;
    private boolean auU;
    private String auV;
    private final String mName;

    c(int i, String s, String s1, int j, int k, boolean flag, boolean flag1, 
            String s2)
    {
        BR = i;
        mName = s;
        Sz = s1;
        FD = j;
        auS = k;
        auT = flag;
        auU = flag1;
        auV = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof c)
        {
            if (n.equal(Integer.valueOf(BR), Integer.valueOf(((c) (obj = (c)obj)).BR)) && n.equal(mName, ((c) (obj)).mName) && n.equal(Sz, ((c) (obj)).Sz) && n.equal(Integer.valueOf(FD), Integer.valueOf(((c) (obj)).FD)) && n.equal(Integer.valueOf(auS), Integer.valueOf(((c) (obj)).auS)) && n.equal(Boolean.valueOf(auT), Boolean.valueOf(((c) (obj)).auT)))
            {
                return true;
            }
        }
        return false;
    }

    public String getAddress()
    {
        return Sz;
    }

    public String getName()
    {
        return mName;
    }

    public int getRole()
    {
        return auS;
    }

    public int getType()
    {
        return FD;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Integer.valueOf(BR), mName, Sz, Integer.valueOf(FD), Integer.valueOf(auS), Boolean.valueOf(auT)
        });
    }

    public boolean isConnected()
    {
        return auU;
    }

    public boolean isEnabled()
    {
        return auT;
    }

    public String pS()
    {
        return auV;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringbuilder.append((new StringBuilder()).append("mName=").append(mName).toString());
        stringbuilder.append((new StringBuilder()).append(", mAddress=").append(Sz).toString());
        stringbuilder.append((new StringBuilder()).append(", mType=").append(FD).toString());
        stringbuilder.append((new StringBuilder()).append(", mRole=").append(auS).toString());
        stringbuilder.append((new StringBuilder()).append(", mEnabled=").append(auT).toString());
        stringbuilder.append((new StringBuilder()).append(", mIsConnected=").append(auU).toString());
        stringbuilder.append((new StringBuilder()).append(", mEnabled=").append(auV).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
