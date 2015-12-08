// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import ar.com.hjg.pngj.chunks.ag;
import java.io.InputStream;
import java.util.logging.Logger;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

// Referenced classes of package ar.com.hjg.pngj:
//            a, d, x, IImageLineSetFactory, 
//            l, y, k, j, 
//            f, m, r

public final class s
{

    public final m a;
    public final boolean b;
    protected d c;
    protected a d;
    protected final ag e;
    protected int f;
    CRC32 g;
    Adler32 h;
    protected k i;
    private IImageLineSetFactory j;

    public s(InputStream inputstream)
    {
        this(inputstream, (byte)0);
    }

    private s(InputStream inputstream, byte byte0)
    {
        f = -1;
        try
        {
            d = new a(inputstream);
            d.a();
            c = new d();
            d.c();
            if (!d.b(c))
            {
                throw new x("error reading first 21 bytes");
            }
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            d.b();
            if (c != null)
            {
                c.d();
            }
            throw inputstream;
        }
        a = c.g();
        boolean flag;
        if (c.h() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        c.k();
        c.i();
        c.j();
        e = new ag(c.e);
        j = new q._cls1();
        f = -1;
        return;
    }

    private k a(boolean flag, int i1)
    {
        return j.create(a, flag, i1, 0, 1);
    }

    private void a(int i1)
    {
        l l1 = c.f();
        int j1 = 0;
        do
        {
            do
            {
                for (; !c.f().c(); d.a(c)) { }
                c.f().a(new Checksum[] {
                    g, h
                });
                int j2 = l1.h.i;
                int k1;
                int i2;
                if ((j2 + 0) % 1 == 0)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                i2 = j1;
                if (k1 != 0)
                {
                    i.a(j2).a(l1.j(), l1.h.p, l1.h.g, l1.h.e);
                    i2 = j1 + 1;
                }
                l1.i();
                j1 = i2;
            } while (i2 < i1);
            j1 = i2;
        } while (!((f) (l1)).b.a());
        l1.e();
        k1 = 0;
        for (j1 = 0; k1 < i1; j1++)
        {
            i.a(j1);
            k1++;
        }

    }

    private void e()
    {
        while (c.d < 4) 
        {
            d.a(c);
        }
    }

    public final ag a()
    {
        if (c.e())
        {
            e();
        }
        return e;
    }

    public final j b()
    {
        j j1;
        int i1;
        i1 = f + 1;
        if (c.e())
        {
            e();
        }
        if (b)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        if (i == null)
        {
            i = a(true, 1);
        }
        j1 = i.a(i1);
        if (i1 != f) goto _L2; else goto _L1
_L1:
        return j1;
_L2:
        if (i1 < f)
        {
            throw new x((new StringBuilder("rows must be read in increasing order: ")).append(i1).toString());
        }
        continue;
        while (f < i1) 
        {
            while (!c.f().c()) 
            {
                d.a(c);
            }
            f = f + 1;
            c.f().a(new Checksum[] {
                g, h
            });
            if (f == i1)
            {
                j1.a(c.f().j(), a.k + 1, 0, 1);
            }
            c.f().i();
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (true) goto _L1; else goto _L4
_L4:
        if (i == null)
        {
            i = a(false, a.b);
            a(a.b);
        }
        f = i1;
        return i.a(i1);
    }

    public final void c()
    {
        try
        {
            if (c != null)
            {
                c.d();
            }
        }
        catch (Exception exception)
        {
            r.a.warning((new StringBuilder("error closing chunk sequence:")).append(exception.getMessage()).toString());
        }
        if (d != null)
        {
            d.b();
        }
    }

    public final void d()
    {
        c.l();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a.toString()).append(" interlaced=").append(b).toString();
    }
}
