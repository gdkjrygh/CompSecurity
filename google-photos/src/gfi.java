// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class gfi
    implements okf
{

    private final File a;
    private FileInputStream b;
    private int c;

    public gfi(File file)
    {
        a = file;
    }

    public final int a(long l, ByteBuffer bytebuffer)
    {
        if (b == null || l < (long)c)
        {
            close();
            b = new FileInputStream(a);
            c = 0;
        }
        for (; l > (long)c; c = (int)((long)c + b.skip(l - (long)c))) { }
        int i = bytebuffer.position();
        do
        {
            if (!bytebuffer.hasRemaining())
            {
                break;
            }
            byte abyte0[] = new byte[bytebuffer.remaining()];
            int j = b.read(abyte0);
            if (j == -1)
            {
                break;
            }
            c = c + j;
            bytebuffer.put(abyte0, 0, j);
        } while (true);
        return bytebuffer.position() - i;
    }

    public final void a()
    {
        try
        {
            close();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public final boolean a(long l, long l1)
    {
        return true;
    }

    public final void close()
    {
        if (b != null)
        {
            b.close();
            b = null;
        }
    }
}
