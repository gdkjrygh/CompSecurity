// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import com.mixpanel.android.surveys.SurveyActivity;
import java.util.List;

final class f
{

    public static String a = "MixpanelAPI.ConfigurationChecker";

    public static boolean a(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            return false;
        }
        Intent intent = new Intent(context, com/mixpanel/android/surveys/SurveyActivity);
        intent.addFlags(0x10000000);
        intent.addFlags(0x20000);
        if (context.getPackageManager().queryIntentActivities(intent, 0).size() == 0)
        {
            Log.w(a, (new StringBuilder()).append(com/mixpanel/android/surveys/SurveyActivity.getName()).append(" is not registered as an activity in your application, so surveys can't be shown.").toString());
            return false;
        } else
        {
            return true;
        }
    }

}
