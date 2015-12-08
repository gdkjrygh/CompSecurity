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

static interface 
{

    public abstract Intent getParentActivityIntent(Activity activity);

    public abstract String getParentActivityName(Context context, ActivityInfo activityinfo);

    public abstract void navigateUpTo(Activity activity, Intent intent);

    public abstract boolean shouldUpRecreateTask(Activity activity, Intent intent);
}
