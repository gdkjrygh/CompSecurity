// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            hi, ho, jx, hp

public class hh
    implements SafeParcelable
{

    public static final hi CREATOR = new hi();
    public static final int CV = Integer.parseInt("-1");
    private static final hp CW = (new hp.a("SsbContext")).G(true).at("blob").fG();
    final int CK;
    public final String CX;
    final hp CY;
    public final int CZ;
    public final byte Da[];

    hh(int i, String s, hp hp, int j, byte abyte0[])
    {
        boolean flag;
        if (j == CV || ho.P(j) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, (new StringBuilder()).append("Invalid section type ").append(j).toString());
        CK = i;
        CX = s;
        CY = hp;
        CZ = j;
        Da = abyte0;
        s = fE();
        if (s != null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public hh(String s, hp hp)
    {
        this(1, s, hp, CV, null);
    }

    public hh(String s, hp hp, String s1)
    {
        this(1, s, hp, ho.as(s1), null);
    }

    public hh(byte abyte0[], hp hp)
    {
        this(1, null, hp, CV, abyte0);
    }

    public int describeContents()
    {
        hi hi1 = CREATOR;
        return 0;
    }

    public String fE()
    {
        if (CZ != CV && ho.P(CZ) == null)
        {
            return (new StringBuilder()).append("Invalid section type ").append(CZ).toString();
        }
        if (CX != null && Da != null)
        {
            return "Both content and blobContent set";
        } else
        {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        hi hi1 = CREATOR;
        hi.a(this, parcel, i);
    }

}
