// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.Request;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.UiLifecycleHelper;
import com.facebook.model.GraphUser;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.AccountPicker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.Plus;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.DialogHelper;
import com.pinterest.activity.signin.dialog.EmailSignupDialog;
import com.pinterest.activity.signin.dialog.SignupDialogView;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.unauth.GroupBoardSignupHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.Social;
import com.pinterest.kit.activity.events.SocialShareEvent;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.AppUtils;
import com.pinterest.schemas.event.ElementType;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.kit.activity:
//            DialogHostActivity

public class SocialConnectActivity extends DialogHostActivity
{

    private static boolean _facebookRefreshed;
    private String _apiTag;
    private com.pinterest.base.Social.Network _connectingTo;
    private com.pinterest.base.Social.Network _disconnectTo;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private UiLifecycleHelper _facebookHelper;
    com.facebook.widget.FacebookDialog.Callback _fbDialogCb;
    private Session _fbSession;
    SessionState _fbState;
    protected GPlusCallBack _gPlusCallback;
    protected GoogleApiClient _gPlusClient;
    private GraphUser _graphUser;
    protected SocialShareEvent _lastShare;
    private com.pinterest.api.remote.AccountApi.SocialConnectParams _loginParams;
    private boolean _requestPublish;
    private boolean _signingUp;
    private com.pinterest.api.remote.AccountApi.SignupParams _signupParams;
    protected ConnectionResult mConnectionResult;
    public ApiResponseHandler onFacebookConnectSubmit;
    private com.facebook.Session.StatusCallback onFacebookStatus;
    private com.facebook.Session.StatusCallback onFacebookTokenStatus;
    public ApiResponseHandler onGPlusConnectSubmit;
    ApiResponseHandler onGplusDisconnect;
    private com.pinterest.api.remote.MyUserApi.MyUserApiResponse onLoadMe;
    private com.pinterest.api.remote.AccountApi.LoginApiResponse onLogin;
    private ApiResponseHandler onRakutenConnectSubmit;
    private BaseApiResponseHandler onSignup;
    private ApiResponseHandler onTwitterConnectSubmit;
    private String oneTimeCode;

    public SocialConnectActivity()
    {
        _connectingTo = com.pinterest.base.Social.Network.NONE;
        _disconnectTo = com.pinterest.base.Social.Network.NONE;
        _apiTag = getClass().getName();
        _fbState = null;
        _fbDialogCb = new _cls1();
        _eventsSubscriber = new _cls2();
        onTwitterConnectSubmit = new _cls3(true);
        onRakutenConnectSubmit = new _cls4(true);
        onFacebookTokenStatus = new _cls5();
        onFacebookStatus = new _cls6();
        onFacebookConnectSubmit = new _cls8(true);
        onLogin = new _cls9();
        onSignup = new _cls10(true);
        onLoadMe = new _cls11();
        onGplusDisconnect = new _cls12(true);
        onGPlusConnectSubmit = new _cls15(true);
    }

    private void connectToFacebook(com.pinterest.base.Social.RequestConnectEvent requestconnectevent)
    {
        if (Device.GTE_LP)
        {
            PackageInfo packageinfo = AppUtils.getPackageInfo("com.facebook.katana", 0);
            if (packageinfo != null && packageinfo.versionCode < 0x528bf9)
            {
                Application.showToast(0x7f070284);
                return;
            }
        }
        requestconnectevent = requestconnectevent.getPermissions();
        Session session = Session.getActiveSession();
        _requestPublish = false;
        com.facebook.Session.NewPermissionsRequest newpermissionsrequest = new com.facebook.Session.NewPermissionsRequest(this, requestconnectevent);
        if (!Social.isPublishPermission(requestconnectevent))
        {
            if (session == null || !session.isOpened())
            {
                Session.openActiveSession(this, true, requestconnectevent, onFacebookStatus);
                return;
            } else
            {
                session.requestNewReadPermissions(newpermissionsrequest);
                return;
            }
        }
        if (session == null || !session.isOpened())
        {
            _requestPublish = true;
            Session.openActiveSession(this, true, Social.FB_REQUIRED_PERMISSIONS, onFacebookStatus);
            return;
        } else
        {
            session.requestNewPublishPermissions(newpermissionsrequest);
            return;
        }
    }

