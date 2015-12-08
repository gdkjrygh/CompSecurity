// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import kik.a.d.s;

// Referenced classes of package com.kik.view.adapters:
//            au

final class ax
    implements Runnable
{

    final s a;
    final au b;

    ax(au au1, s s)
    {
        b = au1;
        a = s;
        super();
    }

    public final void run()
    {
        b.b(a);
    }
}
