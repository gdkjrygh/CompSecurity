// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.content.Context;
import com.facebook.analytics.c.e;
import com.facebook.analytics.c.g;
import com.facebook.analytics.module.DefaultSingleThreadExecutor;
import com.facebook.analytics.service.i;
import com.facebook.common.time.a;
import com.facebook.common.v.f;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.analytics:
//            bq, ay, az

class bd extends d
{

    final ay a;

    private bd(ay ay)
    {
        a = ay;
        super();
    }

    bd(ay ay, az az)
    {
        this(ay);
    }

    public i a()
    {
        return new i((Context)e().a(android/content/Context), (e)a(com/facebook/analytics/c/e), (g)a(com/facebook/analytics/c/g), (com.facebook.base.a.d)a(com/facebook/base/a/d), (a)a(com/facebook/common/time/a), (Executor)a(java/util/concurrent/Executor, com/facebook/analytics/module/DefaultSingleThreadExecutor), (bq)a(com/facebook/analytics/bq), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper), (f)a(com/facebook/common/v/f), (com.facebook.common.process.d)a(com/facebook/common/process/d));
    }

    public Object b()
    {
        return a();
    }
}
