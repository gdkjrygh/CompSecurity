// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.app.Application;

// Referenced classes of package com.crashlytics.android.internal:
//            co, cm

final class cn
{

    final cm a;

    private cn(cm cm)
    {
        a = cm;
        super();
    }

    cn(cm cm, byte byte0)
    {
        this(cm);
    }

    static void a(cn cn1, Application application)
    {
        if (application != null)
        {
            application.registerActivityLifecycleCallbacks(new co(cn1));
        }
    }
}
