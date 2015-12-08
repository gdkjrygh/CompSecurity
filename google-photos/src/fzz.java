// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class fzz
    implements eks
{

    public static final android.os.Parcelable.Creator CREATOR = new gaa();
    public final String a;

    fzz(Parcel parcel)
    {
        a = parcel.readString();
    }

    public fzz(String s)
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
