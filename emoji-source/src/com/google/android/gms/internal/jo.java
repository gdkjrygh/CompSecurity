// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jp, hk

public class jo
    implements SafeParcelable
{

    public static final jp CREATOR = new jp();
    private final String Wl;
    private final String mTag;
    final int xM;

    jo(int i, String s, String s1)
    {
        xM = i;
        Wl = s;
        mTag = s1;
    }

    public int describeContents()
    {
        jp jp1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof jo)
        {
            if (hk.equal(Wl, ((jo) (obj = (jo)obj)).Wl) && hk.equal(mTag, ((jo) (obj)).mTag))
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

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            Wl, mTag
        });
    }

    public String jj()
    {
        return Wl;
    }

    public String toString()
    {
        return hk.e(this).a("mPlaceId", Wl).a("mTag", mTag).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jp jp1 = CREATOR;
        jp.a(this, parcel, i);
    }

}
