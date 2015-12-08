// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import java.util.HashMap;

// Referenced classes of package com.comscore.analytics:
//            Core

class e
    implements Runnable
{

    final HashMap a;
    final Core b;

    e(Core core, HashMap hashmap)
    {
        b = core;
        a = hashmap;
        super();
    }

    public void run()
    {
        b.ad.putAll(a);
    }
}
