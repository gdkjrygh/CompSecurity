// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.analytics.d;
import com.facebook.analytics.f.a;
import com.facebook.base.activity.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.threadlist.ForThreadListActivity;
import com.facebook.widget.titlebar.c;

// Referenced classes of package com.facebook.orca.nux:
//            c, NuxIntroView, h

public class NUXActivity extends i
    implements d
{

    private static final Class p = com/facebook/orca/nux/NUXActivity;
    private NuxIntroView q;
    private ComponentName r;
    private h s;

    public NUXActivity()
    {
    }

    static void a(NUXActivity nuxactivity)
    {
        nuxactivity.k();
    }

    private void j()
    {
        q.setOnNextClickListener(new com.facebook.orca.nux.c(this));
    }

    private void k()
    {
        l();
    }

    private void l()
    {
        s.n();
        Intent intent = new Intent();
        intent.setComponent(r);
        startActivity(intent);
        finish();
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        setContentView(k.nux);
    }

    protected void b(Bundle bundle)
    {
        bundle = i();
        s = (h)bundle.a(com/facebook/orca/nux/h);
        r = (ComponentName)bundle.a(android/content/ComponentName, com/facebook/orca/threadlist/ForThreadListActivity);
        c.a(this);
        q = (NuxIntroView)b(com.facebook.i.nux_intro);
        j();
        q.f();
    }

    public a g_()
    {
        return a.NUX_ACTIVITY_NAME;
    }

}
