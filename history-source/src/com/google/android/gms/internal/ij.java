// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ik, in, jv

public class ij
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ik();
    private final int CK;
    private String Hd;

    public ij()
    {
        this(1, null);
    }

    ij(int i, String s)
    {
        CK = i;
        Hd = s;
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
        if (!(obj instanceof ij))
        {
            return false;
        } else
        {
            obj = (ij)obj;
            return in.a(Hd, ((ij) (obj)).Hd);
        }
    }

    public String fT()
    {
        return Hd;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Hd
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ik.a(this, parcel, i);
    }

}
