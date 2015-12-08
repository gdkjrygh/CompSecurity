// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.gcm:
//            Task, GoogleCloudMessaging

public final class GcmNetworkManager
{

    private static GcmNetworkManager sSingletonInstance;
    private Context mContext;
    private final PendingIntent mPendingIntent;

    private GcmNetworkManager(Context context)
    {
        mContext = context;
        mPendingIntent = PendingIntent.getBroadcast(mContext, 0, new Intent(), 0);
    }

    public static GcmNetworkManager getInstance(Context context)
    {
        if (sSingletonInstance == null)
        {
            sSingletonInstance = new GcmNetworkManager(context.getApplicationContext());
        }
        return sSingletonInstance;
    }

    public final void schedule(Task task)
    {
        boolean flag;
        boolean flag1 = true;
        String s = task.mGcmTaskService;
        Preconditions.checkNotNull(s, "GcmTaskService must not be null.");
        Object obj = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY");
        ((Intent) (obj)).setPackage(mContext.getPackageName());
        obj = mContext.getPackageManager().queryIntentServices(((Intent) (obj)), 0);
        int i;
        if (obj != null && ((List) (obj)).size() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
        obj = ((List) (obj)).iterator();
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        if (!((ResolveInfo)((Iterator) (obj)).next()).serviceInfo.name.equals(s))
        {
            break MISSING_BLOCK_LABEL_80;
        }
        flag = flag1;
_L4:
        Preconditions.checkArgument(flag, (new StringBuilder("The GcmTaskService class you provided ")).append(s).append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.").toString());
        i = GoogleCloudMessaging.getGcmVersion(mContext);
        Intent intent;
        if (i < GoogleCloudMessaging.GCM_LONGHORN)
        {
            Log.e("GcmNetworkManager", (new StringBuilder("Google Play Services is not available, dropping GcmNetworkManager request. code=")).append(i).toString());
            intent = null;
        } else
        {
            intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
            intent.setPackage(GoogleCloudMessaging.getGcmPackage(mContext));
            intent.putExtra("app", mPendingIntent);
        }
        if (intent == null)
        {
            return;
        } else
        {
            Bundle bundle = intent.getExtras();
            bundle.putString("scheduler_action", "SCHEDULE_TASK");
            task.toBundle(bundle);
            intent.putExtras(bundle);
            mContext.sendBroadcast(intent);
            return;
        }
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
