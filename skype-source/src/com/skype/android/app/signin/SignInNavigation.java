// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.skype.android.SkypeConstants;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.config.ecs.EcsConfiguration;

// Referenced classes of package com.skype.android.app.signin:
//            SignInConstants, AuthenticateWithMsaActivity, SignInLiveIdActivity, SignInActivity

public class SignInNavigation
    implements SkypeConstants, SignInConstants
{

    private Analytics analytics;
    private AnalyticsPersistentStorage analyticsPersistentStorage;
    private EcsConfiguration configuration;
    private Context context;

    SignInNavigation(Activity activity, EcsConfiguration ecsconfiguration, Analytics analytics1, AnalyticsPersistentStorage analyticspersistentstorage)
    {
        context = activity;
        configuration = ecsconfiguration;
        analytics = analytics1;
        analyticsPersistentStorage = analyticspersistentstorage;
    }

    protected String getFlowType()
    {
        SignInConstants.FlowType flowtype;
        if (configuration.isAccountDisambiguationSupported())
        {
            flowtype = SignInConstants.FlowType.UNIFIED;
        } else
        {
            flowtype = SignInConstants.FlowType.SIMPLIFIED;
        }
        return String.valueOf(flowtype);
    }

    protected void reportTelemetryEvent(LogEvent logevent)
    {
        logevent = new SkypeTelemetryEvent(logevent);
        logevent.put(LogAttributeName.v, getFlowType());
        analytics.a(logevent);
    }

    public void toMsaLogin()
    {
        toMsaLogin(null);
    }

    public void toMsaLogin(String s)
    {
        Object obj;
        if (configuration.isMsaSdkUsedForLogin())
        {
            obj = com/skype/android/app/signin/AuthenticateWithMsaActivity;
            reportTelemetryEvent(LogEvent.q);
        } else
        {
            obj = com/skype/android/app/signin/SignInLiveIdActivity;
            reportTelemetryEvent(LogEvent.r);
        }
        obj = new Intent(context, ((Class) (obj)));
        ((Intent) (obj)).addFlags(0x4000000);
        ((Intent) (obj)).addFlags(32768);
        if (s != null)
        {
            ((Intent) (obj)).putExtra("username", s);
        }
        ((Intent) (obj)).putExtra("msasignin", true);
        context.startActivity(((Intent) (obj)));
    }

    public void toSkypeLogin()
    {
        toSkypeLogin(null);
    }

    public void toSkypeLogin(String s)
    {
        Intent intent = new Intent(context, com/skype/android/app/signin/SignInActivity);
        if (s != null)
        {
            intent.putExtra("username", s);
        }
        reportTelemetryEvent(LogEvent.y);
        context.startActivity(intent);
        if (context instanceof Activity)
        {
            ((Activity)context).overridePendingTransition(0, 0);
        }
    }
}
