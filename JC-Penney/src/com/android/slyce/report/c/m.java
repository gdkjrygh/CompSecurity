// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import java.io.BufferedOutputStream;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;

// Referenced classes of package com.android.slyce.report.c:
//            p, q, r, o

class m
{

    private static final ByteBuffer d = ByteBuffer.allocate(0);
    private final o a;
    private final p b;
    private final URI c;

    public m(URI uri, o o, Socket socket)
    {
        a = o;
        c = uri;
        try
        {
            b = new p(this, uri, 5000, socket);
            b.c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (URI uri)
        {
            throw new q(this, uri);
        }
    }

    static o a(m m1)
    {
        return m1.a;
    }

    static URI b(m m1)
    {
        return m1.c;
    }

    static p c(m m1)
    {
        return m1.b;
    }

    static ByteBuffer c()
    {
        return d;
    }

    public boolean a()
    {
        return !b.e() && !b.f() && !b.d();
    }

    public BufferedOutputStream b()
    {
        return new BufferedOutputStream(new r(this, null));
    }

}
