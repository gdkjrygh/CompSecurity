// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.netflix.mediaclient.util.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class UserAgentBroadcastIntents
{

    public static final String EXTRA_USER_PROFILE_SELECTION_RESULT_INT = "com.netflix.mediaclient.intent.action.EXTRA_USER_PROFILE_SELECTION_RESULT_INT";
    public static final String EXTRA_USER_PROFILE_SELECTION_RESULT_STRING = "com.netflix.mediaclient.intent.action.EXTRA_USER_PROFILE_SELECTION_RESULT_STRING";
    public static final String NOTIFY_USER_ACCOUNT_ACTIVE = "com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE";
    public static final String NOTIFY_USER_ACCOUNT_DEACTIVE = "com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE";
    public static final String NOTIFY_USER_PROFILE_ACTIVE = "com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE";
    public static final String NOTIFY_USER_PROFILE_DEACTIVE = "com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE";
    public static final String NOTIFY_USER_PROFILE_READY_TO_SELECT = "com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_READY_TO_SELECT";
    public static final String NOTIFY_USER_PROFILE_SELECTION_RESULT = "com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_SELECTION_RESULT";
    private static final Set notifSet = new HashSet() {

            
            {
                add("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE");
                add("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE");
                add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE");
                add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE");
                add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_READY_TO_SELECT");
                add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_SELECTION_RESULT");
            }
    };

    public UserAgentBroadcastIntents()
    {
    }

    public static IntentFilter getNotificationIntentFilter()
    {
        IntentFilter intentfilter = new IntentFilter();
        for (Iterator iterator = notifSet.iterator(); iterator.hasNext(); intentfilter.addAction((String)iterator.next())) { }
        return intentfilter;
    }

    static void signalProfileActive(Context context)
    {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE"));
    }

    static void signalProfileDeactivated(Context context)
    {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE"));
    }

    static void signalProfileReady2Select(Context context)
    {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_READY_TO_SELECT"));
    }

    static void signalProfileSelectionResult(Context context, int i, String s)
    {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_SELECTION_RESULT");
        intent.putExtra("com.netflix.mediaclient.intent.action.EXTRA_USER_PROFILE_SELECTION_RESULT_INT", i);
        if (StringUtils.isNotEmpty(s))
        {
            intent.putExtra("com.netflix.mediaclient.intent.action.EXTRA_USER_PROFILE_SELECTION_RESULT_STRING", s);
        }
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    static void signalUserAccountActive(Context context)
    {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE"));
    }

    static void signalUserAccountDeactivated(Context context)
    {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE"));
    }

}
