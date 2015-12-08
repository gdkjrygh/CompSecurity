// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

class <init>
    implements Parcelable, Serializable
{

    public static final android.os.r CREATOR = new _cls1();
    private String a;
    private String b;

    protected final String a()
    {
        return a;
    }

    protected final String b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }


    public _cls1()
    {
    }

    private _cls1(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
    }

    b(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    /* block-local class not found */
    class _cls1 {}

}
