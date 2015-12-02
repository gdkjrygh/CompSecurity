// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.server:
//            o, ThreadCriteria

public class FetchMoreMessagesParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    private final ThreadCriteria a;
    private final long b;
    private final long c;
    private final int d;

    private FetchMoreMessagesParams(Parcel parcel)
    {
        a = (ThreadCriteria)parcel.readParcelable(com/facebook/orca/server/ThreadCriteria.getClassLoader());
        b = parcel.readLong();
        c = parcel.readLong();
        d = parcel.readInt();
    }

    FetchMoreMessagesParams(Parcel parcel, o o1)
    {
        this(parcel);
    }

    public FetchMoreMessagesParams(ThreadCriteria threadcriteria, long l, long l1, int i)
    {
        a = threadcriteria;
        b = l;
        c = l1;
        d = i;
    }

    public ThreadCriteria a()
    {
        return a;
    }

    public long b()
    {
        return b;
    }

    public long c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeLong(b);
        parcel.writeLong(c);
        parcel.writeInt(d);
    }

}
