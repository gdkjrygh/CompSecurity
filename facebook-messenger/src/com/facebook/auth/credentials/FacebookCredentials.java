// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.credentials;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.auth.credentials:
//            a

public class FacebookCredentials
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private FacebookCredentials(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readLong();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readString();
    }

    FacebookCredentials(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public FacebookCredentials(String s, String s1, long l)
    {
        a = s;
        b = s1;
        c = l;
        d = null;
        e = null;
        f = null;
        g = null;
    }

    public FacebookCredentials(String s, String s1, long l, String s2, String s3, String s4, 
            String s5)
    {
        a = s;
        b = s1;
        c = l;
        d = s2;
        e = s3;
        f = s4;
        g = s5;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public long c()
    {
        return c;
    }

    public String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return d;
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeLong(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
    }

}
