// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.b;


// Referenced classes of package com.qihoo.security.engine.b:
//            g

class a
    implements Runnable
{

    final g a;

    public void run()
    {
        if (a.d() && a.f)
        {
            a.b();
            a.f = false;
        }
    }

    (g g1)
    {
        a = g1;
        super();
    }
}
