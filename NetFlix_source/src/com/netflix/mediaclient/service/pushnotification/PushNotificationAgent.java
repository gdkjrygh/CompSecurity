// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import com.google.android.gcm.GCMRegistrar;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.ServiceAgent;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.logging.UserData;
import com.netflix.mediaclient.service.webclient.UserCredentialRegistry;
import com.netflix.mediaclient.servicemgr.CmpEventLogging;
import com.netflix.mediaclient.servicemgr.CustomerEventLogging;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IPushNotification;
import com.netflix.mediaclient.util.AndroidManifestUtils;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.pushnotification:
//            NotificationUserSettings, MessageData, UserFeedbackOnReceivedPushNotification, NotificationFactory

public class PushNotificationAgent extends ServiceAgent
    implements IPushNotification
{

    private static final long DELTA_FOR_REPORT = 0x5265c00L;
    private static final String TAG = "nf_push";
    private static int idCounter = -1;
    private String gcmRegistrationId;
    private NotificationUserSettings mCurrentUserSettings;
    private boolean mGcmRegistered;
    private boolean mGcmSupported;
    private ImageLoader mImageLoader;
    private Map mSettings;
    private final BroadcastReceiver pushNotificationReceiver = new BroadcastReceiver() {

        final PushNotificationAgent this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (Log.isLoggable("nf_push", 2))
            {
                Log.v("nf_push", (new StringBuilder()).append("Received intent ").append(intent).toString());
            }
            context = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.PUSH_ONLOGIN".equals(context))
            {
                Log.d("nf_push", "onLogin");
                onLogin();
            } else
            {
                if ("com.netflix.mediaclient.intent.action.PUSH_ONLOGOUT".equals(context))
                {
                    Log.d("nf_push", "onLogout");
                    context = createUserData(intent);
                    unregisterOnUserLogout(context);
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTIN".equals(context))
                {
                    Log.d("nf_push", "optIn");
                    registerForPushNotification();
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTOUT".equals(context))
                {
                    Log.d("nf_push", "optOut");
                    unregisterFromPushNotification();
                    return;
                }
                if (Log.isLoggable("nf_push", 3))
                {
                    Log.d("nf_push", (new StringBuilder()).append("We do not support action ").append(context).toString());
                    return;
                }
            }
        }

            
            {
                this$0 = PushNotificationAgent.this;
                super();
            }
    };

    public PushNotificationAgent()
    {
        Log.d("nf_push", "PushNotificationAgent::");
    }

    private NotificationUserSettings createNewCurrentUserSettings(String s, String s1)
    {
        NotificationUserSettings notificationusersettings = new NotificationUserSettings();
        notificationusersettings.current = true;
        notificationusersettings.userId = s;
        notificationusersettings.currentProfileUserId = s1;
        notificationusersettings.oldAppVersion = AndroidManifestUtils.getVersionCode(getContext());
        mSettings.put(s, notificationusersettings);
        return notificationusersettings;
    }

    private UserData createUserData(Intent intent)
    {
        UserData userdata = new UserData();
        userdata.esn = intent.getStringExtra("esn");
        userdata.deviceCategory = intent.getStringExtra("device_cat");
        userdata.netflixId = intent.getStringExtra("nid");
        userdata.secureNetflixId = intent.getStringExtra("sid");
        userdata.userId = intent.getStringExtra("uid");
        userdata.currentProfileUserId = intent.getStringExtra("cp_uid");
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("CreateUserData: ").append(userdata).toString());
        }
        return userdata;
    }

    private void doRegisterForNotifications()
    {
        validateCurrentUser();
        if (mCurrentUserSettings == null)
        {
            Log.d("nf_push", "User is NOT logged in, do nothing. We can not register");
            return;
        }
        mCurrentUserSettings.optedIn = true;
        mCurrentUserSettings.optInDisplayed = true;
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("Save user settings ").append(mCurrentUserSettings).toString());
        }
        saveSettings();
        GCMRegistrar.register(getContext(), new String[] {
            "484286080282"
        });
    }

    private int getMessageId(final Context context)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        if (idCounter == -1)
        {
            idCounter = PreferenceUtils.getIntPref(context, "nf_notification_id_counter", 1);
        }
        i = idCounter;
        idCounter++;
        (new BackgroundTask()).execute(new Runnable() {

            final PushNotificationAgent this$0;
            final Context val$context;

            public void run()
            {
                PreferenceUtils.putIntPref(context, "nf_notification_id_counter", PushNotificationAgent.idCounter);
            }

            
            {
                this$0 = PushNotificationAgent.this;
                context = context1;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return i;
        context;
        throw context;
    }

    private UserData getUserData()
    {
        UserData userdata = new UserData();
        userdata.esn = getConfigurationAgent().getEsnProvider().getEsn();
        userdata.deviceCategory = getConfigurationAgent().getDeviceCategory().getValue();
        userdata.netflixId = getUserAgent().getUserCredentialRegistry().getNetflixID();
        userdata.secureNetflixId = getUserAgent().getUserCredentialRegistry().getSecureNetflixID();
        userdata.userId = getService().getUserId();
        userdata.currentProfileUserId = getService().getCurrentProfileUserId();
        userdata.accountCountry = getUserAgent().getReqCountry();
        userdata.accountCountry = getUserAgent().getGeoCountry();
        userdata.languages = getUserAgent().getLanguagesInCsv();
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("GetUserData: ").append(userdata).toString());
        }
        return userdata;
    }

    private boolean isApplicationUpdated()
    {
        if (mCurrentUserSettings == null)
        {
            Log.d("nf_push", "User NOT found. Device is not registered. No need for check for update!");
        } else
        {
            if (!mCurrentUserSettings.optedIn)
            {
                Log.d("nf_push", "User is NOT oped in, no reason to force reregistration");
                return false;
            }
            int i = AndroidManifestUtils.getVersionCode(getContext());
            if (mCurrentUserSettings.oldAppVersion != 0x80000000 && mCurrentUserSettings.oldAppVersion != i)
            {
                if (Log.isLoggable("nf_push", 3))
                {
                    Log.d("nf_push", (new StringBuilder()).append("App version changed from ").append(mCurrentUserSettings.oldAppVersion).append(" to ").append(i).append("; resetting registration id").toString());
                }
                return true;
            }
        }
        return false;
    }

    private boolean isBeaconDeltaExpire()
    {
        long l = System.currentTimeMillis();
        long l1 = mCurrentUserSettings.timestamp;
        if (l1 <= 0L)
        {
            Log.d("nf_push", "We do not know when last time beacon was sent. Probably data from previous app version");
            return true;
        }
        l -= l1;
        if (l <= 0L)
        {
            Log.d("nf_push", "Now is older than last time? Time messed up. Assume it was not sent");
            return true;
        }
        if (l >= 0x5265c00L)
        {
            Log.d("nf_push", "More than 24 hours elapsed. Sent.");
            return true;
        } else
        {
            return false;
        }
    }

    private void loadConfiguration()
    {
        mSettings = NotificationUserSettings.loadSettings(getContext());
    }

    private void onLogin()
    {
        boolean flag1;
        String s = getService().getUserId();
        String s1 = getService().getCurrentProfileUserId();
        boolean flag = false;
        flag1 = false;
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("onLogin with user ID: ").append(s).toString());
        }
        mCurrentUserSettings = (NotificationUserSettings)mSettings.get(s);
        if (mCurrentUserSettings == null)
        {
            Log.d("nf_push", "User was not know from before");
            mCurrentUserSettings = createNewCurrentUserSettings(s, s1);
        } else
        {
            mCurrentUserSettings.current = true;
            if (!StringUtils.safeEquals(mCurrentUserSettings.currentProfileUserId, s1))
            {
                Log.d("nf_push", "currentProfile change detected");
                flag = true;
                updateCurrentUserSettings(s1);
            }
            flag1 = flag;
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("User was know from before and he opted in ").append(mCurrentUserSettings.optedIn).toString());
                flag1 = flag;
            }
        }
