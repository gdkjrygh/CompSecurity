// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;


// Referenced classes of package com.nuance.b.e:
//            u, c

final class f
    implements Runnable
{

    final u a;
    final c b;

    f(c c, u u1)
    {
        b = c;
        a = u1;
        super();
    }

    public final void run()
    {
        a.started();
    }
}
