// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class azw
    implements bbz, bce
{

    private final bbx a;
    private boolean b;
    private azx c;
    private boolean d;

    public azw(bbx bbx1)
    {
        a = bbx1;
    }

    public final int a(bby bby)
    {
        boolean flag = true;
        int i = a.a(bby);
        if (i == 1)
        {
            flag = false;
        }
        bds.b(flag);
        return i;
    }

    public final int a(bby bby, int i, boolean flag)
    {
        return c.a(bby, i, flag);
    }

    public final bce a()
    {
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        d = true;
        return this;
    }

    public final void a(long l, int i, int j, int k, byte abyte0[])
    {
        c.a(l, i, j, k, abyte0);
    }

    public final void a(azi azi)
    {
        c.a(azi);
    }

    public final void a(azx azx1)
    {
        c = azx1;
        if (!b)
        {
            a.a(this);
            b = true;
            return;
        } else
        {
            a.a();
            return;
        }
    }

    public final void a(bbj bbj)
    {
        c.a(bbj);
    }

    public final void a(bcd bcd)
    {
        c.a(bcd);
    }

    public final void a(bec bec, int i)
    {
        c.a(bec, i);
    }

    public final void b()
    {
        bds.b(d);
    }
}
