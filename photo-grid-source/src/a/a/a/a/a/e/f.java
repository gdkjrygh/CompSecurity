// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.e;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package a.a.a.a.a.e:
//            g, e

final class f extends g
{

    final InputStream a;
    final OutputStream b;
    final e c;

    f(e e1, Closeable closeable, boolean flag, InputStream inputstream, OutputStream outputstream)
    {
        c = e1;
        a = inputstream;
        b = outputstream;
        super(closeable, flag);
    }

    public final Object a()
    {
        byte abyte0[] = new byte[e.a(c)];
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
