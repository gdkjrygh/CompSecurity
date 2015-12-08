// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class <init>
    implements Parcelable, Serializable
{

    public static final android.os.s.Card.BillingAddress.g CREATOR = new _cls1();
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;

    protected final void a(String s)
    {
        a = s;
    }

    protected final void b(String s)
    {
        b = s;
    }

    protected final void c(String s)
    {
        d = s;
    }

    protected final void d(String s)
    {
        e = s;
    }

    public int describeContents()
    {
        return 0;
    }

    protected final void e(String s)
    {
        f = s;
    }

    protected final void f(String s)
    {
        g = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
    }


    public _cls1()
    {
    }

    private _cls1(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readString();
    }

    g(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    /* block-local class not found */
    class _cls1 {}

}
