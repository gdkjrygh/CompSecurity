// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class fzu
    implements eks
{

    public static final android.os.Parcelable.Creator CREATOR = new fzv();
    public final fzw a;

    fzu(Parcel parcel)
    {
        a = (fzw)parcel.readParcelable(fzw.getClassLoader());
    }

    public fzu(fzw fzw1)
    {
        a = fzw1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
    }

}
