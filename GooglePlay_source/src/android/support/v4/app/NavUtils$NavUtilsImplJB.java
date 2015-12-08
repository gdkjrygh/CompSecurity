// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

// Referenced classes of package android.support.v4.app:
//            NavUtils

static final class e extends e
{

    public final Intent getParentActivityIntent(Activity activity)
    {
        Intent intent1 = activity.getParentActivityIntent();
        Intent intent = intent1;
        if (intent1 == null)
        {
            intent = super.getParentActivityIntent(activity);
        }
        return intent;
    }

    public final String getParentActivityName(Context context, ActivityInfo activityinfo)
    {
        String s1 = activityinfo.parentActivityName;
        String s = s1;
        if (s1 == null)
        {
            s = super.getParentActivityName(context, activityinfo);
        }
        return s;
    }

    public final void navigateUpTo(Activity activity, Intent intent)
    {
        activity.navigateUpTo(intent);
    }

    public final boolean shouldUpRecreateTask(Activity activity, Intent intent)
    {
        return activity.shouldUpRecreateTask(intent);
    }

    e()
    {
    }
}
