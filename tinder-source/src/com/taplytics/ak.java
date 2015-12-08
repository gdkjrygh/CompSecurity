// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.taplytics:
//            ih, ax, c, ij

public final class ak extends ih
{

    private final byte b[];

    public ak(String s, c c1)
    {
        super(c1);
        ax.a(s, "Text");
        c1 = c1.p;
        if (c1 == null)
        {
            c1 = ij.b;
        }
        b = s.getBytes(c1);
    }

    public final String a()
    {
        return null;
    }

    public final void a(OutputStream outputstream)
        throws IOException
    {
        ax.a(outputstream, "Output stream");
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(b);
        byte abyte0[] = new byte[4096];
        do
        {
            int i = bytearrayinputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                outputstream.flush();
                return;
            }
        } while (true);
    }

    public final String d()
    {
        return "8bit";
    }

    public final long e()
    {
        return (long)b.length;
    }
}
