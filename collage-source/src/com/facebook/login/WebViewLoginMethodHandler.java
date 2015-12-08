// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.Utility;
import com.facebook.internal.WebDialog;
import java.util.Locale;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, LoginClient, DefaultAudience

class WebViewLoginMethodHandler extends LoginMethodHandler
{
    static class AuthDialogBuilder extends com.facebook.internal.WebDialog.Builder
    {

        private static final String OAUTH_DIALOG = "oauth";
        static final String REDIRECT_URI = "fbconnect://success";
        private String e2e;
        private boolean isRerequest;

        public WebDialog build()
        {
            Bundle bundle = getParameters();
            bundle.putString("redirect_uri", "fbconnect://success");
            bundle.putString("client_id", getApplicationId());
            bundle.putString("e2e", e2e);
            bundle.putString("response_type", "token,signed_request");
            bundle.putString("return_scopes", "true");
            if (isRerequest)
            {
                bundle.putString("auth_type", "rerequest");
            }
            return new WebDialog(getContext(), "oauth", bundle, getTheme(), getListener());
        }

        public AuthDialogBuilder setE2E(String s)
        {
            e2e = s;
            return this;
        }

        public AuthDialogBuilder setIsRerequest(boolean flag)
        {
            isRerequest = flag;
            return this;
        }

        public AuthDialogBuilder(Context context, String s, Bundle bundle)
        {
            super(context, s, "oauth", bundle);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public WebViewLoginMethodHandler createFromParcel(Parcel parcel)
        {
            return new WebViewLoginMethodHandler(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public WebViewLoginMethodHandler[] newArray(int i)
        {
            return new WebViewLoginMethodHandler[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String WEB_VIEW_AUTH_HANDLER_STORE = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY";
    private static final String WEB_VIEW_AUTH_HANDLER_TOKEN_KEY = "TOKEN";
    private String e2e;
    private WebDialog loginDialog;

    WebViewLoginMethodHandler(Parcel parcel)
    {
        super(parcel);
        e2e = parcel.readString();
    }

    WebViewLoginMethodHandler(LoginClient loginclient)
    {
        super(loginclient);
    }

    private String loadCookieToken()
    {
        return loginClient.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    private void saveCookieToken(String s)
    {
        loginClient.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", s).apply();
    }

    void cancel()
    {
        if (loginDialog != null)
        {
            loginDialog.cancel();
            loginDialog = null;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    String getNameForLogging()
    {
        return "web_view";
    }

    boolean needsInternetPermission()
    {
        return true;
    }

    void onWebDialogComplete(LoginClient.Request request, Bundle bundle, FacebookException facebookexception)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("e2e"))
            {
                e2e = bundle.getString("e2e");
            }
            try
            {
                bundle = createAccessTokenFromWebBundle(request.getPermissions(), bundle, AccessTokenSource.WEB_VIEW, request.getApplicationId());
                request = LoginClient.Result.createTokenResult(loginClient.getPendingRequest(), bundle);
                CookieSyncManager.createInstance(loginClient.getActivity()).sync();
                saveCookieToken(bundle.getToken());
            }
            // Misplaced declaration of an exception variable
            catch (LoginClient.Request request)
            {
                request = LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), null, request.getMessage());
            }
        } else
        if (facebookexception instanceof FacebookOperationCanceledException)
        {
            request = LoginClient.Result.createCancelResult(loginClient.getPendingRequest(), "User canceled log in.");
        } else
        {
            e2e = null;
            request = facebookexception.getMessage();
            if (facebookexception instanceof FacebookServiceException)
            {
                request = ((FacebookServiceException)facebookexception).getRequestError();
                bundle = String.format(Locale.ROOT, "%d", new Object[] {
                    Integer.valueOf(request.getErrorCode())
                });
                request = request.toString();
            } else
            {
                bundle = null;
            }
            request = LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), null, request, bundle);
        }
        if (!Utility.isNullOrEmpty(e2e))
        {
            logWebLoginCompleted(e2e);
        }
        loginClient.completeAndValidate(request);
    }

    boolean tryAuthorize(final LoginClient.Request request)
    {
        Bundle bundle = new Bundle();
        if (!Utility.isNullOrEmpty(request.getPermissions()))
        {
            String s = TextUtils.join(",", request.getPermissions());
            bundle.putString("scope", s);
            addLoggingExtra("scope", s);
        }
        bundle.putString("default_audience", request.getDefaultAudience().getNativeProtocolAudience());
        Object obj = AccessToken.getCurrentAccessToken();
        com.facebook.internal.WebDialog.OnCompleteListener oncompletelistener;
        if (obj != null)
        {
            obj = ((AccessToken) (obj)).getToken();
        } else
        {
            obj = null;
        }
        if (obj != null && ((String) (obj)).equals(loadCookieToken()))
        {
            bundle.putString("access_token", ((String) (obj)));
            addLoggingExtra("access_token", "1");
        } else
        {
            Utility.clearFacebookCookies(loginClient.getActivity());
            addLoggingExtra("access_token", "0");
        }
        oncompletelistener = new com.facebook.internal.WebDialog.OnCompleteListener() {

            final WebViewLoginMethodHandler this$0;
            final LoginClient.Request val$request;

            public void onComplete(Bundle bundle1, FacebookException facebookexception)
            {
                onWebDialogComplete(request, bundle1, facebookexception);
            }

            
            {
                this$0 = WebViewLoginMethodHandler.this;
                request = request1;
                super();
            }
        };
        e2e = LoginClient.getE2E();
        addLoggingExtra("e2e", e2e);
        obj = loginClient.getActivity();
        loginDialog = (new AuthDialogBuilder(((Context) (obj)), request.getApplicationId(), bundle)).setE2E(e2e).setIsRerequest(request.isRerequest()).setOnCompleteListener(oncompletelistener).setTheme(FacebookSdk.getWebDialogTheme()).build();
        request = new FacebookDialogFragment();
        request.setRetainInstance(true);
        request.setDialog(loginDialog);
        request.show(((FragmentActivity) (obj)).getSupportFragmentManager(), "FacebookDialogFragment");
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(e2e);
    }

}
