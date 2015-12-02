// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.orca.threads.FolderName;

// Referenced classes of package com.facebook.orca.server:
//            q

public class FetchMoreThreadsParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new q();
    private final FolderName a;
    private final long b;
    private final int c;

    private FetchMoreThreadsParams(Parcel parcel)
    {
        a = (FolderName)parcel.readParcelable(com/facebook/orca/threads/FolderName.getClassLoader());
        b = parcel.readLong();
        c = parcel.readInt();
    }

    FetchMoreThreadsParams(Parcel parcel, q q1)
    {
        this(parcel);
    }

    public FetchMoreThreadsParams(FolderName foldername, long l, int i)
    {
        a = foldername;
        b = l;
        c = i;
    }

    public FolderName a()
    {
        return a;
    }

    public long b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeLong(b);
        parcel.writeInt(c);
    }

}
