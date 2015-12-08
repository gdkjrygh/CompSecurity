// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            g

public final class WakeLockEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    final int a;
    private final long b;
    private int c;
    private final String d;
    private final int e;
    private final List f;
    private final String g;
    private final long h;
    private int i;
    private final String j;
    private final String k;
    private final float l;
    private long m;

    WakeLockEvent(int i1, long l1, int j1, String s, int k1, List list, 
            String s1, long l2, int i2, String s2, String s3, float f1)
    {
        a = i1;
        b = l1;
        c = j1;
        d = s;
        j = s2;
        e = k1;
        m = -1L;
        f = list;
        g = s1;
        h = l2;
        i = i2;
        k = s3;
        l = f1;
    }

    public WakeLockEvent(long l1, int i1, String s, int j1, List list, String s1, 
            long l2, int k1, String s2, String s3, float f1)
    {
        this(1, l1, i1, s, j1, list, s1, l2, k1, s2, s3, f1);
    }

    public long a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public String d()
    {
        return j;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return e;
    }

    public List f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public long h()
    {
        return h;
    }

    public int i()
    {
        return i;
    }

    public String j()
    {
        return k;
    }

    public float k()
    {
        return l;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.common.stats.g.a(this, parcel, i1);
    }

}
