// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import p.dm.j;
import p.dm.k;
import p.dq.c;

public class b
    implements Runnable, j
{

    private OutputStream a;
    private OutputStream b;
    private InputStream c;
    private PipedOutputStream d;
    private InputStream e;
    private Thread f;
    private k g;
    private c h;
    private boolean i;

    public b()
    {
        i = false;
    }

    public b(OutputStream outputstream, InputStream inputstream, c c1)
    {
        i = false;
        a(inputstream, outputstream, c1);
    }

    private void c()
    {
        if (!i)
        {
            i = true;
            g.a();
        }
    }

    public OutputStream a()
    {
        return a;
    }

    protected void a(ByteArrayOutputStream bytearrayoutputstream)
    {
        byte abyte0[] = bytearrayoutputstream.toByteArray();
        bytearrayoutputstream.reset();
        if (g != null)
        {
            g.c(abyte0);
        }
    }

    public void a(InputStream inputstream, OutputStream outputstream, c c1)
    {
        try
        {
            e = new PipedInputStream();
            d = new PipedOutputStream((PipedInputStream)e);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            System.err.println("Failed to set up local intercptor.  Bytes will be passed through as normal.");
            c1.printStackTrace(System.err);
            a = outputstream;
            e = inputstream;
            d = null;
            return;
        }
        b = outputstream;
        c = inputstream;
        a = new ByteArrayOutputStream() {

            final b a;

            public void flush()
                throws IOException
            {
                super.flush();
                a.a(this);
            }

            
            {
                a = b.this;
                super();
            }
        };
        i = false;
        f = new Thread(this, getClass().getSimpleName());
        h = c1;
    }

    public void a(k k1)
    {
        g = k1;
    }

    public void a(byte abyte0[])
    {
        try
        {
            b.write(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            System.err.println("Failed to write bytes to accessory");
        }
        abyte0.printStackTrace();
    }

    public InputStream b()
    {
        if (f.getState() == Thread.State.TERMINATED)
        {
            i = false;
            f = new Thread(this, getClass().getSimpleName());
        }
        if (!f.isAlive())
        {
            f.start();
        }
        return e;
    }

    public void b(byte abyte0[])
    {
        try
        {
            d.write(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            System.err.println("Failed to write data to app");
        }
        abyte0.printStackTrace();
    }

    public void run()
    {
        byte abyte0[] = new byte[2048];
_L2:
        if (i)
        {
            break; /* Loop/switch isn't completed */
        }
        int l = c.read(abyte0);
        if (l == -1)
        {
            try
            {
                c();
            }
            catch (IOException ioexception)
            {
                System.err.append("Failed to pass bytes from accessory to app");
                ioexception.printStackTrace();
                h.g();
                c();
            }
            continue; /* Loop/switch isn't completed */
        }
        byte abyte1[] = new byte[l];
        System.arraycopy(abyte0, 0, abyte1, 0, l);
        if (g != null)
        {
            g.d(abyte1);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
