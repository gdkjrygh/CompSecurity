// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class efu
    implements eft
{

    public static final android.os.Parcelable.Creator CREATOR = new efv();
    private final euu a;
    private final String b;

    efu(Parcel parcel)
    {
        b = parcel.readString();
        a = (euu)parcel.readSerializable();
    }

    public efu(String s, euu euu1)
    {
        b = s;
        a = euu1;
    }

    public final euu c()
    {
        return a;
    }

    public final String d()
    {
        return b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeSerializable(a);
    }

}
