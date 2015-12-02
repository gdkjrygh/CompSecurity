// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            av

public class c
    implements Parcelable
{

    public static final android.os.rtcMessageMethod.Params.c CREATOR = new av();
    private final long a;
    private final String b;
    private final String c;

    public long a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }


    public (long l, String s, String s1)
    {
        a = l;
        b = s;
        c = s1;
    }

    public c(Parcel parcel)
    {
        a = parcel.readLong();
        b = parcel.readString();
        c = parcel.readString();
    }
}
