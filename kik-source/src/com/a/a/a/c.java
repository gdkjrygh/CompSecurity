// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.app.Application;
import b.a.a.a.a.b.j;

// Referenced classes of package com.a.a.a:
//            o, d, a, r, 
//            t

final class c extends o
{

    private final Application d;
    private final android.app.Application.ActivityLifecycleCallbacks e = new d(this);

    c(r r, t t, Application application)
    {
        super(r, t);
        d = application;
        j.e(com.a.a.a.a.c().v());
        application.registerActivityLifecycleCallbacks(e);
    }

    public final void a()
    {
        j.e(com.a.a.a.a.c().v());
        d.unregisterActivityLifecycleCallbacks(e);
        super.a();
    }
}
