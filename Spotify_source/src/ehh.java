// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;

public final class ehh
    implements egv, Closeable
{

    private final InputStream a;
    private final OutputStream b;
    private final ExecutorService c;
    private egw d;
    private volatile boolean e;
    private Runnable f;

    public ehh(InputStream inputstream, OutputStream outputstream, ExecutorService executorservice)
    {
        f = new Runnable() {

            private ehh a;

            public final void run()
            {
                ehh.a(a);
                if (!ehh.b(a))
                {
                    ehh.d(a).execute(ehh.c(a));
                }
            }

            
            {
                a = ehh.this;
                super();
            }
        };
        a = inputstream;
        b = outputstream;
        c = executorservice;
    }

    static void a(ehh ehh1)
    {
        Object obj = new DataInputStream(ehh1.a);
        int i = ((DataInputStream) (obj)).readInt();
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        try
        {
            byte abyte0[] = new byte[Math.min(((DataInputStream) (obj)).available(), 100)];
            ((DataInputStream) (obj)).readFully(abyte0);
            Assertion.b(String.format("Invalid data on input stream: %s", new Object[] {
                new String(abyte0)
            }));
            throw new IOException("Invalid data on input stream");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ehh1.e = true;
        }
        a(((Exception) (obj)));
_L1:
        return;
        byte abyte1[] = new byte[i];
        ((DataInputStream) (obj)).readFully(abyte1);
        if (ehh1.d != null)
        {
            ehh1.d.a(abyte1);
            return;
        }
          goto _L1
    }

    private static void a(Exception exception)
    {
        Logger.a(exception, exception.getMessage(), new Object[0]);
    }

    static boolean b(ehh ehh1)
    {
        return ehh1.e;
    }

    static Runnable c(ehh ehh1)
    {
        return ehh1.f;
    }

    static ExecutorService d(ehh ehh1)
    {
        return ehh1.c;
    }

    public final void a()
    {
        c.execute(f);
    }

    public final void a(int i, byte abyte0[])
    {
        DataOutputStream dataoutputstream = new DataOutputStream(b);
        try
        {
            ByteBuffer bytebuffer = ByteBuffer.allocate(i + 4);
            bytebuffer.putInt(i);
            bytebuffer.put(abyte0, 0, i);
            dataoutputstream.write(bytebuffer.array());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a(((Exception) (abyte0)));
        }
    }

    public final void a(egw egw1)
    {
        d = egw1;
    }

    public final void close()
    {
        e = true;
        try
        {
            a.close();
            b.close();
        }
        catch (IOException ioexception)
        {
            Assertion.a("Failed to close session io", ioexception);
        }
        c.shutdown();
    }
}
