// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kcy;

public final class ConnectionEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kcy();
    public final int a;
    public final long b;
    public int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final long k;

    public ConnectionEvent(int l, long l1, int i1, String s, String s1, String s2, 
            String s3, String s4, String s5, long l2, long l3)
    {
        a = l;
        b = l1;
        c = i1;
        d = s;
        e = s1;
        f = s2;
        g = s3;
        h = s4;
        i = s5;
        j = l2;
        k = l3;
    }

    public ConnectionEvent(long l, int i1, String s, String s1, String s2, String s3, 
            String s4, String s5, long l1, long l2)
    {
        this(1, l, i1, s, s1, s2, s3, s4, s5, l1, l2);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        kcy.a(this, parcel);
    }

}
