// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class hmz
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hna();
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;

    private hmz()
    {
        b = true;
        d = true;
        h = true;
        i = true;
        j = true;
        k = true;
        l = true;
        q = true;
    }

    hmz(Parcel parcel)
    {
        b = true;
        d = true;
        h = true;
        i = true;
        j = true;
        k = true;
        l = true;
        q = true;
        a = b.c(parcel);
        b = b.c(parcel);
        c = b.c(parcel);
        d = b.c(parcel);
        e = b.c(parcel);
        f = b.c(parcel);
        g = b.c(parcel);
        h = b.c(parcel);
        i = b.c(parcel);
        j = b.c(parcel);
        k = b.c(parcel);
        l = b.c(parcel);
        m = b.c(parcel);
        n = b.c(parcel);
        o = b.c(parcel);
        p = b.c(parcel);
        q = b.c(parcel);
        r = b.c(parcel);
        s = b.c(parcel);
    }

    public static hmz a()
    {
        hmz hmz1 = new hmz();
        hmz1.c = true;
        hmz1.g = true;
        hmz1.n = true;
        hmz1.o = true;
        hmz1.p = true;
        hmz1.r = true;
        hmz1.s = true;
        return hmz1;
    }

    public static hmz a(boolean flag)
    {
        hmz hmz1 = new hmz();
        hmz1.b = flag;
        hmz1.a = true;
        hmz1.e = true;
        hmz1.f = true;
        hmz1.h = false;
        hmz1.i = false;
        hmz1.j = false;
        hmz1.k = true;
        hmz1.m = true;
        hmz1.n = true;
        return hmz1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        b.a(parcel, a);
        b.a(parcel, b);
        b.a(parcel, c);
        b.a(parcel, d);
        b.a(parcel, e);
        b.a(parcel, f);
        b.a(parcel, g);
        b.a(parcel, h);
        b.a(parcel, i);
        b.a(parcel, j);
        b.a(parcel, k);
        b.a(parcel, l);
        b.a(parcel, m);
        b.a(parcel, n);
        b.a(parcel, o);
        b.a(parcel, p);
        b.a(parcel, q);
        b.a(parcel, r);
        b.a(parcel, s);
    }

}
