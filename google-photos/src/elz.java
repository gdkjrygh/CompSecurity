// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class elz
    implements ely
{

    public static final android.os.Parcelable.Creator CREATOR = new ema();
    private final boolean a;

    public elz(Parcel parcel)
    {
        boolean flag = true;
        super();
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        a = flag;
    }

    public elz(boolean flag)
    {
        a = true;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean f()
    {
        return a;
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
    }

}
