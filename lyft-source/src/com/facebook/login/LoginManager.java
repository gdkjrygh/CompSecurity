// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.Validate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package com.facebook.login:
//            LoginBehavior, DefaultAudience, LoginResult, LoginFragment, 
//            LoginLogger, StartActivityDelegate, LoginClient

public class LoginManager
{

    private static final String MANAGE_PERMISSION_PREFIX = "manage";
    private static final Set OTHER_PUBLISH_PERMISSIONS = getOtherPublishPermissions();
    private static final String PUBLISH_PERMISSION_PREFIX = "publish";
    private static volatile LoginManager instance;
    private DefaultAudience defaultAudience;
    private LoginBehavior loginBehavior;
    private LoginLogger loginLogger;
    private HashMap pendingLoggingExtras;
    private LoginClient.Request pendingLoginRequest;

    LoginManager()
    {
        loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
        defaultAudience = DefaultAudience.FRIENDS;
        Validate.sdkInitialized();
    }

    static LoginResult computeLoginResult(LoginClient.Request request, AccessToken accesstoken)
    {
        Set set = request.getPermissions();
        HashSet hashset = new HashSet(accesstoken.getPermissions());
        if (request.isRerequest())
        {
            hashset.retainAll(set);
        }
        request = new HashSet(set);
        request.removeAll(hashset);
        return new LoginResult(accesstoken, hashset, request);
    }

