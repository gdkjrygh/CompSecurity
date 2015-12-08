// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            oy, kl

public class ox
    implements SafeParcelable
{

    public static final oy CREATOR = new oy();
    private final int mVersionCode;
    public final String packageName;
    public final int uid;

    ox(int i, int j, String s)
    {
        mVersionCode = i;
        uid = j;
        packageName = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ox)
        {
            if (((ox) (obj = (ox)obj)).uid == uid && kl.equal(((ox) (obj)).packageName, packageName))
            {
                return true;
            }
        }
        return false;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public int hashCode()
    {
        return uid;
    }

    public String toString()
    {
        return String.format("%d:%s", new Object[] {
            Integer.valueOf(uid), packageName
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        oy.a(this, parcel, i);
    }

}
