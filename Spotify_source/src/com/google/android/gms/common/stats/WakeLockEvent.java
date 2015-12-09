// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.text.TextUtils;
import btt;
import btv;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class WakeLockEvent extends btt
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new btv();
    public final int a;
    public final long b;
    public int c;
    public final String d;
    public final int e;
    public final List f;
    public final String g;
    public final long h;
    public int i;
    public final String j;
    public final String k;
    public final float l;
    public final long m;
    private long n;

    public WakeLockEvent(int i1, long l1, int j1, String s, int k1, List list, 
            String s1, long l2, int i2, String s2, String s3, float f1, 
            long l3)
    {
        a = i1;
        b = l1;
        c = j1;
        d = s;
        j = s2;
        e = k1;
        n = -1L;
        f = list;
        g = s1;
        h = l2;
        i = i2;
        k = s3;
        l = f1;
        m = l3;
    }

    public WakeLockEvent(long l1, int i1, String s, int j1, List list, String s1, 
            long l2, int k1, String s2, String s3, float f1, long l3)
    {
        this(1, l1, i1, s, j1, list, s1, l2, k1, s2, s3, f1, l3);
    }

    public final long a()
    {
        return b;
    }

    public final int b()
    {
        return c;
    }

    public final long c()
    {
        return n;
    }

    public final String d()
    {
        StringBuilder stringbuilder = (new StringBuilder("\t")).append(d).append("\t").append(e).append("\t");
        String s;
        if (f == null)
        {
            s = "";
        } else
        {
            s = TextUtils.join(",", f);
        }
        stringbuilder = stringbuilder.append(s).append("\t").append(i).append("\t");
        if (j == null)
        {
            s = "";
        } else
        {
            s = j;
        }
        stringbuilder = stringbuilder.append(s).append("\t");
        if (k == null)
        {
            s = "";
        } else
        {
            s = k;
        }
        return stringbuilder.append(s).append("\t").append(l).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        btv.a(this, parcel);
    }

}
