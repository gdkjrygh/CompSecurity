// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class gfo
    implements gfn
{

    public static final android.os.Parcelable.Creator CREATOR = new gfp();
    private final boolean a;
    private final pye b;
    private final String c;

    gfo(Parcel parcel)
    {
        boolean flag = true;
        super();
        if (parcel.readByte() != 1)
        {
            flag = false;
        }
        a = flag;
        b = b.a(parcel);
        c = parcel.readString();
    }

    public gfo(boolean flag, pye pye, String s)
    {
        a = flag;
        b = pye;
        pye = s;
        if (s == null)
        {
            pye = "";
        }
        c = pye;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean g()
    {
        return a;
    }

    public final pye h()
    {
        return b;
    }

    public final String i()
    {
        return c;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        if (a)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        b.a(b, parcel);
        parcel.writeString(c);
    }

}
