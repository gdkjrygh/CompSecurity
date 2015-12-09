// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.facebook.internal:
//            Utility

public final class Validate
{

    private static final String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";
    private static final String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";
    private static final String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
    private static final String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
    private static final String TAG = com/facebook/internal/Validate.getName();

    public Validate()
    {
    }

    public static void containsNoNullOrEmpty(Collection collection, String s)
    {
        notNull(collection, s);
        for (collection = collection.iterator(); collection.hasNext();)
        {
            String s1 = (String)collection.next();
            if (s1 == null)
            {
                throw new NullPointerException((new StringBuilder()).append("Container '").append(s).append("' cannot contain null values").toString());
            }
            if (s1.length() == 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Container '").append(s).append("' cannot contain empty values").toString());
            }
        }

    }

    public static void containsNoNulls(Collection collection, String s)
    {
        notNull(collection, s);
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (collection.next() == null)
            {
                throw new NullPointerException((new StringBuilder()).append("Container '").append(s).append("' cannot contain null values").toString());
            }
        }

    }

    public static String hasAppID()
    {
        String s = FacebookSdk.getApplicationId();
        if (s == null)
        {
            throw new IllegalStateException("No App ID found, please set the App ID.");
        } else
        {
            return s;
        }
    }

    public static void hasContentProvider(Context context)
    {
        notNull(context, "context");
        String s = hasAppID();
        context = context.getPackageManager();
        if (context != null)
        {
            s = (new StringBuilder()).append("com.facebook.app.FacebookContentProvider").append(s).toString();
            if (context.resolveContentProvider(s, 0) == null)
            {
                throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[] {
                    s
                }));
            }
        }
    }

    public static void hasFacebookActivity(Context context)
    {
        hasFacebookActivity(context, true);
    }

    public static void hasFacebookActivity(Context context, boolean flag)
    {
        notNull(context, "context");
        PackageManager packagemanager = context.getPackageManager();
        Object obj = null;
        android.content.pm.ActivityInfo activityinfo = obj;
        if (packagemanager != null)
        {
            context = new ComponentName(context, com/facebook/FacebookActivity);
            try
            {
                activityinfo = packagemanager.getActivityInfo(context, 1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                activityinfo = obj;
            }
        }
        if (activityinfo == null)
        {
            if (flag)
            {
                throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
            Log.w(TAG, "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    public static void hasInternetPermissions(Context context)
    {
        hasInternetPermissions(context, true);
    }

    public static void hasInternetPermissions(Context context, boolean flag)
    {
        notNull(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1)
        {
            if (flag)
            {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            }
            Log.w(TAG, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static void notEmpty(Collection collection, String s)
    {
        if (collection.isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Container '").append(s).append("' cannot be empty").toString());
        } else
        {
            return;
        }
    }

    public static void notEmptyAndContainsNoNulls(Collection collection, String s)
    {
        containsNoNulls(collection, s);
        notEmpty(collection, s);
    }

    public static void notNull(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder()).append("Argument '").append(s).append("' cannot be null").toString());
        } else
        {
            return;
        }
    }

    public static void notNullOrEmpty(String s, String s1)
    {
        if (Utility.isNullOrEmpty(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Argument '").append(s1).append("' cannot be null or empty").toString());
        } else
        {
            return;
        }
    }

    public static transient void oneOf(Object obj, String s, Object aobj[])
    {
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Object obj1 = aobj[i];
            if (obj1 == null ? obj == null : obj1.equals(obj))
            {
                return;
            }
        }

        throw new IllegalArgumentException((new StringBuilder()).append("Argument '").append(s).append("' was not one of the allowed values").toString());
    }

    public static void runningOnUiThread()
    {
        if (!Looper.getMainLooper().equals(Looper.myLooper()))
        {
            throw new FacebookException("This method should be called from the UI thread");
        } else
        {
            return;
        }
    }

    public static void sdkInitialized()
    {
        if (!FacebookSdk.isInitialized())
        {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        } else
        {
            return;
        }
    }

}
