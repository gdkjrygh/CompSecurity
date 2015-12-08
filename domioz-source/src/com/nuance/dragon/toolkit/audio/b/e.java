// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.b;


// Referenced classes of package com.nuance.dragon.toolkit.audio.b:
//            a, m

final class e
    implements Runnable
{

    final a a;

    e(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        if (com.nuance.dragon.toolkit.audio.b.a.g(a) != null)
        {
            com.nuance.dragon.toolkit.audio.b.a.g(a).a();
        }
    }
}
