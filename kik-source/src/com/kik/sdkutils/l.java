// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import com.kik.g.p;

// Referenced classes of package com.kik.sdkutils:
//            i

final class l
    implements Runnable
{

    final Object a;
    final i b;

    l(i j, Object obj)
    {
        b = j;
        a = obj;
        super();
    }

    public final void run()
    {
        b.b.a(a);
    }
}
