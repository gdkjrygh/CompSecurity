// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.localytics.android:
//            SessionHandler, Constants, DatapointHelper

class val.intent
    implements Runnable
{

    final SessionHandler this$0;
    final Intent val$intent;

    public void run()
    {
        if (!SessionHandler.access$000(SessionHandler.this)) goto _L2; else goto _L1
_L1:
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Got push notification while push is disabled.");
        }
_L4:
        return;
_L2:
        Object obj;
        obj = null;
        if (val$intent.getExtras() != null)
        {
            obj = val$intent.getExtras().getString("ll");
        }
        if (obj == null)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "Ignoring message that aren't from Localytics.");
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        int i = (new JSONObject(((String) (obj)))).getInt("ca");
        Object obj1;
        Object obj3;
        String s;
        int j;
        s = val$intent.getExtras().getString("message");
        obj1 = "";
        j = DatapointHelper.getLocalyticsNotificationIcon(mContext);
        obj3 = null;
        obj = obj1;
        android.content.pm.ApplicationInfo applicationinfo = mContext.getPackageManager().getApplicationInfo(mContext.getPackageName(), 0);
        obj = obj1;
        obj1 = mContext.getPackageManager().getApplicationLabel(applicationinfo);
        obj = obj1;
        Object obj2;
        try
        {
            obj2 = mContext.getPackageManager().getLaunchIntentForPackage(mContext.getPackageName());
        }
        catch (android.content.pm.eNotFoundException enotfoundexception)
        {
            enotfoundexception = ((android.content.pm.eNotFoundException) (obj));
            obj2 = obj3;
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "Failed to get application name, icon, or launch intent");
                enotfoundexception = ((android.content.pm.eNotFoundException) (obj));
                obj2 = obj3;
            }
        }
        obj = new Notification(j, s, System.currentTimeMillis());
        if (obj2 != null)
        {
            ((Intent) (obj2)).putExtras(val$intent);
            obj2 = PendingIntent.getActivity(mContext, 0, ((Intent) (obj2)), 0x8000000);
            ((Notification) (obj)).setLatestEventInfo(mContext, ((CharSequence) (obj1)), s, ((PendingIntent) (obj2)));
        }
        obj.flags = ((Notification) (obj)).flags | 0x10;
        ((NotificationManager)mContext.getSystemService("notification")).notify(i, ((Notification) (obj)));
        return;
        obj;
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Failed to get campaign id from payload, ignoring message");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    FoundException()
    {
        this$0 = final_sessionhandler;
        val$intent = Intent.this;
        super();
    }
}
