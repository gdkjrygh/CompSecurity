// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.user:
//            f

public class LastActive
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    private final long a;
    private final boolean b;

    public LastActive(long l, boolean flag)
    {
        a = l;
        b = flag;
    }

    public LastActive(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readLong();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        b = flag;
    }

    public long a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LastActive)obj;
            if (b != ((LastActive) (obj)).b)
            {
                return false;
            }
            if (a != ((LastActive) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
