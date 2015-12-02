// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.keyguard;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.b.a.f;
import com.facebook.base.activity.i;
import com.facebook.c.k;
import com.facebook.common.e.h;
import com.facebook.debug.log.b;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.common.keyguard:
//            b, c, a

public class KeyguardPendingIntentActivity extends i
    implements f
{

    private KeyguardManager p;
    private h q;
    private av r;
    private PendingIntent s;
    private k t;
    private Handler u;

    public KeyguardPendingIntentActivity()
    {
    }

    static void a(KeyguardPendingIntentActivity keyguardpendingintentactivity)
    {
        keyguardpendingintentactivity.j();
    }

    static void b(KeyguardPendingIntentActivity keyguardpendingintentactivity)
    {
        keyguardpendingintentactivity.l();
    }

    static void c(KeyguardPendingIntentActivity keyguardpendingintentactivity)
    {
        keyguardpendingintentactivity.n();
    }

    static Handler d(KeyguardPendingIntentActivity keyguardpendingintentactivity)
    {
        return keyguardpendingintentactivity.u;
    }

    private void j()
    {
        m();
        if (p.inKeyguardRestrictedInputMode())
        {
            q.a("KeyguardPendingIntentActivity_inKeyguardRestrictedInputMode", "Keyguard should not be enabled");
            finish();
            return;
        } else
        {
            k();
            return;
        }
    }

    private void k()
    {
        View view = getWindow().getDecorView();
        view.invalidate();
        view.getViewTreeObserver().addOnPreDrawListener(new com.facebook.common.keyguard.b(this, view));
    }

    private void l()
    {
        u.postDelayed(new c(this), 400L);
    }

    private void m()
    {
        if (t != null)
        {
            unregisterReceiver(t);
            t = null;
        }
    }

    private void n()
    {
        if (s == null)
        {
            return;
        }
        cb cb1;
        try
        {
            com.facebook.debug.log.b.b(com/facebook/common/keyguard/KeyguardPendingIntentActivity, "Launching intent: %s", new Object[] {
                s
            });
            PendingIntent pendingintent = s;
            s = null;
            pendingintent.send();
            return;
        }
        catch (android.app.PendingIntent.CanceledException canceledexception)
        {
            cb1 = new cb("keyguard_pi_cancelled");
        }
        r.a(cb1);
    }

    public boolean a_()
    {
        return false;
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        overridePendingTransition(0, 0);
        bundle = i();
        p = (KeyguardManager)bundle.a(android/app/KeyguardManager);
        q = (h)bundle.a(com/facebook/common/e/h);
        r = (av)bundle.a(com/facebook/analytics/av);
        u = new Handler();
        bundle = getIntent();
        try
        {
            s = (PendingIntent)bundle.getParcelableExtra("pendingIntent");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            q.a("KeyguardPendingIntentActivity_getParcelableExtra_exception", bundle.getMessage());
            finish();
        }
        if (s == null)
        {
            finish();
        }
    }

    public void onPause()
    {
        super.onPause();
        m();
    }

    public void onResume()
    {
        super.onResume();
        if (!p.inKeyguardRestrictedInputMode())
        {
            j();
            return;
        } else
        {
            t = new k("android.intent.action.USER_PRESENT", new a(this));
            registerReceiver(t, new IntentFilter("android.intent.action.USER_PRESENT"));
            return;
        }
    }

    protected void onStop()
    {
        super.onStop();
        finish();
    }
}
