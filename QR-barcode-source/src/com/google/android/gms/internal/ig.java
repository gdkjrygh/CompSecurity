// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ih, ik

public class ig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ih();
    private final int BR;
    private String Gn;

    public ig()
    {
        this(1, null);
    }

    ig(int i, String s)
    {
        BR = i;
        Gn = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof ig))
        {
            return false;
        } else
        {
            obj = (ig)obj;
            return ik.a(Gn, ((ig) (obj)).Gn);
        }
    }

    public String fy()
    {
        return Gn;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Gn
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ih.a(this, parcel, i);
    }

}
