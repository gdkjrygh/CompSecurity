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
import com.facebook.FacebookSdkNotInitializedException;
import com.facebook.g;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.facebook.internal:
//            m

public final class n
{

    private static final String a = com/facebook/internal/n.getName();

    public n()
    {
    }

    public static void a()
    {
        if (!Looper.getMainLooper().equals(Looper.myLooper()))
        {
            throw new FacebookException("This method should be called from the UI thread");
        } else
        {
            return;
        }
    }

    public static void a(Context context)
    {
        a(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1)
        {
            Log.w(a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static void a(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder("Argument '")).append(s).append("' cannot be null").toString());
        } else
        {
            return;
        }
    }

    public static void a(String s, String s1)
    {
        if (m.a(s))
        {
            throw new IllegalArgumentException((new StringBuilder("Argument '")).append(s1).append("' cannot be null or empty").toString());
        } else
        {
            return;
        }
    }

    public static void a(Collection collection, String s)
    {
        a(collection, s);
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            if (iterator.next() == null)
            {
                throw new NullPointerException((new StringBuilder("Container '")).append(s).append("' cannot contain null values").toString());
            }
        }

        if (collection.isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder("Container '")).append(s).append("' cannot be empty").toString());
        } else
        {
            return;
        }
    }

    public static void b()
    {
        if (!g.a())
        {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        } else
        {
            return;
        }
    }

    public static void b(Context context)
    {
        a(context, "context");
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
            Log.w(a, "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

}
