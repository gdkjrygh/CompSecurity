// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package c:
//            a, o

final class r extends a
{

    final Socket a;

    r(Socket socket)
    {
        a = socket;
        super();
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
            o.a().log(Level.WARNING, (new StringBuilder("Failed to close timed out socket ")).append(a).toString(), exception);
        }
    }
}
