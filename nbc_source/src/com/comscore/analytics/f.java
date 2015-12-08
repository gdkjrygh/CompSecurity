// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;


// Referenced classes of package com.comscore.analytics:
//            Core

class f
    implements Runnable
{

    final String a;
    final String b;
    final Core c;

    f(Core core, String s, String s1)
    {
        c = core;
        a = s;
        b = s1;
        super();
    }

    public void run()
    {
        Core.a(c, a, b);
    }
}
