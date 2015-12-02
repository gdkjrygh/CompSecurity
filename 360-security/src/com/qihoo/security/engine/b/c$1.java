// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.b;

import com.qihoo.security.engine.e.c;

// Referenced classes of package com.qihoo.security.engine.b:
//            c, b, e, d

class a
    implements Runnable
{

    final com.qihoo.security.engine.b.c a;

    public void run()
    {
        while (!a.j.e || a.f.e() && a.f.f() || a.f.d() || !a.g.e()) 
        {
            return;
        }
        a.h.b();
    }

    (com.qihoo.security.engine.b.c c1)
    {
        a = c1;
        super();
    }
}
