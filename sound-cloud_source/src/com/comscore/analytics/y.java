// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;


// Referenced classes of package com.comscore.analytics:
//            Core

class y
    implements Runnable
{

    final Core a;

    y(Core core)
    {
        a = core;
        super();
    }

    public void run()
    {
        a.update();
    }
}
