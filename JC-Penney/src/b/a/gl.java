// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            nh, ot, go, hj, 
//            nj, pr, pf, gn, 
//            kw, pe, no, ow

public abstract class gl
{

    int c;
    final gn d;
    final no e;
    public final nj f;

    public gl(gn gn1, no no, nj nj1)
    {
        if (gn1 == null)
        {
            throw new NullPointerException("opcode == null");
        }
        if (no == null)
        {
            throw new NullPointerException("position == null");
        }
        if (nj1 == null)
        {
            throw new NullPointerException("registers == null");
        } else
        {
            c = -1;
            d = gn1;
            e = no;
            f = nj1;
            return;
        }
    }

    public static hj a(no no, nh nh1, nh nh2)
    {
        boolean flag = true;
        gn gn1;
        int i;
        boolean flag1;
        if (nh1.i() != 1)
        {
            flag = false;
        }
        flag1 = nh1.b().i();
        i = nh1.e();
        if ((nh2.e() | i) < 16)
        {
            if (flag1)
            {
                gn1 = go.i;
            } else
            if (flag)
            {
                gn1 = go.c;
            } else
            {
                gn1 = go.f;
            }
        } else
        if (i < 256)
        {
            if (flag1)
            {
                gn1 = go.j;
            } else
            if (flag)
            {
                gn1 = go.d;
            } else
            {
                gn1 = go.g;
            }
        } else
        if (flag1)
        {
            gn1 = go.k;
        } else
        if (flag)
        {
            gn1 = go.e;
        } else
        {
            gn1 = go.h;
        }
        return new hj(gn1, no, nj.a(nh1, nh2));
    }

    public abstract gl a(gn gn1);

    public abstract gl a(nj nj1);

    protected abstract String a();

    public final String a(String s, int i)
    {
        String s1 = a(true);
        if (s1 == null)
        {
            return null;
        }
        s = (new StringBuilder()).append(s).append(e()).append(": ").toString();
        int j = s.length();
        if (i == 0)
        {
            i = s1.length();
        } else
        {
            i -= j;
        }
        return pr.a(s, j, "", s1, i);
    }

    protected abstract String a(boolean flag);

    public abstract void a(ow ow);

    public abstract gl c(int i);

    public final boolean c()
    {
        return c >= 0;
    }

    public final int d()
    {
        if (c < 0)
        {
            throw new RuntimeException("address not yet known");
        } else
        {
            return c;
        }
    }

    public final String e()
    {
        if (c != -1)
        {
            return String.format("%04x", new Object[] {
                Integer.valueOf(c)
            });
        } else
        {
            return pf.a(System.identityHashCode(this));
        }
    }

    public abstract int f();

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append(e());
        stringbuffer.append(' ');
        stringbuffer.append(e);
        stringbuffer.append(": ");
        stringbuffer.append(kw.a(d.a));
        boolean flag = false;
        if (((pe) (f)).K.length != 0)
        {
            stringbuffer.append(f.a(" ", ", ", null));
            flag = true;
        }
        String s = a();
        if (s != null)
        {
            if (flag)
            {
                stringbuffer.append(',');
            }
            stringbuffer.append(' ');
            stringbuffer.append(s);
        }
        return stringbuffer.toString();
    }
}
