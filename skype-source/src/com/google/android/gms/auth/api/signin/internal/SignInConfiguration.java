// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.EmailSignInConfig;
import com.google.android.gms.auth.api.signin.FacebookSignInConfig;
import com.google.android.gms.auth.api.signin.GoogleSignInConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.y;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//            a

public final class SignInConfiguration
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    private final String b;
    private String c;
    private EmailSignInConfig d;
    private GoogleSignInConfig e;
    private FacebookSignInConfig f;
    private String g;

    SignInConfiguration(int i, String s, String s1, EmailSignInConfig emailsigninconfig, GoogleSignInConfig googlesigninconfig, FacebookSignInConfig facebooksigninconfig, String s2)
    {
        a = i;
        b = y.a(s);
        c = s1;
        d = emailsigninconfig;
        e = googlesigninconfig;
        f = facebooksigninconfig;
        g = s2;
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final EmailSignInConfig c()
    {
        return d;
    }

    public final GoogleSignInConfig d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final FacebookSignInConfig e()
    {
        return f;
    }

    public final String f()
    {
        return g;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.signin.internal.a.a(this, parcel, i);
    }

}
