// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.user:
//            ai, User, UserIdentifier, s, 
//            UserKey, n

public class UserWithIdentifier
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ai();
    private final User a;
    private final UserIdentifier b;

    private UserWithIdentifier(Parcel parcel)
    {
        a = (User)parcel.readParcelable(com/facebook/user/User.getClassLoader());
        b = (UserIdentifier)parcel.readParcelable(com/facebook/user/UserIdentifier.getClassLoader());
    }

    UserWithIdentifier(Parcel parcel, ai ai1)
    {
        this(parcel);
    }

    public UserWithIdentifier(User user, UserIdentifier useridentifier)
    {
        a = user;
        b = useridentifier;
    }

    public User a()
    {
        return a;
    }

    public UserKey b()
    {
        if (b.e() == s.FBID)
        {
            return a().c();
        }
        if (b.e() == s.PHONE)
        {
            return new UserKey(n.PHONE_NUMBER, d());
        }
        if (b.e() == s.EMAIL)
        {
            return new UserKey(n.EMAIL, d());
        } else
        {
            return null;
        }
    }

    public UserIdentifier c()
    {
        return b;
    }

    public String d()
    {
        return b.d();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeParcelable(b, i);
    }

}
