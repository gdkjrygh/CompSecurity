// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.facebook.k;
import com.facebook.m;
import com.facebook.s;
import com.facebook.w;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.facebook.b:
//            al

public final class ar
{

    private static final String a = com/facebook/b/ar.getName();

    public ar()
    {
    }

    public static void a()
    {
        if (!Looper.getMainLooper().equals(Looper.myLooper()))
        {
            throw new m("This method should be called from the UI thread");
        } else
        {
            return;
        }
    }

    public static void a(Context context, boolean flag)
    {
        a(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1)
        {
            if (flag)
            {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            }
            Log.w(a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static void a(Object obj, String s1)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder()).append("Argument '").append(s1).append("' cannot be null").toString());
        } else
        {
            return;
        }
    }

    public static void a(String s1, String s2)
    {
        if (al.a(s1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Argument '").append(s2).append("' cannot be null or empty").toString());
        } else
        {
            return;
        }
    }

    public static void a(Collection collection, String s1)
    {
        if (collection.isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Container '").append(s1).append("' cannot be empty").toString());
        } else
        {
            return;
        }
    }

    public static void b()
    {
        if (!s.a())
        {
            throw new w("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        } else
        {
            return;
        }
    }

    public static void b(Context context, boolean flag)
    {
        a(context, "context");
        PackageManager packagemanager = context.getPackageManager();
        Object obj = null;
        android.content.pm.ActivityInfo activityinfo = obj;
        if (packagemanager != null)
        {
            context = new ComponentName(context, com/facebook/k);
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
            Log.w(a, "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    public static void b(Collection collection, String s1)
    {
        a(collection, s1);
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (collection.next() == null)
            {
                throw new NullPointerException((new StringBuilder()).append("Container '").append(s1).append("' cannot contain null values").toString());
            }
        }

    }

    public static void c(Collection collection, String s1)
    {
        b(collection, s1);
        a(collection, s1);
    }

}
