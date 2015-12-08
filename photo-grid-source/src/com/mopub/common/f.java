// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class f extends FilterOutputStream
{

    final DiskLruCache.Editor a;

    private f(DiskLruCache.Editor editor, OutputStream outputstream)
    {
        a = editor;
        super(outputstream);
    }

    f(DiskLruCache.Editor editor, OutputStream outputstream, byte byte0)
    {
        this(editor, outputstream);
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
            DiskLruCache.Editor.c(a);
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
            DiskLruCache.Editor.c(a);
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
            DiskLruCache.Editor.c(a);
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
            DiskLruCache.Editor.c(a);
        }
    }
}
