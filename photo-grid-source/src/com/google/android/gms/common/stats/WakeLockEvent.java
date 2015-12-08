// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            h, j

public final class WakeLockEvent extends h
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    final int a;
    private final long d;
    private int e;
    private final String f;
    private final int g;
    private final List h;
    private final String i;
    private final long j;
    private int k;
    private final String l;
    private final String m;
    private final float n;
    private final long o;
    private long p;

    WakeLockEvent(int i1, long l1, int j1, String s, int k1, List list, 
            String s1, long l2, int i2, String s2, String s3, float f1, 
            long l3)
    {
        a = i1;
        d = l1;
        e = j1;
        f = s;
        l = s2;
        g = k1;
        p = -1L;
        h = list;
        i = s1;
        j = l2;
        k = i2;
        m = s3;
        n = f1;
        o = l3;
    }

    public WakeLockEvent(long l1, int i1, String s, int j1, List list, String s1, 
            long l2, int k1, String s2, String s3, float f1, long l3)
    {
        this(1, l1, i1, s, j1, list, s1, l2, k1, s2, s3, f1, l3);
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
        return l;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int e()
    {
        return g;
    }

    public final List f()
    {
        return h;
    }

    public final String g()
    {
        return i;
    }

    public final long h()
    {
        return j;
    }

    public final long i()
    {
        return p;
    }

    public final int j()
    {
        return k;
    }

    public final String k()
    {
        return m;
    }

    public final String l()
    {
        StringBuilder stringbuilder = (new StringBuilder("\t")).append(f).append("\t").append(g).append("\t");
        String s;
        if (h == null)
        {
            s = "";
        } else
        {
            s = TextUtils.join(",", h);
        }
        stringbuilder = stringbuilder.append(s).append("\t").append(k).append("\t");
        if (l == null)
        {
            s = "";
        } else
        {
            s = l;
        }
        stringbuilder = stringbuilder.append(s).append("\t");
        if (m == null)
        {
            s = "";
        } else
        {
            s = m;
        }
        return stringbuilder.append(s).append("\t").append(n).toString();
    }

    public final float m()
    {
        return n;
    }

    public final long n()
    {
        return o;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.common.stats.j.a(this, parcel);
    }

}
