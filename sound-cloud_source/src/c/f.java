// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.InputStream;

// Referenced classes of package c:
//            e

final class f extends InputStream
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public final int available()
    {
        return (int)Math.min(a.b, 0x7fffffffL);
    }

    public final void close()
    {
    }

    public final int read()
    {
        if (a.b > 0L)
        {
            return a.e() & 0xff;
        } else
        {
            return -1;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        return a.a(abyte0, i, j);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(".inputStream()").toString();
    }
}
