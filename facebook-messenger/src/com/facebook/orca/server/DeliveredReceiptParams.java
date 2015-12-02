// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.orca.server:
//            h

public class DeliveredReceiptParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    private final String a;
    private final UserKey b;
    private final String c;

    private DeliveredReceiptParams(Parcel parcel)
    {
        a = parcel.readString();
        b = UserKey.a(parcel.readString());
        c = parcel.readString();
    }

    DeliveredReceiptParams(Parcel parcel, h h1)
    {
        this(parcel);
    }

    public DeliveredReceiptParams(String s, UserKey userkey, String s1)
    {
        a = s;
        b = userkey;
        c = s1;
    }

    public String a()
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
        parcel.writeString(c);
    }

}
