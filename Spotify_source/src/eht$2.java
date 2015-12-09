// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

final class ang.Object
    implements Runnable
{

    private byte a;
    private eht b;

    public final void run()
    {
        byte byte0 = 0;
        ByteBuffer bytebuffer = ByteBuffer.wrap(eht.f(b));
        if (a == 0)
        {
            byte0 = 1;
        }
        ehp.a(eht.b(), eht.b().length, (byte)1, byte0, bytebuffer);
        bytebuffer.array();
        bytebuffer.position();
        try
        {
            eht.c(b).write(bytebuffer.array(), 0, bytebuffer.position());
            return;
        }
        catch (IOException ioexception)
        {
            eht.b(ioexception);
        }
    }

    (eht eht1, byte byte0)
    {
        b = eht1;
        a = byte0;
        super();
    }
}
