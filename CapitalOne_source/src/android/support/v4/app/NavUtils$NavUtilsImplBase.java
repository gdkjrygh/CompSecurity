// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            NavUtils

static class 
    implements 
{

    public Intent getParentActivityIntent(Activity activity)
    {
        String s = NavUtils.getParentActivityName(activity);
        if (s == null)
        {
            return null;
        } else
        {
            return (new Intent()).setClassName(activity, s);
        }
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

    ()
    {
    }
}
