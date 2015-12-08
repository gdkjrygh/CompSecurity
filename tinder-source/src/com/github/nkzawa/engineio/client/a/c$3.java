// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;


// Referenced classes of package com.github.nkzawa.engineio.client.a:
//            c

final class a
    implements Runnable
{

    final c a;
    final c b;

    public final void run()
    {
        a.c = true;
        a.a("drain", new Object[0]);
    }

    (c c1, c c2)
    {
        b = c1;
        a = c2;
        super();
    }
}
