// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.util.Locale;

public final class ckg extends ckk
{

    private cod c;
    private boolean d;

    public ckg(cjs cjs, cnq cnq1, int i)
    {
        super(cjs, ((cnq)b.a(cnq1, "clip", null)).e, i);
        c = cnq1.f;
    }

    public final cki a(ByteBuffer bytebuffer)
    {
        cki cki1 = super.a(bytebuffer);
        if (cki1 == null)
        {
            bytebuffer = null;
        } else
        {
            bytebuffer = cki1;
            if (f() >= c.c)
            {
                d = true;
                cki1.f = true;
                g();
                return cki1;
            }
        }
        return bytebuffer;
    }

    public final volatile Object a(Object obj)
    {
        return a((ByteBuffer)obj);
    }

    public final boolean a(long l)
    {
        b.b(l, "timestampUs");
        boolean flag;
        if (l >= c.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        super.a(ddl.a(l, c.b, c.c));
        return !d;
    }

    public final boolean a(cod cod1)
    {
        boolean flag;
        if (f() >= cod1.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = (cod)b.a(cod1, "interval", null);
        if (flag)
        {
            d = true;
            g();
        }
        return !flag;
    }

    public final void c()
    {
        super.c();
        a(c.b);
    }

    public final void d()
    {
        super.d();
        a(c.b);
    }

    public final boolean e()
    {
        return !d && super.e();
    }

    public final String toString()
    {
        return String.format(Locale.US, "%s from %d to %d", new Object[] {
            super.toString(), Long.valueOf(c.b), Long.valueOf(c.c)
        });
    }
}
