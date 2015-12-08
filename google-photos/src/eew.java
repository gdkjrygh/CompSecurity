// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class eew
    implements eev
{

    public static final android.os.Parcelable.Creator CREATOR = new eex();
    private final boolean a;
    private final int b;

    eew(Parcel parcel)
    {
        boolean flag = true;
        super();
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        a = flag;
        b = parcel.readInt();
    }

    public eew(boolean flag, int i)
    {
        a = flag;
        b = i;
    }

    public final boolean a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        parcel.writeInt(b);
    }

}
