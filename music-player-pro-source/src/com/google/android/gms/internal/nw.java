// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            nx, jv

public class nw
    implements SafeParcelable
{

    public static final nx CREATOR = new nx();
    final int CK;
    private final String ahx;
    private final String ahy;
    private final String mTag;

    nw(int i, String s, String s1, String s2)
    {
        CK = i;
        ahx = s;
        mTag = s1;
        ahy = s2;
    }

    public int describeContents()
    {
        nx nx1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof nw)
        {
            if (jv.equal(ahx, ((nw) (obj = (nw)obj)).ahx) && jv.equal(mTag, ((nw) (obj)).mTag) && jv.equal(ahy, ((nw) (obj)).ahy))
            {
                return true;
            }
        }
        return false;
    }

    public String getSource()
    {
        return ahy;
    }

    public String getTag()
    {
        return mTag;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            ahx, mTag, ahy
        });
    }

    public String nw()
    {
        return ahx;
    }

    public String toString()
    {
        return jv.h(this).a("mPlaceId", ahx).a("mTag", mTag).a("mSource", ahy).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        nx nx1 = CREATOR;
        nx.a(this, parcel, i);
    }

}
