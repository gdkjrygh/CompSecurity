// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.os.Parcel;
import android.os.Parcelable;

public class InstallRequirement
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public InstallRequirement a(Parcel parcel)
        {
            return new InstallRequirement(parcel);
        }

        public InstallRequirement[] a(int i)
        {
            return new InstallRequirement[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private String a;
    private String b;
    private int c;

    public InstallRequirement()
    {
    }

    private InstallRequirement(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readInt();
    }


    public String a()
    {
        return a;
    }

    public String b()
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
        parcel.writeInt(c);
    }

}
