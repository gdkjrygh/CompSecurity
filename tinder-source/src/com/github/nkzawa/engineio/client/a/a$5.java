// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client.a;


// Referenced classes of package com.github.nkzawa.engineio.client.a:
//            a

final class b
    implements com.github.nkzawa.engineio.parser._cls5
{

    final a a;
    final Runnable b;
    final a c;

    public final volatile void a(Object obj)
    {
        obj = (byte[])obj;
        a.a(((byte []) (obj)), b);
    }

    (a a1, a a2, Runnable runnable)
    {
        c = a1;
        a = a2;
        b = runnable;
        super();
    }
}
