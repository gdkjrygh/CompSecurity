// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.e;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package b.a.a.a.a.e:
//            d

final class e extends d.a
{

    final InputStream a;
    final OutputStream b;
    final d c;

    e(d d1, Closeable closeable, boolean flag, InputStream inputstream, OutputStream outputstream)
    {
        c = d1;
        a = inputstream;
        b = outputstream;
        super(closeable, flag);
    }

    public final Object a()
        throws d.c, IOException
    {
        byte abyte0[] = new byte[d.a(c)];
        do
        {
            int i = a.read(abyte0);
            if (i != -1)
            {
                b.write(abyte0, 0, i);
            } else
            {
                return c;
            }
        } while (true);
    }
}
