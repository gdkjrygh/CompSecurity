// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class jmp
    implements jmr
{

    private final AssetManager a;
    private final k b;
    private InputStream c;
    private long d;
    private boolean e;

    public jmp(Context context, k k)
    {
        a = context.getAssets();
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
                throw new avz(abyte0);
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
        String s1;
        jms1.a.toString();
        s1 = jms1.a.getPath();
        if (!s1.startsWith("/android_asset/")) goto _L2; else goto _L1
_L1:
        String s = s1.substring(15);
_L4:
        jms1.a.toString();
        c = a.open(s, 1);
        if (c.skip(jms1.c) < jms1.c)
        {
            throw new EOFException();
        }
        break MISSING_BLOCK_LABEL_110;
_L2:
        s = s1;
        if (!s1.startsWith("/")) goto _L4; else goto _L3
_L3:
        s = s1.substring(1);
          goto _L4
        if (jms1.d == -1L) goto _L6; else goto _L5
_L5:
        d = jms1.d;
_L8:
        e = true;
        return d;
_L6:
        try
        {
            d = c.available();
            if (d == 0x7fffffffL)
            {
                d = -1L;
            }
        }
        // Misplaced declaration of an exception variable
        catch (jms jms1)
        {
            throw new avz(jms1);
        }
        if (true) goto _L8; else goto _L7
_L7:
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
        throw new avz(((IOException) (obj)));
        obj;
        c = null;
        if (e)
        {
            e = false;
        }
        throw obj;
    }
}
