// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            f, g

public final class WakeLockEvent extends f
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    final int a;
    final long b;
    int c;
    final String d;
    final int e;
    final List f;
    final String g;
    final long h;
    int i;
    final String j;
    final String k;
    final float l;
    final long m;
    private long p;

    WakeLockEvent(int i1, long l1, int j1, String s, int k1, List list, 
            String s1, long l2, int i2, String s2, String s3, float f1, 
            long l3)
    {
        a = i1;
        b = l1;
        c = j1;
        d = s;
        j = s2;
        e = k1;
        p = -1L;
        f = list;
        g = s1;
        h = l2;
        i = i2;
        k = s3;
        l = f1;
        m = l3;
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
        return p;
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
        com.google.android.gms.common.stats.g.a(this, parcel);
    }

}
