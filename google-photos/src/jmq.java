// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class jmq
    implements jmr
{

    private final ContentResolver a;
    private final k b;
    private InputStream c;
    private long d;
    private boolean e;

    public jmq(Context context, k k)
    {
        a = context.getContentResolver();
        b = k;
    }

    public final int a(byte abyte0[], int i, int j)
    {
        if (d != 0L) goto _L2; else goto _L1
_L1:
        i = -1;
_L4:
        return i;
_L2:
        if (d != -1L)
        {
            long l;
            try
            {
                l = Math.min(d, j);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new jjj(abyte0);
            }
            j = (int)l;
        }
        j = c.read(abyte0, i, j);
        i = j;
        if (j > 0)
        {
            i = j;
            if (d != -1L)
            {
                d = d - (long)j;
                return j;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final long a(jms jms1)
    {
        try
        {
            jms1.a.toString();
            c = new FileInputStream(a.openAssetFileDescriptor(jms1.a, "r").getFileDescriptor());
            if (c.skip(jms1.c) < jms1.c)
            {
                throw new EOFException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (jms jms1)
        {
            throw new jjj(jms1);
        }
        if (jms1.d == -1L)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        d = jms1.d;
_L1:
        e = true;
        return d;
        d = c.available();
        if (d == 0L)
        {
            d = -1L;
        }
          goto _L1
    }

    public final void a()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        c.close();
        c = null;
        if (e)
        {
            e = false;
            if (b == null);
        }
        return;
        Object obj;
        obj;
        throw new jjj(((IOException) (obj)));
        obj;
        c = null;
        if (e)
        {
            e = false;
        }
        throw obj;
    }
}