_L5:
        Log.d("nf_push", "Checks if application is updated (only if app was registered before)...");
        if (!isApplicationUpdated()) goto _L2; else goto _L1
_L1:
        Log.d("nf_push", "Application was updated, execute silent reregistration!");
        doRegisterForNotifications();
_L4:
        return;
_L2:
        if (validateRegistration()) goto _L4; else goto _L3
_L3:
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        if (!isBeaconDeltaExpire())
        {
            break MISSING_BLOCK_LABEL_266;
        }
        Log.d("nf_push", "Report");
        report(mGcmRegistered);
        return;
        Throwable throwable;
        throwable;
        Log.e("nf_push", "Check if we are registered already failed!", throwable);
        return;
        Log.d("nf_push", "No need to report, it was already done inside of last 24 hours or profileDidNotChange");
        return;
          goto _L5
    }

    private void onNotificationBrowserRedirect(Intent intent)
    {
        Object obj = intent.getStringExtra("guid");
        if (StringUtils.isEmpty(((String) (obj))))
        {
            Log.e("nf_push", "Received browser redirect notification WITHOUT GUID! Do nothing!");
            return;
        }
        String s = intent.getStringExtra("messageGuid");
        if (StringUtils.isEmpty(s))
        {
            Log.e("nf_push", "Received browser redirect notification WITHOUT MESSAGE GUID! Do nothing!");
            return;
        }
        String s1 = intent.getStringExtra("originator");
        if (StringUtils.isEmpty(s1))
        {
            Log.w("nf_push", "Received browser redirect notification WITHOUT ORIGINATOR! Pass default!");
        }
        obj = new MessageData(((String) (obj)), s, s1);
        getService().getClientLogging().getCmpEventLogging().reportUserFeedbackOnReceivedPushNotification(((MessageData) (obj)), UserFeedbackOnReceivedPushNotification.opened);
        AndroidUtils.logIntent("nf_push", intent);
        intent = intent.getStringExtra("target_url");
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("URI to be redirected to ").append(intent).toString());
        }
        if (intent != null)
        {
            Intent intent1 = new Intent("android.intent.action.VIEW");
            intent1.setData(Uri.parse(intent));
            intent1.setFlags(0x34000000);
            getService().startActivity(intent1);
            return;
        } else
        {
            Log.e("nf_push", "URI is missing! Can not open to browser!");
            return;
        }
    }

    private void onNotificationCanceled(Intent intent)
    {
        String s = intent.getStringExtra("guid");
        if (StringUtils.isEmpty(s))
        {
            Log.e("nf_push", "Received cancel notification WITHOUT GUID! Do nothing!");
            return;
        }
        String s1 = intent.getStringExtra("messageGuid");
        if (StringUtils.isEmpty(s1))
        {
            Log.e("nf_push", "Received cancel notification WITHOUT MESSAGE GUID! Do nothing!");
            return;
        }
        intent = intent.getStringExtra("originator");
        if (StringUtils.isEmpty(intent))
        {
            Log.w("nf_push", "Received cancel notification WITHOUT ORIGINATOR! Pass default!");
        }
        intent = new MessageData(s, s1, intent);
        getService().getClientLogging().getCmpEventLogging().reportUserFeedbackOnReceivedPushNotification(intent, UserFeedbackOnReceivedPushNotification.canceled);
    }

    private void registerForPushNotification()
    {
        Log.d("nf_push", "Notification is enabled by UI.");
        if (mGcmSupported)
        {
            if (mGcmRegistered)
            {
                Log.d("nf_push", "Notification is enabled by UI, device does support GCM, but it is already registered!");
                return;
            } else
            {
                Log.d("nf_push", "Notification is enabled by UI, device does support GCM and device is NOT registered!");
                doRegisterForNotifications();
                Log.d("nf_push", "Registered!");
                return;
            }
        } else
        {
            Log.e("nf_push", "Notification is enabled by UI, but device does NOT support GCM!");
            return;
        }
    }

    private void registerReceiver()
    {
        Log.d("nf_push", "Register receiver");
        IntentFilter intentfilter = new IntentFilter("com.netflix.mediaclient.intent.action.PUSH_ONLOGIN");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.PUSH_ONLOGOUT");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTIN");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTOUT");
        intentfilter.addCategory("com.netflix.mediaclient.intent.category.PUSH");
        intentfilter.setPriority(999);
        try
        {
            LocalBroadcastManager.getInstance(getContext()).registerReceiver(pushNotificationReceiver, intentfilter);
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("nf_push", "Failed to register ", throwable);
        }
    }

    private void report(boolean flag)
    {
        report(flag, null);
    }

    private void report(boolean flag, UserData userdata)
    {
        if (!isGcmSupported())
        {
            Log.e("nf_push", "We can not report anything is device does not support push notifications!");
            return;
        }
        if (userdata == null)
        {
            Log.d("nf_push", "Gets user data");
            getUserData();
        } else
        {
            Log.d("nf_push", "Use given user data");
        }
        getService().getClientLogging().getCustomerEventLogging().reportNotificationOptIn(flag, gcmRegistrationId);
    }

    private void saveSettings()
    {
        final Map settings = mSettings;
        if (settings == null)
        {
            Log.e("nf_push", "This should not happen! Map is null!");
            return;
        } else
        {
            (new BackgroundTask()).execute(new Runnable() {

                final PushNotificationAgent this$0;
                final Map val$settings;

                public void run()
                {
                    NotificationUserSettings.saveSettings(getContext(), settings);
                }

            
            {
                this$0 = PushNotificationAgent.this;
                settings = map;
                super();
            }
            });
            return;
        }
    }

    private void unregisterFromPushNotification()
    {
        validateCurrentUser();
        if (mCurrentUserSettings == null)
        {
            Log.d("nf_push", "User is NOT logged in, do nothing");
            return;
        }
        mCurrentUserSettings.optedIn = false;
        mCurrentUserSettings.optInDisplayed = true;
        saveSettings();
        Log.d("nf_push", "Notification is enabled by UI.");
        if (mGcmSupported)
        {
            if (mGcmRegistered)
            {
                Log.d("nf_push", "Notification is enabled by UI, device does support GCM, but it is already registered! Unregister!");
            } else
            {
                Log.d("nf_push", "Notification is enabled by UI, device does support GCM and device is NOT registered! Just in case deactivate!");
            }
            GCMRegistrar.unregister(getContext());
            if (mCurrentUserSettings != null)
            {
                mCurrentUserSettings.optInDisplayed = true;
            }
            report(false);
            mGcmRegistered = false;
            gcmRegistrationId = null;
            return;
        } else
        {
            Log.d("nf_push", "Notification is enabled by UI, but device does NOT support GCM! Do nothing!");
            return;
        }
    }

    private void unregisterOnUserLogout(UserData userdata)
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("nf_push", "User is loging out");
        if (isGcmSupported()) goto _L2; else goto _L1
