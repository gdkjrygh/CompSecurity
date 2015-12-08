// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.app.Navigation;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.PathClippedImageView;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.signin:
//            AccountStatusNotifier, PromptManualSignInTelemetryEvent

public class LandingPageActivity extends SkypeActivity
    implements android.view.View.OnClickListener, AsyncCallback
{

    AccountProvider accountProvider;
    AccountStatusNotifier accountStatusNotifier;
    Analytics analytics;
    AnalyticsPersistentStorage analyticsPersistentStorage;
    AsyncService asyncService;
    PathClippedImageView avatar;
    View content;
    TextView header;
    private String identity;
    Navigation navigation;
    UserPreferences userPrefs;

    public LandingPageActivity()
    {
    }

    public void done(AsyncResult asyncresult)
    {
        if (asyncresult.e() && asyncresult.a() != null)
        {
            avatar.setImageBitmap((Bitmap)asyncresult.a());
        }
    }

    public boolean onAcceptEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        case 2131755962: 
        default:
            return;

        case 2131755960: 
            view = new Intent(this, navigation.getSignInLandingPage());
            view.putExtra("fromUserWithPwd", true);
            startActivity(view);
            analytics.c(AnalyticsEvent.af);
            return;

        case 2131755961: 
        case 2131755963: 
            navigation.home();
            break;
        }
        accountStatusNotifier.sendLoggedIn(accountProvider.get().getSkypenameProp());
        analytics.c(AnalyticsEvent.ae);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        identity = accountProvider.get().getSkypenameProp();
        analytics.a(new PromptManualSignInTelemetryEvent(com/skype/android/app/signin/LandingPageActivity.getSimpleName(), analyticsPersistentStorage.c()));
        bundle = AnimationUtils.loadAnimation(this, 0x10a0000);
        content.startAnimation(bundle);
        ViewUtil.a(this, new View[] {
            findViewById(0x7f1003bb), findViewById(0x7f1003b8), avatar
        });
    }

    public void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        com.skype.Account.STATUS status;
        onpropertychange = (Account)onpropertychange.getSender();
        status = onpropertychange.getStatusProp();
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$Account$STATUS[];

            static 
            {
                $SwitchMap$com$skype$Account$STATUS = new int[com.skype.Account.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_IN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_IN_PARTIALLY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Account$STATUS[com.skype.Account.STATUS.LOGGED_OUT_AND_PWD_SAVED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.skype.Account.STATUS[status.ordinal()];
        JVM INSTR tableswitch 1 4: default 52
    //                   1 53
    //                   2 53
    //                   3 65
    //                   4 65;
           goto _L1 _L2 _L2 _L3 _L3
_L1:
        return;
_L2:
        if (!isFinishing())
        {
            finish();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (identity != null && identity.equals(onpropertychange.getSkypenameProp()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!isFinishing())
        {
            finish();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        onpropertychange = onpropertychange.getLogoutReasonProp();
        if (onpropertychange != com.skype.Account.LOGOUTREASON.LOGOUT_CALLED)
        {
            AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
            analyticsparametercontainer.a(AnalyticsParameter.q, onpropertychange.toString());
            analytics.a(AnalyticsEvent.ah, analyticsparametercontainer);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void onResume()
    {
        super.onResume();
        final Account account = accountProvider.get();
        String s = userPrefs.getLoginAsDisplayName(account);
        header.setText(getString(0x7f080256, new Object[] {
            s
        }));
        asyncService.a(new Callable() {

            final LandingPageActivity this$0;
            final Account val$account;

            public final Bitmap call()
                throws Exception
            {
                File file = new File(getApplicationContext().getFilesDir(), account.getSkypenameProp().concat(".jpg"));
                if (file.exists())
                {
                    return BitmapFactory.decodeFile(file.getAbsolutePath());
                } else
                {
                    return null;
                }
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = LandingPageActivity.this;
                account = account1;
                super();
            }
        }, this);
    }
}
