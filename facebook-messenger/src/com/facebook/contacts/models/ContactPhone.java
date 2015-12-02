// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.contacts.models:
//            d

public class ContactPhone
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;

    private ContactPhone(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        e = flag;
    }

    ContactPhone(Parcel parcel, d d1)
    {
        this(parcel);
    }

    public ContactPhone(String s, String s1, String s2, String s3, boolean flag)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDisplayNumber()
    {
        return c;
    }

    public String getId()
    {
        return a;
    }

    public boolean getIsVerified()
    {
        return e;
    }

    public String getLabel()
    {
        return b;
    }

    public String getUniversalNumber()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ContactPhone<").append(a).append(":").append(b).append("> ").append(d).append(" (").append(c).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
