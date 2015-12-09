// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.d;

import android.os.Handler;
import com.nuance.dragon.toolkit.d.b.a;
import com.nuance.dragon.toolkit.d.b.c;

// Referenced classes of package com.nuance.dragon.toolkit.d:
//            c, d

public final class b
{

    private final a a;
    private final Thread b;

    public b()
    {
        this("com.nuance.dragon.toolkit.util.WorkerThread");
    }

    public b(String s)
    {
        com.nuance.dragon.toolkit.d.b.c.a("threadName", s);
        a = new a();
        b = new Thread(new com.nuance.dragon.toolkit.d.c(this), s);
    }

    static a a(b b1)
    {
        return b1.a;
    }

    public final void a()
    {
        b.start();
    }

    public final void b()
    {
        a.post(new d(this));
    }

    public final Handler c()
    {
        return a;
    }
}
