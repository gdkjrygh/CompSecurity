// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import java.util.List;

public abstract class aen
{

    public final aeo a = new aeo();
    public boolean b;

    public aen()
    {
        b = false;
    }

    public abstract int a();

    public int a(int i)
    {
        return 0;
    }

    public abstract afn a(ViewGroup viewgroup, int i);

    public final void a(aep aep)
    {
        a.registerObserver(aep);
    }

    public abstract void a(afn afn1, int i);

    public long b(int i)
    {
        return -1L;
    }

    public final afn b(ViewGroup viewgroup, int i)
    {
        b.a("RV CreateView");
        viewgroup = a(viewgroup, i);
        viewgroup.e = i;
        b.a();
        return viewgroup;
    }

    public final void b(aep aep)
    {
        a.unregisterObserver(aep);
    }

    public final void b(afn afn1, int i)
    {
        afn1.b = i;
        if (b)
        {
            afn1.d = b(i);
        }
        afn1.a(1, 519);
        b.a("RV OnBindView");
        List list;
        if ((afn1.i & 0x400) == 0)
        {
            if (afn1.k == null || afn1.k.size() == 0)
            {
                list = afn.j;
            } else
            {
                list = afn1.l;
            }
        } else
        {
            list = afn.j;
        }
        a(afn1, i);
        afn1.q();
        b.a();
    }

    public final void c(int i)
    {
        a.a(i, 1, null);
    }

    public final void d(int i)
    {
        a.b(i, 1);
    }
}
