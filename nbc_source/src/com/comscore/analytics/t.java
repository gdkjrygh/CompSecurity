// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;


// Referenced classes of package com.comscore.analytics:
//            Core

class t
    implements Runnable
{

    final String a[];
    final Core b;

    t(Core core, String as[])
    {
        b = core;
        a = as;
        super();
    }

    public void run()
    {
        b.am = a;
    }
}
