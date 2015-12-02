// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.protocol;

import android.os.Parcel;
import com.facebook.auth.credentials.FacebookCredentials;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.auth.protocol:
//            AuthenticationResult, g

public class AuthenticationResultImpl
    implements AuthenticationResult
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final String a;
    private final FacebookCredentials b;
    private final String c;

    private AuthenticationResultImpl(Parcel parcel)
    {
        a = parcel.readString();
        b = (FacebookCredentials)parcel.readParcelable(null);
        c = parcel.readString();
    }

    AuthenticationResultImpl(Parcel parcel, g g1)
    {
        this(parcel);
    }

    public AuthenticationResultImpl(String s, FacebookCredentials facebookcredentials, String s1)
    {
        a = (String)Preconditions.checkNotNull(s);
        b = facebookcredentials;
        c = s1;
    }

    public FacebookCredentials a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, i);
        parcel.writeString(c);
    }

}