_L1:
        Log.e("nf_push", "We can not do anything because device does not support push notifications!");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.d("nf_push", "User is opted in, unregister device and send opt put state, but preserve user choice so we can restore it on his/her next login");
        GCMRegistrar.unregister(getContext());
        report(false, userdata);
        if (userdata == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        mCurrentUserSettings = (NotificationUserSettings)mSettings.get(userdata.userId);
        if (mCurrentUserSettings == null)
        {
            Log.e("nf_push", "User is logging out and it was uknown before?");
            mCurrentUserSettings = new NotificationUserSettings();
            mCurrentUserSettings.current = true;
            mCurrentUserSettings.userId = userdata.userId;
            mCurrentUserSettings.optedIn = true;
            mCurrentUserSettings.currentProfileUserId = userdata.currentProfileUserId;
            mCurrentUserSettings.oldAppVersion = AndroidManifestUtils.getVersionCode(getContext());
        }
        saveSettings();
        mCurrentUserSettings = null;
        mGcmRegistered = false;
        gcmRegistrationId = null;
        if (true) goto _L4; else goto _L3
_L3:
        userdata;
        throw userdata;
    }

    private void unregisterReceiver()
    {
        try
        {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(pushNotificationReceiver);
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("nf_push", "Failed to unregister ", throwable);
        }
    }

    private void updateCurrentUserSettings(String s)
    {
        mCurrentUserSettings.currentProfileUserId = s;
        mCurrentUserSettings.timestamp = System.currentTimeMillis();
        mSettings.put(mCurrentUserSettings.userId, mCurrentUserSettings);
        NotificationUserSettings.saveSettings(getContext(), mSettings);
    }

    private void validateCurrentUser()
    {
        String s = getService().getUserId();
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("User ID: ").append(s).toString());
        }
        if (StringUtils.isEmpty(s))
        {
            Log.e("nf_push", "User ID is empty! This should NOT happen!");
            getService().getClientLogging().getErrorLogging().logHandledException("PushNotificationAgent.validateCurrentUser: user ID is empty!");
        } else
        if (mCurrentUserSettings == null || !s.equals(mCurrentUserSettings.userId))
        {
            Log.d("nf_push", "We DO NOT have user! Try to find it from settings");
            if (mCurrentUserSettings != null)
            {
                mCurrentUserSettings.current = false;
            }
            mCurrentUserSettings = (NotificationUserSettings)mSettings.get(s);
            if (mCurrentUserSettings == null)
            {
                Log.d("nf_push", "User was not know from before");
                mCurrentUserSettings = createNewCurrentUserSettings(s, getService().getCurrentProfileUserId());
                return;
            }
            mCurrentUserSettings.current = true;
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("User was know from before and he opted in ").append(mCurrentUserSettings.optedIn).toString());
            }
            if (validateRegistration())
            {
                return;
            }
        }
    }

    private boolean validateRegistration()
    {
        Log.d("nf_push", "Checks GCM registration...");
        gcmRegistrationId = GCMRegistrar.getRegistrationId(getContext());
        if (StringUtils.isEmpty(gcmRegistrationId))
        {
            Log.d("nf_push", "Not registered to GCM");
            mGcmRegistered = false;
            if (mCurrentUserSettings.optedIn)
            {
                Log.d("nf_push", "User was opted in, execute silent reregistration");
                doRegisterForNotifications();
                return true;
            }
        } else
        {
            mGcmRegistered = true;
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("Already registered to GCM with id: ").append(gcmRegistrationId).toString());
            }
        }
        return false;
    }

    public void destroy()
    {
        Log.d("nf_push", "PNA:: destroy and unregister receiver");
        unregisterReceiver();
        super.destroy();
    }

    protected void doInit()
    {
        loadConfiguration();
        verifyGCM();
        registerReceiver();
        mImageLoader = getService().getImageLoader();
        initCompleted(0);
    }

    public String getGcmRegistrationId()
    {
        return gcmRegistrationId;
    }

    public boolean handleCommand(Intent intent)
    {
        if (intent == null)
        {
            Log.w("nf_push", "Intent is null");
            return false;
        }
        if ("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_GCM_ONREGISTERED".equals(intent.getAction()))
        {
            Log.d("nf_push", "Handle registration");
            setRegistrationIdFromRegistrationServer(intent.getStringExtra("reg_id"));
        } else
        if ("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_GCM_ONUNREGISTERED".equals(intent.getAction()))
        {
            Log.d("nf_push", "Handle unregistration");
            unregistrationFromFromRegistrationServer(intent.getStringExtra("reg_id"));
        } else
        if ("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_GCM_ONMESSAGE".equals(intent.getAction()))
        {
            Log.d("nf_push", "Handle message");
            onMessage(intent);
        } else
        if ("com.netflix.mediaclient.intent.action.NOTIFICATION_CANCELED".equals(intent.getAction()))
        {
            Log.d("nf_push", "Handle notification canceled");
            onNotificationCanceled(intent);
        } else
        if ("com.netflix.mediaclient.intent.action.NOTIFICATION_BROWSER_REDIRECT".equals(intent.getAction()))
        {
            Log.d("nf_push", "Handle notification browser redirect");
            onNotificationBrowserRedirect(intent);
        } else
        {
            Log.e("nf_push", "Uknown command!");
            return false;
        }
        return true;
    }

    public boolean isGcmRegistered()
    {
        return mGcmRegistered;
    }

    public boolean isGcmSupported()
    {
        return mGcmSupported;
    }

    public boolean isReady()
    {
        return mGcmSupported;
    }

    public boolean isRegistered()
    {
        return mGcmRegistered;
    }

    public boolean isSupported()
    {
        return isGcmSupported();
    }

    public void onMessage(Intent intent)
    {
        Log.d("nf_push", "Message received, create notification. Running it on main thread.");
        NotificationFactory.createNotification(getContext(), intent, mImageLoader, getMessageId(getContext()), getService().getClientLogging().getErrorLogging());
    }

    public void setRegistrationIdFromRegistrationServer(String s)
    {
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("setRegistrationIdFromRegistrationServer ").append(s).toString());
        }
        gcmRegistrationId = s;
        mGcmRegistered = true;
        report(true);
    }

    public void unregistrationFromFromRegistrationServer(String s)
    {
        if (s != null && s.equals(gcmRegistrationId))
        {
            Log.d("nf_push", "Same registrration ID, report to back end");
        } else
        {
            Log.e("nf_push", (new StringBuilder()).append("Received registration ID ").append(s).append(" is NOT the same as registration ID known to app ").append(gcmRegistrationId).append(". Ignore!").toString());
        }
        report(false);
    }

    public void verifyGCM()
    {
        try
        {
            GCMRegistrar.checkDevice(getContext());
            Log.d("nf_push", "Device supports GCM");
        }
        catch (Throwable throwable)
        {
            Log.e("nf_push", "Device does NOT supports GCM");
            return;
        }
        mGcmSupported = true;
    }

    public boolean wasNotificationOptInDisplayed()
    {
        if (!mGcmSupported)
        {
            Log.e("nf_push", "Device is NOT GCM registered, do not display notification! That is why true is returned");
            return true;
        }
        validateCurrentUser();
        if (mCurrentUserSettings == null)
        {
            Log.d("nf_push", "Current user is empty. Do NOT display opt in dialog!");
            return true;
        }
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("Current user was displayed ").append(mCurrentUserSettings.optInDisplayed).toString());
        }
        return mCurrentUserSettings.optInDisplayed;
    }








}
