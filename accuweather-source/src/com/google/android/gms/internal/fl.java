// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            fm, fp, hn, fq

public class fl
    implements SafeParcelable
{

    public static final fm CREATOR = new fm();
    public static final int xQ = Integer.parseInt("-1");
    final int xJ;
    public final String xR;
    final fq xS;
    public final int xT;
    public final byte xU[];

    fl(int i, String s, fq fq, int j, byte abyte0[])
    {
        boolean flag;
        if (j == xQ || fp.H(j) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, (new StringBuilder()).append("Invalid section type ").append(j).toString());
        xJ = i;
        xR = s;
        xS = fq;
        xT = j;
        xU = abyte0;
        s = dJ();
        if (s != null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public fl(String s, fq fq)
    {
        this(1, s, fq, xQ, null);
    }

    public fl(String s, fq fq, String s1)
    {
        this(1, s, fq, fp.Y(s1), null);
    }

    public fl(byte abyte0[], fq fq)
    {
        this(1, null, fq, xQ, abyte0);
    }

    public String dJ()
    {
        if (xT != xQ && fp.H(xT) == null)
        {
            return (new StringBuilder()).append("Invalid section type ").append(xT).toString();
        }
        if (xR != null && xU != null)
        {
            return "Both content and blobContent set";
        } else
        {
            return null;
        }
    }

    public int describeContents()
    {
        fm fm1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fm fm1 = CREATOR;
        fm.a(this, parcel, i);
    }

}
