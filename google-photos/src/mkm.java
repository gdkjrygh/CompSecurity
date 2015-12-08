// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CopyOnWriteArrayList;

public final class mkm
{

    public final mkd a = mkd.a();
    final CopyOnWriteArrayList b;
    final jz c = new jz(1);
    int d;
    public long e;
    public boolean f;
    public boolean g;
    public final mkf h = new mko(this);
    private final mkl i = new mkn(this);

    public transient mkm(mkk amkk[])
    {
        b = new CopyOnWriteArrayList(amkk);
        d = 1;
        for (int j = 0; j <= 0; j++)
        {
            amkk[0].a(i);
            c.put(amkk[0], Boolean.valueOf(true));
        }

    }

    public void a()
    {
        if (g || !f || d == 0)
        {
            return;
        } else
        {
            g = true;
            a.a(h);
            return;
        }
    }
}
