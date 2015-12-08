// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.auth;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.apps.unveil.auth:
//            b

public class AuthToken
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public final AuthTokenType a;
    public final String b;

    public AuthToken(AuthTokenType authtokentype, String s)
    {
        a = authtokentype;
        b = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName());
        String s = String.valueOf(a);
        stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 8)).append(" { type=").append(s).toString());
        s = b;
        stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 18)).append(" authTokenValue=").append(s).append(" }").toString());
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.name());
        parcel.writeString(b);
    }


    private class AuthTokenType extends Enum
    {

        public static final AuthTokenType GPLUS;
        public static final AuthTokenType SID;
        public static final AuthTokenType WEBUPDATES;
        private static final AuthTokenType a[];
        private final String authTokenType;

        public static AuthTokenType valueOf(String s)
        {
            return (AuthTokenType)Enum.valueOf(com/google/android/apps/unveil/auth/AuthToken$AuthTokenType, s);
        }

        public static AuthTokenType[] values()
        {
            return (AuthTokenType[])a.clone();
        }

        public final String getAuthTokenType()
        {
            return authTokenType;
        }

        static 
        {
            SID = new AuthTokenType("SID", 0, "SID");
            GPLUS = new AuthTokenType("GPLUS", 1, "oauth2:https://www.googleapis.com/auth/emeraldsea.stream.read https://www.googleapis.com/auth/emeraldsea.stream.write https://www.googleapis.com/auth/emeraldsea.circles.read https://www.googleapis.com/auth/emeraldsea.circles.write https://www.googleapis.com/auth/picasa https://www.googleapis.com/auth/userinfo.email");
            WEBUPDATES = new AuthTokenType("WEBUPDATES", 2, "webupdates");
            a = (new AuthTokenType[] {
                SID, GPLUS, WEBUPDATES
            });
        }

        private AuthTokenType(String s, int i, String s1)
        {
            super(s, i);
            authTokenType = s1;
        }
    }

}
