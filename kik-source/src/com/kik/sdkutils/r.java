// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;


// Referenced classes of package com.kik.sdkutils:
//            m

final class r
    implements Runnable
{

    final Object a;
    final m b;

    r(m m1, Object obj)
    {
        b = m1;
        a = obj;
        super();
    }

    public final void run()
    {
        b.b.a(a);
    }
}
