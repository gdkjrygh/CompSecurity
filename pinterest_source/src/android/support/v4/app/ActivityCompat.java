// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.ContextCompat;

// Referenced classes of package android.support.v4.app:
//            ActivityCompatJB, ActivityCompat21, ActivityCompatHoneycomb, ActivityCompatApi23, 
//            ActivityCompat22, SharedElementCallback

public class ActivityCompat extends ContextCompat
{

    public ActivityCompat()
    {
    }

    private static ActivityCompat21.SharedElementCallback21 createCallback(SharedElementCallback sharedelementcallback)
    {
        SharedElementCallback21Impl sharedelementcallback21impl = null;
        if (sharedelementcallback != null)
        {
            sharedelementcallback21impl = new SharedElementCallback21Impl(sharedelementcallback);
        }
        return sharedelementcallback21impl;
    }

    public static void finishAffinity(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            ActivityCompatJB.finishAffinity(activity);
            return;
        } else
        {
            activity.finish();
            return;
        }
    }

    public static void finishAfterTransition(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ActivityCompat21.finishAfterTransition(activity);
            return;
        } else
        {
            activity.finish();
            return;
        }
    }

    public static boolean invalidateOptionsMenu(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ActivityCompatHoneycomb.invalidateOptionsMenu(activity);
            return true;
        } else
        {
            return false;
        }
    }

    public static void postponeEnterTransition(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ActivityCompat21.postponeEnterTransition(activity);
        }
    }

    public static void requestPermissions(Activity activity, String as[], int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            ActivityCompatApi23.requestPermissions(activity, as, i);
        } else
        if (activity instanceof OnRequestPermissionsResultCallback)
        {
            (new Handler(Looper.getMainLooper())).post(new _cls1(as, activity, i));
            return;
        }
    }

    public static void setEnterSharedElementCallback(Activity activity, SharedElementCallback sharedelementcallback)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ActivityCompat21.setEnterSharedElementCallback(activity, createCallback(sharedelementcallback));
        }
    }

    public static void setExitSharedElementCallback(Activity activity, SharedElementCallback sharedelementcallback)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ActivityCompat21.setExitSharedElementCallback(activity, createCallback(sharedelementcallback));
        }
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            return ActivityCompatApi23.shouldShowRequestPermissionRationale(activity, s);
        } else
        {
            return false;
        }
    }

    public static void startActivity(Activity activity, Intent intent, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            ActivityCompatJB.startActivity(activity, intent, bundle);
            return;
        } else
        {
            activity.startActivity(intent);
            return;
        }
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            ActivityCompatJB.startActivityForResult(activity, intent, i, bundle);
            return;
        } else
        {
            activity.startActivityForResult(intent, i);
            return;
        }
    }

    public static void startPostponedEnterTransition(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ActivityCompat21.startPostponedEnterTransition(activity);
        }
    }

    public Uri getReferrer(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            activity = ActivityCompat22.getReferrer(activity);
        } else
        {
            Intent intent = activity.getIntent();
            Uri uri = (Uri)intent.getParcelableExtra("android.intent.extra.REFERRER");
            activity = uri;
            if (uri == null)
            {
                activity = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                if (activity != null)
                {
                    return Uri.parse(activity);
                } else
                {
                    return null;
                }
            }
        }
        return activity;
    }

    /* member class not found */
    class SharedElementCallback21Impl {}


    private class OnRequestPermissionsResultCallback
    {

        public abstract void onRequestPermissionsResult(int i, String as[], int ai[]);
    }


    /* member class not found */
    class _cls1 {}

}
