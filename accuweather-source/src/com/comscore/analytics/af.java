// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.utils.OfflineMeasurementsCache;

// Referenced classes of package com.comscore.analytics:
//            Core

class af
    implements Runnable
{

    final String a;
    final Core b;

    af(Core core, String s)
    {
        b = core;
        a = s;
        super();
    }

    public void run()
    {
        b.a.setUrl(a);
    }
}
