// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

public final class gua
{

    final gra a;
    final gqz b;
    public final hcj c;
    final hci d;
    int e;
    int f;
    private final Socket g;

    public gua(gra gra, gqz gqz, Socket socket)
    {
        e = 0;
        f = 0;
        a = gra;
        b = gqz;
        g = socket;
        c = hcq.a(hcq.b(socket));
        d = hcq.a(hcq.a(socket));
    }

    static void a(hcn hcn1)
    {
        hcx hcx1 = hcn1.a;
        hcn1.a = hcx.b;
        hcx1.Y_();
        hcx1.d();
    }

    public final hcw a(long l)
    {
        if (e != 4)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(e).toString());
        } else
        {
            e = 5;
            return new guf(this, l);
        }
    }

    public final void a()
    {
        d.flush();
    }

    public final void a(int i, int j)
    {
        if (i != 0)
        {
            c.T_().a(i, TimeUnit.MILLISECONDS);
        }
        if (j != 0)
        {
            d.T_().a(j, TimeUnit.MILLISECONDS);
        }
    }

    public final void a(grh grh1, String s)
    {
        if (e != 0)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(e).toString());
        }
        d.b(s).b("\r\n");
        int i = 0;
        for (int j = grh1.a.length / 2; i < j; i++)
        {
            d.b(grh1.a(i)).b(": ").b(grh1.b(i)).b("\r\n");
        }

        d.b("\r\n");
        e = 1;
    }

    public final void a(gri gri1)
    {
        do
        {
            String s = c.q();
            if (s.length() != 0)
            {
                gsf.b.a(gri1, s);
            } else
            {
                return;
            }
        } while (true);
    }

    public final boolean b()
    {
        Exception exception;
        int i;
        boolean flag;
        try
        {
            i = g.getSoTimeout();
        }
        catch (SocketTimeoutException sockettimeoutexception)
        {
            return true;
        }
        catch (IOException ioexception)
        {
            return false;
        }
        g.setSoTimeout(1);
        flag = c.e();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        g.setSoTimeout(i);
        return false;
        g.setSoTimeout(i);
        return true;
        exception;
        g.setSoTimeout(i);
        throw exception;
    }

    public final gru c()
    {
        if (e != 1 && e != 3)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(e).toString());
        }
        gru gru1;
        try
        {
            gur gur1;
            do
            {
                gur1 = gur.a(c.q());
                gru1 = new gru();
                gru1.b = gur1.a;
                gru1.c = gur1.b;
                gru1.d = gur1.c;
                gri gri1 = new gri();
                a(gri1);
                gri1.a(gum.c, gur1.a.toString());
                gru1.a(gri1.a());
            } while (gur1.b == 100);
            e = 4;
        }
        catch (EOFException eofexception)
        {
            IOException ioexception = new IOException((new StringBuilder("unexpected end of stream on ")).append(b).append(" (recycle count=").append(gsf.b.b(b)).append(")").toString());
            ioexception.initCause(eofexception);
            throw ioexception;
        }
        return gru1;
    }
}
