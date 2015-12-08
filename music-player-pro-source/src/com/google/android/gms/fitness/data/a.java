// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.mg;

// Referenced classes of package com.google.android.gms.fitness.data:
//            b

public final class a
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public static final a TT = new a("com.google.android.gms", String.valueOf(0x648278), null);
    private final int CK;
    private final String CS;
    private final String TU;
    private final String TV;

    a(int i, String s, String s1, String s2)
    {
        CK = i;
        CS = (String)jx.i(s);
        TU = "";
        TV = s2;
    }

    public a(String s, String s1, String s2)
    {
        this(1, s, "", s2);
    }

    private boolean a(a a1)
    {
        return CS.equals(a1.CS) && jv.equal(TU, a1.TU) && jv.equal(TV, a1.TV);
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
        return CS;
    }

    public String getVersion()
    {
        return TU;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            CS, TU, TV
        });
    }

    public String jk()
    {
        return TV;
    }

    a jl()
    {
        return new a(mg.bw(CS), mg.bw(TU), mg.bw(TV));
    }

    public String toString()
    {
        return String.format("Application{%s:%s:%s}", new Object[] {
            CS, TU, TV
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
