// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.user:
//            a

public class Birthday
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int a;
    private final int b;
    private final int c;

    public Birthday(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public Birthday(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readInt();
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public boolean d()
    {
        return c != 0;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
    }

}
