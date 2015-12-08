// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.microsoft.onlineid.a;
import com.microsoft.onlineid.b;
import com.microsoft.onlineid.j;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.Navigation;
import com.skype.android.app.calling.CallQualityFeedbackManager;
import com.skype.android.app.settings.SnoozeNotificationHelper;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.EmoticonContent;
import com.skype.android.mediacontent.EmoticonSize;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.push.SkypePushListener;
import com.skype.android.util.AccountUtil;
import com.skype.android.util.PerformanceLog;

// Referenced classes of package com.skype.android.app.signin:
//            AccountStatusNotifier

public class SignOutActivity extends SkypeActivity
    implements android.graphics.drawable.Drawable.Callback
{

    private static final String EXTRA_CID_TO_LOGOUT = "extra_cid_to_logout";
    private static final String EXTRA_HANDLED_LOGOUT = "extra_handled_logout";
    Account account;
    private a accountManager;
    AccountStatusNotifier accountStatusNotifier;
    private String cidToLogout;
    CallQualityFeedbackManager cqfManager;
    EcsConfiguration ecsConfiguration;
    MediaContentRoster emoticons;
    private boolean handledLogout;
    Navigation navigation;
    SkypePushListener pushListener;
    ImageView signOutImage;
    UserPreferences userPreferences;

    public SignOutActivity()
    {
        cidToLogout = null;
    }

    private void checkAccountStatus()
    {
label0:
        {
            com.skype.Account.STATUS status = account.getStatusProp();
            if (status == com.skype.Account.STATUS.LOGGED_OUT || status == com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED)
            {
                PerformanceLog.c.c();
                if (!isFinishing() && !handledLogout)
                {
                    handledLogout = true;
                    if (!TextUtils.isEmpty(cidToLogout))
                    {
                        break label0;
                    }
                    goToLanding();
                }
            }
            return;
        }
        logOutOfMsaSdk();
    }

    private void goToLanding()
    {
        if (!isFinishing())
        {
            navigation.toLandingPage(account);
            finish();
        }
    }

    private void logOutOfMsaSdk()
    {
        if (!TextUtils.isEmpty(cidToLogout))
        {
            accountManager = new a(getApplicationContext());
            accountManager.a(new b() {

                final SignOutActivity this$0;

                public final void onAccountAcquired(j j, Bundle bundle)
                {
                    accountManager.a(j, bundle);
                }

                public final void onAccountSignedOut(String s, boolean flag, Bundle bundle)
                {
                    goToLanding();
                }

                public final void onFailure(com.microsoft.onlineid.b.a a1, Bundle bundle)
                {
                    goToLanding();
                }

                public final void onUINeeded(PendingIntent pendingintent, Bundle bundle)
                {
                    try
                    {
                        startIntentSenderForResult(pendingintent.getIntentSender(), 1, null, 0, 0, 0);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (PendingIntent pendingintent)
                    {
                        pendingintent.printStackTrace();
                    }
                    goToLanding();
                }

                public final void onUserCancel(Bundle bundle)
                {
                    goToLanding();
                }

            
            {
                this$0 = SignOutActivity.this;
                super();
            }
            });
            accountManager.a(cidToLogout, new Bundle());
        }
    }

    public void invalidateDrawable(Drawable drawable)
    {
        drawable.invalidateSelf();
    }

    public boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        accountManager.a(j, intent);
    }

    public void onBackPressed()
    {
    }

    public void onCreate(final Bundle drawable)
    {
        super.onCreate(drawable);
        getComponent().inject(this);
        boolean flag;
        if (drawable != null && drawable.getBoolean("extra_handled_logout"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        handledLogout = flag;
        if (!userPreferences.saveUserPwdOnLogout() && ecsConfiguration.isMsaSdkUsedForLogin() && AccountUtil.a(account))
        {
            cidToLogout = AccountUtil.d(account);
        }
        drawable = (EmoticonContent)emoticons.a("hi", com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON);
        if (drawable != null)
        {
            drawable = drawable.c(EmoticonSize.c);
            drawable.setCallback(this);
            runOnUiThread(new Runnable() {

                final SignOutActivity this$0;
                final Drawable val$drawable;

                public final void run()
                {
                    signOutImage.setImageDrawable(drawable);
                    if (drawable instanceof Animatable)
                    {
                        Animatable animatable = (Animatable)drawable;
                        animatable.stop();
                        animatable.start();
                    }
                }

            
            {
                this$0 = SignOutActivity.this;
                drawable = drawable1;
                super();
            }
            });
        }
        (new SnoozeNotificationHelper(getApplicationContext())).cancelAlarm();
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnObjectPropertyChangeWithValue onobjectpropertychangewithvalue)
    {
        if (onobjectpropertychangewithvalue.getPropKey() == PROPKEY.ACCOUNT_STATUS)
        {
            checkAccountStatus();
        }
    }

    public void onResume()
    {
        super.onResume();
        static final class _cls3
        {

            static final int $SwitchMap$com$skype$Account$STATUS[];

            static 
            {
                $SwitchMap$com$skype$Account$STATUS = new int[com.skype.Account.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGING_OUT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.skype.Account.STATUS[account.getStatusProp().ordinal()])
        {
        default:
            PerformanceLog.c.b();
            cqfManager.uploadAllRatings();
            accountStatusNotifier.sendLoggedOut();
            pushListener.unregisterPushDuringLogout();
            boolean flag;
            if (!userPreferences.saveUserPwdOnLogout())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            account.logout(flag);
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            checkAccountStatus();
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_handled_logout", handledLogout);
        bundle.putString("extra_cid_to_logout", cidToLogout);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        drawable.scheduleSelf(runnable, l);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        drawable.unscheduleSelf(runnable);
    }


}
