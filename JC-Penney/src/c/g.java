// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.OutputStream;

// Referenced classes of package c:
//            f

class g extends OutputStream
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public void close()
    {
    }

    public void flush()
    {
    }

    public String toString()
    {
        return (new StringBuilder()).append(this).append(".outputStream()").toString();
    }

    public void write(int i)
    {
        a.b((byte)i);
    }

    public void write(byte abyte0[], int i, int j)
    {
        a.b(abyte0, i, j);
    }
}
