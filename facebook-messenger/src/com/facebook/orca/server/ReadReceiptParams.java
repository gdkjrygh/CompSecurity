// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.orca.server:
//            ar

public class ReadReceiptParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ar();
    private final String a;
    private final UserKey b;
    private final long c;

    private ReadReceiptParams(Parcel parcel)
    {
        a = parcel.readString();
        b = UserKey.a(parcel.readString());
        c = parcel.readLong();
    }

    ReadReceiptParams(Parcel parcel, ar ar1)
    {
        this(parcel);
    }

    public ReadReceiptParams(String s, UserKey userkey, long l)
    {
        a = s;
        b = userkey;
        c = l;
    }

    public long a()
    {
        return c;
    }

    public String b()
    {
        return a;
    }

    public UserKey c()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b.c());
        parcel.writeLong(c);
    }

}
