// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.wearable:
//            ad

public class zze
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ad();
    final int a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    private final boolean f;
    private boolean g;
    private String h;

    zze(int i, String s, String s1, int j, int k, boolean flag, boolean flag1, 
            String s2)
    {
        a = i;
        b = s;
        c = s1;
        d = j;
        e = k;
        f = flag;
        g = flag1;
        h = s2;
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public final int d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return g;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof zze)
        {
            if (an.a(Integer.valueOf(a), Integer.valueOf(((zze) (obj = (zze)obj)).a)) && an.a(b, ((zze) (obj)).b) && an.a(c, ((zze) (obj)).c) && an.a(Integer.valueOf(d), Integer.valueOf(((zze) (obj)).d)) && an.a(Integer.valueOf(e), Integer.valueOf(((zze) (obj)).e)) && an.a(Boolean.valueOf(f), Boolean.valueOf(((zze) (obj)).f)))
            {
                return true;
            }
        }
        return false;
    }

    public final String f()
    {
        return h;
    }

    public final boolean g()
    {
        return f;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, c, Integer.valueOf(d), Integer.valueOf(e), Boolean.valueOf(f)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
        stringbuilder.append((new StringBuilder("mName=")).append(b).toString());
        stringbuilder.append((new StringBuilder(", mAddress=")).append(c).toString());
        stringbuilder.append((new StringBuilder(", mType=")).append(d).toString());
        stringbuilder.append((new StringBuilder(", mRole=")).append(e).toString());
        stringbuilder.append((new StringBuilder(", mEnabled=")).append(f).toString());
        stringbuilder.append((new StringBuilder(", mIsConnected=")).append(g).toString());
        stringbuilder.append((new StringBuilder(", mEnabled=")).append(h).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ad.a(this, parcel);
    }

}
