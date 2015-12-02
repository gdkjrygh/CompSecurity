// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.user:
//            UserIdentifier, r, UserIdentifierKey, s

public class UserFbidIdentifier extends UserIdentifier
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new r();
    private final UserIdentifierKey a;

    private UserFbidIdentifier(Parcel parcel)
    {
        a = new UserIdentifierKey(s.FBID, parcel.readString());
    }

    UserFbidIdentifier(Parcel parcel, r r1)
    {
        this(parcel);
    }

    public UserFbidIdentifier(String s1)
    {
        a = new UserIdentifierKey(s.FBID, s1);
    }

    public String a()
    {
        return a.b;
    }

    public String a(Resources resources)
    {
        return a.b;
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
        return s.FBID;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(d());
    }

}
