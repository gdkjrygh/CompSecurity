// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            UriDataSource, TransferListener, DataSpec

public final class ContentDataSource
    implements UriDataSource
{

    private final ContentResolver a;
    private final TransferListener b;
    private InputStream c;
    private String d;
    private long e;
    private boolean f;

    public ContentDataSource(Context context, TransferListener transferlistener)
    {
        a = context.getContentResolver();
        b = transferlistener;
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

    public final long a(DataSpec dataspec)
    {
        try
        {
            d = dataspec.a.toString();
            c = new FileInputStream(a.openAssetFileDescriptor(dataspec.a, "r").getFileDescriptor());
            if (c.skip(dataspec.d) < dataspec.d)
            {
                throw new EOFException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (DataSpec dataspec)
        {
            throw new ContentDataSourceException(dataspec);
        }
        if (dataspec.e == -1L)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        e = dataspec.e;
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

    public final void a()
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

    public final String b()
    {
        return d;
    }

    private class ContentDataSourceException extends IOException
    {

        public ContentDataSourceException(IOException ioexception)
        {
            super(ioexception);
        }
    }

}
