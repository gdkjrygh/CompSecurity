// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mjp
    implements ann, ano
{

    private final ann a;
    private final int b;
    private final int c;
    private final ani d;
    private final mjn e;
    private boolean f;
    private ano g;
    private amb h;
    private volatile boolean i;
    private mjo j;

    mjp(mjo mjo1, ann ann1, mjn mjn, int k, int l, ani ani)
    {
        j = mjo1;
        super();
        a = ann1;
        b = k;
        c = l;
        d = ani;
        e = mjn;
    }

    public final void a()
    {
        a.a();
    }

    public final void a(amb amb, ano ano1)
    {
        h = amb;
        g = ano1;
        a.a(amb, this);
    }

    public final void a(Exception exception)
    {
        if (!i && !f)
        {
            boolean flag;
            if (exception instanceof and)
            {
                if (403 == ((and)exception).a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            if (flag)
            {
                f = true;
                b.a(j.b, "Argument must not be null");
                j.b.b(e);
                Object obj = j.a(e, b, c);
                obj = j.a.a(obj, b, c, d);
                if (obj == null)
                {
                    a(exception);
                    return;
                } else
                {
                    ((atn) (obj)).c.a(h, this);
                    return;
                }
            }
        }
        g.a(exception);
    }

    public final void a(Object obj)
    {
        g.a(obj);
    }

    public final void b()
    {
        i = true;
        a.b();
    }

    public final amz c()
    {
        return a.c();
    }

    public final Class d()
    {
        return a.d();
    }
}
