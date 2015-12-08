// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            fl, fo, hm, fp

public class fk
    implements SafeParcelable
{

    public static final fl CREATOR = new fl();
    public static final int xT = Integer.parseInt("-1");
    final int xM;
    public final String xU;
    final fp xV;
    public final int xW;
    public final byte xX[];

    fk(int i, String s, fp fp, int j, byte abyte0[])
    {
        boolean flag;
        if (j == xT || fo.H(j) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, (new StringBuilder()).append("Invalid section type ").append(j).toString());
        xM = i;
        xU = s;
        xV = fp;
        xW = j;
        xX = abyte0;
        s = dO();
        if (s != null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public fk(String s, fp fp)
    {
        this(1, s, fp, xT, null);
    }

    public fk(String s, fp fp, String s1)
    {
        this(1, s, fp, fo.Y(s1), null);
    }

    public fk(byte abyte0[], fp fp)
    {
        this(1, null, fp, xT, abyte0);
    }

    public String dO()
    {
        if (xW != xT && fo.H(xW) == null)
        {
            return (new StringBuilder()).append("Invalid section type ").append(xW).toString();
        }
        if (xU != null && xX != null)
        {
            return "Both content and blobContent set";
        } else
        {
            return null;
        }
    }

    public int describeContents()
    {
        fl fl1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fl fl1 = CREATOR;
        fl.a(this, parcel, i);
    }

}
