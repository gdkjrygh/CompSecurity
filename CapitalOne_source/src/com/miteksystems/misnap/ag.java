// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;


// Referenced classes of package com.miteksystems.misnap:
//            u, b

final class ag
    implements Runnable
{

    final u a;

    ag(u u1)
    {
        a = u1;
        super();
    }

    public final void run()
    {
        u.f(a);
        if (u.g(a) != null && u.g(a).a())
        {
            u.g(a).c();
        }
    }
}
