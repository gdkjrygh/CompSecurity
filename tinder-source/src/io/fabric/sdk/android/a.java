// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public final class io.fabric.sdk.android.a
{
    private static final class a
    {

        public final Set a = new HashSet();
        public final Application b;

        a(Application application)
        {
            b = application;
        }
    }

    public static abstract class b
    {

        public void a(Activity activity)
        {
        }

        public void b(Activity activity)
        {
        }

        public void c(Activity activity)
        {
        }

        public void d(Activity activity)
        {
        }

        public void e(Activity activity)
        {
        }

        public void f(Activity activity)
        {
        }

        public void g(Activity activity)
        {
        }

        public b()
        {
        }
    }


    public a a;
    private final Application b;

    public io.fabric.sdk.android.a(Context context)
    {
        b = (Application)context.getApplicationContext();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new a(b);
        }
    }

    public final boolean a(b b1)
    {
        if (a != null)
        {
            a a1 = a;
            boolean flag;
            if (a1.b != null)
            {
                b1 = new android.app.Application.ActivityLifecycleCallbacks(a1, b1) {

                    final b a;
                    final a b;

                    public final void onActivityCreated(Activity activity, Bundle bundle)
                    {
                        a.a(activity);
                    }

                    public final void onActivityDestroyed(Activity activity)
                    {
                        a.g(activity);
                    }

                    public final void onActivityPaused(Activity activity)
                    {
                        a.d(activity);
                    }

                    public final void onActivityResumed(Activity activity)
                    {
                        a.c(activity);
                    }

                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
                    {
                        a.f(activity);
                    }

                    public final void onActivityStarted(Activity activity)
                    {
                        a.b(activity);
                    }

                    public final void onActivityStopped(Activity activity)
                    {
                        a.e(activity);
                    }

            
            {
                b = a1;
                a = b1;
                super();
            }
                };
                a1.b.registerActivityLifecycleCallbacks(b1);
                a1.a.add(b1);
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }
}
