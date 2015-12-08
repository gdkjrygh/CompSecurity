// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;


// Referenced classes of package com.comscore.analytics:
//            Core

class d
    implements Runnable
{

    final String a;
    final Core b;

    d(Core core, String s)
    {
        b = core;
        a = s;
        super();
    }

    public void run()
    {
        Core.b(b, a);
    }
}
