// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.b;

import com.nuance.a.a.a.a.d.a.e;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.nuance.a.a.a.b.b:
//            a

final class b
    implements Runnable
{

    private final String a;
    private final int b;
    private final OutputStream c;

    b(String s, int i, OutputStream outputstream)
    {
        a = s;
        b = i;
        c = outputstream;
    }

    public final void run()
    {
        String s = String.format("CONNECT %s:%d HTTP/1.0\r\n\r\n", new Object[] {
            a, Integer.valueOf(b)
        });
        try
        {
            c.write(s.getBytes("UTF-8"));
            return;
        }
        catch (IOException ioexception)
        {
            if (com.nuance.a.a.a.b.b.a.a().e())
            {
                com.nuance.a.a.a.b.b.a.a().b((new StringBuilder("proxy request write error: [")).append(ioexception.getClass().getName()).append("] Message - [").append(ioexception.getMessage()).append("]").toString());
            }
        }
        try
        {
            c.close();
            return;
        }
        catch (IOException ioexception1)
        {
            return;
        }
    }
}
