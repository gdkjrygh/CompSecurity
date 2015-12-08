// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package b.a:
//            ha, hb

public final class gy extends ha
{

    protected InputStream a;
    protected OutputStream b;

    protected gy()
    {
        a = null;
        b = null;
    }

    public gy(OutputStream outputstream)
    {
        a = null;
        b = null;
        b = outputstream;
    }

    public final int a(byte abyte0[], int i, int j)
    {
        if (a == null)
        {
            throw new hb("Cannot read from null inputStream");
        }
        try
        {
            i = a.read(abyte0, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new hb(abyte0);
        }
        if (i < 0)
        {
            throw new hb((byte)0);
        } else
        {
            return i;
        }
    }

    public final void b(byte abyte0[], int i, int j)
    {
        if (b == null)
        {
            throw new hb("Cannot write to null outputStream");
        }
        try
        {
            b.write(abyte0, i, j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new hb(abyte0);
        }
    }
}
