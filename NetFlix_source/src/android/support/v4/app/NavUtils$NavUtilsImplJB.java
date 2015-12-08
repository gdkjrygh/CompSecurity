// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

// Referenced classes of package android.support.v4.app:
//            NavUtils, NavUtilsJB

static class e extends e
{

    public Intent getParentActivityIntent(Activity activity)
    {
        Intent intent1 = NavUtilsJB.getParentActivityIntent(activity);
        Intent intent = intent1;
        if (intent1 == null)
        {
            intent = superGetParentActivityIntent(activity);
        }
        return intent;
    }

    public String getParentActivityName(Context context, ActivityInfo activityinfo)
    {
        String s1 = NavUtilsJB.getParentActivityName(activityinfo);
        String s = s1;
        if (s1 == null)
        {
            s = super.getParentActivityName(context, activityinfo);
        }
        return s;
    }

    public void navigateUpTo(Activity activity, Intent intent)
    {
        NavUtilsJB.navigateUpTo(activity, intent);
    }

    public boolean shouldUpRecreateTask(Activity activity, Intent intent)
    {
        return NavUtilsJB.shouldUpRecreateTask(activity, intent);
    }

    Intent superGetParentActivityIntent(Activity activity)
    {
        return super.getParentActivityIntent(activity);
    }

    e()
    {
    }
}
