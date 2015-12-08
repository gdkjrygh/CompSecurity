// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            lt

public class ls
    implements SafeParcelable
{

    public static final lt CREATOR = new lt();
    private final int BR;
    public final String packageName;
    public final int uid;

    ls(int i, int j, String s)
    {
        BR = i;
        uid = j;
        packageName = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ls)
        {
            if (((ls) (obj = (ls)obj)).uid == uid && n.equal(((ls) (obj)).packageName, packageName))
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return BR;
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
        lt.a(this, parcel, i);
    }

}
