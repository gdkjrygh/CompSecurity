// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            UriDataSource, TransferListener, DataSpec

public final class AssetDataSource
    implements UriDataSource
{

    private final AssetManager a;
    private final TransferListener b;
    private String c;
    private InputStream d;
    private long e;
    private boolean f;

    public AssetDataSource(Context context, TransferListener transferlistener)
    {
        a = context.getAssets();
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
                throw new AssetDataSourceException(abyte0);
            }
            j = (int)l;
        }
        j = d.read(abyte0, i, j);
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
        String s1;
        c = dataspec.a.toString();
        s1 = dataspec.a.getPath();
        if (!s1.startsWith("/android_asset/")) goto _L2; else goto _L1
_L1:
        String s = s1.substring(15);
_L4:
        c = dataspec.a.toString();
        d = a.open(s, 1);
        if (d.skip(dataspec.d) < dataspec.d)
        {
            throw new EOFException();
        }
        break MISSING_BLOCK_LABEL_116;
_L2:
        s = s1;
        if (!s1.startsWith("/")) goto _L4; else goto _L3
_L3:
        s = s1.substring(1);
          goto _L4
        if (dataspec.e == -1L) goto _L6; else goto _L5
_L5:
        e = dataspec.e;
_L8:
        f = true;
        if (b != null)
        {
            b.b();
        }
        return e;
_L6:
        try
        {
            e = d.available();
            if (e == 0x7fffffffL)
            {
                e = -1L;
            }
        }
        // Misplaced declaration of an exception variable
        catch (DataSpec dataspec)
        {
            throw new AssetDataSourceException(dataspec);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a()
    {
        c = null;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        d.close();
        d = null;
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
        throw new AssetDataSourceException(((IOException) (obj)));
        obj;
        d = null;
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
        return c;
    }

    private class AssetDataSourceException extends IOException
    {

        public AssetDataSourceException(IOException ioexception)
        {
            super(ioexception);
        }
    }

}
