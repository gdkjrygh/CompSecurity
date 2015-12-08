// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.applications.EventType;
import java.util.HashMap;

// Referenced classes of package com.comscore.analytics:
//            Core

class y
    implements Runnable
{

    final EventType a;
    final HashMap b;
    final Core c;

    y(Core core, EventType eventtype, HashMap hashmap)
    {
        c = core;
        a = eventtype;
        b = hashmap;
        super();
    }

    public void run()
    {
        c.a(a, b);
    }
}
