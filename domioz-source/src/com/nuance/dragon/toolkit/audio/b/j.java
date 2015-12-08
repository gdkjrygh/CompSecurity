// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.b;


// Referenced classes of package com.nuance.dragon.toolkit.audio.b:
//            a

final class j
    implements Runnable
{

    final a a;

    j(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        com.nuance.dragon.toolkit.audio.b.a.c(a);
        if (!a.c(com.nuance.dragon.toolkit.audio.b.a.a(a)))
        {
            a.g();
        }
    }
}
