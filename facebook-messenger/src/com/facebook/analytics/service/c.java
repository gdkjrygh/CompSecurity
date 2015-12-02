// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.b;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.analytics.service:
//            a, d, b

class c
    implements b
{

    final a a;

    private c(a a1)
    {
        a = a1;
        super();
    }

    c(a a1, com.facebook.analytics.service.b b1)
    {
        this(a1);
    }

    public void a(Context context, Intent intent, com.facebook.c.c c1)
    {
        if (com.facebook.analytics.service.a.e(a))
        {
            com.facebook.analytics.service.a.b(a, false);
            com.facebook.analytics.service.a.a(false);
            com.facebook.analytics.service.a.f(a).execute(new d(this, null));
            return;
        } else
        {
            com.facebook.analytics.service.a.b(a, true);
            com.facebook.analytics.service.a.a(true);
            return;
        }
    }
}
