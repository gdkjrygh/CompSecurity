// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class ikq
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new ikr();
    public final String a;

    ikq(Parcel parcel)
    {
        a = parcel.readString();
    }

    public ikq(String s)
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
        return (new StringBuilder(String.valueOf(s).length() + 30)).append("SharedMediaFeature{mediaKey: ").append(s).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
