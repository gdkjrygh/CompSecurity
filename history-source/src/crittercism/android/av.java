// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;

// Referenced classes of package crittercism.android:
//            bd, dx, bl, az, 
//            bg, d, b, cd, 
//            bj

public final class av
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private int a;
    private boolean b;
    private boolean c;
    private boolean d;
    private Context e;
    private az f;
    private bd g;

    public av(Context context, az az1)
    {
        a = 0;
        b = false;
        c = false;
        d = false;
        e = context;
        f = az1;
        g = new bd(context, az1);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityDestroyed(Activity activity)
    {
    }

    public final void onActivityPaused(Activity activity)
    {
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        if (c)
        {
            activity.unregisterReceiver(g);
            c = false;
        }
        return;
        activity;
        throw activity;
        activity;
        dx.a(activity);
        return;
    }

    public final void onActivityResumed(Activity activity)
    {
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        if (!b) goto _L2; else goto _L1
_L1:
        dx.b();
        b = false;
_L3:
        a = a + 1;
        IntentFilter intentfilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        intentfilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        activity.registerReceiver(g, intentfilter);
        c = true;
        return;
_L2:
label0:
        {
            if (a != 0)
            {
                break MISSING_BLOCK_LABEL_178;
            }
            f.a(new bl(bl.a.a));
            bg.f();
            if (!d)
            {
                d = true;
                b b1 = (new d(e)).a();
                if (b1 != b.c)
                {
                    if (b1 != b.d)
                    {
                        break label0;
                    }
                    f.a(new cd(cd.a.b));
                }
            }
        }
          goto _L3
        try
        {
            f.a(new cd(cd.a.a));
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            dx.a(activity);
            return;
        }
          goto _L3
        f.a(new bj(bj.a.a, activity.getClass().getName()));
          goto _L3
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
    {
    }

    public final void onActivityStopped(Activity activity)
    {
        if (activity == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        a = a - 1;
        if (activity.isChangingConfigurations())
        {
            dx.b();
            b = true;
            return;
        }
        if (a == 0)
        {
            f.a(new bl(bl.a.b));
            bg.a(f);
            return;
        }
        try
        {
            f.a(new bj(bj.a.b, activity.getClass().getName()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            dx.a(activity);
        }
    }
}
