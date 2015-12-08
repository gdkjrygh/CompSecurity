// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class gth
    implements gtg
{

    public static final android.os.Parcelable.Creator CREATOR = new gti();
    private final boolean a;

    gth(Parcel parcel)
    {
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    public gth(boolean flag)
    {
        a = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean j()
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
        parcel.writeInt(i);
    }

}
