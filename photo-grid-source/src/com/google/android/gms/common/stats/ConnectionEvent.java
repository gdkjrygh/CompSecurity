// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.stats:
//            h, a

public final class ConnectionEvent extends h
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    private final long d;
    private int e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final long l;
    private final long m;
    private long n;

    ConnectionEvent(int i1, long l1, int j1, String s, String s1, String s2, 
            String s3, String s4, String s5, long l2, long l3)
    {
        a = i1;
        d = l1;
        e = j1;
        f = s;
        g = s1;
        h = s2;
        i = s3;
        n = -1L;
        j = s4;
        k = s5;
        l = l2;
        m = l3;
    }

    public ConnectionEvent(long l1, int i1, String s, String s1, String s2, String s3, 
            String s4, String s5, long l2, long l3)
    {
        this(1, l1, i1, s, s1, s2, s3, s4, s5, l2, l3);
    }

    public final long a()
    {
        return d;
    }

    public final int b()
    {
        return e;
    }

    public final String c()
    {
        return f;
    }

    public final String d()
    {
        return g;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return h;
    }

    public final String f()
    {
        return i;
    }

    public final String g()
    {
        return j;
    }

    public final String h()
    {
        return k;
    }

    public final long i()
    {
        return n;
    }

    public final long j()
    {
        return m;
    }

    public final long k()
    {
        return l;
    }

    public final String l()
    {
        StringBuilder stringbuilder = (new StringBuilder("\t")).append(f).append("/").append(g).append("\t").append(h).append("/").append(i).append("\t");
        String s;
        if (j == null)
        {
            s = "";
        } else
        {
            s = j;
        }
        return stringbuilder.append(s).append("\t").append(m).toString();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.common.stats.a.a(this, parcel);
    }

}
