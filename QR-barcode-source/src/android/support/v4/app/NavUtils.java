// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.content.IntentCompat;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//            NavUtilsJB

public class NavUtils
{
    static interface NavUtilsImpl
    {

        public abstract Intent getParentActivityIntent(Activity activity);

        public abstract String getParentActivityName(Context context, ActivityInfo activityinfo);

        public abstract void navigateUpTo(Activity activity, Intent intent);

        public abstract boolean shouldUpRecreateTask(Activity activity, Intent intent);
    }

    static class NavUtilsImplBase
        implements NavUtilsImpl
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

        NavUtilsImplBase()
        {
        }
    }

    static class NavUtilsImplJB extends NavUtilsImplBase
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

        NavUtilsImplJB()
        {
        }
    }


    private static final NavUtilsImpl IMPL;
    public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
    private static final String TAG = "NavUtils";

    private NavUtils()
    {
    }

    public static Intent getParentActivityIntent(Activity activity)
    {
        return IMPL.getParentActivityIntent(activity);
    }

    public static Intent getParentActivityIntent(Context context, ComponentName componentname)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
        String s = getParentActivityName(context, componentname);
        if (s == null)
        {
            return null;
        }
        componentname = new ComponentName(componentname.getPackageName(), s);
        if (getParentActivityName(context, componentname) == null)
        {
            return IntentCompat.makeMainActivity(componentname);
        } else
        {
            return (new Intent()).setComponent(componentname);
        }
    }

    public static Intent getParentActivityIntent(Context context, Class class1)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
        class1 = getParentActivityName(context, new ComponentName(context, class1));
        if (class1 == null)
        {
            return null;
        }
        class1 = new ComponentName(context, class1);
        if (getParentActivityName(context, class1) == null)
        {
            return IntentCompat.makeMainActivity(class1);
        } else
        {
            return (new Intent()).setComponent(class1);
        }
    }

    public static String getParentActivityName(Activity activity)
    {
        try
        {
            activity = getParentActivityName(((Context) (activity)), activity.getComponentName());
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new IllegalArgumentException(activity);
        }
        return activity;
    }

    public static String getParentActivityName(Context context, ComponentName componentname)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
        componentname = context.getPackageManager().getActivityInfo(componentname, 128);
        return IMPL.getParentActivityName(context, componentname);
    }

    public static void navigateUpFromSameTask(Activity activity)
    {
        Intent intent = getParentActivityIntent(activity);
        if (intent == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Activity ").append(activity.getClass().getSimpleName()).append(" does not have a parent activity name specified.").append(" (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> ").append(" element in your manifest?)").toString());
        } else
        {
            navigateUpTo(activity, intent);
            return;
        }
    }

    public static void navigateUpTo(Activity activity, Intent intent)
    {
        IMPL.navigateUpTo(activity, intent);
    }

    public static boolean shouldUpRecreateTask(Activity activity, Intent intent)
    {
        return IMPL.shouldUpRecreateTask(activity, intent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new NavUtilsImplJB();
        } else
        {
            IMPL = new NavUtilsImplBase();
        }
    }
}
