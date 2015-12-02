// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.threads:
//            d

public class FolderCounts
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final int a;
    private final int b;
    private final long c;
    private final long d;

    public FolderCounts(int i, int j, long l, long l1)
    {
        a = i;
        b = j;
        c = l;
        d = l1;
    }

    private FolderCounts(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readLong();
        d = parcel.readLong();
    }

    FolderCounts(Parcel parcel, d d1)
    {
        this(parcel);
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public long c()
    {
        return c;
    }

    public long d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeLong(c);
        parcel.writeLong(d);
    }

}
