// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.java_websocket.b;

import org.java_websocket.e.a;
import org.java_websocket.e.b;

// Referenced classes of package org.java_websocket.b:
//            d, c, a

public final class f extends d
{

    public f()
    {
    }

    public final int a(a a1)
    {
        if (c(a1) == 13)
        {
            return org.java_websocket.b.c.a;
        } else
        {
            return org.java_websocket.b.c.b;
        }
    }

    public final b a(b b1)
    {
        super.a(b1);
        b1.a("Sec-WebSocket-Version", "13");
        return b1;
    }

    public final org.java_websocket.b.a c()
    {
        return new f();
    }
}
