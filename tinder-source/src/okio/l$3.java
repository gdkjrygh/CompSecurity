// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package okio:
//            a, l

static final class nit> extends a
{

    final Socket a;

    protected final IOException a(IOException ioexception)
    {
        SocketTimeoutException sockettimeoutexception = new SocketTimeoutException("timeout");
        if (ioexception != null)
        {
            sockettimeoutexception.initCause(ioexception);
        }
        return sockettimeoutexception;
    }

    protected final void a()
    {
        try
        {
            a.close();
            return;
        }
        catch (Exception exception)
        {
            l.a().log(Level.WARNING, (new StringBuilder("Failed to close timed out socket ")).append(a).toString(), exception);
            return;
        }
        catch (AssertionError assertionerror)
        {
            if (assertionerror.getCause() != null && assertionerror.getMessage() != null && assertionerror.getMessage().contains("getsockname failed"))
            {
                l.a().log(Level.WARNING, (new StringBuilder("Failed to close timed out socket ")).append(a).toString(), assertionerror);
                return;
            } else
            {
                throw assertionerror;
            }
        }
    }

    Socket(Socket socket)
    {
        a = socket;
        super();
    }
}
