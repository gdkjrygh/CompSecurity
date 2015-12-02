// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.server:
//            ah, ai

public class MarkThreadParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ah();
    private final String a;
    private final ai b;
    private final boolean c;
    private final long d;

    private MarkThreadParams(Parcel parcel)
    {
        a = parcel.readString();
        b = ai.valueOf(parcel.readString());
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = parcel.readLong();
    }

    MarkThreadParams(Parcel parcel, ah ah1)
    {
        this(parcel);
    }

    public MarkThreadParams(String s, ai ai1, boolean flag, long l)
    {
        a = s;
        b = ai1;
        c = flag;
        d = l;
    }

    public String a()
    {
        return a;
    }

    public ai b()
    {
        return b;
    }

    public boolean c()
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
        parcel.writeString(a);
        parcel.writeString(b.name());
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeLong(d);
    }

}