    private LoginClient.Request createLoginRequest(Collection collection)
    {
        LoginBehavior loginbehavior = loginBehavior;
        boolean flag;
        if (collection != null)
        {
            collection = new HashSet(collection);
        } else
        {
            collection = new HashSet();
        }
        collection = new LoginClient.Request(loginbehavior, Collections.unmodifiableSet(collection), defaultAudience, FacebookSdk.getApplicationId(), UUID.randomUUID().toString());
        if (AccessToken.getCurrentAccessToken() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        collection.setRerequest(flag);
        return collection;
    }

    private LoginClient.Request createLoginRequestFromResponse(GraphResponse graphresponse)
    {
        Validate.notNull(graphresponse, "response");
        graphresponse = graphresponse.getRequest().getAccessToken();
        if (graphresponse != null)
        {
            graphresponse = graphresponse.getPermissions();
        } else
        {
            graphresponse = null;
        }
        return createLoginRequest(graphresponse);
    }

    private void finishLogin(AccessToken accesstoken, FacebookException facebookexception, boolean flag, FacebookCallback facebookcallback)
    {
        if (accesstoken != null)
        {
            AccessToken.setCurrentAccessToken(accesstoken);
            Profile.fetchProfileForCurrentAccessToken();
        }
        if (facebookcallback == null) goto _L2; else goto _L1
_L1:
        LoginResult loginresult;
        if (accesstoken != null)
        {
            loginresult = computeLoginResult(pendingLoginRequest, accesstoken);
        } else
        {
            loginresult = null;
        }
        if (!flag && (loginresult == null || loginresult.getRecentlyGrantedPermissions().size() != 0)) goto _L4; else goto _L3
_L3:
        facebookcallback.onCancel();
_L2:
        pendingLoginRequest = null;
        loginLogger = null;
        return;
_L4:
        if (facebookexception != null)
        {
            facebookcallback.onError(facebookexception);
        } else
        if (accesstoken != null)
        {
            facebookcallback.onSuccess(loginresult);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private Intent getFacebookActivityIntent(LoginClient.Request request)
    {
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
        intent.setAction(request.getLoginBehavior().toString());
        intent.putExtras(LoginFragment.populateIntentExtras(request));
        return intent;
    }

    public static LoginManager getInstance()
    {
        if (instance != null) goto _L2; else goto _L1
_L1:
        com/facebook/login/LoginManager;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new LoginManager();
        }
        com/facebook/login/LoginManager;
        JVM INSTR monitorexit ;
_L2:
        return instance;
        Exception exception;
        exception;
        com/facebook/login/LoginManager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private LoginLogger getLoggerForContext(Context context)
    {
        if (context != null && pendingLoginRequest != null) goto _L2; else goto _L1
_L1:
        LoginLogger loginlogger = null;
_L4:
        return loginlogger;
_L2:
        LoginLogger loginlogger1;
        loginlogger1 = loginLogger;
        if (loginlogger1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        loginlogger = loginlogger1;
        if (loginlogger1.getApplicationId().equals(pendingLoginRequest.getApplicationId())) goto _L4; else goto _L3
_L3:
        return new LoginLogger(context, pendingLoginRequest.getApplicationId());
    }

    private static Set getOtherPublishPermissions()
    {
        return Collections.unmodifiableSet(new HashSet() {

            
            {
                add("ads_management");
                add("create_event");
                add("rsvp_event");
            }
        });
    }

    static boolean isPublishPermission(String s)
    {
        return s != null && (s.startsWith("publish") || s.startsWith("manage") || OTHER_PUBLISH_PERMISSIONS.contains(s));
    }

    private void logCompleteLogin(LoginClient.Result.Code code, Map map, Exception exception)
    {
        if (loginLogger == null)
        {
            return;
        }
        if (pendingLoginRequest == null)
        {
            loginLogger.logUnexpectedError("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            return;
        } else
        {
            loginLogger.logCompleteLogin(pendingLoginRequest.getAuthId(), pendingLoggingExtras, code, map, exception);
            return;
        }
    }

    private void logStartLogin()
    {
        if (loginLogger != null && pendingLoginRequest != null)
        {
            loginLogger.logStartLogin(pendingLoginRequest);
        }
    }

    private boolean resolveIntent(Intent intent)
    {
        return FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private void startLogin(StartActivityDelegate startactivitydelegate, LoginClient.Request request)
    {
        pendingLoginRequest = request;
        pendingLoggingExtras = new HashMap();
        loginLogger = getLoggerForContext(startactivitydelegate.getActivityContext());
        logStartLogin();
        CallbackManagerImpl.registerStaticCallback(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new com.facebook.internal.CallbackManagerImpl.Callback() {

            final LoginManager this$0;

            public boolean onActivityResult(int i, Intent intent)
            {
                return LoginManager.this.onActivityResult(i, intent);
            }

            
            {
                this$0 = LoginManager.this;
                super();
            }
        });
        boolean flag = tryFacebookActivity(startactivitydelegate, request);
        request = pendingLoggingExtras;
        if (flag)
        {
            startactivitydelegate = "1";
        } else
        {
            startactivitydelegate = "0";
        }
        request.put("try_login_activity", startactivitydelegate);
        if (!flag)
        {
            startactivitydelegate = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            logCompleteLogin(LoginClient.Result.Code.ERROR, null, startactivitydelegate);
            pendingLoginRequest = null;
            throw startactivitydelegate;
        } else
        {
            return;
        }
    }

    private boolean tryFacebookActivity(StartActivityDelegate startactivitydelegate, LoginClient.Request request)
    {
        request = getFacebookActivityIntent(request);
        if (!resolveIntent(request))
        {
            return false;
        }
        try
        {
            startactivitydelegate.startActivityForResult(request, LoginClient.getLoginRequestCode());
        }
        // Misplaced declaration of an exception variable
        catch (StartActivityDelegate startactivitydelegate)
        {
            return false;
        }
        return true;
    }

    private void validatePublishPermissions(Collection collection)
    {
        if (collection != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)collection.next();
        } while (isPublishPermission(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        throw new FacebookException(String.format("Cannot pass a read permission (%s) to a request for publish authorization", new Object[] {
            s
        }));
    }

    private void validateReadPermissions(Collection collection)
    {
        if (collection != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)collection.next();
        } while (!isPublishPermission(s));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] {
            s
        }));
    }

    public DefaultAudience getDefaultAudience()
    {
        return defaultAudience;
    }

    public LoginBehavior getLoginBehavior()
    {
        return loginBehavior;
    }

    LoginClient.Request getPendingLoginRequest()
    {
        return pendingLoginRequest;
    }

    public void logInWithPublishPermissions(Activity activity, Collection collection)
    {
        validatePublishPermissions(collection);
        collection = createLoginRequest(collection);
        startLogin(new ActivityStartActivityDelegate(activity), collection);
    }

    public void logInWithPublishPermissions(Fragment fragment, Collection collection)
    {
        validatePublishPermissions(collection);
        collection = createLoginRequest(collection);
        startLogin(new FragmentStartActivityDelegate(fragment), collection);
    }

    public void logInWithReadPermissions(Activity activity, Collection collection)
    {
        validateReadPermissions(collection);
        collection = createLoginRequest(collection);
        startLogin(new ActivityStartActivityDelegate(activity), collection);
    }

    public void logInWithReadPermissions(Fragment fragment, Collection collection)
    {
        validateReadPermissions(collection);
        collection = createLoginRequest(collection);
        startLogin(new FragmentStartActivityDelegate(fragment), collection);
    }

    public void logOut()
    {
        AccessToken.setCurrentAccessToken(null);
        Profile.setCurrentProfile(null);
    }

    boolean onActivityResult(int i, Intent intent)
    {
        return onActivityResult(i, intent, null);
    }

    boolean onActivityResult(int i, Intent intent, FacebookCallback facebookcallback)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag = false;
        Object obj3 = null;
        Object obj2 = null;
        Object obj1 = null;
        if (pendingLoginRequest == null)
        {
            return false;
        }
        Object obj = LoginClient.Result.Code.ERROR;
        if (intent != null)
        {
            obj2 = (LoginClient.Result)intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (obj2 != null)
            {
                obj3 = ((LoginClient.Result) (obj2)).code;
                if (i == -1)
                {
                    if (((LoginClient.Result) (obj2)).code == LoginClient.Result.Code.SUCCESS)
                    {
                        intent = ((LoginClient.Result) (obj2)).token;
                        obj = obj1;
                    } else
                    {
                        obj = new FacebookAuthorizationException(((LoginClient.Result) (obj2)).errorMessage);
                        intent = null;
                    }
                } else
                if (i == 0)
                {
                    flag = true;
                    intent = null;
                    obj = obj1;
                } else
                {
                    intent = null;
                    obj = obj1;
                }
                obj1 = ((LoginClient.Result) (obj2)).loggingExtras;
                obj2 = obj;
                obj = obj1;
                obj1 = intent;
                intent = ((Intent) (obj3));
            } else
            {
                intent = ((Intent) (obj));
                obj2 = null;
                obj1 = null;
                flag = flag1;
                obj = obj3;
            }
            obj3 = obj2;
            obj2 = obj;
            obj = intent;
            intent = ((Intent) (obj3));
        } else
        if (i == 0)
        {
            obj = LoginClient.Result.Code.CANCEL;
            flag = true;
            obj1 = null;
            intent = null;
        } else
        {
            obj1 = null;
            intent = null;
            flag = flag2;
        }
        obj3 = intent;
        if (intent == null)
        {
            obj3 = intent;
            if (obj1 == null)
            {
                obj3 = intent;
                if (!flag)
                {
                    obj3 = new FacebookException("Unexpected call to LoginManager.onActivityResult");
                }
            }
        }
        logCompleteLogin(((LoginClient.Result.Code) (obj)), ((Map) (obj2)), ((Exception) (obj3)));
        finishLogin(((AccessToken) (obj1)), ((FacebookException) (obj3)), flag, facebookcallback);
        return true;
    }

    public void registerCallback(CallbackManager callbackmanager, final FacebookCallback callback)
    {
        if (!(callbackmanager instanceof CallbackManagerImpl))
        {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        } else
        {
            ((CallbackManagerImpl)callbackmanager).registerCallback(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), new com.facebook.internal.CallbackManagerImpl.Callback() {

                final LoginManager this$0;
                final FacebookCallback val$callback;

                public boolean onActivityResult(int i, Intent intent)
                {
                    return LoginManager.this.onActivityResult(i, intent, callback);
                }

            
            {
                this$0 = LoginManager.this;
                callback = facebookcallback;
                super();
            }
            });
            return;
        }
    }

    public void resolveError(Activity activity, GraphResponse graphresponse)
    {
        startLogin(new ActivityStartActivityDelegate(activity), createLoginRequestFromResponse(graphresponse));
    }

    public void resolveError(Fragment fragment, GraphResponse graphresponse)
    {
        startLogin(new FragmentStartActivityDelegate(fragment), createLoginRequestFromResponse(graphresponse));
    }

    public LoginManager setDefaultAudience(DefaultAudience defaultaudience)
    {
        defaultAudience = defaultaudience;
        return this;
    }

    public LoginManager setLoginBehavior(LoginBehavior loginbehavior)
    {
        loginBehavior = loginbehavior;
        return this;
    }


    private class ActivityStartActivityDelegate
        implements StartActivityDelegate
    {

        private final Activity activity;

        public Activity getActivityContext()
        {
            return activity;
        }

        public void startActivityForResult(Intent intent, int i)
        {
            activity.startActivityForResult(intent, i);
        }

        ActivityStartActivityDelegate(Activity activity1)
        {
            Validate.notNull(activity1, "activity");
            activity = activity1;
        }
    }


    private class FragmentStartActivityDelegate
        implements StartActivityDelegate
    {

        private final Fragment fragment;

        public Activity getActivityContext()
        {
            return fragment.getActivity();
        }

        public void startActivityForResult(Intent intent, int i)
        {
            fragment.startActivityForResult(intent, i);
        }

        FragmentStartActivityDelegate(Fragment fragment1)
        {
            Validate.notNull(fragment1, "fragment");
            fragment = fragment1;
        }
    }

}