    private void connectToRakuten()
    {
        ActivityHelper.goRakutenAuth(this);
    }

    private void connectToTwitter()
    {
        Events.post(new DialogEvent(null));
        ActivityHelper.goTwitterAuth(this);
    }

    private void doGPlusLogin(String s)
    {
        _loginParams = new com.pinterest.api.remote.AccountApi.SocialConnectParams();
        _loginParams.l = s;
        try
        {
            AccountApi.a(_loginParams, onLogin);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    private void doGPlusRegistration()
    {
        _signupParams = new com.pinterest.api.remote.AccountApi.SignupParams();
        _signupParams.k = oneTimeCode;
        _signupParams.q = "";
        _signupParams.s = "unspecified";
        _signupParams.c = "";
        _signupParams.u = GroupBoardSignupHelper.getBoardInviteArgs().getString("board_invite_code");
        try
        {
            AccountApi.a(_signupParams, onSignup);
            return;
        }
        catch (Exception exception)
        {
            PLog.error(exception, "exception occurred", new Object[0]);
        }
    }

    private String getGPlusIdTokenBlocking()
    {
        String s;
        try
        {
            s = GoogleAuthUtil.getToken(this, MyUser.getGPlusAccount(), "audience:server:client_id:694505692171-31closf3bcmlt59aeulg2j81ej68j6hk.apps.googleusercontent.com");
        }
        catch (IOException ioexception)
        {
            return null;
        }
        catch (UserRecoverableAuthException userrecoverableauthexception)
        {
            PLog.warn(userrecoverableauthexception.toString(), new Object[0]);
            return null;
        }
        catch (GoogleAuthException googleauthexception)
        {
            PLog.error(googleauthexception, "Auth failure", new Object[0]);
            return null;
        }
        catch (Exception exception)
        {
            PLog.error(exception, "Gplus exception", new Object[0]);
            return null;
        }
        return s;
    }

    private String getGPlusOneTimeCodeBlocking()
    {
        String s;
        try
        {
            s = GoogleAuthUtil.getToken(this, MyUser.getGPlusAccount(), "oauth2:server:client_id:694505692171-31closf3bcmlt59aeulg2j81ej68j6hk.apps.googleusercontent.com:api_scope:https://www.googleapis.com/auth/plus.login https://www.googleapis.com/auth/userinfo.email");
        }
        catch (IOException ioexception)
        {
            return null;
        }
        catch (UserRecoverableAuthException userrecoverableauthexception)
        {
            PLog.warn(userrecoverableauthexception.toString(), new Object[0]);
            startActivityForResult(userrecoverableauthexception.getIntent(), 104);
            return null;
        }
        catch (GoogleAuthException googleauthexception)
        {
            PLog.error(googleauthexception, "Auth failure", new Object[0]);
            return null;
        }
        catch (Exception exception)
        {
            PLog.error(exception, "Gplus exception", new Object[0]);
            return null;
        }
        return s;
    }

    private void initGPlusClient()
    {
        if (_gPlusClient != null)
        {
            return;
        } else
        {
            String s = MyUser.getGPlusAccount();
            _gPlusCallback = new GPlusCallBack();
            _gPlusClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(Application.context())).addApi(Plus.API).setAccountName(s).addScope(Plus.SCOPE_PLUS_LOGIN).addConnectionCallbacks(_gPlusCallback).addOnConnectionFailedListener(_gPlusCallback).build();
            return;
        }
    }

    private boolean isHandledFacebookError(int i)
    {
        return i != 400 && i != 401 && i != 500;
    }

    private void makeFacebookRequest(final Session session)
    {
        Request.newMeRequest(session, new _cls7()).executeAsync();
    }

    private void onGPlusResolution(Intent intent, int i)
    {
        if (i == -1 && !_gPlusClient.isConnected() && !_gPlusClient.isConnecting())
        {
            _gPlusClient.connect();
        }
    }

    private void onHaveGPlusAccount()
    {
        if (!MyUser.hasAccessTokenAndUser())
        {
            getGPlusIdToken();
            return;
        } else
        {
            getGPlusOneTimeCode();
            return;
        }
    }

    private void onRakutenConnected(Intent intent, int i)
    {
        if (intent != null)
        {
            if ((intent = intent.getExtras()) != null)
            {
                if (i == -1)
                {
                    showWaitDialog();
                    Pinalytics.a(ElementType.RAKUTEN_CONNECT);
                    _loginParams = new com.pinterest.api.remote.AccountApi.SocialConnectParams();
                    _loginParams.j = intent.getString("com.pinterest.EXTRA_ID");
                    _loginParams.f = intent.getString("com.pinterest.EXTRA_TOKEN");
                    _loginParams.h = intent.getString("com.pinterest.EXTRA_REFRESH_TOKEN");
                    if (MyUser.hasAccessTokenAndUser())
                    {
                        MyUserApi.a(_loginParams, onRakutenConnectSubmit, _apiTag);
                        return;
                    }
                    try
                    {
                        AccountApi.a(_loginParams, onLogin);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Intent intent)
                    {
                        return;
                    }
                } else
                {
                    Events.post(new com.pinterest.base.Social.UpdateEvent(com.pinterest.base.Social.Network.RAKUTEN));
                    return;
                }
            }
        }
    }

    private void onSessionStateChange(Session session, SessionState sessionstate, Exception exception)
    {
        PLog.info("FB session %s", new Object[] {
            sessionstate
        });
        if (session != null && !(exception instanceof FacebookAuthorizationException)) goto _L2; else goto _L1
_L1:
        Application.showToast(0x7f070281);
        PLog.error(exception, "FB error", new Object[0]);
_L4:
        return;
_L2:
        if (exception instanceof FacebookOperationCanceledException)
        {
            Application.showToast(0x7f070282);
            PLog.error(exception, "FB operation cancelled error", new Object[0]);
        }
        if (!sessionstate.isOpened())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (_connectingTo != com.pinterest.base.Social.Network.FACEBOOK) goto _L4; else goto _L3
_L3:
        if (_requestPublish)
        {
            _requestPublish = false;
            session.requestNewPublishPermissions(new com.facebook.Session.NewPermissionsRequest(this, Social.FB_STREAM_PERMISSIONS));
            return;
        }
        PLog.info("declined permissions: %s", new Object[] {
            StringUtils.join(session.getDeclinedPermissions(), ",")
        });
        sessionstate = Social.getMissingPermissions(session.getPermissions());
        if (sessionstate.size() == 0)
        {
            _connectingTo = com.pinterest.base.Social.Network.NONE;
            makeFacebookRequest(session);
            return;
        } else
        {
            DialogHelper.showFBPermissionMissing(sessionstate);
            return;
        }
        if (!sessionstate.isClosed()) goto _L4; else goto _L5
_L5:
        hideWaitDialog();
        return;
    }

    private void onTwitterConnected(Intent intent, int i)
    {
        Bundle bundle;
        if (intent != null)
        {
            if ((bundle = intent.getExtras()) != null)
            {
                if (i == -1)
                {
                    if (_signingUp)
                    {
                        SignupDialogView.onTwitterConnected(intent);
                        show(new EmailSignupDialog());
                        return;
                    }
                    showWaitDialog();
                    Pinalytics.a(ElementType.TWITTER_CONNECT);
                    _loginParams = new com.pinterest.api.remote.AccountApi.SocialConnectParams();
                    _loginParams.i = bundle.getString("com.pinterest.EXTRA_ID");
                    _loginParams.f = bundle.getString("com.pinterest.EXTRA_TOKEN");
                    _loginParams.g = bundle.getString("com.pinterest.EXTRA_SECRET");
                    _loginParams.y = bundle.getString("com.pinterest.EXTRA_USER_NAME");
                    if (MyUser.hasAccessTokenAndUser())
                    {
                        MyUserApi.a(_loginParams, onTwitterConnectSubmit, _apiTag);
                        return;
                    }
                    try
                    {
                        AccountApi.a(_loginParams, onLogin);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Intent intent)
                    {
                        return;
                    }
                } else
                {
                    Events.post(new com.pinterest.base.Social.UpdateEvent(com.pinterest.base.Social.Network.TWITTER));
                    return;
                }
            }
        }
    }

    private void promptEmailPasswordLogin()
    {
        DialogHelper.goEmailOnlyLogin();
    }

    private void refreshFacebookToken()
    {
        if (!MyUser.hasAccessToken() || !MyUser.isConnectedToFacebook())
        {
            return;
        }
        Session session = Session.getActiveSession();
        if (!session.isOpened() && !session.isClosed())
        {
            session.openForRead((new com.facebook.Session.OpenRequest(this)).setPermissions(Social.FB_READ_PERMISSIONS).setCallback(onFacebookTokenStatus));
        } else
        {
            Session.openActiveSession(this, false, onFacebookTokenStatus);
        }
        _facebookRefreshed = true;
    }

    private void startAccountPicker()
    {
        if (MyUser.hasAccessTokenAndUser() && MyUser.getGPlusAccount() != null)
        {
            onHaveGPlusAccount();
            return;
        } else
        {
            startActivityForResult(AccountPicker.newChooseAccountIntent(null, null, new String[] {
                "com.google"
            }, false, null, null, null, null), 105);
            return;
        }
    }

    private void startResolution()
    {
        try
        {
            mConnectionResult.startResolutionForResult(this, 103);
            return;
        }
        catch (android.content.IntentSender.SendIntentException sendintentexception)
        {
            _gPlusClient.connect();
        }
    }

    private void submitFacebookToken(String s)
    {
        MyUserApi.a(s, _apiTag);
    }

    protected void disconnectGPlus()
    {
        MyUserApi.a(5, onGplusDisconnect, _apiTag);
    }

    protected UiLifecycleHelper getFacebookHelper()
    {
        return _facebookHelper;
    }

    protected void getGPlusIdToken()
    {
        (new _cls14()).execute();
    }

    protected void getGPlusOneTimeCode()
    {
        PLog.info("getGPlusOneTimeCode: ", new Object[0]);
        (new _cls13()).execute();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        PLog.info("onActivityResult: %d, %d ", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        i;
        JVM INSTR tableswitch 101 106: default 72
    //                   101 87
    //                   102 94
    //                   103 72
    //                   104 101
    //                   105 111
    //                   106 86;
           goto _L1 _L2 _L3 _L1 _L4 _L5 _L6
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        _facebookHelper.onActivityResult(i, j, intent, _fbDialogCb);
_L8:
        return;
_L2:
        onTwitterConnected(intent, j);
        return;
_L3:
        onRakutenConnected(intent, j);
        return;
_L4:
        if (j == -1)
        {
            getGPlusOneTimeCode();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (j == -1)
        {
            MyUser.setGPlusAccount(intent.getStringExtra("authAccount"));
            onHaveGPlusAccount();
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _facebookHelper = new UiLifecycleHelper(this, onFacebookStatus);
        _facebookHelper.onCreate(bundle);
        if (bundle != null)
        {
            _connectingTo = com.pinterest.base.Social.Network.from(bundle.getInt("_connectingTo", com.pinterest.base.Social.Network.NONE.ordinal()));
        }
        if (MyUser.isConnectingToGplus())
        {
            getGPlusOneTimeCode();
            Preferences.user().set("PREF_CONNETING_GPLUS", false);
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        _facebookHelper.onDestroy();
        _fbSession = null;
    }

    protected void onFacebookConnected(GraphUser graphuser, Session session)
    {
        if (graphuser == null || session == null)
        {
            return;
        }
        _graphUser = graphuser;
        _fbSession = session;
        _loginParams = new com.pinterest.api.remote.AccountApi.SocialConnectParams();
        _loginParams.m = graphuser.getId();
        _loginParams.z = graphuser.getLink();
        _loginParams.n = session.getAccessToken();
        _loginParams.o = StringUtils.join(session.getPermissions(), ",");
        PLog.info("facebookScope: %s", new Object[] {
            _loginParams.o
        });
        if (MyUser.hasAccessTokenAndUser())
        {
            MyUserApi.a(_loginParams, onFacebookConnectSubmit, _apiTag);
            return;
        }
        try
        {
            AccountApi.a(_loginParams, onLogin);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GraphUser graphuser)
        {
            return;
        }
    }

    protected void onFacebookSignup()
    {
        if (_graphUser == null || _fbSession == null)
        {
            return;
        }
        Object obj = _graphUser;
        Session session = _fbSession;
        _signupParams = new com.pinterest.api.remote.AccountApi.SignupParams();
        _signupParams.b = "";
        _signupParams.e = "";
        _signupParams.q = ((GraphUser) (obj)).getFirstName();
        _signupParams.r = ((GraphUser) (obj)).getLastName();
        _signupParams.m = ((GraphUser) (obj)).getId();
        _signupParams.z = ((GraphUser) (obj)).getLink();
        _signupParams.n = session.getAccessToken();
        _signupParams.o = StringUtils.join(session.getPermissions(), ",");
        _signupParams.c = (String)((GraphUser) (obj)).getProperty("email");
        _signupParams.u = GroupBoardSignupHelper.getBoardInviteArgs().getString("board_invite_code");
        obj = (String)((GraphUser) (obj)).getProperty("gender");
        if ("male".equals(obj))
        {
            _signupParams.s = "male";
        } else
        if ("female".equals(obj))
        {
            _signupParams.s = "female";
        } else
        {
            _signupParams.s = "unspecified";
        }
        try
        {
            AccountApi.a(_signupParams, onSignup);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            PLog.error(((Throwable) (obj)), "exception occurred", new Object[0]);
        }
    }

    protected void onPause()
    {
        super.onPause();
        _facebookHelper.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        Session session = Session.getActiveSession();
        if (session != null && (session.isOpened() || session.isClosed()) && _fbState != session.getState())
        {
            _fbState = session.getState();
        }
        _facebookHelper.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        _facebookHelper.onSaveInstanceState(bundle);
        bundle.putInt("_connectingTo", _connectingTo.ordinal());
    }

    protected void onStart()
    {
        super.onStart();
        Events.register(_eventsSubscriber, com/pinterest/base/Social$RequestConnectEvent, new Class[] {
            com/pinterest/base/Social$RequestDisconnectEvent
        });
    }

    protected void onStop()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/base/Social$RequestConnectEvent, com/pinterest/base/Social$RequestDisconnectEvent
        });
        super.onStop();
    }


/*
    static boolean access$002(SocialConnectActivity socialconnectactivity, boolean flag)
    {
        socialconnectactivity._signingUp = flag;
        return flag;
    }

*/



/*
    static com.pinterest.base.Social.Network access$102(SocialConnectActivity socialconnectactivity, com.pinterest.base.Social.Network network)
    {
        socialconnectactivity._connectingTo = network;
        return network;
    }

*/







/*
    static String access$1502(SocialConnectActivity socialconnectactivity, String s)
    {
        socialconnectactivity.oneTimeCode = s;
        return s;
    }

*/










/*
    static com.pinterest.base.Social.Network access$602(SocialConnectActivity socialconnectactivity, com.pinterest.base.Social.Network network)
    {
        socialconnectactivity._disconnectTo = network;
        return network;
    }

*/




    private class _cls1
        implements com.facebook.widget.FacebookDialog.Callback
    {

        final SocialConnectActivity this$0;

        public void onComplete(com.facebook.widget.FacebookDialog.PendingCall pendingcall, Bundle bundle)
        {
            boolean flag = false;
            if (_lastShare == null)
            {
                return;
            }
            pendingcall = FacebookDialog.getNativeDialogCompletionGesture(bundle);
            PLog.info((new StringBuilder("FB share Success: ")).append(pendingcall).append(" ").append(_lastShare.id).toString(), new Object[0]);
            if ("post".equalsIgnoreCase(pendingcall))
            {
                flag = true;
                Application.showToast(0x7f07051f);
            } else
            if ("cancel".equalsIgnoreCase(pendingcall))
            {
                return;
            }
            Pinalytics.a(EventType.PIN_SHARE_FACEBOOK, _lastShare.id);
            AccountApi.a(_lastShare, flag);
        }

        public void onError(com.facebook.widget.FacebookDialog.PendingCall pendingcall, Exception exception, Bundle bundle)
        {
            if (MyUser.isConnectedToFacebook())
            {
                Application.showToast(0x7f07051e);
            }
        }

        _cls1()
        {
            this$0 = SocialConnectActivity.this;
            super();
        }
    }


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final SocialConnectActivity this$0;

        public void onEventMainThread(com.pinterest.base.Social.RequestConnectEvent requestconnectevent)
        {
            _signingUp = requestconnectevent.isForSignup();
            _connectingTo = requestconnectevent.getNetwork();
            switch (_cls16..SwitchMap.com.pinterest.base.Social.Network[requestconnectevent.getNetwork().ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                connectToFacebook(requestconnectevent);
                return;

            case 2: // '\002'
                startAccountPicker();
                return;

            case 3: // '\003'
                connectToRakuten();
                return;

            case 4: // '\004'
                connectToTwitter();
                break;
            }
        }

        public void onEventMainThread(com.pinterest.base.Social.RequestDisconnectEvent requestdisconnectevent)
        {
            _disconnectTo = requestdisconnectevent.getNetwork();
            switch (_cls16..SwitchMap.com.pinterest.base.Social.Network[requestdisconnectevent.getNetwork().ordinal()])
            {
            case 1: // '\001'
            default:
                return;

            case 2: // '\002'
                disconnectGPlus();
                break;
            }
        }

        _cls2()
        {
            this$0 = SocialConnectActivity.this;
            super();
        }

        private class _cls16
        {

            static final int $SwitchMap$com$pinterest$base$Social$Network[];

            static 
            {
                $SwitchMap$com$pinterest$base$Social$Network = new int[com.pinterest.base.Social.Network.values().length];
                try
                {
                    $SwitchMap$com$pinterest$base$Social$Network[com.pinterest.base.Social.Network.FACEBOOK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$pinterest$base$Social$Network[com.pinterest.base.Social.Network.GPLUS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$pinterest$base$Social$Network[com.pinterest.base.Social.Network.RAKUTEN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$pinterest$base$Social$Network[com.pinterest.base.Social.Network.TWITTER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls3 extends ApiResponseHandler
    {

        final SocialConnectActivity this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Events.post(new com.pinterest.base.Social.UpdateEvent(com.pinterest.base.Social.Network.TWITTER, false));
            super.onFailure(throwable, apiresponse);
        }

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            Pinalytics.a(EventType.USER_ENABLE_TWITTER, "0");
            Preferences.user().set("PREF_CONNETED_TWITTER", true);
            Preferences.user().set("PREF_SHARE_TWITTER", true);
            Events.post(new com.pinterest.base.Social.UpdateEvent(com.pinterest.base.Social.Network.TWITTER));
            super.onSuccess(pinterestjsonobject);
        }

        _cls3(boolean flag)
        {
            this$0 = SocialConnectActivity.this;
            super(flag);
        }
    }


    private class _cls4 extends ApiResponseHandler
    {

        final SocialConnectActivity this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Events.post(new com.pinterest.base.Social.UpdateEvent(com.pinterest.base.Social.Network.RAKUTEN, false));
            super.onFailure(throwable, apiresponse);
        }

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            Pinalytics.a(EventType.USER_ENABLE_RAKUTEN, "0");
            Preferences.user().set("PREF_CONNETED_RAKUTEN", true);
            Events.post(new com.pinterest.base.Social.UpdateEvent(com.pinterest.base.Social.Network.RAKUTEN));
            super.onSuccess(pinterestjsonobject);
        }

        _cls4(boolean flag)
        {
            this$0 = SocialConnectActivity.this;
            super(flag);
        }
    }


    private class _cls5
        implements com.facebook.Session.StatusCallback
    {

        final SocialConnectActivity this$0;

        public void call(Session session, SessionState sessionstate, Exception exception)
        {
            if (exception != null)
            {
                return;
            } else
            {
                submitFacebookToken(session.getAccessToken());
                return;
            }
        }

        _cls5()
        {
            this$0 = SocialConnectActivity.this;
            super();
        }
    }


    private class _cls6
        implements com.facebook.Session.StatusCallback
    {

        final SocialConnectActivity this$0;

        public void call(Session session, SessionState sessionstate, Exception exception)
        {
            onSessionStateChange(session, sessionstate, exception);
        }

        _cls6()
        {
            this$0 = SocialConnectActivity.this;
            super();
        }
    }


    private class _cls8 extends ApiResponseHandler
    {

        final SocialConnectActivity this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Events.post(new com.pinterest.base.Social.UpdateEvent(com.pinterest.base.Social.Network.FACEBOOK, false));
            super.onFailure(throwable, apiresponse);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Pinalytics.a(EventType.USER_ENABLE_FACEBOOK, "0");
            Preferences.user().set("PREF_CONNETED_FACEBOOK", true);
            Preferences.user().set("PREF_SHARE_FACEBOOK", true);
            Events.post(new com.pinterest.base.Social.UpdateEvent(com.pinterest.base.Social.Network.FACEBOOK));
        }

        _cls8(boolean flag)
        {
            this$0 = SocialConnectActivity.this;
            super(flag);
        }
    }


    private class _cls9 extends com.pinterest.api.remote.AccountApi.LoginApiResponse
    {

        final SocialConnectActivity this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            boolean flag = true;
            if (_loginParams.a() != 5) goto _L2; else goto _L1
_L1:
            if (apiresponse.getCode() != 30) goto _L4; else goto _L3
_L3:
            getGPlusOneTimeCode();
_L7:
            if (!flag)
            {
                Events.post(new DialogEvent(new LoginFailureDialog(throwable, apiresponse)));
            }
            return;
_L4:
            if (apiresponse.getCode() == 180)
            {
                promptEmailPasswordLogin();
                continue; /* Loop/switch isn't completed */
            }
              goto _L5
_L2:
            if (_loginParams.a() == 3 && isHandledFacebookError(apiresponse.getCode()))
            {
                onFacebookSignup();
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = false;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public void onStart()
        {
            super.onStart();
            Events.post(new DialogEvent(new LoadingDialog()));
        }

        public void onTokenSaved()
        {
            MyUserApi.a(onLoadMe, _apiTag);
        }

        _cls9()
        {
            this$0 = SocialConnectActivity.this;
            super();
        }
    }


    private class _cls10 extends ApiResponseHandler
    {

        final SocialConnectActivity this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Events.post(new DialogEvent(new SignupFailureDialog(throwable, apiresponse, _signupParams.a(), null)));
        }

        public void onFinish()
        {
            ActivityHelper.setPostSignup(true);
            switch (_signupParams.a())
            {
            default:
                return;

            case 5: // '\005'
                GoogleAuthUtil.invalidateToken(SocialConnectActivity.this, oneTimeCode);
                break;
            }
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            MyUser.setAccessToken((String)apiresponse.getData());
            AnalyticsApi.a(FunnelActions.b(_signupParams.a()));
            Pinalytics.a(EventType.USER_CREATE, null, Pinalytics.b());
            (new DeepLinkLogging()).a(EventType.REFERRER_APP_SIGNUP);
            MyUserApi.a(onLoadMe, _apiTag);
        }

        _cls10(boolean flag)
        {
            this$0 = SocialConnectActivity.this;
            super(flag);
        }
    }


    private class _cls11 extends com.pinterest.api.remote.MyUserApi.MyUserApiResponse
    {

        final SocialConnectActivity this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
        }

        public void onFinish()
        {
            super.onFinish();
            Events.post(new DialogEvent(null));
        }

        public void onStart()
        {
            super.onStart();
            Events.post(new DialogEvent(new LoadingDialog()));
        }

        public void onSuccess(User user)
        {
            super.onSuccess(user);
            GlobalDataUpdateReceiver.c();
            PWidgetHelper.notifyWidgetStateChange(Application.context());
            Events.post(new DialogEvent(null));
            ActivityHelper.goPostSignup(SocialConnectActivity.this);
            finish();
        }

        _cls11()
        {
            this$0 = SocialConnectActivity.this;
            super();
        }
    }


    private class _cls12 extends ApiResponseHandler
    {

        final SocialConnectActivity this$0;

        public void onFinish()
        {
            super.onFinish();
            Events.post(new com.pinterest.base.Social.UpdateEvent(com.pinterest.base.Social.Network.GPLUS, false));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Pinalytics.a(EventType.USER_DISABLE_GPLUS, "0");
            Preferences.user().set("PREF_CONNETED_GPLUS", false);
        }

        _cls12(boolean flag)
        {
            this$0 = SocialConnectActivity.this;
            super(flag);
        }
    }


    private class _cls15 extends ApiResponseHandler
    {

        final SocialConnectActivity this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Events.post(new com.pinterest.base.Social.UpdateEvent(com.pinterest.base.Social.Network.GPLUS, false));
            super.onFailure(throwable, apiresponse);
        }

        public void onFinish()
        {
            super.onFinish();
            GoogleAuthUtil.invalidateToken(SocialConnectActivity.this, oneTimeCode);
        }

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            Pinalytics.a(EventType.USER_ENABLE_GPLUS, "0");
            Preferences.user().set("PREF_CONNETED_GPLUS", true);
            Events.post(new com.pinterest.base.Social.UpdateEvent(com.pinterest.base.Social.Network.GPLUS));
            super.onSuccess(pinterestjsonobject);
            Application.showToastShort(0x7f070174);
        }

        _cls15(boolean flag)
        {
            this$0 = SocialConnectActivity.this;
            super(flag);
        }
    }


    private class GPlusCallBack
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        final SocialConnectActivity this$0;

        public void onConnected(Bundle bundle)
        {
            PLog.info((new StringBuilder("onConnected: ")).append(bundle).toString(), new Object[0]);
            MyUser.setGPlusAccount(Plus.AccountApi.getAccountName(_gPlusClient));
            _gPlusClient.disconnect();
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            PLog.info((new StringBuilder("onConnectionFailed: ")).append(connectionresult).toString(), new Object[0]);
            mConnectionResult = connectionresult;
        }

        public void onConnectionSuspended(int i)
        {
        }

        protected GPlusCallBack()
        {
            this$0 = SocialConnectActivity.this;
            super();
        }
    }


    private class _cls7
        implements com.facebook.Request.GraphUserCallback
    {

        final SocialConnectActivity this$0;
        final Session val$session;

        public void onCompleted(GraphUser graphuser, Response response)
        {
            if (graphuser != null)
            {
                onFacebookConnected(graphuser, session);
            }
        }

        _cls7()
        {
            this$0 = SocialConnectActivity.this;
            session = session1;
            super();
        }
    }


    private class _cls14 extends BackgroundTask
    {

        final SocialConnectActivity this$0;
        String token;

        public void onFinish()
        {
            if (token == null)
            {
                return;
            } else
            {
                doGPlusLogin(token);
                return;
            }
        }

        public void run()
        {
            token = getGPlusIdTokenBlocking();
        }

        _cls14()
        {
            this$0 = SocialConnectActivity.this;
            super();
        }
    }


    private class _cls13 extends BackgroundTask
    {

        final SocialConnectActivity this$0;

        public void onFinish()
        {
            if (oneTimeCode == null)
            {
                return;
            }
            if (!MyUser.hasAccessTokenAndUser())
            {
                doGPlusRegistration();
                return;
            } else
            {
                com.pinterest.api.remote.AccountApi.SocialConnectParams socialconnectparams = new com.pinterest.api.remote.AccountApi.SocialConnectParams();
                socialconnectparams.k = oneTimeCode;
                MyUserApi.a(socialconnectparams, onGPlusConnectSubmit, _apiTag);
                return;
            }
        }

        public void run()
        {
            oneTimeCode = getGPlusOneTimeCodeBlocking();
        }

        _cls13()
        {
            this$0 = SocialConnectActivity.this;
            super();
        }
    }

}
