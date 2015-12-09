// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import bde;
import bdn;
import bdo;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ContentDataSource
    implements bdo
{

    private final ContentResolver a;
    private final bdn b;
    private InputStream c;
    private String d;
    private long e;
    private boolean f;

    public ContentDataSource(Context context, bdn bdn1)
    {
        a = context.getContentResolver();
        b = bdn1;
    }

    public final int a(byte abyte0[], int i, int j)
    {
        if (e != 0L) goto _L2; else goto _L1
_L1:
        i = -1;
_L4:
        return i;
_L2:
        if (e != -1L)
        {
            long l;
            try
            {
                l = Math.min(e, j);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new ContentDataSourceException(abyte0);
            }
            j = (int)l;
        }
        j = c.read(abyte0, i, j);
        i = j;
        if (j > 0)
        {
            if (e != -1L)
            {
                e = e - (long)j;
            }
            i = j;
            if (b != null)
            {
                b.a(j);
                return j;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final long a(bde bde1)
    {
        try
        {
            d = bde1.a.toString();
            c = new FileInputStream(a.openAssetFileDescriptor(bde1.a, "r").getFileDescriptor());
            if (c.skip(bde1.c) < bde1.c)
            {
                throw new EOFException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (bde bde1)
        {
            throw new ContentDataSourceException(bde1);
        }
        if (bde1.d == -1L)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        e = bde1.d;
_L1:
        f = true;
        if (b != null)
        {
            b.b();
        }
        return e;
        e = c.available();
        if (e == 0L)
        {
            e = -1L;
        }
          goto _L1
    }

    public final String a()
    {
        return d;
    }

    public final void b()
    {
        d = null;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        c.close();
        c = null;
        if (f)
        {
            f = false;
            if (b != null)
            {
                b.c();
            }
        }
        return;
        Object obj;
        obj;
        throw new ContentDataSourceException(((IOException) (obj)));
        obj;
        c = null;
        if (f)
        {
            f = false;
            if (b != null)
            {
                b.c();
            }
        }
        throw obj;
    }

    private class ContentDataSourceException extends IOException
    {

        public ContentDataSourceException(IOException ioexception)
        {
            super(ioexception);
        }
    }

}
