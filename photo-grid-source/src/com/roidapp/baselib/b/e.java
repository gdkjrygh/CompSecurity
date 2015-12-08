// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.roidapp.baselib.b:
//            d

final class e extends FilterOutputStream
{

    final d a;

    private e(d d1, OutputStream outputstream)
    {
        a = d1;
        super(outputstream);
    }

    e(d d1, OutputStream outputstream, byte byte0)
    {
        this(d1, outputstream);
    }

    public final void close()
    {
        try
        {
            out.close();
            return;
        }
        catch (IOException ioexception)
        {
            d.b(a);
        }
    }

    public final void flush()
    {
        try
        {
            out.flush();
            return;
        }
        catch (IOException ioexception)
        {
            d.b(a);
        }
    }

    public final void write(int i)
    {
        try
        {
            out.write(i);
            return;
        }
        catch (IOException ioexception)
        {
            d.b(a);
        }
    }

    public final void write(byte abyte0[], int i, int j)
    {
        try
        {
            out.write(abyte0, i, j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            d.b(a);
        }
    }
}
