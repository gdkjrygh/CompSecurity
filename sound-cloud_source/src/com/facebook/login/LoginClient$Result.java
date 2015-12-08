// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.internal.U;
import com.facebook.internal.Y;
import java.util.Map;

// Referenced classes of package com.facebook.login:
//            LoginClient, j

public static class d
    implements Parcelable
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a e[];
        final String d;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/facebook/login/LoginClient$Result$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("SUCCESS", 0, "success");
            b = new a("CANCEL", 1, "cancel");
            c = new a("ERROR", 2, "error");
            e = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            d = s1;
        }
    }


    public static final android.os..Result.f CREATOR = new j();
    final a a;
    final AccessToken b;
    final String c;
    final String d;
    final  e;
    public Map f;

    static  a( , AccessToken accesstoken)
    {
        return new <init>(, a.a, accesstoken, null, null);
    }

    static  a( , String s)
    {
        return new <init>(, a.b, null, s, null);
    }

    static  a( , String s, String s1)
    {
        return a(, s, s1, null);
    }

    static  a( , String s, String s1, String s2)
    {
        s = TextUtils.join(": ", U.b(new String[] {
            s, s1
        }));
        return new <init>(, a.c, null, s, s2);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.name());
        parcel.writeParcelable(b, i);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeParcelable(e, i);
        U.a(parcel, f);
    }


    private a(Parcel parcel)
    {
        a = a.valueOf(parcel.readString());
        b = (AccessToken)parcel.readParcelable(com/facebook/AccessToken.getClassLoader());
        c = parcel.readString();
        d = parcel.readString();
        e = ()parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
        f = U.a(parcel);
    }

    f(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private a( , a a1, AccessToken accesstoken, String s, String s1)
    {
        Y.a(a1, "code");
        e = ;
        b = accesstoken;
        c = s;
        a = a1;
        d = s1;
    }
}
