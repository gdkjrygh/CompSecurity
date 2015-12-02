// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.http.protocol:
//            c, d

public class ApiErrorResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final d d;

    public ApiErrorResult(int i, String s, String s1)
    {
        this(i, s, s1, d.API_EC_DOMAIN);
    }

    public ApiErrorResult(int i, String s, String s1, d d1)
    {
        a = i;
        b = s;
        c = s1;
        d = d1;
    }

    private ApiErrorResult(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        c = parcel.readString();
        d = (d)Enum.valueOf(com/facebook/http/protocol/d, parcel.readString());
    }

    ApiErrorResult(Parcel parcel, c c1)
    {
        this(parcel);
    }

    public int a()
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

    public d d()
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
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d.toString());
    }

}
