// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.kn;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.gcm:
//            Task

public final class GcmNetworkManager
{

    public static final String ACTION_SCHEDULE = "com.google.android.gms.gcm.ACTION_SCHEDULE";
    public static final String CANCEL_ALL = "CANCEL_ALL";
    public static final String CANCEL_TASK = "CANCEL_TASK";
    public static final String INTENT_PARAM_ACTION = "scheduler_action";
    public static final String INTENT_PARAM_APP = "app";
    public static final String INTENT_PARAM_CALLBACK = "callback";
    public static final String INTENT_PARAM_CMP = "component";
    public static final String INTENT_PARAM_PERIOD_FLEX = "period_flex";
    public static final String INTENT_PARAM_PERIOD_LENGTH = "period";
    public static final String INTENT_PARAM_TAG = "tag";
    public static final String INTENT_PARAM_TASK = "task";
    public static final String INTENT_PARAM_TASK_WRAPPER = "task_wrapper";
    public static final String INTENT_PARAM_UPDATE_CURRENT = "update_current";
    public static final String INTENT_PARAM_WINDOW_END = "window_end";
    public static final String INTENT_PARAM_WINDOW_START = "window_start";
    public static final int RESULT_FAILURE = 2;
    public static final int RESULT_RESCHEDULE = 1;
    public static final int RESULT_SUCCESS = 0;
    public static final String SCHEDULE = "ACTION_SCHEDULE";
    public static final String SCHEDULE_RECURRING = "SCHEDULE_RECURRING";
    public static final String SCHEDULE_TASK = "SCHEDULE_TASK";
    private static GcmNetworkManager arn;
    private Context mContext;
    private final PendingIntent mPendingIntent;

    private GcmNetworkManager(Context context)
    {
        mContext = context;
        mPendingIntent = PendingIntent.getBroadcast(mContext, 0, new Intent(), 0);
    }

    private static void cs(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else
        {
            return;
        }
    }

    private void ct(String s)
    {
        boolean flag;
        boolean flag1 = true;
        kn.b(s, "GcmTaskService must not be null.");
        Object obj = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY");
        ((Intent) (obj)).setPackage(mContext.getPackageName());
        obj = mContext.getPackageManager().queryIntentServices(((Intent) (obj)), 0);
        if (obj != null && ((List) (obj)).size() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
        obj = ((List) (obj)).iterator();
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        if (!((ResolveInfo)((Iterator) (obj)).next()).serviceInfo.name.equals(s))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        flag = flag1;
_L4:
        kn.b(flag, (new StringBuilder("The GcmTaskService class you provided ")).append(s).append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.").toString());
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static GcmNetworkManager getInstance(Context context)
    {
        if (arn == null)
        {
            arn = new GcmNetworkManager(context.getApplicationContext());
        }
        return arn;
    }

    private Intent oJ()
    {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        try
        {
            GooglePlayServicesUtil.verifyPackageIsGoogleSigned(mContext.getPackageManager(), "com.google.android.gms");
        }
        catch (SecurityException securityexception)
        {
            throw new SecurityException("The Google Play Services installed on your device is not from Google. This could be a malicious app trying to spoof you.");
        }
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", mPendingIntent);
        return intent;
    }

    public final void cancelAllTasks(Class class1)
    {
        ct(class1.getName());
        Intent intent = oJ();
        intent.putExtra("scheduler_action", "CANCEL_ALL");
        intent.putExtra("component", new ComponentName(mContext, class1));
        mContext.sendBroadcast(intent);
    }

    public final void cancelTask(String s, Class class1)
    {
        cs(s);
        ct(class1.getName());
        Intent intent = oJ();
        intent.putExtra("scheduler_action", "CANCEL_TASK");
        intent.putExtra("tag", s);
        intent.putExtra("component", new ComponentName(mContext, class1));
        mContext.sendBroadcast(intent);
    }

    public final void schedule(Task task)
    {
        ct(task.getServiceName());
        Intent intent = oJ();
        intent.putExtra("scheduler_action", "SCHEDULE_TASK");
        Bundle bundle = new Bundle();
        bundle.putParcelable("task", task);
        intent.putExtra("task_wrapper", bundle);
        mContext.sendBroadcast(intent);
    }
}
