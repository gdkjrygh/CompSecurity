// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kw;

// Referenced classes of package com.google.android.gms.fitness.data:
//            b

public final class a
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public static final a Sw = new a("com.google.android.gms", String.valueOf(0x5e2978), null);
    private final int BR;
    private final String BZ;
    private final String Sx;
    private final String Sy;

    a(int i, String s, String s1, String s2)
    {
        BR = i;
        BZ = (String)o.i(s);
        Sx = "";
        Sy = s2;
    }

    public a(String s, String s1, String s2)
    {
        this(1, s, "", s2);
    }

    private boolean a(a a1)
    {
        return BZ.equals(a1.BZ) && n.equal(Sx, a1.Sx) && n.equal(Sy, a1.Sy);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof a) && a((a)obj);
    }

    public String getPackageName()
    {
        return BZ;
    }

    public String getVersion()
    {
        return Sx;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            BZ, Sx, Sy
        });
    }

    a iA()
    {
        return new a(kw.bt(BZ), kw.bt(Sx), kw.bt(Sy));
    }

    public String iz()
    {
        return Sy;
    }

    public String toString()
    {
        return String.format("Application{%s:%s:%s}", new Object[] {
            BZ, Sx, Sy
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
