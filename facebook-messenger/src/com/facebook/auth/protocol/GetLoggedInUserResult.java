// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.protocol;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.c.a;
import com.facebook.fbservice.c.b;
import com.facebook.user.User;

// Referenced classes of package com.facebook.auth.protocol:
//            i

public class GetLoggedInUserResult extends a
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    private final User a;

    private GetLoggedInUserResult(Parcel parcel)
    {
        super(parcel);
        a = (User)parcel.readParcelable(com/facebook/user/User.getClassLoader());
    }

    GetLoggedInUserResult(Parcel parcel, i j)
    {
        this(parcel);
    }

    public GetLoggedInUserResult(b b, User user, long l)
    {
        super(b, l);
        a = user;
    }

    public User a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeParcelable(a, j);
    }

}
