// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class iks
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new ikt();
    public final String a;

    iks(Parcel parcel)
    {
        a = parcel.readString();
    }

    public iks(String s)
    {
        a = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        String s = a;
        return (new StringBuilder(String.valueOf(s).length() + 16)).append("AuthKeyFeature{").append(s).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
