// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import akV;
import akY;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import java.util.Iterator;

// Referenced classes of package org.chromium.base:
//            BaseChromiumApplication

final class a extends akY
{

    private Activity a;
    private a b;

    public final void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        for (Iterator iterator = BaseChromiumApplication.a(b.b).iterator(); iterator.hasNext(); ((b)iterator.next()).b(a, flag)) { }
    }

    acks(acks acks, android.view.._cls1 _pcls1, Activity activity)
    {
        b = acks;
        a = activity;
        super(_pcls1);
    }

    // Unreferenced inner class org/chromium/base/BaseChromiumApplication$1

/* anonymous class */
    final class BaseChromiumApplication._cls1
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        private static boolean b;
        final BaseChromiumApplication a;

        public final void onActivityCreated(Activity activity, Bundle bundle)
        {
            bundle = activity.getWindow().getCallback();
            activity.getWindow().setCallback(new BaseChromiumApplication._cls1._cls1(this, bundle, activity));
        }

        public final void onActivityDestroyed(Activity activity)
        {
            if (!b && !(activity.getWindow().getCallback() instanceof akY))
            {
                throw new AssertionError();
            } else
            {
                return;
            }
        }

        public final void onActivityPaused(Activity activity)
        {
            if (!b && !(activity.getWindow().getCallback() instanceof akY))
            {
                throw new AssertionError();
            } else
            {
                return;
            }
        }

        public final void onActivityResumed(Activity activity)
        {
            if (!b && !(activity.getWindow().getCallback() instanceof akY))
            {
                throw new AssertionError();
            } else
            {
                return;
            }
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
            if (!b && !(activity.getWindow().getCallback() instanceof akY))
            {
                throw new AssertionError();
            } else
            {
                return;
            }
        }

        public final void onActivityStarted(Activity activity)
        {
            if (!b && !(activity.getWindow().getCallback() instanceof akY))
            {
                throw new AssertionError();
            } else
            {
                return;
            }
        }

        public final void onActivityStopped(Activity activity)
        {
            if (!b && !(activity.getWindow().getCallback() instanceof akY))
            {
                throw new AssertionError();
            } else
            {
                return;
            }
        }

        static 
        {
            boolean flag;
            if (!org/chromium/base/BaseChromiumApplication.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
        }

            
            {
                a = basechromiumapplication;
                super();
            }
    }

}
