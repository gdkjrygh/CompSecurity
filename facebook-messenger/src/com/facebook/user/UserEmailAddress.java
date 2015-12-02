// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.user:
//            UserIdentifier, q, UserIdentifierKey, s

public class UserEmailAddress extends UserIdentifier
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new q();
    private final UserIdentifierKey a;
    private final String b;
    private final int c;

    private UserEmailAddress(Parcel parcel)
    {
        a = new UserIdentifierKey(s.EMAIL, parcel.readString());
        b = parcel.readString();
        c = parcel.readInt();
    }

    UserEmailAddress(Parcel parcel, q q1)
    {
        this(parcel);
    }

    public UserEmailAddress(String s1, int i)
    {
        a = new UserIdentifierKey(s.EMAIL, s1.toLowerCase());
        b = s1;
        c = i;
    }

    public String a()
    {
        return d();
    }

    public String a(Resources resources)
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public UserIdentifierKey c()
    {
        return a;
    }

    public String d()
    {
        return a.b;
    }

    public int describeContents()
    {
        return 0;
    }

    public s e()
    {
        return s.EMAIL;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(d());
        parcel.writeString(b);
        parcel.writeInt(c);
    }

}
