// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

final class iqp
{

    ArrayList a;
    ArrayList b;
    private final int c;
    private ArrayList d;
    private ArrayList e;

    public iqp(int i)
    {
        c = i;
        a = new ArrayList();
        b = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
    }

    private void b()
    {
        if (!e.isEmpty())
        {
            d.add(new iqo((ArrayList)e.clone()));
            e.clear();
        }
    }

    void a()
    {
        b();
        a.addAll(b);
        b.clear();
        a.addAll(d);
        d.clear();
    }

    public final void a(iqm iqm1)
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if (iqm1.c == 1)
        {
            if (iqm1.a.b != 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        if (flag)
        {
            b.add(new iqo(iqm1));
            return;
        }
        if (e.size() == c)
        {
            b();
        }
        e.add(iqm1);
    }
}
