// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.credentials;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.auth.credentials:
//            c

public class PasswordCredentials
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final String a;
    private final String b;

    private PasswordCredentials(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
    }

    PasswordCredentials(Parcel parcel, c c1)
    {
        this(parcel);
    }

    public PasswordCredentials(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public String a()
    {
        return a;
    }

    public String b()
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
        parcel.writeString(b);
    }

}
