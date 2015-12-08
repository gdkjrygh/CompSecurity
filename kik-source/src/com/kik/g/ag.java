// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;


// Referenced classes of package com.kik.g:
//            af, p

final class ag
    implements Runnable
{

    final Object a;
    final af b;

    ag(af af1, Object obj)
    {
        b = af1;
        a = obj;
        super();
    }

    public final void run()
    {
        b.b.a(a);
    }
}
