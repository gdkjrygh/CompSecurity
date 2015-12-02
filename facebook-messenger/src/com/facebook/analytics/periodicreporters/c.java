// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.periodicreporters;

import android.content.Context;
import android.content.Intent;
import com.facebook.analytics.av;
import com.facebook.c.b;
import com.facebook.common.time.a;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.analytics.periodicreporters:
//            k, b

class c
    implements b
{

    private c()
    {
    }

    c(com.facebook.analytics.periodicreporters.b b1)
    {
        this();
    }

    public void a(Context context, Intent intent, com.facebook.c.c c1)
    {
        context = t.a(context);
        ((av)context.a(com/facebook/analytics/av)).b(((k)context.a(com/facebook/analytics/periodicreporters/k)).b(((a)context.a(com/facebook/common/time/a)).a()));
    }
}
