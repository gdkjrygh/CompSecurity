// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a.a.a.a;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.b.a.a.a.a.a:
//            a

private final class <init> extends FilterOutputStream
{

    final a a;

    public final void close()
    {
        try
        {
            out.close();
            return;
        }
        catch (IOException ioexception)
        {
            a.a = true;
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
            a.a = true;
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
            a.a = true;
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
            a.a = true;
        }
    }

    private ream(ream ream, OutputStream outputstream)
    {
        a = ream;
        super(outputstream);
    }

    ream(ream ream, OutputStream outputstream, byte byte0)
    {
        this(ream, outputstream);
    }
}
