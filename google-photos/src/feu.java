// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class feu
    implements eks
{

    public static final android.os.Parcelable.Creator CREATOR = new fev();
    final String a;
    public final String b;

    feu(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
    }

    public feu(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }

}
