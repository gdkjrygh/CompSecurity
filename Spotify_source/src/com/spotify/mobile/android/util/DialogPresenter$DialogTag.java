// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.os.Parcel;
import android.os.Parcelable;

class <init>
    implements Parcelable
{

    public static final android.os.gPresenter.DialogTag.a CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new DialogPresenter.DialogTag(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new DialogPresenter.DialogTag[i];
        }

    };
    private final String a;

    static String a(<init> <init>1)
    {
        return <init>1.a;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof a) && ((a)obj).a.equals(a);
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }


    private _cls1(Parcel parcel)
    {
        a = parcel.readString();
    }

    a(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private <init>(String s)
    {
        a = s;
    }

    a(String s, byte byte0)
    {
        this(s);
    }
}
