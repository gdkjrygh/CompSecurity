// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import android.os.Parcel;
import android.os.Parcelable;

public class SnapchatTextStyle
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new SnapchatTextStyle(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new SnapchatTextStyle[i];
        }

    };
    public Qn.a a;
    public int b;
    public int c;

    public SnapchatTextStyle(Qn.a a1, int i, int j)
    {
        a = a1;
        b = i;
        c = j;
    }

    private SnapchatTextStyle(Parcel parcel)
    {
        a = Qn.a.values()[parcel.readInt()];
        b = parcel.readInt();
        c = parcel.readInt();
    }

    SnapchatTextStyle(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.ordinal());
        parcel.writeInt(b);
        parcel.writeInt(c);
    }

}
