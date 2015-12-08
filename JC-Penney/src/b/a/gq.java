// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            hm, pe, no, nh, 
//            gl, hj, nj, ow

public final class gq extends hm
{

    private hj a[];

    public gq(no no1, nj nj1)
    {
        super(no1, nj1);
        if (((pe) (nj1)).K.length == 0)
        {
            throw new IllegalArgumentException("registers.size() == 0");
        } else
        {
            a = null;
            return;
        }
    }

    private static hj a(nh nh1, int i)
    {
        return gl.a(no.a, nh.a(i, nh1.b()), nh1);
    }

    private void b()
    {
        int j = 0;
        if (a == null)
        {
            nj nj1 = super.f;
            int k = ((pe) (nj1)).K.length;
            a = new hj[k];
            int i = 0;
            while (i < k) 
            {
                nh nh1 = nj1.b(i);
                a[i] = a(nh1, j);
                j += nh1.i();
                i++;
            }
        }
    }

    public final gl a(nj nj1)
    {
        return new gq(super.e, nj1);
    }

    protected final String a()
    {
        return null;
    }

    protected final String a(boolean flag)
    {
        int j = 0;
        nj nj1 = super.f;
        int k = ((pe) (nj1)).K.length;
        StringBuffer stringbuffer = new StringBuffer(100);
        for (int i = 0; i < k; i++)
        {
            nh nh1 = nj1.b(i);
            hj hj1 = a(nh1, j);
            if (i != 0)
            {
                stringbuffer.append('\n');
            }
            stringbuffer.append(hj1.a(flag));
            j += nh1.i();
        }

        return stringbuffer.toString();
    }

    public final void a(ow ow)
    {
        b();
        hj ahj[] = a;
        int j = ahj.length;
        for (int i = 0; i < j; i++)
        {
            ahj[i].a(ow);
        }

    }

    public final int f()
    {
        int i = 0;
        b();
        hj ahj[] = a;
        int k = ahj.length;
        int j = 0;
        for (; i < k; i++)
        {
            j += ahj[i].f();
        }

        return j;
    }
}
