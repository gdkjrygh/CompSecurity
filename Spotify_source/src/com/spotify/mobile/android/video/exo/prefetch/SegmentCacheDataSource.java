// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.exo.prefetch;

import bdc;
import bde;
import cvu;
import glt;
import java.io.IOException;
import java.io.InputStream;

public final class SegmentCacheDataSource
    implements bdc
{

    private final glt a;
    private InputStream b;
    private long c;
    private boolean d;
    private cvu e;

    public SegmentCacheDataSource(glt glt1)
    {
        this(glt1, (byte)0);
    }

    private SegmentCacheDataSource(glt glt1, byte byte0)
    {
        a = glt1;
    }

    public final int a(byte abyte0[], int i, int j)
    {
        if (c == 0L)
        {
            return -1;
        }
        try
        {
            i = b.read(abyte0, i, (int)Math.min(c, j));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new DiskLruCacheDataSourceException(abyte0);
        }
        if (i > 0)
        {
            c = c - (long)i;
        }
        return i;
    }

    public final long a(bde bde1)
    {
        long l;
        e = a.d(bde1);
        b = e.a[0];
        if (bde1.d != -1L)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        l = (long)b.available() - bde1.c;
_L1:
        c = l;
        d = true;
        return c;
        try
        {
            l = bde1.d;
        }
        // Misplaced declaration of an exception variable
        catch (bde bde1)
        {
            throw new DiskLruCacheDataSourceException(bde1);
        }
          goto _L1
    }

    public final void b()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        b.close();
        b = null;
        if (d)
        {
            d = false;
        }
        if (e != null)
        {
            e.close();
        }
        return;
        Object obj;
        obj;
        throw new DiskLruCacheDataSourceException(((IOException) (obj)));
        obj;
        b = null;
        if (d)
        {
            d = false;
        }
        throw obj;
    }

    private class DiskLruCacheDataSourceException extends IOException
    {

        public static final long serialVersionUID = 0x6656991fe5L;

        public DiskLruCacheDataSourceException(IOException ioexception)
        {
            super(ioexception);
        }
    }

}
