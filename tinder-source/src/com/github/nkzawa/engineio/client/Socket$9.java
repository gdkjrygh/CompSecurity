// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;


// Referenced classes of package com.github.nkzawa.engineio.client:
//            Socket

final class a
    implements Runnable
{

    final Socket a;

    public final void run()
    {
        Socket.c(a, "ping");
    }

    (Socket socket)
    {
        a = socket;
        super();
    }
}
