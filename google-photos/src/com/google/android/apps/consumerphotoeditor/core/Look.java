// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.core;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import bdq;

public class Look
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bdq();
    public Bitmap a;
    public String b;
    public int c;
    public int d;
    public int e;

    public Look(Bitmap bitmap, String s, int i, int j, int k)
    {
        a = bitmap;
        b = s;
        c = i;
        d = j;
        e = k;
    }

    public Look(Parcel parcel)
    {
        a = (Bitmap)parcel.readParcelable(android/graphics/Bitmap.getClassLoader());
        b = parcel.readString();
        c = parcel.readInt();
        d = parcel.readInt();
        e = parcel.readInt();
    }

    public int describeContents()
    {
        return a.describeContents();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeString(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeInt(e);
    }

}
