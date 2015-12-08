// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class okh
    implements okf
{

    private final oki a;
    private final int b;
    private int c;
    private final ByteBuffer d;
    private int e;

    public okh(oki oki1)
    {
        a = (oki)p.b(oki1, "chunkSource cannot be null");
        b = oki1.a();
        d = ByteBuffer.allocate(b);
        c = -1;
    }

    public final int a(long l, ByteBuffer bytebuffer)
    {
        int i;
        int j;
        int k;
        i = 0;
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "startOffset must be non-negative");
        p.b(bytebuffer, "buffer must not be null");
_L8:
        if (!bytebuffer.hasRemaining()) goto _L2; else goto _L1
_L1:
        j = (int)(l / (long)b);
        if (j == c) goto _L4; else goto _L3
_L3:
        k = a.a(j, d.array());
        if (k != 0) goto _L5; else goto _L2
_L2:
        return i;
_L5:
        c = j;
        e = k;
_L4:
        j = (int)(l % (long)b);
        k = e - j;
        if (e < b && k <= 0) goto _L2; else goto _L6
_L6:
        k = Math.min(k, bytebuffer.remaining());
        d.limit(j + k);
        d.position(j);
        bytebuffer.put(d);
        l += k;
        i += k;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a()
    {
        a.b();
    }

    public final boolean a(long l, long l1)
    {
        int j = (int)(l / (long)b);
        int i = j;
        if (c == j)
        {
            i = j + 1;
        }
        j = ((int)((l + l1) / (long)b) - i) + 1;
        if (j <= 0)
        {
            return true;
        } else
        {
            return a.a(i, j);
        }
    }

    public final void close()
    {
        p.a(a);
    }
}
