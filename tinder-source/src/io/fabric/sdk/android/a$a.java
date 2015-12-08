// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package io.fabric.sdk.android:
//            a

private static final class b
{

    public final Set a = new HashSet();
    public final Application b;

    _cls1.a(Application application)
    {
        b = application;
    }

    // Unreferenced inner class io/fabric/sdk/android/a$a$1

/* anonymous class */
    final class _cls1
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final a.b a;
        final a.a b;

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
                b = a.a.this;
                a = b1;
                super();
            }
    }

}
