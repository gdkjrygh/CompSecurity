// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class jmu
    implements jmr
{

    private final k a;
    private RandomAccessFile b;
    private long c;
    private boolean d;

    public jmu()
    {
        this(null);
    }

    public jmu(k k)
    {
        a = k;
    }

    public final int a(byte abyte0[], int i, int j)
    {
        if (c == 0L)
        {
            i = -1;
        } else
        {
            try
            {
                j = b.read(abyte0, i, (int)Math.min(c, j));
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new jmv(abyte0);
            }
            i = j;
            if (j > 0)
            {
                c = c - (long)j;
                return j;
            }
        }
        return i;
    }

    public final long a(jms jms1)
    {
        long l;
        jms1.a.toString();
        b = new RandomAccessFile(jms1.a.getPath(), "r");
        b.seek(jms1.c);
        if (jms1.d != -1L)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        l = b.length() - jms1.c;
_L1:
        c = l;
        if (c < 0L)
        {
            throw new EOFException();
        }
        break MISSING_BLOCK_LABEL_103;
        try
        {
            l = jms1.d;
        }
        // Misplaced declaration of an exception variable
        catch (jms jms1)
        {
            throw new jmv(jms1);
        }
          goto _L1
        d = true;
        return c;
    }

    public final void a()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        b.close();
        b = null;
        if (d)
        {
            d = false;
            if (a == null);
        }
        return;
        Object obj;
        obj;
        throw new jmv(((IOException) (obj)));
        obj;
        b = null;
        if (d)
        {
            d = false;
        }
        throw obj;
    }
}
