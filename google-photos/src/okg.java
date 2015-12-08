// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.IOException;

public final class okg
    implements oki
{

    private final String a;
    private final oki b;
    private final okj c;

    public okg(String s, oki oki1, okj okj1)
    {
        a = (String)p.b(s, "entityName cannot be null");
        b = (oki)p.b(oki1, "source cannot be null");
        c = (okj)p.b(okj1, "store cannot be null");
        boolean flag;
        if (oki1.a() == okj1.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "chunk size of store and the source must match");
    }

    public final int a()
    {
        return c.a();
    }

    public final int a(int i, byte abyte0[])
    {
        int l;
        boolean flag1 = true;
        int j = 0;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "chunkIndex must be non-negative");
        if (abyte0.length >= c.a())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "buffer must be at least chunkSizeBytes big");
        l = c.b(a, i, abyte0);
        if (l <= 0) goto _L2; else goto _L1
_L1:
        j = l;
_L4:
        return j;
_L2:
        if (l == -1) goto _L4; else goto _L3
_L3:
        int k = b.a(i, abyte0);
        IOException ioexception;
        if (k < c.a())
        {
            c.a(a, i, abyte0, c.a() * i + k);
        } else
        {
            c.a(a, i, abyte0);
        }
        return k;
        ioexception;
        Log.w("CachingChunkFetcher", "IOException when loading a chunk from cache", ioexception);
          goto _L3
    }

    public final boolean a(int i, int j)
    {
        for (int k = i; k < i + j; k++)
        {
            if (!c.a(a, k))
            {
                return b.a(k, j - (k - i));
            }
        }

        return true;
    }

    public final void b()
    {
        b.b();
    }

    public final void close()
    {
        c.b();
        p.a(b);
        return;
        Exception exception;
        exception;
        p.a(b);
        throw exception;
    }
}
