// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class mtq
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mtr();
    public final int a;
    public final String b;
    public final mue c;

    public mtq(int i, String s, mue mue1)
    {
        a = i;
        b = s;
        c = mue1;
    }

    mtq(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        int i = parcel.readInt();
        Exception exception = (Exception)parcel.readSerializable();
        String s = parcel.readString();
        long l = parcel.readLong();
        c = new mue(i, exception, s, parcel.createByteArray(), l);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeInt(c.b);
        parcel.writeSerializable(c.c);
        parcel.writeString(c.d);
        parcel.writeLong(c.e);
        parcel.writeByteArray(c.b());
    }

}
