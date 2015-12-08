// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public class fzw
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fzx();
    public final Double a;
    public final Double b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Integer f;
    public final String g;
    public final String h;
    public final Long i;
    public final Float j;
    public final Float k;
    public final Float l;
    public final Integer m;
    public final String n;
    public final String o;
    public final Integer p;
    public final Long q;
    public final Long r;
    public final String s;

    fzw(Parcel parcel)
    {
        ClassLoader classloader = getClass().getClassLoader();
        a = (Double)parcel.readValue(classloader);
        b = (Double)parcel.readValue(classloader);
        c = (Long)parcel.readValue(classloader);
        d = (Long)parcel.readValue(classloader);
        e = (Long)parcel.readValue(classloader);
        f = (Integer)parcel.readValue(classloader);
        g = parcel.readString();
        h = parcel.readString();
        i = (Long)parcel.readValue(classloader);
        j = (Float)parcel.readValue(classloader);
        k = (Float)parcel.readValue(classloader);
        l = (Float)parcel.readValue(classloader);
        m = (Integer)parcel.readValue(classloader);
        n = parcel.readString();
        o = parcel.readString();
        p = (Integer)parcel.readValue(classloader);
        q = (Long)parcel.readValue(classloader);
        s = parcel.readString();
        r = (Long)parcel.readValue(classloader);
    }

    fzw(fzy fzy1)
    {
        a = fzy1.a;
        b = fzy1.b;
        c = fzy1.c;
        d = fzy1.d;
        e = fzy1.e;
        f = fzy1.f;
        g = fzy1.g;
        h = fzy1.h;
        i = fzy1.i;
        j = fzy1.j;
        k = fzy1.k;
        l = fzy1.l;
        m = fzy1.m;
        n = fzy1.n;
        o = fzy1.o;
        p = fzy1.p;
        q = fzy1.q;
        s = fzy1.r;
        r = fzy1.s;
    }

    static String a(fzw fzw1)
    {
        return fzw1.s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeValue(a);
        parcel.writeValue(b);
        parcel.writeValue(c);
        parcel.writeValue(d);
        parcel.writeValue(e);
        parcel.writeValue(f);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeValue(i);
        parcel.writeValue(j);
        parcel.writeValue(k);
        parcel.writeValue(l);
        parcel.writeValue(m);
        parcel.writeString(n);
        parcel.writeString(o);
        parcel.writeValue(p);
        parcel.writeValue(q);
        parcel.writeString(s);
        parcel.writeValue(r);
    }

}
