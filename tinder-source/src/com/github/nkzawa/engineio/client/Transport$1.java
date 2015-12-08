// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;


// Referenced classes of package com.github.nkzawa.engineio.client:
//            Transport

final class a
    implements Runnable
{

    final Transport a;

    public final void run()
    {
        if (a.o == adyState.c || a.o == null)
        {
            a.o = adyState.a;
            a.f();
        }
    }

    adyState(Transport transport)
    {
        a = transport;
        super();
    }
}
