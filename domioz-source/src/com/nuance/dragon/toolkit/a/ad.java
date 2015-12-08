// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;


// Referenced classes of package com.nuance.dragon.toolkit.a:
//            ac, f, x

final class ad
    implements Runnable
{

    final String a;
    final ac b;

    ad(ac ac1, String s)
    {
        b = ac1;
        a = s;
        super();
    }

    public final void run()
    {
        f.b(b.a).a(a);
        f.b(b.a);
    }
}
