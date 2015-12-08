// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.facebook.FacebookActivity;
import com.facebook.p;
import com.facebook.s;
import com.facebook.v;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.facebook.internal:
//            U

public final class Y
{

    private static final String a = com/facebook/internal/Y.getName();

    public Y()
    {
    }

    public static void a()
    {
        if (!Looper.getMainLooper().equals(Looper.myLooper()))
        {
            throw new p("This method should be called from the UI thread");
        } else
        {
            return;
        }
    }

    public static void a(Context context)
    {
        a(context, true);
    }

    public static void a(Context context, boolean flag)
    {
        a(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && flag)
        {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        } else
        {
            return;
        }
    }

    public static void a(Object obj, String s1)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder("Argument '")).append(s1).append("' cannot be null").toString());
        } else
        {
            return;
        }
    }

    public static void a(String s1, String s2)
    {
        if (U.a(s1))
        {
            throw new IllegalArgumentException((new StringBuilder("Argument '")).append(s2).append("' cannot be null or empty").toString());
        } else
        {
            return;
        }
    }

    public static void a(Collection collection, String s1)
    {
        a(collection, s1);
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            if (iterator.next() == null)
            {
                throw new NullPointerException((new StringBuilder("Container '")).append(s1).append("' cannot contain null values").toString());
            }
        }

        if (collection.isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder("Container '")).append(s1).append("' cannot be empty").toString());
        } else
        {
            return;
        }
    }

    public static void b()
    {
        if (!s.a())
        {
            throw new v("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        } else
        {
            return;
        }
    }

    public static void b(Context context)
    {
        b(context, true);
    }

    public static void b(Context context, boolean flag)
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
        if (activityinfo == null && flag)
        {
            throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        } else
        {
            return;
        }
    }

    public static void c(Context context)
    {
        a(context, "context");
        String s1 = s.h();
        if (s1 == null)
        {
            throw new IllegalStateException("No App ID found, please set the App ID.");
        }
        context = context.getPackageManager();
        if (context != null)
        {
            s1 = (new StringBuilder("com.facebook.app.FacebookContentProvider")).append(s1).toString();
            if (context.resolveContentProvider(s1, 0) == null)
            {
                throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[] {
                    s1
                }));
            }
        }
    }

}
