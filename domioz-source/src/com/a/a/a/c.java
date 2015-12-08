// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.app.Application;
import b.a.a.a.a.b.l;

// Referenced classes of package com.a.a.a:
//            k, d, a, o, 
//            q

final class c extends k
{

    private final Application d;
    private final android.app.Application.ActivityLifecycleCallbacks e = new d(this);

    c(o o, q q, Application application)
    {
        super(o, q);
        d = application;
        l.a(com.a.a.a.a.b().w(), "Registering activity lifecycle callbacks for session analytics.");
        application.registerActivityLifecycleCallbacks(e);
    }

    public final void a()
    {
        l.a(com.a.a.a.a.b().w(), "Unregistering activity lifecycle callbacks for session analytics");
        d.unregisterActivityLifecycleCallbacks(e);
        super.a();
    }
}
