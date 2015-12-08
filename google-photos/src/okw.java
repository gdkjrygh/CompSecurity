// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class okw
    implements okj
{

    private final okj a;
    private final okj b;
    private final int c;

    public okw(okj okj1, okj okj2)
    {
        a = (okj)p.b(okj1, "firstChunkStore cannot be null");
        b = (okj)p.b(okj2, "restChunkStore cannot be null");
        boolean flag;
        if (okj1.a() == okj2.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "firstChunkStore and restChunkStore must use the same chunk size");
        c = okj1.a();
    }

    public final int a()
    {
        return c;
    }

    public final long a(String s)
    {
        long l = a.a(s);
        if (l != -1L)
        {
            return l;
        } else
        {
            return b.a(s);
        }
    }

    public final void a(String s, int i, byte abyte0[])
    {
        if (i == 0)
        {
            a.a(s, i, abyte0);
            return;
        } else
        {
            b.a(s, i, abyte0);
            return;
        }
    }

    public final void a(String s, int i, byte abyte0[], long l)
    {
        if (i == 0)
        {
            a.a(s, i, abyte0, l);
            return;
        } else
        {
            b.a(s, i, abyte0, l);
            return;
        }
    }

    public final boolean a(String s, int i)
    {
        if (i == 0)
        {
            return a.a(s, i);
        } else
        {
            return b.a(s, i);
        }
    }

    public final int b(String s, int i, byte abyte0[])
    {
        if (i == 0)
        {
            return a.b(s, i, abyte0);
        }
        long l = a.a(s);
        if (l != -1L && l <= (long)c)
        {
            return -1;
        } else
        {
            return b.b(s, i, abyte0);
        }
    }

    public final void b()
    {
        a.b();
        b.b();
    }

    public final void b(String s)
    {
        a.b(s);
        b.b(s);
    }
}
