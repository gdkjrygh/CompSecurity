// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, LoginBehavior, GetTokenLoginMethodHandler, KatanaProxyLoginMethodHandler, 
//            WebViewLoginMethodHandler, LoginLogger

class LoginClient
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    BackgroundProcessingListener backgroundProcessingListener;
    boolean checkedInternetPermission;
    int currentHandler;
    Fragment fragment;
    LoginMethodHandler handlersToTry[];
    Map loggingExtras;
    private LoginLogger loginLogger;
    OnCompletedListener onCompletedListener;
    Request pendingRequest;

    public LoginClient(Parcel parcel)
    {
        currentHandler = -1;
        Parcelable aparcelable[] = parcel.readParcelableArray(com/facebook/login/LoginMethodHandler.getClassLoader());
        handlersToTry = new LoginMethodHandler[aparcelable.length];
        for (int i = 0; i < aparcelable.length; i++)
        {
            handlersToTry[i] = (LoginMethodHandler)aparcelable[i];
            handlersToTry[i].setLoginClient(this);
        }

        currentHandler = parcel.readInt();
        pendingRequest = (Request)parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
        loggingExtras = Utility.readStringMapFromParcel(parcel);
    }

    public LoginClient(Fragment fragment1)
    {
        currentHandler = -1;
        fragment = fragment1;
    }

    private void addLoggingExtra(String s, String s1, boolean flag)
    {
        if (loggingExtras == null)
        {
            loggingExtras = new HashMap();
        }
        String s2 = s1;
        if (loggingExtras.containsKey(s))
        {
            s2 = s1;
            if (flag)
            {
                s2 = (new StringBuilder()).append((String)loggingExtras.get(s)).append(",").append(s1).toString();
            }
        }
        loggingExtras.put(s, s2);
    }

    private void completeWithFailure()
    {
        complete(Result.createErrorResult(pendingRequest, "Login attempt failed.", null));
    }

    private static AccessToken createFromTokenWithRefreshedPermissions(AccessToken accesstoken, Collection collection, Collection collection1)
    {
        return new AccessToken(accesstoken.getToken(), accesstoken.getApplicationId(), accesstoken.getUserId(), collection, collection1, accesstoken.getSource(), accesstoken.getExpires(), accesstoken.getLastRefresh());
    }

    private LoginMethodHandler getCurrentHandler()
    {
        if (currentHandler >= 0)
        {
            return handlersToTry[currentHandler];
        } else
        {
            return null;
        }
    }

    static String getE2E()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("init", System.currentTimeMillis());
        }
        catch (JSONException jsonexception) { }
        return jsonobject.toString();
    }

    private LoginMethodHandler[] getHandlersToTry(Request request)
    {
        ArrayList arraylist = new ArrayList();
        request = request.getLoginBehavior();
        if (request.allowsKatanaAuth())
        {
            arraylist.add(new GetTokenLoginMethodHandler(this));
            arraylist.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (request.allowsWebViewAuth())
        {
            arraylist.add(new WebViewLoginMethodHandler(this));
        }
        request = new LoginMethodHandler[arraylist.size()];
        arraylist.toArray(request);
        return request;
    }

    private LoginLogger getLogger()
    {
        if (loginLogger == null || !loginLogger.getApplicationId().equals(pendingRequest.getApplicationId()))
        {
            loginLogger = new LoginLogger(getActivity(), pendingRequest.getApplicationId());
        }
        return loginLogger;
    }

    public static int getLoginRequestCode()
    {
        return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
    }

    private static PermissionsPair handlePermissionResponse(GraphResponse graphresponse)
    {
        if (graphresponse.getError() == null)
        {
            if ((graphresponse = graphresponse.getJSONObject()) != null && ((graphresponse = graphresponse.optJSONArray("data")) != null && graphresponse.length() != 0))
            {
                ArrayList arraylist = new ArrayList(graphresponse.length());
                ArrayList arraylist1 = new ArrayList(graphresponse.length());
                int i = 0;
                while (i < graphresponse.length()) 
                {
                    Object obj = graphresponse.optJSONObject(i);
                    String s = ((JSONObject) (obj)).optString("permission");
                    if (s == null || s.equals("installed"))
                    {
                        continue;
                    }
                    obj = ((JSONObject) (obj)).optString("status");
                    if (obj != null)
                    {
                        if (((String) (obj)).equals("granted"))
                        {
                            arraylist.add(s);
                        } else
                        if (((String) (obj)).equals("declined"))
                        {
                            arraylist1.add(s);
                        }
                    }
                    i++;
                }
                return new PermissionsPair(arraylist, arraylist1);
            }
        }
        return null;
    }

    private void logAuthorizationMethodComplete(String s, Result result, Map map)
    {
        logAuthorizationMethodComplete(s, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    private void logAuthorizationMethodComplete(String s, String s1, String s2, String s3, Map map)
    {
        if (pendingRequest == null)
        {
            getLogger().logUnexpectedError("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", s);
            return;
        } else
        {
            getLogger().logAuthorizationMethodComplete(pendingRequest.getAuthId(), s, s1, s2, s3, map);
            return;
        }
    }

    private void notifyOnCompleteListener(Result result)
    {
        if (onCompletedListener != null)
        {
            onCompletedListener.onCompleted(result);
        }
    }

    void authorize(Request request)
    {
        if (request != null)
        {
            if (pendingRequest != null)
            {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            }
            if (AccessToken.getCurrentAccessToken() == null || checkInternetPermission())
            {
                pendingRequest = request;
                handlersToTry = getHandlersToTry(request);
                tryNextHandler();
                return;
            }
        }
    }

    void cancelCurrentHandler()
    {
        if (currentHandler >= 0)
        {
            getCurrentHandler().cancel();
        }
    }

    boolean checkInternetPermission()
    {
        if (checkedInternetPermission)
        {
            return true;
        }
        if (checkPermission("android.permission.INTERNET") != 0)
        {
            Object obj = getActivity();
            String s = ((Activity) (obj)).getString(com.facebook.R.string.com_facebook_internet_permission_error_title);
            obj = ((Activity) (obj)).getString(com.facebook.R.string.com_facebook_internet_permission_error_message);
            complete(Result.createErrorResult(pendingRequest, s, ((String) (obj))));
            return false;
        } else
        {
            checkedInternetPermission = true;
            return true;
        }
    }

    int checkPermission(String s)
    {
        return getActivity().checkCallingOrSelfPermission(s);
    }

    void complete(Result result)
    {
        LoginMethodHandler loginmethodhandler = getCurrentHandler();
        if (loginmethodhandler != null)
        {
            logAuthorizationMethodComplete(loginmethodhandler.getNameForLogging(), result, loginmethodhandler.methodLoggingExtras);
        }
        if (loggingExtras != null)
        {
            result.loggingExtras = loggingExtras;
        }
        handlersToTry = null;
        currentHandler = -1;
        pendingRequest = null;
        loggingExtras = null;
        notifyOnCompleteListener(result);
    }

    void completeAndValidate(Result result)
    {
        if (result.token != null && AccessToken.getCurrentAccessToken() != null)
        {
            validateSameFbidAndFinish(result);
            return;
        } else
        {
            complete(result);
            return;
        }
    }

    GraphRequest createGetPermissionsRequest(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("access_token", s);
        return new GraphRequest(null, "me/permissions", bundle, HttpMethod.GET, null);
    }

    GraphRequest createGetProfileIdRequest(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id");
        bundle.putString("access_token", s);
        return new GraphRequest(null, "me", bundle, HttpMethod.GET, null);
    }

    public int describeContents()
    {
        return 0;
    }

    FragmentActivity getActivity()
    {
        return fragment.getActivity();
    }

    BackgroundProcessingListener getBackgroundProcessingListener()
    {
        return backgroundProcessingListener;
    }

    public Fragment getFragment()
    {
        return fragment;
    }

    boolean getInProgress()
    {
        return pendingRequest != null && currentHandler >= 0;
    }

    OnCompletedListener getOnCompletedListener()
    {
        return onCompletedListener;
    }

    public Request getPendingRequest()
    {
        return pendingRequest;
    }

    void notifyBackgroundProcessingStart()
    {
        if (backgroundProcessingListener != null)
        {
            backgroundProcessingListener.onBackgroundProcessingStarted();
        }
    }

    void notifyBackgroundProcessingStop()
    {
        if (backgroundProcessingListener != null)
        {
            backgroundProcessingListener.onBackgroundProcessingStopped();
        }
    }

    public boolean onActivityResult(int i, int j, Intent intent)
    {
        if (pendingRequest != null)
        {
            return getCurrentHandler().onActivityResult(i, j, intent);
        } else
        {
            return false;
        }
    }

    void setBackgroundProcessingListener(BackgroundProcessingListener backgroundprocessinglistener)
    {
        backgroundProcessingListener = backgroundprocessinglistener;
    }

    void setFragment(Fragment fragment1)
    {
        if (fragment != null)
        {
            throw new FacebookException("Can't set fragment once it is already set.");
        } else
        {
            fragment = fragment1;
            return;
        }
    }

    void setOnCompletedListener(OnCompletedListener oncompletedlistener)
    {
        onCompletedListener = oncompletedlistener;
    }

    void startOrContinueAuth(Request request)
    {
        if (!getInProgress())
        {
            authorize(request);
        }
    }

    boolean tryCurrentHandler()
    {
        LoginMethodHandler loginmethodhandler = getCurrentHandler();
        if (loginmethodhandler.needsInternetPermission() && !checkInternetPermission())
        {
            addLoggingExtra("no_internet_permission", "1", false);
            return false;
        }
        boolean flag = loginmethodhandler.tryAuthorize(pendingRequest);
        if (flag)
        {
            getLogger().logAuthorizationMethodStart(pendingRequest.getAuthId(), loginmethodhandler.getNameForLogging());
            return flag;
        } else
        {
            addLoggingExtra("not_tried", loginmethodhandler.getNameForLogging(), true);
            return flag;
        }
    }

    void tryNextHandler()
    {
        if (currentHandler >= 0)
        {
            logAuthorizationMethodComplete(getCurrentHandler().getNameForLogging(), "skipped", null, null, getCurrentHandler().methodLoggingExtras);
        }
_L4:
        if (handlersToTry == null || currentHandler >= handlersToTry.length - 1) goto _L2; else goto _L1
_L1:
        currentHandler = currentHandler + 1;
        if (!tryCurrentHandler()) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (pendingRequest != null)
        {
            completeWithFailure();
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    void validateSameFbidAndFinish(Result result)
    {
        AccessToken accesstoken;
        AccessToken accesstoken1;
        if (result.token == null)
        {
            throw new FacebookException("Can't validate without a token");
        }
        accesstoken = AccessToken.getCurrentAccessToken();
        accesstoken1 = result.token;
        if (accesstoken == null || accesstoken1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (!accesstoken.getUserId().equals(accesstoken1.getUserId()))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        result = Result.createTokenResult(pendingRequest, result.token);
_L1:
        complete(result);
        return;
        try
        {
            result = Result.createErrorResult(pendingRequest, "User logged in as different Facebook user.", null);
        }
        // Misplaced declaration of an exception variable
        catch (Result result)
        {
            complete(Result.createErrorResult(pendingRequest, "Caught exception", result.getMessage()));
            return;
        }
          goto _L1
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelableArray(handlersToTry, i);
        parcel.writeInt(currentHandler);
        parcel.writeParcelable(pendingRequest, i);
        Utility.writeStringMapToParcel(parcel, loggingExtras);
    }


    private class Request
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        private final String applicationId;
        private final String authId;
        private final DefaultAudience defaultAudience;
        private boolean isRerequest;
        private final LoginBehavior loginBehavior;
        private Set permissions;

        public int describeContents()
        {
            return 0;
        }

        String getApplicationId()
        {
            return applicationId;
        }

        String getAuthId()
        {
            return authId;
        }

        DefaultAudience getDefaultAudience()
        {
            return defaultAudience;
        }

        LoginBehavior getLoginBehavior()
        {
            return loginBehavior;
        }

        Set getPermissions()
        {
            return permissions;
        }

        boolean isRerequest()
        {
            return isRerequest;
        }

        void setPermissions(Set set)
        {
            Validate.notNull(set, "permissions");
            permissions = set;
        }

        void setRerequest(boolean flag)
        {
            isRerequest = flag;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            Object obj = null;
            String s;
            if (loginBehavior != null)
            {
                s = loginBehavior.name();
            } else
            {
                s = null;
            }
            parcel.writeString(s);
            parcel.writeStringList(new ArrayList(permissions));
            s = obj;
            if (defaultAudience != null)
            {
                s = defaultAudience.name();
            }
            parcel.writeString(s);
            parcel.writeString(applicationId);
            parcel.writeString(authId);
            if (isRerequest)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeByte((byte)i);
        }


        private Request(Parcel parcel)
        {
            Object obj1 = null;
            super();
            isRerequest = false;
            Object obj = parcel.readString();
            String s;
            boolean flag;
            if (obj != null)
            {
                obj = LoginBehavior.valueOf(((String) (obj)));
            } else
            {
                obj = null;
            }
            loginBehavior = ((LoginBehavior) (obj));
            obj = new ArrayList();
            parcel.readStringList(((List) (obj)));
            permissions = new HashSet(((Collection) (obj)));
            s = parcel.readString();
            obj = obj1;
            if (s != null)
            {
                obj = DefaultAudience.valueOf(s);
            }
            defaultAudience = ((DefaultAudience) (obj));
            applicationId = parcel.readString();
            authId = parcel.readString();
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            isRerequest = flag;
        }

        Request(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        Request(LoginBehavior loginbehavior, Set set, DefaultAudience defaultaudience, String s, String s1)
        {
            isRerequest = false;
            loginBehavior = loginbehavior;
            if (set == null)
            {
                set = new HashSet();
            }
            permissions = set;
            defaultAudience = defaultaudience;
            applicationId = s;
            authId = s1;
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final Request createFromParcel(Parcel parcel)
            {
                return new Request(parcel, null);
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final Request[] newArray(int i)
            {
                return new Request[i];
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


    private class Result
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        final Code code;
        final String errorCode;
        final String errorMessage;
        public Map loggingExtras;
        final Request request;
        final AccessToken token;

        static Result createCancelResult(Request request1, String s)
        {
            return new Result(request1, Code.CANCEL, null, s, null);
        }

        static Result createErrorResult(Request request1, String s, String s1)
        {
            return createErrorResult(request1, s, s1, null);
        }

        static Result createErrorResult(Request request1, String s, String s1, String s2)
        {
            s = TextUtils.join(": ", Utility.asListNoNulls(new String[] {
                s, s1
            }));
            return new Result(request1, Code.ERROR, null, s, s2);
        }

        static Result createTokenResult(Request request1, AccessToken accesstoken)
        {
            return new Result(request1, Code.SUCCESS, accesstoken, null, null);
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(code.name());
            parcel.writeParcelable(token, i);
            parcel.writeString(errorMessage);
            parcel.writeString(errorCode);
            parcel.writeParcelable(request, i);
            Utility.writeStringMapToParcel(parcel, loggingExtras);
        }


        private Result(Parcel parcel)
        {
            class Code extends Enum
            {

                private static final Code $VALUES[];
                public static final Code CANCEL;
                public static final Code ERROR;
                public static final Code SUCCESS;
                private final String loggingValue;

                public static Code valueOf(String s)
                {
                    return (Code)Enum.valueOf(com/facebook/login/LoginClient$Result$Code, s);
                }

                public static Code[] values()
                {
                    return (Code[])$VALUES.clone();
                }

                final String getLoggingValue()
                {
                    return loggingValue;
                }

                static 
                {
                    SUCCESS = new Code("SUCCESS", 0, "success");
                    CANCEL = new Code("CANCEL", 1, "cancel");
                    ERROR = new Code("ERROR", 2, "error");
                    $VALUES = (new Code[] {
                        SUCCESS, CANCEL, ERROR
                    });
                }

                private Code(String s, int i, String s1)
                {
                    super(s, i);
                    loggingValue = s1;
                }
            }

            code = Code.valueOf(parcel.readString());
            token = (AccessToken)parcel.readParcelable(com/facebook/AccessToken.getClassLoader());
            errorMessage = parcel.readString();
            errorCode = parcel.readString();
            request = (Request)parcel.readParcelable(com/facebook/login/LoginClient$Request.getClassLoader());
            loggingExtras = Utility.readStringMapFromParcel(parcel);
        }

        Result(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        Result(Request request1, Code code1, AccessToken accesstoken, String s, String s1)
        {
            Validate.notNull(code1, "code");
            request = request1;
            token = accesstoken;
            errorMessage = s;
            code = code1;
            errorCode = s1;
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final Result createFromParcel(Parcel parcel)
            {
                return new Result(parcel, null);
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final Result[] newArray(int i)
            {
                return new Result[i];
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


    private class PermissionsPair
    {

        List declinedPermissions;
        List grantedPermissions;

        public List getDeclinedPermissions()
        {
            return declinedPermissions;
        }

        public List getGrantedPermissions()
        {
            return grantedPermissions;
        }

        public PermissionsPair(List list, List list1)
        {
            grantedPermissions = list;
            declinedPermissions = list1;
        }
    }


    private class OnCompletedListener
    {

        public abstract void onCompleted(Result result);
    }


    private class BackgroundProcessingListener
    {

        public abstract void onBackgroundProcessingStarted();

        public abstract void onBackgroundProcessingStopped();
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LoginClient createFromParcel(Parcel parcel)
        {
            return new LoginClient(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LoginClient[] newArray(int i)
        {
            return new LoginClient[i];
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
