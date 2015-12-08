// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hj, hp, hq

public class hi
    implements SafeParcelable
{

    public static final hj CREATOR = new hj();
    public static final int Cc = Integer.parseInt("-1");
    private static final hq Cd = (new hq.a("SsbContext")).E(true).at("blob").fm();
    final int BR;
    public final String Ce;
    final hq Cf;
    public final int Cg;
    public final byte Ch[];

    hi(int i, String s, hq hq, int j, byte abyte0[])
    {
        boolean flag;
        if (j == Cc || hp.O(j) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, (new StringBuilder()).append("Invalid section type ").append(j).toString());
        BR = i;
        Ce = s;
        Cf = hq;
        Cg = j;
        Ch = abyte0;
        s = fk();
        if (s != null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public hi(String s, hq hq)
    {
        this(1, s, hq, Cc, null);
    }

    public hi(String s, hq hq, String s1)
    {
        this(1, s, hq, hp.as(s1), null);
    }

    public hi(byte abyte0[], hq hq)
    {
        this(1, null, hq, Cc, abyte0);
    }

    public int describeContents()
    {
        hj hj1 = CREATOR;
        return 0;
    }

    public String fk()
    {
        if (Cg != Cc && hp.O(Cg) == null)
        {
            return (new StringBuilder()).append("Invalid section type ").append(Cg).toString();
        }
        if (Ce != null && Ch != null)
        {
            return "Both content and blobContent set";
        } else
        {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hj hj1 = CREATOR;
        hj.a(this, parcel, i);
    }

}
