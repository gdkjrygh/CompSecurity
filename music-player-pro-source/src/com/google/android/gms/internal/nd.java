// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ne, jv

public class nd
    implements SafeParcelable
{

    public static final ne CREATOR = new ne();
    private final int CK;
    public final String packageName;
    public final int uid;

    nd(int i, int j, String s)
    {
        CK = i;
        uid = j;
        packageName = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof nd)
        {
            if (((nd) (obj = (nd)obj)).uid == uid && jv.equal(((nd) (obj)).packageName, packageName))
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return CK;
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
        ne.a(this, parcel, i);
    }

}
