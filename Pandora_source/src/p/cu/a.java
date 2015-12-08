// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cu;

import android.util.Log;
import p.cv.c;
import p.cv.e;

// Referenced classes of package p.cu:
//            b, d, c

public class a extends b
{

    private p.cv.a d;

    protected a(p.cv.a a1, d d1)
        throws p.ax.a
    {
        super(a1, d1);
        d = null;
        d = a1;
        d.a(new p.cv.d.b() {

            final a a;

            public void a(p.cu.c c1)
            {
                a.b(c1);
            }

            public boolean a()
            {
                return a.b();
            }

            
            {
                a = a.this;
                super();
            }
        });
    }

    public a(e e)
        throws p.ax.a
    {
        this(new p.cv.a(e), new d());
    }

    public void a()
    {
        Log.d("AppLink", "Disposing of everything");
        if (d != null)
        {
            d.a();
        }
        super.a();
    }

    public void a(p.bd.e e)
    {
        a(new p.cu.c(e, null, false));
    }

    public void a(p.bd.e e, c c1)
    {
        a(new p.cu.c(e, c1, false));
    }

    public void a(p.bd.e e, c c1, boolean flag)
    {
        a(new p.cu.c(e, c1, flag));
    }

    public void a(p.bd.e e, boolean flag)
    {
        a(new p.cu.c(e, null, flag));
    }

    protected void a(p.cu.c c1)
    {
        if (!b())
        {
            return;
        } else
        {
            d.a(c1);
            return;
        }
    }

    public void b(p.bd.e e)
    {
        b(new p.cu.c(e, null));
    }

    public void b(p.bd.e e, c c1)
    {
        b(new p.cu.c(e, c1));
    }

    protected void b(p.cu.c c1)
    {
        if (c1 != null)
        {
            p.bd.e e = c1.a();
            if (d.a(e))
            {
                super.a(c1);
            }
        }
    }
}
