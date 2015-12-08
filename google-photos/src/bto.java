// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public class bto extends bmb
{

    private final Object a;
    public Object b;
    private final List e = new ArrayList();
    private boolean f;

    public bto(bmb bmb1, Class class1)
    {
        super(bmb1);
        a = ddz.a(class1);
        b = a;
        f = false;
    }

    private void e(Object obj)
    {
        if (b != obj)
        {
            if (b != a)
            {
                a(b);
            }
            b = obj;
            if (b != a)
            {
                b(b);
            }
        }
    }

    public final void C_()
    {
        c.a(f, "Already suspended");
        e(a);
        f = false;
        super.C_();
    }

    public void a(Object obj)
    {
    }

    public void b(Object obj)
    {
    }

    public final boolean b()
    {
        return b != a;
    }

    public final void c(Object obj)
    {
        b.a(obj, "ui", null);
        boolean flag;
        if (!e.contains(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "UI already attached");
        e.add(obj);
        if (f)
        {
            e(obj);
        }
    }

    public final void d(Object obj)
    {
        b.a(obj, "ui", null);
        c.a(e.remove(obj), "UI not attached");
        if (f)
        {
            int i = e.size();
            if (i > 0)
            {
                obj = e.get(i - 1);
            } else
            {
                obj = a;
            }
            e(obj);
        }
    }

    public final void e()
    {
        super.e();
        int i;
        boolean flag;
        if (!f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "Already initialized");
        i = e.size();
        if (i > 0)
        {
            e(e.get(i - 1));
        }
        f = true;
    }
}
