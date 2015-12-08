// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.search.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            t

public final class am
    implements SafeParcelable
{

    public static final t a = new t();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final int l;
    public final String m;
    public final int n;
    public final int o;
    public final String p;

    am(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2, int i3, String s, int j3, String s1, int k3, int l3, 
            String s2)
    {
        b = i1;
        c = j1;
        d = k1;
        e = l1;
        f = i2;
        g = j2;
        h = k2;
        i = l2;
        j = i3;
        k = s;
        l = j3;
        m = s1;
        n = k3;
        o = l3;
        p = s2;
    }

    public am(a a1)
    {
        b = 1;
        c = a1.a();
        d = a1.b();
        e = a1.c();
        f = a1.d();
        g = a1.e();
        h = a1.f();
        i = a1.g();
        j = a1.h();
        k = a1.i();
        l = a1.j();
        m = a1.k();
        n = a1.l();
        o = a1.m();
        p = a1.n();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.internal.t.a(this, parcel);
    }

}
