// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.os.Bundle;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsPersistentStorage;

// Referenced classes of package com.skype.android.app.signin:
//            PromptManualSignInTelemetryEvent

public abstract class SignInLandingPageActivity extends SkypeActivity
{

    public static final String EXTRA_FROM_USER_WITH_PWD_FLOW = "fromUserWithPwd";
    Analytics analytics;
    AnalyticsPersistentStorage analyticsPersistentStorage;

    public SignInLandingPageActivity()
    {
    }

    private boolean isFromUserWithPwdFlow()
    {
        return getIntent().hasExtra("fromUserWithPwd");
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        if (isFromUserWithPwdFlow())
        {
            analytics.c(AnalyticsEvent.ag);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    protected void reportPromptManualSignInTelemetryEvent(String s)
    {
        if (!isFromUserWithPwdFlow())
        {
            analytics.a(new PromptManualSignInTelemetryEvent(s, analyticsPersistentStorage.c()));
        }
    }
}
