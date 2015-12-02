// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.server:
//            c

public class ConfirmPhoneAndRegisterPartialAccountParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    private ConfirmPhoneAndRegisterPartialAccountParams(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readString();
        h = parcel.readString();
    }

    ConfirmPhoneAndRegisterPartialAccountParams(Parcel parcel, c c1)
    {
        this(parcel);
    }

    public ConfirmPhoneAndRegisterPartialAccountParams(String s, String s1, String s2, String s3, String s4, String s5)
    {
        this(s, s1, s2, s3, s4, s5, null, null);
    }

    public ConfirmPhoneAndRegisterPartialAccountParams(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        g = s6;
        h = s7;
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

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        parcel.writeString(h);
    }

}
