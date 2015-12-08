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

final class a
    implements android.app.cleCallbacks
{

    private static boolean b;
    final BaseChromiumApplication a;

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
        bundle = activity.getWindow().getCallback();
        activity.getWindow().setCallback(new akY(bundle, activity) {

            private Activity a;
            private BaseChromiumApplication._cls1 b;

            public final void onWindowFocusChanged(boolean flag)
            {
                super.onWindowFocusChanged(flag);
                for (Iterator iterator = BaseChromiumApplication.a(b.a).iterator(); iterator.hasNext(); ((BaseChromiumApplication.a)iterator.next()).a(a, flag)) { }
            }

            
            {
                b = BaseChromiumApplication._cls1.this;
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

    _cls1.a(BaseChromiumApplication basechromiumapplication)
    {
        a = basechromiumapplication;
        super();
    }
}
