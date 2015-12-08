// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.preference.Preference;
import com.microsoft.onlineid.a;
import com.microsoft.onlineid.b;
import com.microsoft.onlineid.d;
import com.microsoft.onlineid.e;
import com.microsoft.onlineid.g;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.j;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.Setup;
import com.skype.SkyLib;
import com.skype.android.SkyLibSetup;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.Agent;
import com.skype.android.app.AgentComponent;
import com.skype.android.app.BackgroundNavigation;
import com.skype.android.app.OnPreferenceChangedEvent;
import com.skype.android.app.ads.AdManagerInitializer;
import com.skype.android.app.calling.SeamlessCapabilityReceiver;
import com.skype.android.app.chat.ChatServiceMonitor;
import com.skype.android.app.settings.SkypePreferenceListener;
import com.skype.android.app.settings.SnoozeNotificationHelper;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.signin.tasks.AccountTaskComposition;
import com.skype.android.config.FileUtil;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.push.PushManager;
import com.skype.android.res.Sounds;
import com.skype.android.service.AccountService;
import com.skype.android.service.LocalBinder;
import com.skype.android.service.SyncAccountUtil;
import com.skype.android.skylib.GISetup;
import com.skype.android.telemetry.RecordBuilder;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.util.AccountUtil;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.PerformanceLog;
import com.skype.android.util.State;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionUtil;
import com.skype.android.wakeup.ForegroundState;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.signin:
//            SharedGlobalPreferences, PromptManualSignInFromAgentTelemetryEvent

