// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ar.com.hjg.pngj:
//            k, m, j, IImageLineSetFactory, 
//            p

public abstract class q
    implements k
{

    protected final m a;
    protected List b;
    protected j c;
    protected int d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;

    public q(m m1, boolean flag)
    {
        d = -1;
        a = m1;
        e = flag;
        if (flag)
        {
            f = 1;
            g = 0;
            h = 1;
        } else
        {
            f = m1.b;
            g = 0;
            h = 1;
        }
        b();
    }

    private void b()
    {
        if (e)
        {
            c = a();
        } else
        {
            b = new ArrayList();
            int i = 0;
            while (i < f) 
            {
                b.add(a());
                i++;
            }
        }
    }

    protected abstract j a();

    public final j a(int i)
    {
        d = i;
        if (e)
        {
            return c;
        }
        List list = b;
        i -= g;
        if (i >= 0 && i % h == 0)
        {
            i /= h;
        } else
        {
            i = -1;
        }
        if (i >= f)
        {
            i = -1;
        }
        return (j)list.get(i);
    }

    // Unreferenced inner class ar/com/hjg/pngj/q$1

/* anonymous class */
    static final class _cls1
        implements IImageLineSetFactory
    {

        public final k create(m m1, boolean flag, int i, int l, int i1)
        {
            return new q(this, m1, flag) {

                final _cls1 e;

                protected final j a()
                {
                    return new p(a);
                }

            
            {
                e = _pcls1;
                super(m1, flag);
            }
            };
        }

    }

}
