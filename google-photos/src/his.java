// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class his
    implements hil
{

    public static final android.os.Parcelable.Creator CREATOR = new hit();
    public final hio a;
    public final String b;
    public final ems c;
    public final ems d;
    private final String e;
    private final String f;
    private final String g;

    his(Parcel parcel)
    {
        a = new hio(parcel);
        c = ems.a(parcel.readDouble(), parcel.readDouble());
        f = parcel.readString();
        g = parcel.readString();
        d = ems.a(parcel.readDouble(), parcel.readDouble());
        b = parcel.readString();
        e = parcel.readString();
    }

    public his(hio hio1, ems ems1, String s, String s1, ems ems2, String s2, String s3)
    {
        a = hio1;
        c = ems1;
        f = s;
        g = s1;
        d = ems2;
        b = s2;
        e = s3;
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
        parcel.writeDouble(c.a);
        parcel.writeDouble(c.b);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeDouble(d.a);
        parcel.writeDouble(d.b);
        parcel.writeString(b);
        parcel.writeString(e);
    }

}
