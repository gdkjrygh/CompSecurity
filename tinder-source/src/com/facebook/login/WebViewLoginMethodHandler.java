// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.g;
import com.facebook.internal.d;
import com.facebook.internal.m;
import com.facebook.internal.o;
import java.util.Locale;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, LoginClient, DefaultAudience

class WebViewLoginMethodHandler extends LoginMethodHandler
{
    static final class a extends com.facebook.internal.o.a
    {

        String f;
        boolean g;

        public final o a()
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
            return new o(super.a, "oauth", bundle, super.c, super.d);
        }

        public a(Context context, String s, Bundle bundle)
        {
            super(context, s, "oauth", bundle);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new WebViewLoginMethodHandler(parcel);
        }

        public final volatile Object[] newArray(int j)
        {
            return new WebViewLoginMethodHandler[j];
        }

    };
    private o c;
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

    final void a(LoginClient.Request request, Bundle bundle, FacebookException facebookexception)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("e2e"))
            {
                d = bundle.getString("e2e");
            }
            try
            {
                bundle = a(((java.util.Collection) (request.b)), bundle, AccessTokenSource.e, request.d);
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
        if (facebookexception instanceof FacebookOperationCanceledException)
        {
            request = LoginClient.Result.a(b.g, "User canceled log in.");
        } else
        {
            d = null;
            bundle = facebookexception.getMessage();
            if (facebookexception instanceof FacebookServiceException)
            {
                bundle = ((FacebookServiceException)facebookexception).a;
                request = String.format(Locale.ROOT, "%d", new Object[] {
                    Integer.valueOf(((FacebookRequestError) (bundle)).c)
                });
                bundle = bundle.toString();
            } else
            {
                request = null;
            }
            request = LoginClient.Result.a(b.g, null, bundle, request);
        }
        if (!m.a(d))
        {
            a(d);
        }
        b.a(request);
    }

    final boolean a(LoginClient.Request request)
    {
        Object obj1 = new Bundle();
        if (!m.a(request.b))
        {
            String s = TextUtils.join(",", request.b);
            ((Bundle) (obj1)).putString("scope", s);
            a("scope", s);
        }
        ((Bundle) (obj1)).putString("default_audience", request.c.e);
        Object obj = AccessToken.a();
        com.facebook.internal.o.c c1;
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
            m.b(b.c.getActivity());
            a("access_token", "0");
        }
        c1 = new com.facebook.internal.o.c(request) {

            final LoginClient.Request a;
            final WebViewLoginMethodHandler b;

            public final void a(Bundle bundle, FacebookException facebookexception)
            {
                b.a(a, bundle, facebookexception);
            }

            
            {
                b = WebViewLoginMethodHandler.this;
                a = request;
                super();
            }
        };
        d = LoginClient.f();
        a("e2e", d);
        obj = b.c.getActivity();
        obj1 = new a(((Context) (obj)), request.d, ((Bundle) (obj1)));
        obj1.f = d;
        obj1.g = request.f;
        obj1.d = c1;
        obj1.c = g.l();
        c = ((com.facebook.internal.o.a) (obj1)).a();
        request = new d();
        request.setRetainInstance(true);
        request.a = c;
        request.show(((i) (obj)).getSupportFragmentManager(), "FacebookDialogFragment");
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

    public void writeToParcel(Parcel parcel, int j)
    {
        super.writeToParcel(parcel, j);
        parcel.writeString(d);
    }

}