public class AccountAgent extends Agent
    implements ServiceConnection, b, e, com.skype.android.util.State.OnStateUpdateListener
{

    private static final String ATTRIBUTE_ACCOUNT_LOGOUT_REASON = "account_logout_reason";
    private static final String ATTRIBUTE_ACCOUNT_NEW_STATE = "account_new_state";
    private static final String ATTRIBUTE_ACCOUNT_OLD_STATE = "account_old_state";
    private static final String EVENT_TYPE_ANDROID_LOGOUT_REASON = "android_logout_reason";
    private static final String SCOPES = "scopes";
    private static final Logger log = Logger.getLogger("AccountAgent");
    private AccountService accountService;
    AccountTaskComposition accountTasks;
    AdManagerInitializer adManagerInitializer;
    Analytics analytics;
    AnalyticsPersistentStorage analyticsPersistentStorage;
    private State availabilityState;
    private boolean cblSyncComplete;
    ChatServiceMonitor chatServiceMonitor;
    ContactUtil contactUtil;
    private Context context;
    private EcsConfiguration ecsConfiguration;
    private Notification foregroundNotification;
    ForegroundState foregroundState;
    ImageCache imageCache;
    SkyLib lib;
    BackgroundNavigation navigation;
    NetworkUtil networkUtil;
    private final int notificationId;
    NotificationManager notificationManager;
    private PermissionUtil permissionUtil;
    PushManager pushManager;
    SkypePreferenceListener skypePreferenceListener;
    Sounds sounds;
    TelemetryHelper telemetryHelper;
    TimeUtil timeUtil;

    public AccountAgent(Application application, EcsConfiguration ecsconfiguration)
    {
        super(application);
        getComponent().inject(this);
        context = application;
        notificationId = application.getPackageName().hashCode();
        ecsConfiguration = ecsconfiguration;
        availabilityState = new State();
        setOnStateUpdateListener(this);
        permissionUtil = new PermissionUtil(application);
    }

    private void clearLogoutReason()
    {
        analyticsPersistentStorage.d();
        getUserPreferences().clearAccountLogoutReason();
    }

    private void createForegroundNotification()
    {
        android.support.v4.app.x.d d1 = createNotificationBuilder();
        updateAvailability(d1);
        foregroundNotification = d1.e();
        log.info((new StringBuilder("createForegroundNotification() onGoingNotificationId: ")).append(notificationId).toString());
        notificationManager.notify(notificationId, foregroundNotification);
    }

    private android.support.v4.app.x.d createNotificationBuilder()
    {
        android.support.v4.app.x.d d1 = new android.support.v4.app.x.d(context);
        d1.b(true);
        d1.a(true);
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        d1.a(PendingIntent.getActivity(context, 0, intent, 0x8000000));
        return d1;
    }

    private void getTicketForScope(j j1, String s)
    {
        s = s.split("::");
        s = new g(s[1], s[2]);
        log.info((new StringBuilder("Acquiring ticket for scope ")).append(s).toString());
        j1.a(s, new Bundle());
    }

    private void handleStatusNotificationSettingChanged(boolean flag)
    {
        log.info((new StringBuilder("handleStatusNotificationSettingChanged() enabled:")).append(flag).toString());
        if (flag)
        {
            showOngoingServiceNotification();
            return;
        } else
        {
            stopAccountService();
            notificationManager.cancel(notificationId);
            return;
        }
    }

    private void saveLogoutReason()
    {
        analyticsPersistentStorage.a(getAccount());
        getUserPreferences().saveAccountLogoutReason(getAccount());
    }

    private void saveUserAvatar(Account account)
    {
        Account account1;
        Object obj;
        Object obj2;
        Object obj3;
        Bitmap bitmap;
        bitmap = imageCache.a(account);
        if (bitmap == null)
        {
            return;
        }
        obj2 = null;
        obj = null;
        obj3 = null;
        account1 = obj;
        File file = new File(getContext().getFilesDir(), account.getSkypenameProp().concat(".jpg"));
        account1 = obj;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        account = obj3;
        account1 = obj;
        if (!file.delete())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        account1 = obj;
        account = new FileOutputStream(file);
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, account);
        FileUtil.flushStream(account);
        FileUtil.closeStream(account);
        return;
        Object obj1;
        obj1;
        account = obj2;
_L4:
        account1 = account;
        ((Exception) (obj1)).printStackTrace();
        FileUtil.flushStream(account);
        FileUtil.closeStream(account);
        return;
        account;
_L2:
        FileUtil.flushStream(account1);
        FileUtil.closeStream(account1);
        throw account;
        obj1;
        account1 = account;
        account = ((Account) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setupGI(Setup setup, GISetup gisetup)
    {
        gisetup.a(context, setup, com.skype.android.skylib.GISetup.Scope.b);
    }

    private void setupSeamlessSupport()
    {
        boolean flag1 = networkUtil.f();
        boolean flag = networkUtil.g();
        Object obj = lib;
        byte byte0;
        if (flag1 || flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((SkyLib) (obj)).setSeamlessCapable(flag);
        obj = new ComponentName(context, com/skype/android/app/calling/SeamlessCapabilityReceiver);
        if (flag1)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        context.getPackageManager().setComponentEnabledSetting(((ComponentName) (obj)), byte0, 1);
    }

    private void showOngoingServiceNotification()
    {
        createForegroundNotification();
        startAccountService();
    }

    private void startAccountService()
    {
        Intent intent = new Intent(context, com/skype/android/service/AccountService);
        intent.setAction("com.skype.ACTION_START_BACKGROUND");
        context.bindService(intent, this, 1);
        context.startService(intent);
    }

    private void stopAccountService()
    {
        if (accountService != null)
        {
            accountService.stopForeground(true);
        }
        Intent intent = new Intent(context, com/skype/android/service/AccountService);
        context.stopService(intent);
    }

    private void updateAvailability(android.support.v4.app.x.d d1)
    {
        com.skype.Contact.AVAILABILITY availability = getAccount().getAvailabilityProp();
        int k;
        int l;
        if (ContactUtil.b(availability))
        {
            l = 0x7f0802f5;
            k = 0x7f0201b9;
        } else
        if (ContactUtil.a(availability))
        {
            l = 0x7f0802f8;
            k = 0x7f0201be;
        } else
        {
            l = 0x7f0802c8;
            k = 0x7f0201b9;
        }
        if (getUserPreferences().isSkypeStatusNotificationEnabled())
        {
            d1.a(k);
            d1.a(context.getString(0x7f0801a9));
            d1.b(context.getString(l));
        }
    }

    public void onAccountAcquired(j j1, Bundle bundle)
    {
        log.info("onAccountAcquired");
        bundle = bundle.getStringArray("scopes");
        if (bundle != null)
        {
            int l = bundle.length;
            for (int k = 0; k < l; k++)
            {
                getTicketForScope(j1, bundle[k]);
            }

        }
    }

    public void onAccountEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        Account account = (Account)onpropertychange.getSender();
        onpropertychange = onpropertychange.getPropKey();
        if (onpropertychange == PROPKEY.CONTACT_AVAILABILITY && account.getStatusProp() == com.skype.Account.STATUS.LOGGED_IN)
        {
            if (DeviceFeatures.d() && foregroundNotification == null)
            {
                log.info("onAccountEvent() create notification for BB from the background");
                createForegroundNotification();
            }
            if (foregroundNotification != null && availabilityState.a(account.getAvailabilityProp()) && getUserPreferences().isSkypeStatusNotificationEnabled())
            {
                onpropertychange = createNotificationBuilder();
                updateAvailability(onpropertychange);
                log.info("onAccountEvent() notify");
                notificationManager.notify(notificationId, onpropertychange.e());
            }
        } else
        if (onpropertychange == PROPKEY.ACCOUNT_CBLSYNCSTATUS)
        {
            try
            {
                onpropertychange = account.getCblSyncStatusProp();
                if (com.skype.Account.CBLSYNCSTATUS.CBL_IN_SYNC == onpropertychange)
                {
                    if (!cblSyncComplete)
                    {
                        PerformanceLog.e.a("CORE LIB ACTION: contacts have completed syncing");
                        cblSyncComplete = true;
                    }
                    if (getUserPreferences().isSyncContactsEnabled() && permissionUtil.a(Permission.p))
                    {
                        onpropertychange = (new SyncAccountUtil(context, timeUtil)).getCurrentAccount();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("force", true);
                        bundle.putBoolean("expedited", true);
                        ContentResolver.requestSync(onpropertychange, "com.android.contacts", bundle);
                        return;
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
            {
                onpropertychange.printStackTrace();
                return;
            }
        }
    }

    public void onAccountSignedOut(String s, boolean flag, Bundle bundle)
    {
        log.info("onAccountSignedOut");
    }

    public void onEvent(OnPreferenceChangedEvent onpreferencechangedevent)
    {
        String s = onpreferencechangedevent.getPreference().getKey();
        log.info((new StringBuilder("onEvent() key:")).append(s).toString());
        if (s.equals(getContext().getString(0x7f080556)))
        {
            handleStatusNotificationSettingChanged(((Boolean)onpreferencechangedevent.getNewValue()).booleanValue());
        } else
        if (s.equals(getContext().getString(0x7f08053e)))
        {
            handleStatusNotificationSettingChanged(getUserPreferences().isSkypeStatusNotificationEnabled());
            if (Boolean.valueOf(((Boolean)onpreferencechangedevent.getNewValue()).booleanValue()).booleanValue())
            {
                (new SnoozeNotificationHelper(getContext())).cancelAlarm();
                return;
            }
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnAuthTokenRequest onauthtokenrequest)
    {
        onauthtokenrequest = onauthtokenrequest.getScopes();
        Object obj = getAccount();
        if (AccountUtil.a(((Account) (obj))) && onauthtokenrequest != null)
        {
            a a1 = new a(getContext());
            a1.a(this);
            a1.a(this);
            obj = AccountUtil.d(((Account) (obj)));
            Bundle bundle = new Bundle();
            bundle.putStringArray("scopes", onauthtokenrequest);
            log.info((new StringBuilder("Acquiring UserAccount for cid ")).append(((String) (obj))).toString());
            a1.a(((String) (obj)), bundle);
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnChatServiceConnectivity onchatserviceconnectivity)
    {
        chatServiceMonitor.processEvent(onchatserviceconnectivity.getSender().getConnectivity());
    }

    public void onFailure(com.microsoft.onlineid.b.a a1, Bundle bundle)
    {
        a1.printStackTrace();
        log.log(Level.SEVERE, "MSA SDK failure!", a1);
    }

    public void onLoggingOut()
    {
        if (getUserPreferences().saveUserPwdOnLogout())
        {
            saveUserAvatar(getAccount());
        }
    }

    public void onLogin()
    {
        super.onLogin();
        clearLogoutReason();
        availabilityState.a(null);
        setupGI(lib.getSetup(), new SkyLibSetup(ecsConfiguration));
        if (getUserPreferences().isSkypeStatusNotificationEnabled() || !pushManager.isAnyServiceSupported() || DeviceFeatures.d())
        {
            showOngoingServiceNotification();
            log.info("onLogin() setSkypeStatusNotificationEnabled");
            getUserPreferences().setSkypeStatusNotificationEnabled();
        }
        skypePreferenceListener.init(getUserPreferences());
        setupSeamlessSupport();
        accountTasks.onLogin(getAccount());
        adManagerInitializer.initialize(getAccount());
        String s = getAccount().getSigninNameProp();
        SignInConstants.AccountType accounttype;
        if (getAccount().getLastPartnerId() == com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT)
        {
            accounttype = SignInConstants.AccountType.MSA;
        } else
        {
            accounttype = SignInConstants.AccountType.SKYPE;
        }
        (new SharedGlobalPreferences(context)).addExistingAccount(s, accounttype);
    }

    public void onLogout()
    {
        saveLogoutReason();
        stopAccountService();
        AccountUtil.a(context);
        notificationManager.cancelAll();
        if (!getUserPreferences().saveUserPwdOnLogout()) goto _L2; else goto _L1
_L1:
        getUserPreferences().saveLoginAsDisplayName(getAccount());
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Account$LOGOUTREASON[];
            static final int $SwitchMap$com$skype$Account$STATUS[];

            static 
            {
                $SwitchMap$com$skype$Account$STATUS = new int[com.skype.Account.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$skype$Account$LOGOUTREASON = new int[com.skype.Account.LOGOUTREASON.values().length];
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.ACCESS_TOKEN_RENEWAL_FAILED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.PASSWORD_HAS_CHANGED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.PERIODIC_UIC_UPDATE_FAILED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Account$LOGOUTREASON[com.skype.Account.LOGOUTREASON.REMOTE_LOGOUT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.Account.LOGOUTREASON[getUserPreferences().getAccountLogoutReason().ordinal()];
        JVM INSTR tableswitch 1 4: default 88
    //                   1 127
    //                   2 127
    //                   3 127
    //                   4 127;
           goto _L2 _L3 _L3 _L3 _L3
_L2:
        accountTasks.onLogout(getAccount());
        availabilityState.a(null);
        adManagerInitializer.release();
        chatServiceMonitor.resetConnectionIndicator();
        super.onLogout();
        return;
_L3:
        navigation.toLandingPage(getAccount());
        analytics.a(new PromptManualSignInFromAgentTelemetryEvent(analyticsPersistentStorage.c(), foregroundState.c()));
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = (LocalBinder)ibinder;
        if (componentname.getBinding() != null && (!pushManager.isAnyServiceSupported() || DeviceFeatures.d()))
        {
            log.info("No push services supported!");
            accountService = (AccountService)componentname.getBinding();
            accountService.startForeground(notificationId, foregroundNotification);
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        accountService = null;
    }

    public void onStateChanged(com.skype.Account.STATUS status, com.skype.Account.STATUS status1)
    {
        RecordBuilder recordbuilder;
        switch (_cls1..SwitchMap.com.skype.Account.STATUS[status1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            recordbuilder = telemetryHelper.startBuildingRecord(true);
            break;
        }
        telemetryHelper.addFullNetworkInfo(recordbuilder);
        Account account = getAccount();
        recordbuilder.a(account);
        recordbuilder.a("account_old_state", status.name());
        recordbuilder.a("account_new_state", status1.name());
        recordbuilder.a("account_logout_reason", account.getLogoutReasonProp().name());
        recordbuilder.a("android_logout_reason");
        telemetryHelper.sendRecord(recordbuilder);
    }

    public volatile void onStateChanged(Object obj, Object obj1)
    {
        onStateChanged((com.skype.Account.STATUS)obj, (com.skype.Account.STATUS)obj1);
    }

    public void onTicketAcquired(i k, j j1, Bundle bundle)
    {
        j1 = k.a();
        bundle = (new g(j1.a(), j1.b().toUpperCase(Locale.US))).toString();
        log.info((new StringBuilder("onTicketAcquired for scope ")).append(bundle).toString());
        j1 = k.c().replaceFirst("t=", "");
        k = j1;
        if (j1.endsWith("&p="))
        {
            k = j1.substring(0, j1.length() - 3);
        }
        if (!lib.putAuthTokens(com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT.toInt(), new String[] {
    bundle
}, k))
        {
            log.severe("Skylib putAuthTokens failed.");
        }
    }

    public void onUINeeded(PendingIntent pendingintent, Bundle bundle)
    {
        try
        {
            pendingintent.send();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            return;
        }
    }

    public void onUserCancel(Bundle bundle)
    {
        log.info("onUserCancel!");
    }

}
