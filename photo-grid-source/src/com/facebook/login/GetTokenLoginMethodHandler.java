// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, GetTokenClient, LoginClient

class GetTokenLoginMethodHandler extends LoginMethodHandler
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls3();
    private GetTokenClient getTokenClient;

    GetTokenLoginMethodHandler(Parcel parcel)
    {
        super(parcel);
    }

    GetTokenLoginMethodHandler(LoginClient loginclient)
    {
        super(loginclient);
    }

    void cancel()
    {
        if (getTokenClient != null)
        {
            getTokenClient.cancel();
            getTokenClient = null;
        }
    }

    void complete(final LoginClient.Request request, final Bundle result)
    {
        String s = result.getString("com.facebook.platform.extra.USER_ID");
        if (s == null || s.isEmpty())
        {
            loginClient.notifyBackgroundProcessingStart();
            Utility.getGraphMeRequestWithCacheAsync(result.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new _cls2());
            return;
        } else
        {
            onComplete(request, result);
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    String getNameForLogging()
    {
        return "get_token";
    }

    void getTokenCompleted(LoginClient.Request request, Bundle bundle)
    {
        getTokenClient = null;
        loginClient.notifyBackgroundProcessingStop();
        if (bundle != null)
        {
            ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Object obj = request.getPermissions();
            if (arraylist != null && (obj == null || arraylist.containsAll(((java.util.Collection) (obj)))))
            {
                complete(request, bundle);
                return;
            }
            bundle = new HashSet();
            obj = ((Set) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj)).next();
                if (!arraylist.contains(s))
                {
                    bundle.add(s);
                }
            } while (true);
            if (!bundle.isEmpty())
            {
                addLoggingExtra("new_permissions", TextUtils.join(",", bundle));
            }
            request.setPermissions(bundle);
        }
        loginClient.tryNextHandler();
    }

    void onComplete(LoginClient.Request request, Bundle bundle)
    {
        request = createAccessTokenFromNativeLogin(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId());
        request = LoginClient.Result.createTokenResult(loginClient.getPendingRequest(), request);
        loginClient.completeAndValidate(request);
    }

    boolean tryAuthorize(final LoginClient.Request request)
    {
        getTokenClient = new GetTokenClient(loginClient.getActivity(), request.getApplicationId());
        if (!getTokenClient.start())
        {
            return false;
        } else
        {
            loginClient.notifyBackgroundProcessingStart();
            request = new _cls1();
            getTokenClient.setCompletedListener(request);
            return true;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
    }


    private class _cls2
        implements com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
    {

        final GetTokenLoginMethodHandler this$0;
        final LoginClient.Request val$request;
        final Bundle val$result;

        public void onFailure(FacebookException facebookexception)
        {
            loginClient.complete(LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), "Caught exception", facebookexception.getMessage()));
        }

        public void onSuccess(JSONObject jsonobject)
        {
            try
            {
                jsonobject = jsonobject.getString("id");
                result.putString("com.facebook.platform.extra.USER_ID", jsonobject);
                onComplete(request, result);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                loginClient.complete(LoginClient.Result.createErrorResult(loginClient.getPendingRequest(), "Caught exception", jsonobject.getMessage()));
            }
        }

        _cls2()
        {
            this$0 = GetTokenLoginMethodHandler.this;
            result = bundle;
            request = request1;
            super();
        }
    }


    private class _cls1
        implements com.facebook.internal.PlatformServiceClient.CompletedListener
    {

        final GetTokenLoginMethodHandler this$0;
        final LoginClient.Request val$request;

        public void completed(Bundle bundle)
        {
            getTokenCompleted(request, bundle);
        }

        _cls1()
        {
            this$0 = GetTokenLoginMethodHandler.this;
            request = request1;
            super();
        }
    }


    private class _cls3
        implements android.os.Parcelable.Creator
    {

        public final GetTokenLoginMethodHandler createFromParcel(Parcel parcel)
        {
            return new GetTokenLoginMethodHandler(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final GetTokenLoginMethodHandler[] newArray(int i)
        {
            return new GetTokenLoginMethodHandler[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls3()
        {
        }
    }

}
