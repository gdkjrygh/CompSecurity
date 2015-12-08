// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import java.util.Collection;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, LoginClient

class KatanaProxyLoginMethodHandler extends LoginMethodHandler
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();

    KatanaProxyLoginMethodHandler(Parcel parcel)
    {
        super(parcel);
    }

    KatanaProxyLoginMethodHandler(LoginClient loginclient)
    {
        super(loginclient);
    }

    private LoginClient.Result handleResultOk(LoginClient.Request request, Intent intent)
    {
        Bundle bundle = intent.getExtras();
        String s = bundle.getString("error");
        intent = s;
        if (s == null)
        {
            intent = bundle.getString("error_type");
        }
        String s2 = bundle.getString("error_code");
        String s1 = bundle.getString("error_message");
        s = s1;
        if (s1 == null)
        {
            s = bundle.getString("error_description");
        }
        s1 = bundle.getString("e2e");
        if (!Utility.isNullOrEmpty(s1))
        {
            logWebLoginCompleted(s1);
        }
        if (intent == null && s2 == null && s == null)
        {
            try
            {
                intent = LoginClient.Result.createTokenResult(request, createAccessTokenFromWebBundle(request.getPermissions(), bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, request.getApplicationId()));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                return LoginClient.Result.createErrorResult(request, null, intent.getMessage());
            }
            return intent;
        }
        if (ServerProtocol.errorsProxyAuthDisabled.contains(intent))
        {
            return null;
        }
        if (ServerProtocol.errorsUserCanceled.contains(intent))
        {
            return LoginClient.Result.createCancelResult(request, null);
        } else
        {
            return LoginClient.Result.createErrorResult(request, intent, s, s2);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    String getNameForLogging()
    {
        return "katana_proxy_auth";
    }

    boolean onActivityResult(int i, int j, Intent intent)
    {
        LoginClient.Request request = loginClient.getPendingRequest();
        if (intent == null)
        {
            intent = LoginClient.Result.createCancelResult(request, "Operation canceled");
        } else
        if (j == 0)
        {
            intent = LoginClient.Result.createCancelResult(request, intent.getStringExtra("error"));
        } else
        if (j != -1)
        {
            intent = LoginClient.Result.createErrorResult(request, "Unexpected resultCode from authorization.", null);
        } else
        {
            intent = handleResultOk(request, intent);
        }
        if (intent != null)
        {
            loginClient.completeAndValidate(intent);
        } else
        {
            loginClient.tryNextHandler();
        }
        return true;
    }

    boolean tryAuthorize(LoginClient.Request request)
    {
        String s = LoginClient.getE2E();
        request = NativeProtocol.createProxyAuthIntent(loginClient.getActivity(), request.getApplicationId(), request.getPermissions(), s, request.isRerequest(), request.getDefaultAudience());
        addLoggingExtra("e2e", s);
        return tryIntent(request, LoginClient.getLoginRequestCode());
    }

    protected boolean tryIntent(Intent intent, int i)
    {
        if (intent == null)
        {
            return false;
        }
        try
        {
            loginClient.getFragment().startActivityForResult(intent, i);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel)
        {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final KatanaProxyLoginMethodHandler[] newArray(int i)
        {
            return new KatanaProxyLoginMethodHandler[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
