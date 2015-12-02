// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.core;

import com.facebook.loom.config.ControllerConfig;

// Referenced classes of package com.facebook.loom.core:
//            TraceController

class HttpTraceController
    implements TraceController
{

    HttpTraceController()
    {
    }

    public final int a(Object obj, ControllerConfig controllerconfig)
    {
        return 15;
    }

    public final boolean a(Object obj, Object obj1)
    {
        return obj == null && obj1 == null || obj.equals(obj1);
    }
}
