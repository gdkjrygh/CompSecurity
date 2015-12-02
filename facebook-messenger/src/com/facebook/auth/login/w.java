// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.app.Activity;
import android.content.IntentFilter;
import com.facebook.auth.b.b;
import com.facebook.base.a.d;
import com.facebook.base.activity.AuthNotRequired;
import com.facebook.base.activity.a;
import com.facebook.base.broadcast.q;
import com.facebook.fbservice.ops.o;

// Referenced classes of package com.facebook.auth.login:
//            al, x

public class w extends a
{

    protected q a;
    private final Activity b;
    private final b c;
    private final d d;
    private final o e;
    private final al f;

    public w(Activity activity, b b1, d d1, o o1, al al1)
    {
        b = activity;
        c = b1;
        d = d1;
        e = o1;
        f = al1;
    }

    static Activity a(w w1)
    {
        return w1.b;
    }

    private boolean m(Activity activity)
    {
        while (activity.getClass().getAnnotation(com/facebook/base/activity/AuthNotRequired) != null || !d.c() || c.b()) 
        {
            return true;
        }
        return false;
    }

    public boolean a(Activity activity, Exception exception)
    {
        while (activity.getClass().getAnnotation(com/facebook/base/activity/AuthNotRequired) != null || !e.a(exception)) 
        {
            return false;
        }
        f.a(activity);
        activity.finish();
        return true;
    }

    public void b(Activity activity)
    {
        if (m(activity))
        {
            return;
        } else
        {
            f.b(activity);
            activity.finish();
            return;
        }
    }

    public void f(Activity activity)
    {
        if (m(activity))
        {
            return;
        } else
        {
            f.b(activity);
            activity.finish();
            return;
        }
    }

    public void g(Activity activity)
    {
        if (activity.getClass().getAnnotation(com/facebook/base/activity/AuthNotRequired) != null)
        {
            return;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE");
            a = new x(this, activity, intentfilter);
            a.a();
            return;
        }
    }

    public void h(Activity activity)
    {
        while (activity.getClass().getAnnotation(com/facebook/base/activity/AuthNotRequired) != null || a == null) 
        {
            return;
        }
        a.b();
        a = null;
    }
}
