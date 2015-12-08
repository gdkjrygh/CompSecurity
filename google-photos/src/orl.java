// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class orl
    implements orm
{

    float a;
    private final orn b;
    private final orn c;
    private final orn d;
    private final float e;
    private final float f;
    private final float g;
    private float h;
    private float i;
    private float j;
    private ork k;

    public orl(ork ork1, orn orn1, orn orn2, orn orn3)
    {
        k = ork1;
        super();
        a = 0.0F;
        b = orn1;
        c = orn2;
        d = orn3;
        e = orn1.a(orn2.a);
        f = orn1.a(orn2.b);
        g = (float)(orn2.c / orn1.c);
        a(a);
    }

    public final float a(long l)
    {
        if (ork.b(k))
        {
            return d.a(l);
        }
        if (l < c.a)
        {
            return b.a(l) - (e - h);
        }
        if (l > c.b)
        {
            return b.a(l) + (i - f);
        } else
        {
            return h + j * c.a(l);
        }
    }

    public final void a(float f1)
    {
        a = f1;
        h = (float)ork.a(e, 0.0D, f1);
        i = (float)ork.a(f, 1.0D, f1);
        j = (float)ork.a(g, 1.0D, f1);
        ork.a(k);
    }

    public final long b(float f1)
    {
        if (ork.b(k))
        {
            return d.b(f1);
        }
        if (f1 < h)
        {
            return b.b((e - h) + f1);
        }
        if (f1 > i)
        {
            return b.b(f1 - (i - f));
        } else
        {
            return c.b((f1 - h) / j);
        }
    }

    public final long c(float f1)
    {
        return d.c(f1);
    }
}
