// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.utils.id.IdHelper;

// Referenced classes of package com.comscore.analytics:
//            Core

class a
    implements Runnable
{

    final Core a;

    a(Core core)
    {
        a = core;
        super();
    }

    public void run()
    {
        Core.a(a).resetVisitorId();
    }
}
