// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;

class as
    implements ar
{

    as()
    {
    }

    public Intent a(Activity activity)
    {
        String s = aq.b(activity);
        if (s == null)
        {
            return null;
        }
        ComponentName componentname = new ComponentName(activity, s);
        try
        {
            if (aq.b(activity, componentname) == null)
            {
                return cv.a(componentname);
            }
            activity = (new Intent()).setComponent(componentname);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.e("NavUtils", (new StringBuilder("getParentActivityIntent: bad parentActivityName '")).append(s).append("' in manifest").toString());
            return null;
        }
        return activity;
    }

    public String a(Context context, ActivityInfo activityinfo)
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

    public boolean a(Activity activity, Intent intent)
    {
        activity = activity.getIntent().getAction();
        return activity != null && !activity.equals("android.intent.action.MAIN");
    }

    public void b(Activity activity, Intent intent)
    {
        intent.addFlags(0x4000000);
        activity.startActivity(intent);
        activity.finish();
    }
}
