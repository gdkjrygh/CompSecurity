// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class obb extends nzx
{

    public static final android.os.Parcelable.Creator CREATOR = new obc();
    boolean a;

    public obb(Parcel parcel)
    {
        boolean flag = true;
        super(parcel);
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        a = flag;
    }

    public obb(Parcelable parcelable)
    {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
