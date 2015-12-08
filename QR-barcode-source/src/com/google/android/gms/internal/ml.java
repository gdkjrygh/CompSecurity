// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            mm

public class ml
    implements SafeParcelable
{

    public static final mm CREATOR = new mm();
    final int BR;
    private final String afz;
    private final String mTag;

    ml(int i, String s, String s1)
    {
        BR = i;
        afz = s;
        mTag = s1;
    }

    public int describeContents()
    {
        mm mm1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ml)
        {
            if (n.equal(afz, ((ml) (obj = (ml)obj)).afz) && n.equal(mTag, ((ml) (obj)).mTag))
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
        return n.hashCode(new Object[] {
            afz, mTag
        });
    }

    public String mk()
    {
        return afz;
    }

    public String toString()
    {
        return n.h(this).a("mPlaceId", afz).a("mTag", mTag).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mm mm1 = CREATOR;
        mm.a(this, parcel, i);
    }

}
