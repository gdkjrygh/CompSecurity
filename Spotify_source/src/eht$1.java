// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

final class ang.Object
    implements Runnable
{

    private int a;
    private byte b[];
    private int c;
    private eht d;

    public final void run()
    {
        ByteBuffer bytebuffer = ByteBuffer.wrap(eht.a(d));
        ehp.a(b, c, (byte)0, eht.b(d), bytebuffer);
        if (a < 5)
        {
            try
            {
                bytebuffer.array();
                bytebuffer.position();
                eht.c(d).write(bytebuffer.array(), 0, bytebuffer.position());
                a = a + 1;
                long l = Math.max(750L, Math.min(5000L, (long)(((double)c / 35000D) * 5000D)));
                eht.a(d, eht.a(d, this, l));
                return;
            }
            catch (IOException ioexception)
            {
                eht.b(new IOException("Error sending data", ioexception));
            }
            eht.d(d);
            eht.e(d);
            return;
        } else
        {
            eht.b(new IOException("Message resent five times without being ACKed, giving up on this message"));
            eht.d(d);
            eht.e(d);
            return;
        }
    }

    (eht eht1, byte abyte0[], int i)
    {
        d = eht1;
        b = abyte0;
        c = i;
        super();
    }
}
