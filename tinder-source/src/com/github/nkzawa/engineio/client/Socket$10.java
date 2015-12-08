// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;


// Referenced classes of package com.github.nkzawa.engineio.client:
//            Socket

public final class a
    implements Runnable
{

    final String a;
    final Runnable b = null;
    final Socket c;

    public final void run()
    {
        Socket.a(c, "message", a, b);
    }

    public (Socket socket, String s)
    {
        c = socket;
        a = s;
        super();
    }
}
