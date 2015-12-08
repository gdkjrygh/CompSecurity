// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.b.al;
import com.facebook.b.ar;
import java.util.Map;

// Referenced classes of package com.facebook.login:
//            l, m, h

public class d
    implements Parcelable
{

    public static final android.os..Result.f CREATOR = new l();
    final m a;
    final AccessToken b;
    final String c;
    final String d;
    final  e;
    public Map f;

    static  a( , AccessToken accesstoken)
    {
        return new <init>(, m.a, accesstoken, null, null);
    }

    static  a( , String s)
    {
        return new <init>(, m.b, null, s, null);
    }

    static  a( , String s, String s1)
    {
        return a(, s, s1, null);
    }

    static  a( , String s, String s1, String s2)
    {
        s = TextUtils.join(": ", al.b(new String[] {
            s, s1
        }));
        return new <init>(, m.c, null, s, s2);
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
        al.a(parcel, f);
    }


    private (Parcel parcel)
    {
        a = m.valueOf(parcel.readString());
        b = (AccessToken)parcel.readParcelable(com/facebook/AccessToken.getClassLoader());
        c = parcel.readString();
        d = parcel.readString();
        e = ()parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
        f = al.a(parcel);
    }

    f(Parcel parcel, h h)
    {
        this(parcel);
    }

    ( , m m1, AccessToken accesstoken, String s, String s1)
    {
        ar.a(m1, "code");
        e = ;
        b = accesstoken;
        c = s;
        a = m1;
        d = s1;
    }
}
