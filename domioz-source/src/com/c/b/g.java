// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            bg

final class g
    implements Runnable
{

    final bg a;
    final RuntimeException b;

    g(bg bg1, RuntimeException runtimeexception)
    {
        a = bg1;
        b = runtimeexception;
        super();
    }

    public final void run()
    {
        throw new RuntimeException((new StringBuilder("Transformation ")).append(a.b()).append(" crashed with exception.").toString(), b);
    }
}
