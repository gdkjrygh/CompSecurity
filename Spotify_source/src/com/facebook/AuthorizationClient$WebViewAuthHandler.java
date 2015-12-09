// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import aoc;
import aof;
import arp;
import ash;
import asi;
import asj;
import asl;

// Referenced classes of package com.facebook:
//            SessionDefaultAudience, AuthorizationClient, AccessTokenSource, AccessToken, 
//            FacebookOperationCanceledException, FacebookException, FacebookServiceException, FacebookRequestError

class this._cls0 extends this._cls0
{

    private static final long serialVersionUID = 1L;
    private transient ash a;
    String applicationId;
    String e2e;
    final AuthorizationClient this$0;

    final String a()
    {
        return "web_view";
    }

    final boolean a(t t)
    {
        applicationId = t.applicationId;
        Object obj = new Bundle();
        if (!arp.a(t.permissions))
        {
            String s = TextUtils.join(",", t.permissions);
            ((Bundle) (obj)).putString("scope", s);
            a("scope", s);
        }
        ((Bundle) (obj)).putString("default_audience", t.defaultAudience.nativeProtocolAudience);
        Object obj1 = t.previousAccessToken;
        if (!arp.a(((String) (obj1))) && ((String) (obj1)).equals(AuthorizationClient.this.b().a().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "")))
        {
            ((Bundle) (obj)).putString("access_token", ((String) (obj1)));
            a("access_token", "1");
        } else
        {
            arp.b(AuthorizationClient.this.a);
            a("access_token", "0");
        }
        obj1 = new asl(t) {

            private AuthorizationClient.AuthorizationRequest a;
            private AuthorizationClient.WebViewAuthHandler b;

            public final void a(Bundle bundle, FacebookException facebookexception)
            {
                AuthorizationClient.WebViewAuthHandler webviewauthhandler = b;
                Object obj2 = a;
                if (bundle != null)
                {
                    if (bundle.containsKey("e2e"))
                    {
                        webviewauthhandler.e2e = bundle.getString("e2e");
                    }
                    bundle = AccessToken.a(((AuthorizationClient.AuthorizationRequest) (obj2)).permissions, bundle, AccessTokenSource.e);
                    facebookexception = AuthorizationClient.Result.a(webviewauthhandler.this$0.pendingRequest, bundle);
                    CookieSyncManager.createInstance(webviewauthhandler.this$0.a).sync();
                    bundle = ((AccessToken) (bundle)).token;
                    obj2 = webviewauthhandler.this$0.b().a().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit();
                    ((android.content.SharedPreferences.Editor) (obj2)).putString("TOKEN", bundle);
                    bundle = facebookexception;
                    if (!((android.content.SharedPreferences.Editor) (obj2)).commit())
                    {
                        arp.b("Facebook-AuthorizationClient", "Could not update saved web view auth handler token.");
                        bundle = facebookexception;
                    }
                } else
                if (facebookexception instanceof FacebookOperationCanceledException)
                {
                    bundle = AuthorizationClient.Result.a(webviewauthhandler.this$0.pendingRequest, "User canceled log in.");
                } else
                {
                    webviewauthhandler.e2e = null;
                    bundle = facebookexception.getMessage();
                    if (facebookexception instanceof FacebookServiceException)
                    {
                        facebookexception = ((FacebookServiceException)facebookexception).error;
                        bundle = String.format("%d", new Object[] {
                            Integer.valueOf(((FacebookRequestError) (facebookexception)).b)
                        });
                        facebookexception = facebookexception.toString();
                    } else
                    {
                        facebookexception = bundle;
                        bundle = null;
                    }
                    bundle = AuthorizationClient.Result.a(webviewauthhandler.this$0.pendingRequest, null, facebookexception, bundle);
                }
                if (!arp.a(webviewauthhandler.e2e))
                {
                    AuthorizationClient.a(webviewauthhandler.this$0, webviewauthhandler.applicationId, webviewauthhandler.e2e);
                }
                webviewauthhandler.this$0.a(bundle);
            }

            
            {
                b = AuthorizationClient.WebViewAuthHandler.this;
                a = authorizationrequest;
                super();
            }
        };
        e2e = AuthorizationClient.c();
        a("e2e", e2e);
        obj = new aoc(AuthorizationClient.this.b().a(), applicationId, ((Bundle) (obj)));
        obj.a = e2e;
        obj.b = t.isRerequest;
        obj.f = ((asl) (obj1));
        a = ((asi)obj).a();
        a.show();
        return true;
    }

    final boolean b()
    {
        return true;
    }

    final boolean c()
    {
        return true;
    }

    final void d()
    {
        if (a != null)
        {
            a.b = null;
            a.dismiss();
            a = null;
        }
    }

    _cls1.a()
    {
        this$0 = AuthorizationClient.this;
        super(AuthorizationClient.this);
    }
}
