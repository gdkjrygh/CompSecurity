// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package c:
//            a, r

final class u extends a
{

    final Socket a;

    u(Socket socket)
    {
        a = socket;
        super();
    }

    protected IOException newTimeoutException(IOException ioexception)
    {
        SocketTimeoutException sockettimeoutexception = new SocketTimeoutException("timeout");
        if (ioexception != null)
        {
            sockettimeoutexception.initCause(ioexception);
        }
        return sockettimeoutexception;
    }

    protected void timedOut()
    {
        try
        {
            a.close();
            return;
        }
        catch (Exception exception)
        {
            r.a().log(Level.WARNING, (new StringBuilder()).append("Failed to close timed out socket ").append(a).toString(), exception);
            return;
        }
        catch (AssertionError assertionerror)
        {
            if (assertionerror.getCause() != null && assertionerror.getMessage() != null && assertionerror.getMessage().contains("getsockname failed"))
            {
                r.a().log(Level.WARNING, (new StringBuilder()).append("Failed to close timed out socket ").append(a).toString(), assertionerror);
                return;
            } else
            {
                throw assertionerror;
            }
        }
    }
}
