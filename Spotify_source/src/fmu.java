// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;

public class fmu
    implements android.app.Application.ActivityLifecycleCallbacks, dmx
{

    public WeakReference a;

    public fmu()
    {
        a = new WeakReference(null);
    }

    public final void a()
    {
        a.get();
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        a = new WeakReference(activity);
    }

    public void onActivityStopped(Activity activity)
    {
        a.clear();
    }
}
