// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.l;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.l:
//            b

public final class a
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int a;
    final long b;
    int c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;
    final String i;
    final long j;
    final long k;
    private long l;

    a(int i1, long l1, int j1, String s, String s1, String s2, 
            String s3, String s4, String s5, long l2, long l3)
    {
        a = i1;
        b = l1;
        c = j1;
        d = s;
        e = s1;
        f = s2;
        g = s3;
        l = -1L;
        h = s4;
        i = s5;
        j = l2;
        k = l3;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.m4b.maps.l.b.a(this, parcel);
    }

}
