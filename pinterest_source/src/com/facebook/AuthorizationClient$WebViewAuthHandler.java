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
//            FacebookException, FacebookServiceException, FacebookRequestError, SessionDefaultAudience

class this._cls0 extends this._cls0
{

    private static final long serialVersionUID = 1L;
    private String applicationId;
    private String e2e;
    private transient WebDialog loginDialog;
    final AuthorizationClient this$0;

    private String loadCookieToken()
    {
        return getStartActivityDelegate().getActivityContext().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    private void saveCookieToken(String s)
    {
        getStartActivityDelegate().getActivityContext().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().getActivityContext("TOKEN", s).getActivityContext();
    }

    void cancel()
    {
        if (loginDialog != null)
        {
            loginDialog.setOnCompleteListener(null);
            loginDialog.dismiss();
            loginDialog = null;
        }
    }

    String getNameForLogging()
    {
        return "web_view";
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
            if (bundle.containsKey("e2e"))
            {
                e2e = bundle.getString("e2e");
            }
            bundle = AccessToken.createFromWebBundle(t.getPermissions(), bundle, AccessTokenSource.WEB_VIEW);
            t = esult(pendingRequest, bundle);
            CookieSyncManager.createInstance(context).sync();
            saveCookieToken(bundle.getToken());
        } else
        if (facebookexception instanceof FacebookOperationCanceledException)
        {
            t = Result(pendingRequest, "User canceled log in.");
        } else
        {
            e2e = null;
            bundle = facebookexception.getMessage();
            if (facebookexception instanceof FacebookServiceException)
            {
                bundle = ((FacebookServiceException)facebookexception).getRequestError();
                t = String.format("%d", new Object[] {
                    Integer.valueOf(bundle.getErrorCode())
                });
                bundle = bundle.toString();
            } else
            {
                t = null;
            }
            t = esult(pendingRequest, null, bundle, t);
        }
        if (!Utility.isNullOrEmpty(e2e))
        {
            AuthorizationClient.access$200(AuthorizationClient.this, applicationId, e2e);
        }
        completeAndValidate(t);
    }

    boolean tryAuthorize(final t request)
    {
        applicationId = request.getApplicationId();
        Bundle bundle = new Bundle();
        if (!Utility.isNullOrEmpty(request.getPermissions()))
        {
            String s = TextUtils.join(",", request.getPermissions());
            bundle.putString("scope", s);
            addLoggingExtra("scope", s);
        }
        bundle.putString("default_audience", request.getDefaultAudience().getNativeProtocolAudience());
        Object obj = request.getPreviousAccessToken();
        class _cls1
            implements com.facebook.widget.WebDialog.OnCompleteListener
        {

            final AuthorizationClient.WebViewAuthHandler this$1;
            final AuthorizationClient.AuthorizationRequest val$request;

            public void onComplete(Bundle bundle1, FacebookException facebookexception)
            {
                onWebDialogComplete(request, bundle1, facebookexception);
            }

            _cls1()
            {
                this$1 = AuthorizationClient.WebViewAuthHandler.this;
                request = authorizationrequest;
                super();
            }
        }

        if (!Utility.isNullOrEmpty(((String) (obj))) && ((String) (obj)).equals(loadCookieToken()))
        {
            bundle.putString("access_token", ((String) (obj)));
            addLoggingExtra("access_token", "1");
        } else
        {
            Utility.clearFacebookCookies(context);
            addLoggingExtra("access_token", "0");
        }
        obj = new _cls1();
        e2e = AuthorizationClient.access$100();
        addLoggingExtra("e2e", e2e);
        loginDialog = ((com.facebook.widget.alog)(new init>(getStartActivityDelegate().getActivityContext(), applicationId, bundle)).etE2E(e2e).etIsRerequest(request.isRerequest()).etOnCompleteListener(((com.facebook.widget.pleteListener) (obj)))).pleteListener();
        loginDialog.show();
        return true;
    }

    t()
    {
        this$0 = AuthorizationClient.this;
        super(AuthorizationClient.this);
    }
}
