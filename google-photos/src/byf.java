// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class byf
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new byg();
    public float a;
    public long b;
    public int c;
    public boolean d;

    public byf()
    {
        a = 0.0F;
        b = -1L;
        c = 0;
        d = false;
    }

    public byf(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = 0.0F;
        b = -1L;
        c = 0;
        d = false;
        a = parcel.readFloat();
        b = parcel.readLong();
        c = parcel.readInt();
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        d = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(a);
        parcel.writeLong(b);
        parcel.writeInt(c);
        if (d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}
