// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import jsf;

public class Command
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jsf();
    public String a;
    public String b;
    private String c;

    public Command()
    {
    }

    public Command(Parcel parcel)
    {
        a = parcel.readString();
        c = parcel.readString();
        b = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(c);
        parcel.writeString(b);
    }

}
