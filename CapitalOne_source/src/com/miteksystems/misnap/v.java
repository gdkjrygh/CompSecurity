// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;


// Referenced classes of package com.miteksystems.misnap:
//            u, b

final class v
    implements Runnable
{

    final u a;

    v(u u1)
    {
        a = u1;
        super();
    }

    public final void run()
    {
        if (u.a(a))
        {
            u.b(a).c();
        }
        u.c(a);
    }
}
