// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c.a.a;


// Referenced classes of package c.a.a:
//            j

public final class g
{

    public static final g a = new g();
    public static final g b = new g(-1);
    public static final g c = new g(2);
    private boolean d;
    private boolean e;
    private boolean f;
    private j.f g;
    private j.f h;
    private j.g i;

    public g()
    {
        this(0);
    }

    private g(int k)
    {
        boolean flag1 = true;
        super();
        Object obj;
        boolean flag;
        if ((k & 1) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if ((k & 4) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if ((k & 2) == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        e = flag;
        if ((k & 8) > 0)
        {
            obj = j.c;
        } else
        {
            obj = j.a;
        }
        if (f)
        {
            h = j.b;
        } else
        {
            h = ((j.f) (obj));
        }
        if (d)
        {
            g = j.b;
        } else
        {
            g = ((j.f) (obj));
        }
        if (e)
        {
            i = j.e;
            return;
        } else
        {
            i = j.d;
            return;
        }
    }

    public final void a(String s, Appendable appendable)
    {
        i.a(s, appendable);
    }

    public final boolean a(String s)
    {
        return g.a(s);
    }

    public final boolean b(String s)
    {
        return h.a(s);
    }

}
