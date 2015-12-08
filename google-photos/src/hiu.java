// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class hiu
    implements hil
{

    public static final android.os.Parcelable.Creator CREATOR = new hiv();
    public final hio a;
    public final String b;

    hiu(Parcel parcel)
    {
        a = new hio(parcel);
        b = parcel.readString();
    }

    public hiu(hio hio1, String s)
    {
        a = hio1;
        b = (String)p.a(s);
    }

    public final String a()
    {
        return a.a;
    }

    public final double b()
    {
        return a.b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a.writeToParcel(parcel, i);
        parcel.writeString(b);
    }

}
