// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.skype.android.app.account.UserFeedbackWebActivity;
import com.skype.android.app.account.WebActivity;
import com.skype.android.res.Urls;
import com.skype.android.util.DeviceFeatures;
import java.util.List;

public class NavigationUrl
{

    private Context context;
    private Urls urls;

    public NavigationUrl(Context context1, Urls urls1)
    {
        context = context1;
        urls = urls1;
    }

    private void goToUrl(Activity activity, com.skype.android.res.Urls.Type type, boolean flag)
    {
        if (flag)
        {
            flag = type.a();
            String s = urls.a(type);
            if (flag)
            {
                s = urls.c(type);
            }
            if (flag)
            {
                type = urls.b(type);
            } else
            {
                type = "";
            }
            openUrlInApp(activity, s, flag, type);
            return;
        } else
        {
            openUrlInExternalBrowser(activity, urls.a(type));
            return;
        }
    }

    private boolean hasDefaultHandler(Intent intent)
    {
        return context.getPackageManager().queryIntentActivities(intent, 0x10000).size() > 0;
    }

    private void openUrlInApp(Activity activity, String s, boolean flag, String s1)
    {
        s = getIntentForUrl(activity, s, flag, s1);
        s.putExtra("EXTRA_INITIATED_ACTIVITY", activity.getClass().getSimpleName());
        activity.startActivity(s);
    }

    public Intent getIntentForFeedbackPage(Activity activity, String s, String s1)
    {
        activity = new Intent(activity, com/skype/android/app/account/UserFeedbackWebActivity);
        activity.putExtra("url", urls.a(s, s1));
        activity.putExtra("EXTRA_TITLE", 0x7f0802b4);
        return activity;
    }

    public Intent getIntentForUrl(Activity activity, String s, boolean flag, String s1)
    {
        activity = new Intent(activity, com/skype/android/app/account/WebActivity);
        activity.putExtra("url", s);
        activity.putExtra("use_sso", flag);
        activity.putExtra("GO_PARAM_VALUE", s1);
        return activity;
    }

    public void goToUrl(Activity activity, com.skype.android.res.Urls.Type type)
    {
        boolean flag = true;
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$res$Urls$Type[];

            static 
            {
                $SwitchMap$com$skype$android$res$Urls$Type = new int[com.skype.android.res.Urls.Type.values().length];
                try
                {
                    $SwitchMap$com$skype$android$res$Urls$Type[com.skype.android.res.Urls.Type.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$res$Urls$Type[com.skype.android.res.Urls.Type.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$res$Urls$Type[com.skype.android.res.Urls.Type.g.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$res$Urls$Type[com.skype.android.res.Urls.Type.f.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$res$Urls$Type[com.skype.android.res.Urls.Type.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.res.Urls.Type[type.ordinal()])
        {
        default:
            goToUrl(activity, type, true);
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            break;
        }
        if (DeviceFeatures.c())
        {
            flag = false;
        }
        goToUrl(activity, type, flag);
    }

    public void goToUrl(Activity activity, String s, boolean flag)
    {
        if (flag)
        {
            openUrlInApp(activity, s, false, "");
            return;
        } else
        {
            openUrlInExternalBrowser(activity, s);
            return;
        }
    }

    public void openUrlInExternalBrowser(Activity activity, String s)
    {
        if (s != null && s.startsWith("http"))
        {
            s = new Intent("android.intent.action.VIEW", Uri.parse(s));
            if (hasDefaultHandler(s))
            {
                activity.startActivity(s);
            }
        }
    }
}
