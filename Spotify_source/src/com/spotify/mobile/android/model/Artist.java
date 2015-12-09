// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import gen;

public final class Artist
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Artist(parcel);
        }

        public final volatile Object[] newArray(int i1)
        {
            return new Artist[i1];
        }

    };
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final String m;
    private final String n;
    private final String o;
    private final boolean p;
    private final boolean q;
    private final boolean r;

    public Artist(int i1, int j1, int k1, int l1, int i2, int j2, String s, 
            String s1, String s2, String s3, String s4, String s5, String s6, boolean flag, 
            boolean flag1, boolean flag2, boolean flag3, boolean flag4)
    {
        j = i1;
        a = j1;
        b = k1;
        k = l1;
        c = i2;
        l = j2;
        d = s;
        e = s1;
        f = s2;
        m = s3;
        g = s4;
        n = s5;
        o = s6;
        p = flag;
        q = flag1;
        h = flag2;
        r = flag3;
        i = flag4;
    }

    protected Artist(Parcel parcel)
    {
        j = parcel.readInt();
        a = parcel.readInt();
        b = parcel.readInt();
        k = parcel.readInt();
        c = parcel.readInt();
        l = parcel.readInt();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        m = parcel.readString();
        g = parcel.readString();
        n = parcel.readString();
        o = parcel.readString();
        p = gen.a(parcel);
        q = gen.a(parcel);
        h = gen.a(parcel);
        r = gen.a(parcel);
        i = gen.a(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeInt(j);
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeInt(k);
        parcel.writeInt(c);
        parcel.writeInt(l);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(m);
        parcel.writeString(g);
        parcel.writeString(n);
        parcel.writeString(o);
        gen.a(parcel, p);
        gen.a(parcel, q);
        gen.a(parcel, h);
        gen.a(parcel, r);
        gen.a(parcel, i);
    }

}
