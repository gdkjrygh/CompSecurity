// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;

final class ojx
    implements ook, opv
{

    private final Activity a;

    public ojx(Activity activity, opd opd1)
    {
        a = activity;
        opd1.a(this);
    }

    static boolean a(Activity activity)
    {
        boolean flag = false;
        if (activity.getCallingActivity() != null || activity.getIntent().getBooleanExtra("task_launched_for_result", false))
        {
            flag = true;
        }
        return flag;
    }

    public final void a(Intent intent)
    {
        if (a(a))
        {
            intent.putExtra("task_launched_for_result", true);
        }
    }
}
