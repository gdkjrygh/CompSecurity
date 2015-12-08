// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.internal.Utility;
import com.facebook.widget.WebDialog;

// Referenced classes of package com.facebook:
//            AuthorizationClient, AccessTokenSource, AccessToken, FacebookOperationCanceledException, 
//            FacebookException

class this._cls0 extends this._cls0
{

    private static final long serialVersionUID = 1L;
    private transient WebDialog loginDialog;
    final AuthorizationClient this$0;

    private String loadCookieToken()
    {
        return getStartActivityDelegate().getActivityContext().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    private void saveCookieToken(String s)
    {
        android.content.getActivityContext getactivitycontext = getStartActivityDelegate().getActivityContext().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit();
        getactivitycontext.getActivityContext("TOKEN", s);
        if (!getactivitycontext.getActivityContext())
        {
            Utility.logd("Facebook-AuthorizationClient", "Could not update saved web view auth handler token.");
        }
    }

    void cancel()
    {
        if (loginDialog != null)
        {
            loginDialog.dismiss();
            loginDialog = null;
        }
    }

    boolean needsInternetPermission()
    {
        return true;
    }

    boolean needsRestart()
    {
        return true;
    }

    void onWebDialogComplete(t t, Bundle bundle, FacebookException facebookexception)
    {
        if (bundle != null)
        {
            bundle = AccessToken.createFromWebBundle(t.getPermissions(), bundle, AccessTokenSource.WEB_VIEW);
            t = esult(bundle);
            CookieSyncManager.createInstance(context).sync();
            saveCookieToken(bundle.getToken());
        } else
        if (facebookexception instanceof FacebookOperationCanceledException)
        {
            t = Result("User canceled log in.");
        } else
        {
            t = esult(facebookexception.getMessage(), null);
        }
        completeAndValidate(t);
    }

    boolean tryAuthorize(final t request)
    {
        String s = request.getApplicationId();
        Bundle bundle = new Bundle();
        if (!Utility.isNullOrEmpty(request.getPermissions()))
        {
            bundle.putString("scope", TextUtils.join(",", request.getPermissions()));
        }
        String s1 = request.getPreviousAccessToken();
        if (!Utility.isNullOrEmpty(s1) && s1.equals(loadCookieToken()))
        {
            bundle.putString("access_token", s1);
        } else
        {
            Utility.clearFacebookCookies(context);
        }
        request = new com.facebook.widget.WebDialog.OnCompleteListener() {

            final AuthorizationClient.WebViewAuthHandler this$1;
            final AuthorizationClient.AuthorizationRequest val$request;

            public void onComplete(Bundle bundle1, FacebookException facebookexception)
            {
                onWebDialogComplete(request, bundle1, facebookexception);
            }

            
            {
                this$1 = AuthorizationClient.WebViewAuthHandler.this;
                request = authorizationrequest;
                super();
            }
        };
        loginDialog = ((com.facebook.widget.alog)(new init>(getStartActivityDelegate().getActivityContext(), s, bundle)).etOnCompleteListener(request)).pleteListener();
        loginDialog.show();
        return true;
    }

    _cls1.val.request()
    {
        this$0 = AuthorizationClient.this;
        super(AuthorizationClient.this);
    }
}
