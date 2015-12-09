// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hj, fo

public class hi
    implements SafeParcelable
{

    public static final hj CREATOR = new hj();
    private final String OE;
    private final String mTag;
    final int xH;

    hi(int i, String s, String s1)
    {
        xH = i;
        OE = s;
        mTag = s1;
    }

    public int describeContents()
    {
        hj hj1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof hi)
        {
            if (fo.equal(OE, ((hi) (obj = (hi)obj)).OE) && fo.equal(mTag, ((hi) (obj)).mTag))
            {
                return true;
            }
        }
        return false;
    }

    public String getTag()
    {
        return mTag;
    }

    public String hY()
    {
        return OE;
    }

    public int hashCode()
    {
        return fo.hashCode(new Object[] {
            OE, mTag
        });
    }

    public String toString()
    {
        return fo.e(this).a("mPlaceId", OE).a("mTag", mTag).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hj hj1 = CREATOR;
        hj.a(this, parcel, i);
    }

}
