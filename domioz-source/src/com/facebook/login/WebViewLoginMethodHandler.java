// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.g;
import com.facebook.internal.aw;
import com.facebook.internal.bd;
import com.facebook.internal.bi;
import com.facebook.internal.p;
import com.facebook.l;
import com.facebook.m;
import com.facebook.n;
import com.facebook.v;
import java.util.Locale;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, s, LoginClient, a, 
//            r, t

class WebViewLoginMethodHandler extends LoginMethodHandler
{

    public static final android.os.Parcelable.Creator CREATOR = new s();
    private bd c;
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

    final String a()
    {
        return "web_view";
    }

    final void a(LoginClient.Request request, Bundle bundle, l l1)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("e2e"))
            {
                d = bundle.getString("e2e");
            }
            try
            {
                bundle = a(((java.util.Collection) (request.a())), bundle, g.e, request.d());
                request = LoginClient.Result.a(b.g, bundle);
                CookieSyncManager.createInstance(b.c.getActivity()).sync();
                bundle = bundle.b();
                b.c.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", bundle).apply();
            }
            // Misplaced declaration of an exception variable
            catch (LoginClient.Request request)
            {
                request = LoginClient.Result.a(b.g, null, request.getMessage());
            }
        } else
        if (l1 instanceof m)
        {
            request = LoginClient.Result.a(b.g, "User canceled log in.");
        } else
        {
            d = null;
            bundle = l1.getMessage();
            if (l1 instanceof v)
            {
                bundle = ((v)l1).a();
                request = String.format(Locale.ROOT, "%d", new Object[] {
                    Integer.valueOf(bundle.b())
                });
                bundle = bundle.toString();
            } else
            {
                request = null;
            }
            request = LoginClient.Result.a(b.g, null, bundle, request);
        }
        if (!aw.a(d))
        {
            a(d);
        }
        b.a(request);
    }

    final boolean a(LoginClient.Request request)
    {
        Bundle bundle = new Bundle();
        if (!aw.a(request.a()))
        {
            String s1 = TextUtils.join(",", request.a());
            bundle.putString("scope", s1);
            a("scope", s1);
        }
        bundle.putString("default_audience", request.c().a());
        Object obj = AccessToken.a();
        r r1;
        if (obj != null)
        {
            obj = ((AccessToken) (obj)).b();
        } else
        {
            obj = null;
        }
        if (obj != null && ((String) (obj)).equals(b.c.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "")))
        {
            bundle.putString("access_token", ((String) (obj)));
            a("access_token", "1");
        } else
        {
            aw.b(b.c.getActivity());
            a("access_token", "0");
        }
        r1 = new r(this, request);
        d = LoginClient.e();
        a("e2e", d);
        obj = b.c.getActivity();
        c = (new t(((Context) (obj)), request.d(), bundle)).a(d).a(request.f()).a(r1).a();
        request = new p();
        request.setRetainInstance(true);
        request.a(c);
        request.show(((FragmentActivity) (obj)).getSupportFragmentManager(), "FacebookDialogFragment");
        return true;
    }

    final void b()
    {
        if (c != null)
        {
            c.cancel();
            c = null;
        }
    }

    final boolean c()
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
