// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.base.activity.a;
import com.facebook.debug.log.b;
import com.facebook.orca.nux.NUXActivity;
import com.facebook.orca.nux.h;

public class m extends a
{

    private static final Class a = com/facebook/orca/activity/m;
    private final h b;
    private final com.facebook.orca.c.a c;
    private String d;
    private Intent e;
    private ComponentName f;

    public m(h h1, com.facebook.orca.c.a a1, ComponentName componentname)
    {
        b = h1;
        c = a1;
        f = componentname;
    }

    public void a(Intent intent)
    {
        d = intent.getStringExtra("orca:loginparam:ReturnUri");
        e = (Intent)intent.getParcelableExtra("orca:loginparam:ReturnIntent");
    }

    public boolean a()
    {
        return c.a();
    }

    public boolean b()
    {
        return b.i();
    }

    public Intent m(Activity activity)
    {
        if (d != null)
        {
            com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Going to ").append(d).toString());
            return new Intent("android.intent.action.VIEW", Uri.parse(d));
        }
        if (e != null)
        {
            com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Going to ").append(e).toString());
            activity = new Intent(e);
            activity.setFlags(activity.getFlags() & 0xefffffff);
            return activity;
        }
        if (b())
        {
            com.facebook.debug.log.b.c(a, "Going to NUX.");
            return new Intent(activity, com/facebook/orca/nux/NUXActivity);
        } else
        {
            com.facebook.debug.log.b.c(a, "Going to threadlist.");
            activity = new Intent();
            activity.setComponent(f);
            return activity;
        }
    }

}
