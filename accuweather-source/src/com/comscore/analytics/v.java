// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;


// Referenced classes of package com.comscore.analytics:
//            Core

class v
    implements Runnable
{

    final int a;
    final boolean b;
    final Core c;

    v(Core core, int i, boolean flag)
    {
        c = core;
        a = i;
        b = flag;
        super();
    }

    public void run()
    {
        c.a(a, b);
    }
}
