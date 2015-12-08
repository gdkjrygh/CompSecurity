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
import com.facebook.h;
import com.facebook.internal.U;
import com.facebook.internal.Z;
import com.facebook.p;
import com.facebook.q;
import com.facebook.r;
import com.facebook.s;
import com.facebook.w;
import java.util.Locale;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, v, LoginClient, a, 
//            u

class WebViewLoginMethodHandler extends LoginMethodHandler
{
    static final class a extends com.facebook.internal.Z.a
    {

        String f;
        boolean g;

        public final Z a()
        {
            Bundle bundle = super.e;
            bundle.putString("redirect_uri", "fbconnect://success");
            bundle.putString("client_id", super.b);
            bundle.putString("e2e", f);
            bundle.putString("response_type", "token,signed_request");
            bundle.putString("return_scopes", "true");
            if (g)
            {
                bundle.putString("auth_type", "rerequest");
            }
            return new Z(super.a, "oauth", bundle, super.c, super.d);
        }

        public a(Context context, String s1, Bundle bundle)
        {
            super(context, s1, "oauth", bundle);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new v();
    private Z c;
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

    final void a(LoginClient.Request request, Bundle bundle, p p1)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("e2e"))
            {
                d = bundle.getString("e2e");
            }
            try
            {
                bundle = a(((java.util.Collection) (request.b)), bundle, h.e, request.d);
                request = LoginClient.Result.a(b.g, bundle);
                CookieSyncManager.createInstance(b.c.getActivity()).sync();
                bundle = ((AccessToken) (bundle)).d;
                b.c.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", bundle).apply();
            }
            // Misplaced declaration of an exception variable
            catch (LoginClient.Request request)
            {
                request = LoginClient.Result.a(b.g, null, request.getMessage());
            }
        } else
        if (p1 instanceof q)
        {
            request = LoginClient.Result.a(b.g, "User canceled log in.");
        } else
        {
            d = null;
            bundle = p1.getMessage();
            if (p1 instanceof w)
            {
                bundle = ((w)p1).a;
                request = String.format(Locale.ROOT, "%d", new Object[] {
                    Integer.valueOf(((r) (bundle)).c)
                });
                bundle = bundle.toString();
            } else
            {
                request = null;
            }
            request = LoginClient.Result.a(b.g, null, bundle, request);
        }
        if (!U.a(d))
        {
            a(d);
        }
        b.a(request);
    }

    final boolean a(LoginClient.Request request)
    {
        Object obj1 = new Bundle();
        if (!U.a(request.b))
        {
            String s1 = TextUtils.join(",", request.b);
            ((Bundle) (obj1)).putString("scope", s1);
            a("scope", s1);
        }
        ((Bundle) (obj1)).putString("default_audience", request.c.e);
        Object obj = AccessToken.a();
        u u1;
        if (obj != null)
        {
            obj = ((AccessToken) (obj)).d;
        } else
        {
            obj = null;
        }
        if (obj != null && ((String) (obj)).equals(b.c.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "")))
        {
            ((Bundle) (obj1)).putString("access_token", ((String) (obj)));
            a("access_token", "1");
        } else
        {
            U.b(b.c.getActivity());
            a("access_token", "0");
        }
        u1 = new u(this, request);
        d = LoginClient.f();
        a("e2e", d);
        obj = b.c.getActivity();
        obj1 = new a(((Context) (obj)), request.d, ((Bundle) (obj1)));
        obj1.f = d;
        obj1.g = request.f;
        obj1.d = u1;
        obj1.c = s.k();
        c = ((com.facebook.internal.Z.a) (obj1)).a();
        request = new com.facebook.internal.q();
        request.setRetainInstance(true);
        request.a = c;
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
