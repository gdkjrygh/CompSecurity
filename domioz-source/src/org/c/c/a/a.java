// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.c.c.f;

// Referenced classes of package org.c.c.a:
//            b, i

abstract class a extends b
{

    private ByteArrayOutputStream a;

    a()
    {
        a = new ByteArrayOutputStream();
    }

    protected abstract i a(f f1, byte abyte0[]);

    protected i executeInternal(f f1)
    {
        byte abyte0[] = a.toByteArray();
        if (f1.getContentLength() == -1L)
        {
            f1.setContentLength(abyte0.length);
        }
        f1 = a(f1, abyte0);
        a = null;
        return f1;
    }

    protected OutputStream getBodyInternal(f f1)
    {
        return a;
    }
}
