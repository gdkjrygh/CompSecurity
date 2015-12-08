// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            if

public final class zzlm
    implements SafeParcelable
{

    public static final if CREATOR = new if();
    final int a;
    private final long b;
    private String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final long i;
    private long j;

    zzlm(int k, long l, String s, String s1, String s2, String s3, 
            String s4, String s5, long l1)
    {
        a = k;
        b = l;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        j = -1L;
        h = s5;
        i = l1;
    }

    public zzlm(long l, String s, String s1, String s2, String s3, String s4, 
            String s5, long l1)
    {
        this(1, l, s, s1, s2, s3, s4, s5, l1);
    }

    public final long a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final String d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return f;
    }

    public final String f()
    {
        return g;
    }

    public final String g()
    {
        return h;
    }

    public final long h()
    {
        return i;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.gms.internal.if.a(this, parcel);
    }

}
