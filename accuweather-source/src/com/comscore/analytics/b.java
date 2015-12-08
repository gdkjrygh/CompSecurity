// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;


// Referenced classes of package com.comscore.analytics:
//            Core

class b
    implements Runnable
{

    final boolean a;
    final Core b;

    b(Core core, boolean flag)
    {
        b = core;
        a = flag;
        super();
    }

    public void run()
    {
        b.af = a;
    }
}
