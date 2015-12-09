// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            gm, gr, gq, zziz

public class zzir
    implements SafeParcelable
{

    public static final gm CREATOR = new gm();
    public static final int a = Integer.parseInt("-1");
    private static final zziz g = (new gr("SsbContext")).a().a("blob").c();
    final int b;
    public final String c;
    final zziz d;
    public final int e;
    public final byte f[];

    zzir(int i, String s, zziz zziz, int j, byte abyte0[])
    {
        boolean flag;
        if (j == a || gq.a(j) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.b(flag, (new StringBuilder("Invalid section type ")).append(j).toString());
        b = i;
        c = s;
        d = zziz;
        e = j;
        f = abyte0;
        if (e != a && gq.a(e) == null)
        {
            s = (new StringBuilder("Invalid section type ")).append(e).toString();
        } else
        if (c != null && f != null)
        {
            s = "Both content and blobContent set";
        } else
        {
            s = null;
        }
        if (s != null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public zzir(String s, zziz zziz)
    {
        this(1, s, zziz, a, null);
    }

    public zzir(String s, zziz zziz, String s1)
    {
        this(1, s, zziz, gq.a(s1), null);
    }

    public zzir(byte abyte0[], zziz zziz)
    {
        this(1, null, zziz, a, abyte0);
    }

    public static zzir a(byte abyte0[])
    {
        return new zzir(abyte0, g);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gm.a(this, parcel, i);
    }

}
