// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class gek
    implements gej
{

    public static final android.os.Parcelable.Creator CREATOR = new gel();
    private final boolean a;
    private final boolean b;

    gek(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (parcel.readByte() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (parcel.readByte() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    public gek(boolean flag, boolean flag1)
    {
        a = flag;
        b = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean n()
    {
        return a;
    }

    public final boolean o()
    {
        return b;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (b)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}
