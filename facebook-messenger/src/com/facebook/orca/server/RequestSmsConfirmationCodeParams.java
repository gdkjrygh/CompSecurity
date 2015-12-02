// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.server:
//            au

public class RequestSmsConfirmationCodeParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new au();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    private RequestSmsConfirmationCodeParams(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
    }

    RequestSmsConfirmationCodeParams(Parcel parcel, au au1)
    {
        this(parcel);
    }

    public RequestSmsConfirmationCodeParams(String s, String s1, String s2, String s3, String s4)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
    }

    public String a()
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

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return e;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
    }

}
