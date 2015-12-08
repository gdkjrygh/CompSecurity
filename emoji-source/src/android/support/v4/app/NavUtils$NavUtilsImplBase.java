// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.content.IntentCompat;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//            NavUtils

static class eption
    implements eption
{

    public Intent getParentActivityIntent(Activity activity)
    {
        String s;
        ComponentName componentname;
        s = NavUtils.getParentActivityName(activity);
        if (s == null)
        {
            return null;
        }
        componentname = new ComponentName(activity, s);
label0:
        {
            if (NavUtils.getParentActivityName(activity, componentname) == null)
            {
                activity = IntentCompat.makeMainActivity(componentname);
                break label0;
            }
            try
            {
                activity = (new Intent()).setComponent(componentname);
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                Log.e("NavUtils", (new StringBuilder()).append("getParentActivityIntent: bad parentActivityName '").append(s).append("' in manifest").toString());
                return null;
            }
        }
        return activity;
    }

    public String getParentActivityName(Context context, ActivityInfo activityinfo)
    {
        if (activityinfo.metaData == null)
        {
            activityinfo = null;
        } else
        {
            String s = activityinfo.metaData.getString("android.support.PARENT_ACTIVITY");
            if (s == null)
            {
                return null;
            }
            activityinfo = s;
            if (s.charAt(0) == '.')
            {
                return (new StringBuilder()).append(context.getPackageName()).append(s).toString();
            }
        }
        return activityinfo;
    }

    public void navigateUpTo(Activity activity, Intent intent)
    {
        intent.addFlags(0x4000000);
        activity.startActivity(intent);
        activity.finish();
    }

    public boolean shouldUpRecreateTask(Activity activity, Intent intent)
    {
        activity = activity.getIntent().getAction();
        return activity != null && !activity.equals("android.intent.action.MAIN");
    }

    eption()
    {
    }
}
