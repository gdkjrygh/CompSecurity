// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package c:
//            v, f

class w extends OutputStream
{

    final v a;

    w(v v1)
    {
        a = v1;
        super();
    }

    public void close()
    {
        a.close();
    }

    public void flush()
    {
        if (!v.a(a))
        {
            a.flush();
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(a).append(".outputStream()").toString();
    }

    public void write(int i)
    {
        if (v.a(a))
        {
            throw new IOException("closed");
        } else
        {
            a.a.b((byte)i);
            a.w();
            return;
        }
    }

    public void write(byte abyte0[], int i, int j)
    {
        if (v.a(a))
        {
            throw new IOException("closed");
        } else
        {
            a.a.b(abyte0, i, j);
            a.w();
            return;
        }
    }
}
