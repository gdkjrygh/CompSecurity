// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.internal.m;
import com.facebook.internal.n;
import java.util.Map;

// Referenced classes of package com.facebook.login:
//            LoginClient

public static class d
    implements Parcelable
{
    static final class Code extends Enum
    {

        public static final Code a;
        public static final Code b;
        public static final Code c;
        private static final Code e[];
        final String d;

        public static Code valueOf(String s)
        {
            return (Code)Enum.valueOf(com/facebook/login/LoginClient$Result$Code, s);
        }

        public static Code[] values()
        {
            return (Code[])e.clone();
        }

        static 
        {
            a = new Code("SUCCESS", 0, "success");
            b = new Code("CANCEL", 1, "cancel");
            c = new Code("ERROR", 2, "error");
            e = (new Code[] {
                a, b, c
            });
        }

        private Code(String s, int i, String s1)
        {
            super(s, i);
            d = s1;
        }
    }


    public static final android.os..Result.f CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new LoginClient.Result(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new LoginClient.Result[i];
        }

    };
    final Code a;
    final AccessToken b;
    final String c;
    final String d;
    final  e;
    public Map f;

    static  a( , AccessToken accesstoken)
    {
        return new <init>(, Code.a, accesstoken, null, null);
    }

    static  a( , String s)
    {
        return new <init>(, Code.b, null, s, null);
    }

    static  a( , String s, String s1)
    {
        return a(, s, s1, null);
    }

    static  a( , String s, String s1, String s2)
    {
        s = TextUtils.join(": ", m.b(new String[] {
            s, s1
        }));
        return new <init>(, Code.c, null, s, s2);
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
        m.a(parcel, f);
    }


    private Code(Parcel parcel)
    {
        a = Code.valueOf(parcel.readString());
        b = (AccessToken)parcel.readParcelable(com/facebook/AccessToken.getClassLoader());
        c = parcel.readString();
        d = parcel.readString();
        e = ()parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
        f = m.a(parcel);
    }

    f(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private Code( , Code code, AccessToken accesstoken, String s, String s1)
    {
        n.a(code, "code");
        e = ;
        b = accesstoken;
        c = s;
        a = code;
        d = s1;
    }
}
