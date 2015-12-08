// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class cod
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new coe();
    public static final cod a = new cod(0L, 0L);
    public final long b;
    public final long c;
    private volatile int d;

    public cod(long l, long l1)
    {
        boolean flag;
        if (l <= l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "startPointUs must be <= endPointUs");
        b = l;
        c = l1;
    }

    cod(Parcel parcel)
    {
        b = parcel.readLong();
        c = parcel.readLong();
    }

    public final long a()
    {
        return c - b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof cod))
            {
                return false;
            }
            obj = (cod)obj;
            if (b != ((cod) (obj)).b || c != ((cod) (obj)).c)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        if (d == 0)
        {
            d = b.a(b, b.a(c, 17));
        }
        return d;
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            Long.valueOf(b), Long.valueOf(c)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(b);
        parcel.writeLong(c);
    }

}
