// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import com.kik.g.r;

// Referenced classes of package com.kik.sdkutils:
//            s

final class x
    implements Runnable
{

    final Object a;
    final s b;

    x(s s1, Object obj)
    {
        b = s1;
        a = obj;
        super();
    }

    public final void run()
    {
        b.b.a(a);
    }
}
