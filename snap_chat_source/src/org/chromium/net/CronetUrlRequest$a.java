// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;

// Referenced classes of package org.chromium.net:
//            CronetUrlRequest, UrlRequestListener

final class <init>
    implements Runnable
{

    ByteBuffer a;
    private CronetUrlRequest b;

    public final void run()
    {
        if (b.d())
        {
            return;
        }
        synchronized (CronetUrlRequest.a(b))
        {
            if (CronetUrlRequest.b(b) != 0L)
            {
                break MISSING_BLOCK_LABEL_51;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            CronetUrlRequest.a(b, ((Exception) (obj)));
        }
        return;
        CronetUrlRequest.c(b);
        obj;
        JVM INSTR monitorexit ;
        ByteBuffer bytebuffer = a;
        a = null;
        CronetUrlRequest.e(b).a(b, bytebuffer);
        return;
    }

    private (CronetUrlRequest croneturlrequest)
    {
        b = croneturlrequest;
        super();
    }

    b(CronetUrlRequest croneturlrequest, byte byte0)
    {
        this(croneturlrequest);
    }
}
