// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.appboy.Appboy;
import com.appboy.AppboyImageUtils;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import com.appboy.support.IntentUtils;
import com.appboy.support.PackageUtils;
import com.appboy.ui.support.StringUtils;

// Referenced classes of package com.appboy.push:
//            AppboyNotificationUtils

public class AppboyNotificationActionUtils
{

    public static final String DEFAULT_LOCAL_STORAGE_FOLDER = "Shared Photos";
    public static final String IMAGE_MIME_TYPE = "image/*";
    private static final String TAG;
    public static final String TEXT_MIME_TYPE = "text/plain";

    public AppboyNotificationActionUtils()
    {
    }

    private static void addNotificationAction(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle, int i)
    {
        Bundle bundle1 = new Bundle(bundle);
        String s = getActionFieldAtIndex(i, bundle, "ab_a*_a");
        bundle1.putInt("appboy_action_index", i);
        bundle1.putString("appboy_action_type", s);
        bundle1.putString("appboy_action_id", getActionFieldAtIndex(i, bundle, "ab_a*_id"));
        bundle1.putString("appboy_action_uri", getActionFieldAtIndex(i, bundle, "ab_a*_uri"));
        bundle1.putBoolean("appboy_is_custom_action", isCustomActionType(s));
        s = getActionFieldAtIndex(i, bundle, "ab_a*_ic");
        bundle1.putString("appboy_action_icon", getActionFieldAtIndex(i, bundle, "ab_a*_ic"));
        Object obj = (new Intent("com.appboy.action.APPBOY_ACTION_CLICKED")).setClass(context, AppboyNotificationUtils.getNotificationReceiverClass());
        ((Intent) (obj)).putExtras(bundle1);
        bundle = getActionFieldAtIndex(i, bundle, "ab_a*_t");
        obj = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), ((Intent) (obj)), 0x8000000);
        context = new android.support.v4.app.NotificationCompat.Action.Builder(getIconDrawableResourceId(context, s), bundle, ((PendingIntent) (obj)));
        context.addExtras(new Bundle(bundle1));
        builder.addAction(context.build());
    }

    public static void addNotificationActions(Context context, android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle)
    {
        if (bundle != null) goto _L2; else goto _L1
_L1:
        int i;
        try
        {
            AppboyLogger.w(TAG, String.format("Notification extras were null. Doing nothing.", new Object[0]));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            AppboyLogger.e(TAG, String.format("Caught exception while adding notification action buttons.", new Object[] {
                context
            }));
        }
          goto _L3
_L2:
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L3; else goto _L4
_L4:
        i = 0;
_L5:
        if (StringUtils.isNullOrBlank(getActionFieldAtIndex(i, bundle, "ab_a*_a")))
        {
            break; /* Loop/switch isn't completed */
        }
        addNotificationAction(context, builder, bundle, i);
        i++;
        if (true) goto _L5; else goto _L3
_L3:
    }

    static boolean canShareImage(Context context, Bundle bundle)
    {
        return bundle != null && bundle.containsKey("appboy_image_url") && AppboyImageUtils.isWriteExternalPermissionGranted(context);
    }

    private static Intent createShareActionIntent(Context context, Intent intent)
    {
        Bundle bundle = intent.getExtras();
        intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", bundle.getString("t"));
        intent.putExtra("android.intent.extra.TEXT", bundle.getString("a"));
        Object obj = bundle.getBundle("extra");
        if (canShareImage(context, ((Bundle) (obj))))
        {
            String s = Long.toString(System.currentTimeMillis());
            obj = AppboyImageUtils.downloadImageBitmap(((Bundle) (obj)).getString("appboy_image_url"));
            context = AppboyImageUtils.storeBitmapLocally(context.getApplicationContext(), ((android.graphics.Bitmap) (obj)), s, "Shared Photos");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", context);
            intent.addFlags(1);
        } else
        {
            intent.setType("text/plain");
        }
        intent.setFlags(0x10000000);
        return intent;
    }

    static String getActionFieldAtIndex(int i, Bundle bundle, String s)
    {
        s = bundle.getString(s.replace("*", String.valueOf(i)));
        bundle = s;
        if (s == null)
        {
            bundle = "";
        }
        return bundle;
    }

    static int getIconDrawableResourceId(Context context, String s)
    {
        while (context == null || StringUtils.isNullOrBlank(s)) 
        {
            return 0;
        }
        return context.getResources().getIdentifier(s, "drawable", PackageUtils.getResourcePackageName(context));
    }

    public static void handleNotificationActionClicked(Context context, Intent intent)
    {
        String s;
        int i;
        try
        {
            s = intent.getStringExtra("appboy_action_type");
            if (StringUtils.isNullOrBlank(s))
            {
                AppboyLogger.w(TAG, String.format("Notification action button type was blank or null.  Doing nothing.", new Object[0]));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            AppboyLogger.e(TAG, String.format("Caught exception while handling notification action button click.", new Object[] {
                context
            }));
            return;
        }
        i = intent.getIntExtra("nid", -1);
        if (!s.equals("ab_none"))
        {
            logNotificationActionClicked(context, intent);
        }
        if (!s.equals("ab_uri") && !s.equals("ab_open"))
        {
            break MISSING_BLOCK_LABEL_170;
        }
        AppboyNotificationUtils.cancelNotification(context, i);
        context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        if (!s.equals("ab_uri") || !intent.getExtras().containsKey("appboy_action_uri"))
        {
            break MISSING_BLOCK_LABEL_160;
        }
        intent.putExtra("uri", intent.getStringExtra("appboy_action_uri"));
_L1:
        AppboyNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
        return;
        intent.removeExtra("uri");
          goto _L1
        if (s.equals("ab_share"))
        {
            AppboyNotificationUtils.cancelNotification(context, i);
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            handleShareActionClicked(context, intent);
            return;
        }
        if (s.equals("ab_none"))
        {
            AppboyNotificationUtils.cancelNotification(context, i);
            return;
        }
        AppboyLogger.i(TAG, String.format("Custom notification action button clicked. Doing nothing and passing on data to client receiver.", new Object[0]));
        AppboyNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
        return;
    }

    private static void handleShareActionClicked(Context context, Intent intent)
    {
        (new ShareTask(context)).execute(new Intent[] {
            intent
        });
    }

    static boolean isCustomActionType(String s)
    {
        while (s.equals("ab_uri") || s.equals("ab_open") || s.equals("ab_none") || s.equals("ab_share")) 
        {
            return false;
        }
        return true;
    }

    private static void logNotificationActionClicked(Context context, Intent intent)
    {
        String s = intent.getStringExtra("cid");
        intent = intent.getStringExtra("appboy_action_id");
        if (StringUtils.isNullOrBlank(s))
        {
            AppboyLogger.i(TAG, String.format("No campaign Id associated with this notification.  Not logging push action click to Appboy.", new Object[0]));
            return;
        }
        if (StringUtils.isNullOrBlank(intent))
        {
            AppboyLogger.i(TAG, String.format("No action button Id associated with this notification action.  Not logging push action click to Appboy.", new Object[0]));
            return;
        } else
        {
            AppboyLogger.i(TAG, String.format((new StringBuilder()).append("Logging push action click to Appboy. Campaign Id: ").append(s).append(" Action Button Id: ").append(intent).toString(), new Object[0]));
            Appboy.getInstance(context).logPushNotificationActionClicked(s, intent);
            return;
        }
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/push/AppboyNotificationActionUtils.getName()
        });
    }



    private class ShareTask extends AsyncTask
    {

        private final Context mContext;

        protected transient Intent doInBackground(Intent aintent[])
        {
            if (mContext != null)
            {
                return AppboyNotificationActionUtils.createShareActionIntent(mContext, aintent[0]);
            } else
            {
                return null;
            }
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Intent[])aobj);
        }

        protected void onPostExecute(Intent intent)
        {
label0:
            {
                if (intent != null && mContext != null)
                {
                    if (intent == null)
                    {
                        break label0;
                    }
                    mContext.startActivity(intent);
                }
                return;
            }
            AppboyLogger.w(AppboyNotificationActionUtils.TAG, "Null share intent received.  Not starting share intent.");
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Intent)obj);
        }

        public ShareTask(Context context)
        {
            mContext = context;
        }
    }

}
