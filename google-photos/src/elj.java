// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class elj
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new elk();
    public final String a;

    elj(Parcel parcel)
    {
        a = parcel.readString();
    }

    public elj(String s)
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
