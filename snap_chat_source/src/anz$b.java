// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class d
{

    final char a;
    final int b;
    final int c;
    final int d;
    private int e;
    private boolean f;

    private long d(alr alr1, long l)
    {
        if (e >= 0)
        {
            return alr1.u().b(l, e);
        } else
        {
            l = alr1.u().b(l, 1);
            l = alr1.C().a(l, 1);
            return alr1.u().a(l, e);
        }
    }

    final long a(alr alr1, long l)
    {
        long l1;
        try
        {
            l1 = d(alr1, l);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (b == 2 && e == 29)
            {
                for (; !alr1.E().b(l); l = alr1.E().a(l, 1)) { }
                return d(alr1, l);
            } else
            {
                throw illegalargumentexception;
            }
        }
        return l1;
    }

    final long b(alr alr1, long l)
    {
        long l1;
        try
        {
            l1 = d(alr1, l);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (b == 2 && e == 29)
            {
                for (; !alr1.E().b(l); l = alr1.E().a(l, -1)) { }
                return d(alr1, l);
            } else
            {
                throw illegalargumentexception;
            }
        }
        return l1;
    }

    final long c(alr alr1, long l)
    {
        int k;
        long l1;
        int i = alr1.t().a(l);
        k = c - i;
        l1 = l;
        if (k == 0) goto _L2; else goto _L1
_L1:
        if (!f) goto _L4; else goto _L3
_L3:
        int j;
        j = k;
        if (k < 0)
        {
            j = k + 7;
        }
_L6:
        l1 = alr1.t().a(l, j);
_L2:
        return l1;
_L4:
        j = k;
        if (k > 0)
        {
            j = k - 7;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof )
            {
                if (a != ((a) (obj = (a)obj)).a || b != ((b) (obj)).b || e != ((e) (obj)).e || c != ((c) (obj)).c || f != ((f) (obj)).f || d != ((d) (obj)).d)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    (char c1, int i, int j, int k, boolean flag, int l)
    {
        if (c1 != 'u' && c1 != 'w' && c1 != 's')
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown mode: ")).append(c1).toString());
        } else
        {
            a = c1;
            b = i;
            e = j;
            c = k;
            f = flag;
            d = l;
            return;
        }
    }
}
