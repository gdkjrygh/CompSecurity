// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cv;

import p.bd.g;
import p.bg.ai;
import p.ct.e;
import p.cu.c;

// Referenced classes of package p.cv:
//            b, d, e, c

public class a extends b
{

    private e b;
    private d c;

    public a(p.cv.e e1)
    {
        this(e1, new d());
    }

    protected a(p.cv.e e1, d d1)
    {
        super(e1);
        b = null;
        c = null;
        c = d1;
    }

    public void a()
    {
        if (c != null)
        {
            c.c();
        }
        super.a();
    }

    protected void a(g g, p.cv.c c1)
    {
        if (c != null)
        {
            d.a a1 = c.b();
            try
            {
                a1.a();
            }
            catch (p.ax.a a2) { }
        }
        super.a(g, c1);
    }

    public void a(ai ai)
    {
        b = new e(ai);
        if (c != null)
        {
            c.a(b);
            c.a();
        }
        super.a(ai);
    }

    public void a(c c1)
    {
        if (c != null)
        {
            c.a(c1);
        }
    }

    public void a(d.b b1)
    {
        if (c != null)
        {
            c.a(b1);
        }
    }

    public boolean a(p.bd.e e1)
    {
        if (b != null)
        {
            return b.a(e1.a());
        } else
        {
            return false;
        }
    }
}
