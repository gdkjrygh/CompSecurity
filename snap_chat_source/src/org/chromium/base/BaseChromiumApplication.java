// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import akV;
import akY;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import java.util.Iterator;

// Referenced classes of package org.chromium.base:
//            ApplicationStatus

public class BaseChromiumApplication extends Application
{
    public static interface a
    {

        public abstract void a(Activity activity, boolean flag);
    }


    akV a;

    public BaseChromiumApplication()
    {
        this((byte)0);
    }

    private BaseChromiumApplication(byte byte0)
    {
        a = new akV();
    }

    static akV a(BaseChromiumApplication basechromiumapplication)
    {
        return basechromiumapplication.a;
    }

    public void onCreate()
    {
        super.onCreate();
        ApplicationStatus.a(this);
        registerActivityLifecycleCallbacks(new android.app.Application.ActivityLifecycleCallbacks() {

            private static boolean b;
            final BaseChromiumApplication a;

            public final void onActivityCreated(Activity activity, Bundle bundle)
            {
                bundle = activity.getWindow().getCallback();
                activity.getWindow().setCallback(new akY(this, bundle, activity) {

                    private Activity a;
                    private _cls1 b;

                    public final void onWindowFocusChanged(boolean flag)
                    {
                        super.onWindowFocusChanged(flag);
                        for (Iterator iterator = BaseChromiumApplication.a(b.a).iterator(); iterator.hasNext(); ((a)iterator.next()).a(a, flag)) { }
                    }

            
            {
                b = _pcls1;
                a = activity;
                super(callback);
            }
                });
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
                a = BaseChromiumApplication.this;
                super();
            }
        });
    }
}
