// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import bolts.e;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.messenger:
//            ShareToMessengerParams, MessengerThreadParams

public class MessengerUtils
{

    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
    public static final String EXTRA_APP_ID = "com.facebook.orca.extra.APPLICATION_ID";
    public static final String EXTRA_EXTERNAL_URI = "com.facebook.orca.extra.EXTERNAL_URI";
    public static final String EXTRA_IS_COMPOSE = "com.facebook.orca.extra.IS_COMPOSE";
    public static final String EXTRA_IS_REPLY = "com.facebook.orca.extra.IS_REPLY";
    public static final String EXTRA_METADATA = "com.facebook.orca.extra.METADATA";
    public static final String EXTRA_PARTICIPANTS = "com.facebook.orca.extra.PARTICIPANTS";
    public static final String EXTRA_PROTOCOL_VERSION = "com.facebook.orca.extra.PROTOCOL_VERSION";
    public static final String EXTRA_REPLY_TOKEN_KEY = "com.facebook.orca.extra.REPLY_TOKEN";
    public static final String EXTRA_THREAD_TOKEN_KEY = "com.facebook.orca.extra.THREAD_TOKEN";
    public static final String ORCA_THREAD_CATEGORY_20150314 = "com.facebook.orca.category.PLATFORM_THREAD_20150314";
    public static final String PACKAGE_NAME = "com.facebook.orca";
    public static final int PROTOCOL_VERSION_20150314 = 0x133782a;
    private static final String TAG = "MessengerUtils";

    public MessengerUtils()
    {
    }

    public static void finishShareToMessenger(Activity activity, ShareToMessengerParams sharetomessengerparams)
    {
        Object obj = activity.getIntent();
        Set set = ((Intent) (obj)).getCategories();
        if (set == null)
        {
            activity.setResult(0, null);
            activity.finish();
            return;
        }
        if (set.contains("com.facebook.orca.category.PLATFORM_THREAD_20150314"))
        {
            obj = e.a(((Intent) (obj)));
            Intent intent = new Intent();
            if (set.contains("com.facebook.orca.category.PLATFORM_THREAD_20150314"))
            {
                intent.putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 0x133782a);
                intent.putExtra("com.facebook.orca.extra.THREAD_TOKEN", ((Bundle) (obj)).getString("com.facebook.orca.extra.THREAD_TOKEN"));
                intent.setDataAndType(sharetomessengerparams.uri, sharetomessengerparams.mimeType);
                intent.setFlags(1);
                intent.putExtra("com.facebook.orca.extra.APPLICATION_ID", FacebookSdk.getApplicationId());
                intent.putExtra("com.facebook.orca.extra.METADATA", sharetomessengerparams.metaData);
                intent.putExtra("com.facebook.orca.extra.EXTERNAL_URI", sharetomessengerparams.externalUri);
                activity.setResult(-1, intent);
                activity.finish();
                return;
            } else
            {
                throw new RuntimeException();
            }
        } else
        {
            activity.setResult(0, null);
            activity.finish();
            return;
        }
    }

    private static Set getAllAvailableProtocolVersions(Context context)
    {
        Object obj;
        obj = context.getContentResolver();
        context = new HashSet();
        obj = ((ContentResolver) (obj)).query(Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions"), new String[] {
            "version"
        }, null, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        int i = ((Cursor) (obj)).getColumnIndex("version");
        for (; ((Cursor) (obj)).moveToNext(); context.add(Integer.valueOf(((Cursor) (obj)).getInt(i)))) { }
        break MISSING_BLOCK_LABEL_86;
        context;
        ((Cursor) (obj)).close();
        throw context;
        ((Cursor) (obj)).close();
        return context;
    }

    public static MessengerThreadParams getMessengerThreadParamsForIntent(Intent intent)
    {
        String s;
        String s1;
        String s2;
        boolean flag;
        boolean flag1;
        for (Set set = intent.getCategories(); set == null || !set.contains("com.facebook.orca.category.PLATFORM_THREAD_20150314");)
        {
            return null;
        }

        intent = e.a(intent);
        s = intent.getString("com.facebook.orca.extra.THREAD_TOKEN");
        s1 = intent.getString("com.facebook.orca.extra.METADATA");
        s2 = intent.getString("com.facebook.orca.extra.PARTICIPANTS");
        flag = intent.getBoolean("com.facebook.orca.extra.IS_REPLY");
        flag1 = intent.getBoolean("com.facebook.orca.extra.IS_COMPOSE");
        intent = MessengerThreadParams.Origin.UNKNOWN;
        if (!flag) goto _L2; else goto _L1
_L1:
        intent = MessengerThreadParams.Origin.REPLY_FLOW;
_L4:
        return new MessengerThreadParams(intent, s, s1, parseParticipants(s2));
_L2:
        if (flag1)
        {
            intent = MessengerThreadParams.Origin.COMPOSE_FLOW;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean hasMessengerInstalled(Context context)
    {
        try
        {
            context.getPackageManager().getPackageInfo("com.facebook.orca", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static void openMessengerInPlayStore(Context context)
    {
        try
        {
            startViewUri(context, "market://details?id=com.facebook.orca");
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            startViewUri(context, "http://play.google.com/store/apps/details?id=com.facebook.orca");
        }
    }

    private static List parseParticipants(String s)
    {
        if (s != null && s.length() != 0) goto _L2; else goto _L1
_L1:
        s = Collections.emptyList();
_L4:
        return s;
_L2:
        String as[] = s.split(",");
        ArrayList arraylist = new ArrayList();
        int j = as.length;
        int i = 0;
        do
        {
            s = arraylist;
            if (i >= j)
            {
                continue;
            }
            arraylist.add(as[i].trim());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void shareToMessenger(Activity activity, int i, ShareToMessengerParams sharetomessengerparams)
    {
        if (!hasMessengerInstalled(activity))
        {
            openMessengerInPlayStore(activity);
            return;
        }
        if (getAllAvailableProtocolVersions(activity).contains(Integer.valueOf(0x133782a)))
        {
            shareToMessenger20150314(activity, i, sharetomessengerparams);
            return;
        } else
        {
            openMessengerInPlayStore(activity);
            return;
        }
    }

    private static void shareToMessenger20150314(Activity activity, int i, ShareToMessengerParams sharetomessengerparams)
    {
        Intent intent;
        String s;
        try
        {
            intent = new Intent("android.intent.action.SEND");
            intent.setFlags(1);
            intent.setPackage("com.facebook.orca");
            intent.putExtra("android.intent.extra.STREAM", sharetomessengerparams.uri);
            intent.setType(sharetomessengerparams.mimeType);
            s = FacebookSdk.getApplicationId();
        }
        // Misplaced declaration of an exception variable
        catch (ShareToMessengerParams sharetomessengerparams)
        {
            activity.startActivity(activity.getPackageManager().getLaunchIntentForPackage("com.facebook.orca"));
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        intent.putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 0x133782a);
        intent.putExtra("com.facebook.orca.extra.APPLICATION_ID", s);
        intent.putExtra("com.facebook.orca.extra.METADATA", sharetomessengerparams.metaData);
        intent.putExtra("com.facebook.orca.extra.EXTERNAL_URI", sharetomessengerparams.externalUri);
        activity.startActivityForResult(intent, i);
        return;
    }

    private static void startViewUri(Context context, String s)
    {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }
}
