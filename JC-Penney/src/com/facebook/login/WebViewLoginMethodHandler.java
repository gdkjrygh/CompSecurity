// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.b.al;
import com.facebook.b.as;
import com.facebook.b.ax;
import com.facebook.b.q;
import com.facebook.j;
import com.facebook.m;
import com.facebook.n;
import com.facebook.o;
import com.facebook.x;
import java.util.Locale;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, u, LoginClient, a, 
//            t, v

class WebViewLoginMethodHandler extends LoginMethodHandler
{

    public static final android.os.Parcelable.Creator CREATOR = new u();
    private as c;
    private String d;

    WebViewLoginMethodHandler(Parcel parcel)
    {
        super(parcel);
        d = parcel.readString();
    }

    WebViewLoginMethodHandler(LoginClient loginclient)
    {
        super(loginclient);
    }

    private void b(String s)
    {
        b.b().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", s).apply();
    }

    private String d()
    {
        return b.b().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    String a()
    {
        return "web_view";
    }

    void a(LoginClient.Request request, Bundle bundle, m m1)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("e2e"))
            {
                d = bundle.getString("e2e");
            }
            try
            {
                bundle = a(((java.util.Collection) (request.a())), bundle, j.e, request.d());
                request = LoginClient.Result.a(b.c(), bundle);
                CookieSyncManager.createInstance(b.b()).sync();
                b(bundle.b());
            }
            // Misplaced declaration of an exception variable
            catch (LoginClient.Request request)
            {
                request = LoginClient.Result.a(b.c(), null, request.getMessage());
            }
        } else
        if (m1 instanceof n)
        {
            request = LoginClient.Result.a(b.c(), "User canceled log in.");
        } else
        {
            d = null;
            request = m1.getMessage();
            if (m1 instanceof x)
            {
                request = ((x)m1).a();
                bundle = String.format(Locale.ROOT, "%d", new Object[] {
                    Integer.valueOf(request.b())
                });
                request = request.toString();
            } else
            {
                bundle = null;
            }
            request = LoginClient.Result.a(b.c(), null, request, bundle);
        }
        if (!al.a(d))
        {
            a(d);
        }
        b.a(request);
    }

    boolean a(LoginClient.Request request)
    {
        Bundle bundle = new Bundle();
        if (!al.a(request.a()))
        {
            String s = TextUtils.join(",", request.a());
            bundle.putString("scope", s);
            a("scope", s);
        }
        bundle.putString("default_audience", request.c().a());
        Object obj = AccessToken.a();
        t t1;
        if (obj != null)
        {
            obj = ((AccessToken) (obj)).b();
        } else
        {
            obj = null;
        }
        if (obj != null && ((String) (obj)).equals(d()))
        {
            bundle.putString("access_token", ((String) (obj)));
            a("access_token", "1");
        } else
        {
            al.b(b.b());
            a("access_token", "0");
        }
        t1 = new t(this, request);
        d = LoginClient.l();
        a("e2e", d);
        obj = b.b();
        c = (new v(((Context) (obj)), request.d(), bundle)).a(d).a(request.f()).a(t1).a();
        request = new q();
        request.d(true);
        request.a(c);
        request.a(((ac) (obj)).f(), "FacebookDialogFragment");
        return true;
    }

    void b()
    {
        if (c != null)
        {
            c.cancel();
            c = null;
        }
    }

    boolean c()
    {
        return true;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(d);
    }

}
