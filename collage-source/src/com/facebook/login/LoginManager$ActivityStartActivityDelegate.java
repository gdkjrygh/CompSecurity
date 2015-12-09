// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import com.facebook.internal.Validate;

// Referenced classes of package com.facebook.login:
//            StartActivityDelegate, LoginManager

private static class activity
    implements StartActivityDelegate
{

    private final Activity activity;

    public Activity getActivityContext()
    {
        return activity;
    }

    public void startActivityForResult(Intent intent, int i)
    {
        activity.startActivityForResult(intent, i);
    }

    (Activity activity1)
    {
        Validate.notNull(activity1, "activity");
        activity = activity1;
    }
}
