// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class cvs extends FilterOutputStream
{

    private cvr a;

    private cvs(cvr cvr1, OutputStream outputstream)
    {
        a = cvr1;
        super(outputstream);
    }

    cvs(cvr cvr1, OutputStream outputstream, byte byte0)
    {
        this(cvr1, outputstream);
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
            a.c = true;
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
            a.c = true;
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
            a.c = true;
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
            a.c = true;
        }
    }
}
