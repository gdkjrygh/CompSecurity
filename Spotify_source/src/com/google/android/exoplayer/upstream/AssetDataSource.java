// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import bde;
import bdn;
import bdo;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class AssetDataSource
    implements bdo
{

    private final AssetManager a;
    private final bdn b;
    private String c;
    private InputStream d;
    private long e;
    private boolean f;

    public AssetDataSource(Context context, bdn bdn1)
    {
        a = context.getAssets();
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

    public final long a(bde bde1)
    {
        String s1;
        c = bde1.a.toString();
        s1 = bde1.a.getPath();
        if (!s1.startsWith("/android_asset/")) goto _L2; else goto _L1
_L1:
        String s = s1.substring(15);
_L4:
        c = bde1.a.toString();
        d = a.open(s, 1);
        if (d.skip(bde1.c) < bde1.c)
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
        if (bde1.d == -1L) goto _L6; else goto _L5
_L5:
        e = bde1.d;
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
        catch (bde bde1)
        {
            throw new AssetDataSourceException(bde1);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final String a()
    {
        return c;
    }

    public final void b()
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

    private class AssetDataSourceException extends IOException
    {

        public AssetDataSourceException(IOException ioexception)
        {
            super(ioexception);
        }
    }

}
