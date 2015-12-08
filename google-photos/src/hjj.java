// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class hjj
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new hjk();
    private final String a;

    hjj(Parcel parcel)
    {
        a = parcel.readString();
    }

    public hjj(String s)
    {
        a = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
