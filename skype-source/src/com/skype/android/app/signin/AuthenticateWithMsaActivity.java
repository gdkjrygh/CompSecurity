// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.microsoft.onlineid.a;
import com.microsoft.onlineid.b;
import com.microsoft.onlineid.c;
import com.microsoft.onlineid.e;
import com.microsoft.onlineid.f;
import com.microsoft.onlineid.g;
import com.microsoft.onlineid.h;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.j;
import com.skype.Setup;
import com.skype.SkyLib;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.InfoDialogFragment;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.util.SignInDurationReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.signin:
//            AbstractSignInActivity, SignInConstants, LinkingSkypeNamesNotFoundActivity, LinkingGetAccounts, 
//            SignInErrorTelemetryEvent

public class AuthenticateWithMsaActivity extends AbstractSignInActivity
    implements com.microsoft.onlineid.b, c, e, SignInConstants
{
    private static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a MSA_SIGN_IN;
        public static final a MSA_SIGN_UP;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/signin/AuthenticateWithMsaActivity$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        static 
        {
            MSA_SIGN_IN = new a("MSA_SIGN_IN", 0);
            MSA_SIGN_UP = new a("MSA_SIGN_UP", 1);
            $VALUES = (new a[] {
                MSA_SIGN_IN, MSA_SIGN_UP
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }

    private static final class b extends com.microsoft.onlineid.b.a
    {

        b(String s)
        {
            super(s);
        }
    }


    private static final boolean ALLOW_SPAM = false;
    private static final String EXTRA_CID = "extra_cid";
    private static final String EXTRA_REQUESTED_TICKET = "requested_ticket";
    private static final int LINKING = 2;
    private static final int LOGIN = 1;
    private static final String LOG_SUB_TAG = "AuthenticateWithMsaActivity";
    private static final String SECURITY_SCOPE_LOGIN = "login.skype.com";
    private static final String SECURITY_SCOPE_POLICY = "mbi_ssl";
    private static final String SECURITY_SCOPE_SKYPE = "skype.com";
    private static final int UNKNOWN = -1;
    private com.microsoft.onlineid.a accountManager;
    Analytics analytics;
    private String cid;
    EcsConfiguration ecsConfiguration;
    SkyLib lib;
    LinkingGetAccounts linkingGetAccounts;
    private ArrayList microsoftAccounts;
    SignInDurationReporter signInDurationReporter;
    private boolean skypeInfoChecked;
    private ArrayList suggestedAccounts;
    TelemetryHelper telemetryHelper;
    private a type;
    private j userAccount;
    private String userName;

    public AuthenticateWithMsaActivity()
    {
        type = a.MSA_SIGN_IN;
        userAccount = null;
        cid = null;
        skypeInfoChecked = false;
        microsoftAccounts = new ArrayList();
        suggestedAccounts = new ArrayList();
    }

    private void accountsLinking(boolean flag)
    {
        Intent intent = new Intent(this, com/skype/android/app/signin/LinkingSkypeNamesNotFoundActivity);
        intent.putParcelableArrayListExtra("microsoftAccounts", microsoftAccounts);
        intent.putExtra("accessToken", skypeAccessToken);
        intent.putExtra("refreshToken", "");
        intent.putExtra("loginAccessToken", loginAccessToken);
        intent.putExtra("marketing", flag);
        startActivity(intent);
        finish();
    }

    private void acquireAccount(boolean flag)
    {
        if (cid != null)
        {
            log.info(subTagLog((new StringBuilder("Acquiring previously obtained account with cid ")).append(cid).toString()));
            accountManager.a(cid, new Bundle());
        }
    }

    private String dumpBundle(Bundle bundle)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (bundle != null)
        {
            String s;
            for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); stringbuilder.append(s).append(':').append(bundle.get(s)).append(' '))
            {
                s = (String)iterator.next();
            }

        }
        return stringbuilder.toString();
    }

    private String getLinkingScopeForSDK()
    {
        if (isLightweightMSAEnabled())
        {
            return parseLoginScopeForSdk(ecsConfiguration.getMSALoginScope());
        } else
        {
            return "skype.com";
        }
    }

    private String getLoginScopeForSDK()
    {
        if (isLightweightMSAEnabled())
        {
            return parseLoginScopeForSdk(ecsConfiguration.getMSALoginScope());
        } else
        {
            return "login.skype.com";
        }
    }

    private void getMsaLinkingAccounts(com.skype.android.gen.SkyLibListener.OnSuggestedAccountsResult onsuggestedaccountsresult)
    {
        linkingGetAccounts.setEvent(onsuggestedaccountsresult);
        onsuggestedaccountsresult = new LinkingGetAccounts.LinkingCallback() {

            final AuthenticateWithMsaActivity this$0;

            public final void microsoftAccounts(String s, String s1, ArrayList arraylist, ArrayList arraylist1)
            {
label0:
                {
                    AuthenticateWithMsaActivity.this.microsoftAccounts = arraylist;
                    suggestedAccounts = arraylist1;
                    if (isLightweightMSAEnabled())
                    {
                        if (type != a.MSA_SIGN_UP)
                        {
                            break label0;
                        }
                        analytics.a(new SkypeTelemetryEvent(LogEvent.s));
                        lib.linkAccountWithPartner(com.skype.SkyLib.PARTNER_ID.PARTNER_MICROSOFT.toInt(), skypeAccessToken, "", "", "", false, false);
                    }
                    return;
                }
                accountsLinking(false);
            }

            public final void onLinkingError(String s)
            {
                showErrorDialog(new b(s));
            }

            
            {
                this$0 = AuthenticateWithMsaActivity.this;
                super();
            }
        };
        linkingGetAccounts.getMsaInfo(skypeAccessToken, "", ecsConfiguration.getMSALoginScope(), onsuggestedaccountsresult);
    }

    private String getSiteName()
    {
        return parseLoginScopeForSdk(ecsConfiguration.getMSALoginScope());
    }

    private void handleSkypeLinkInfoResult(com.skype.android.gen.SkyLibListener.OnPartnerLinkInfoResult onpartnerlinkinforesult)
    {
        com.skype.SkyLib.AUTH_RESULT auth_result = onpartnerlinkinforesult.getCode();
        log.info(subTagLog((new StringBuilder("OnPartnerLinkInfoResult: ")).append(auth_result).toString()));
        static final class _cls3
        {

            static final int $SwitchMap$com$skype$SkyLib$AUTH_RESULT[];

            static 
            {
                $SwitchMap$com$skype$SkyLib$AUTH_RESULT = new int[com.skype.SkyLib.AUTH_RESULT.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_OK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$AUTH_RESULT[com.skype.SkyLib.AUTH_RESULT.AUTH_ANOTHER_MAPPING_EXISTS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.skype.SkyLib.AUTH_RESULT[auth_result.ordinal()])
        {
        default:
            log.severe(subTagLog("Failure to get partner link info"));
            analytics.a(new SignInErrorTelemetryEvent(auth_result));
            showError(auth_result);
            return;

        case 2: // '\002'
            signInWithMsa();
            return;

        case 1: // '\001'
            break;
        }
        if (TextUtils.isEmpty(onpartnerlinkinforesult.getSkypename()))
        {
            log.info(subTagLog((new StringBuilder("no merged account found, token:")).append(skypeAccessToken).toString()));
            lib.getSuggestedAccounts(MS_PARTNER_ID, skypeAccessToken);
            return;
        } else
        {
            log.info(subTagLog("account already merged"));
            signInWithMsa();
            return;
        }
    }

    private boolean isLightweightMSAEnabled()
    {
        return ecsConfiguration.getLightweightMSASupportState() > 0;
    }

    private boolean isSignIn()
    {
        return type == a.MSA_SIGN_IN;
    }

    private boolean isSignUp()
    {
        return type == a.MSA_SIGN_UP;
    }

    private void navigateToMSASignIn()
    {
        h h1 = new h();
        h1.a(userName);
        log.info(subTagLog((new StringBuilder("Getting MSA SDK sign in intent for username ")).append(userName).toString()));
        accountManager.a(h1, new Bundle());
    }

    private void navigateToMSASignUp()
    {
        log.info(subTagLog("Getting MSA SDK sign up intent"));
        accountManager.a(new Bundle());
    }

    private void onAccountRemoved()
    {
        log.info(subTagLog("onAccountRemoved"));
        userAccount = null;
        cid = null;
        skypeAccessToken = null;
        loginAccessToken = null;
        skypeInfoChecked = false;
        finish();
    }

    private void onSkypeTokenAcquired(i k)
    {
        int l = ecsConfiguration.getLightweightMSASupportState();
        lib.getSetup().setInt("*Lib/Account/LWEnabled", l);
        skypeAccessToken = k.c();
        if (isSignUp())
        {
            boolean flag = getIntent().getBooleanExtra("marketing", false);
            analytics.a(new SkypeTelemetryEvent(LogEvent.s));
            lib.linkAccountWithPartner(MS_PARTNER_ID, skypeAccessToken, "", "", "", flag);
        } else
        if (isSignIn())
        {
            lib.getSkypeLinkInfo(MS_PARTNER_ID, skypeAccessToken);
            return;
        }
    }

    private String parseLoginScopeForSdk(String s)
    {
        String s1 = s;
        if (!TextUtils.isEmpty(s))
        {
            String as[] = s.split("::");
            s1 = s;
            if (as.length > 2)
            {
                s1 = as[1];
            }
        }
        return s1;
    }

    private void showErrorDialog(com.microsoft.onlineid.b.a a1)
    {
        a1 = getString(0x7f08003c);
        a1 = InfoDialogFragment.create(getString(0x7f08003d), a1, getString(0x7f0802f6));
        a1.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final AuthenticateWithMsaActivity this$0;

            public final void onDismiss(DialogInterface dialoginterface)
            {
                finish();
            }

            
            {
                this$0 = AuthenticateWithMsaActivity.this;
                super();
            }
        });
        SkypeDialogFragment.dismiss(getSupportFragmentManager());
        a1.show(getSupportFragmentManager());
    }

    private String subTagLog(String s)
    {
        return (new StringBuilder("AuthenticateWithMsaActivity: ")).append(s).toString();
    }

    public void onAccountAcquired(j j1, Bundle bundle)
    {
        userAccount = j1;
        cid = j1.a();
        log.info(subTagLog(String.format("onAccountAcquired: Cid: %s Bundle: %s", new Object[] {
            cid, dumpBundle(bundle)
        })));
        String s = getLoginScopeForSDK();
        SignInTelemetryEvent signintelemetryevent = createSignInTelemetryEvent(LogEvent.w, SignInConstants.AccountType.MSA, true);
        analytics.a(signintelemetryevent);
        signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.c, String.valueOf(SignInConstants.AccountType.MSA), true);
        bundle.putInt("requested_ticket", 1);
        j1.a(new g(s, "mbi_ssl"), bundle);
    }

    public void onAccountCollectionAcquired(Set set, Bundle bundle)
    {
        log.info(subTagLog(String.format("onAccountCollectionAcquired", new Object[0])));
        Toast.makeText(this, "onAccountCollectionRequired!", 0).show();
        set = set.iterator();
        if (set.hasNext())
        {
            onAccountAcquired((j)set.next(), bundle);
        }
    }

    public void onAccountSignedOut(String s, boolean flag, Bundle bundle)
    {
        onAccountRemoved();
    }

    protected void onActivityResult(int k, int l, Intent intent)
    {
        super.onActivityResult(k, l, intent);
        while (accountManager.a(l, intent) || l != -1) 
        {
            return;
        }
        showProgress();
        accountsLinking(false);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setTitle(null);
        isLightweightMSAEnabled();
        f f1 = new f(com.microsoft.onlineid.f.a.e);
        f1.a(ecsConfiguration.getMsaCobrandId());
        accountManager = new com.microsoft.onlineid.a(getApplicationContext(), f1);
        accountManager.a(this);
        accountManager.a(this);
        accountManager.a(this);
        if (bundle != null)
        {
            cid = bundle.getString("extra_cid", null);
            if (cid != null && userAccount == null)
            {
                acquireAccount(false);
            }
        }
        signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.j, String.valueOf(SignInConstants.AccountType.MSA), true, String.valueOf(SignInConstants.ScreenName.MSA_SDK_SIGN_IN_SCREEN));
        bundle = getIntent();
        userName = bundle.getStringExtra("username");
        if (bundle.getBooleanExtra("msasignup", false))
        {
            type = a.MSA_SIGN_UP;
        }
        if (isSignIn())
        {
            bundle = getString(0x7f080429);
        } else
        {
            bundle = getString(0x7f0803b7);
        }
        showProgress(bundle);
        if (userAccount == null)
        {
            if (isSignIn())
            {
                navigateToMSASignIn();
            } else
            if (isSignUp())
            {
                navigateToMSASignUp();
                return;
            }
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnAccountPartnerLinkResult onaccountpartnerlinkresult)
    {
        onaccountpartnerlinkresult = onaccountpartnerlinkresult.getCode();
        log.info(subTagLog((new StringBuilder("OnAccountPartnerLinkResult: ")).append(onaccountpartnerlinkresult).toString()));
        switch (_cls3..SwitchMap.com.skype.SkyLib.AUTH_RESULT[onaccountpartnerlinkresult.ordinal()])
        {
        default:
            log.severe(subTagLog("Failure to get Skype link info"));
            analytics.a(new SignInErrorTelemetryEvent(onaccountpartnerlinkresult));
            showError(onaccountpartnerlinkresult);
            return;

        case 1: // '\001'
            signInWithMsa();
            break;
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnPartnerLinkInfoResult onpartnerlinkinforesult)
    {
        if (!skypeInfoChecked)
        {
            handleSkypeLinkInfoResult(onpartnerlinkinforesult);
            skypeInfoChecked = true;
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnSuggestedAccountsResult onsuggestedaccountsresult)
    {
        log.info(subTagLog((new StringBuilder("Listening to OnSuggestedAccountResult ")).append(onsuggestedaccountsresult.getCode()).toString()));
        com.skype.SkyLib.AUTH_RESULT auth_result = onsuggestedaccountsresult.getCode();
        if (auth_result == com.skype.SkyLib.AUTH_RESULT.AUTH_OK)
        {
            getMsaLinkingAccounts(onsuggestedaccountsresult);
            return;
        } else
        {
            analytics.a(new SignInErrorTelemetryEvent(auth_result));
            showError(auth_result);
            return;
        }
    }

    public void onFailure(com.microsoft.onlineid.b.a a1, Bundle bundle)
    {
        log.throwing(com/skype/android/app/signin/AuthenticateWithMsaActivity.getSimpleName(), "onFailure", a1);
        analytics.a(new SignInErrorTelemetryEvent(a1));
        showErrorDialog(a1);
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("extra_cid", cid);
    }

    public void onTicketAcquired(i k, j j1, Bundle bundle)
    {
        log.info(subTagLog((new StringBuilder("onTicketAcquired: ")).append(k.a()).append(" bundle: ").append(dumpBundle(bundle)).toString()));
        switch (bundle.getInt("requested_ticket", -1))
        {
        default:
            analytics.a(new SignInErrorTelemetryEvent(k));
            return;

        case 1: // '\001'
            loginAccessToken = k.c();
            bundle.putInt("requested_ticket", 2);
            j1.a(new g(getLinkingScopeForSDK(), "mbi_ssl"), bundle);
            return;

        case 2: // '\002'
            onSkypeTokenAcquired(k);
            break;
        }
    }

    public void onUINeeded(PendingIntent pendingintent, Bundle bundle)
    {
        try
        {
            log.info(subTagLog("onUINeeded: Starting pending intent."));
            startIntentSenderForResult(pendingintent.getIntentSender(), type.ordinal(), null, 0, 0, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            log.throwing(com/skype/android/app/signin/AuthenticateWithMsaActivity.getSimpleName(), "onUINeeded", pendingintent);
        }
        pendingintent.printStackTrace();
    }

    public void onUserCancel(Bundle bundle)
    {
        finish();
    }


/*
    static ArrayList access$002(AuthenticateWithMsaActivity authenticatewithmsaactivity, ArrayList arraylist)
    {
        authenticatewithmsaactivity.microsoftAccounts = arraylist;
        return arraylist;
    }

*/


/*
    static ArrayList access$102(AuthenticateWithMsaActivity authenticatewithmsaactivity, ArrayList arraylist)
    {
        authenticatewithmsaactivity.suggestedAccounts = arraylist;
        return arraylist;
    }

*/




}
