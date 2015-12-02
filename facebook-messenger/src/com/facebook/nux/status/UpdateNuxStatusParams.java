// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.nux.status:
//            m, n

public class UpdateNuxStatusParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    private final String a;
    private final String b;
    private final n c;

    private UpdateNuxStatusParams(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = n.values()[parcel.readInt()];
    }

    UpdateNuxStatusParams(Parcel parcel, m m1)
    {
        this(parcel);
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public n c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeInt(c.ordinal());
    }

}
