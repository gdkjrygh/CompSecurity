// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class gsn
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new gso();
    public final boolean a;
    private final int b;

    public gsn(int i)
    {
        this(i, false);
    }

    public gsn(int i, boolean flag)
    {
        b = i;
        a = flag;
    }

    gsn(Parcel parcel)
    {
        b = parcel.readInt();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    public final boolean a()
    {
        return b == 2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(b);
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
