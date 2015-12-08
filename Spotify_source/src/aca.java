// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aca
{

    public final hc a = new hc();
    public final hg b = new hg();

    public aca()
    {
    }

    public final void a()
    {
        a.clear();
        hg hg1 = b;
        int j = hg1.e;
        Object aobj[] = hg1.d;
        for (int i = 0; i < j; i++)
        {
            aobj[i] = null;
        }

        hg1.e = 0;
        hg1.b = false;
    }

    public final void a(long l, abo abo)
    {
        hg hg1 = b;
        int i = hd.a(hg1.c, hg1.e, l);
        if (i >= 0)
        {
            hg1.d[i] = abo;
            return;
        }
        int j = ~i;
        if (j < hg1.e && hg1.d[j] == hg.a)
        {
            hg1.c[j] = l;
            hg1.d[j] = abo;
            return;
        }
        i = j;
        if (hg1.b)
        {
            i = j;
            if (hg1.e >= hg1.c.length)
            {
                hg1.a();
                i = ~hd.a(hg1.c, hg1.e, l);
            }
        }
        if (hg1.e >= hg1.c.length)
        {
            int k = hd.b(hg1.e + 1);
            long al[] = new long[k];
            Object aobj[] = new Object[k];
            System.arraycopy(hg1.c, 0, al, 0, hg1.c.length);
            System.arraycopy(((Object) (hg1.d)), 0, ((Object) (aobj)), 0, hg1.d.length);
            hg1.c = al;
            hg1.d = aobj;
        }
        if (hg1.e - i != 0)
        {
            System.arraycopy(hg1.c, i, hg1.c, i + 1, hg1.e - i);
            System.arraycopy(((Object) (hg1.d)), i, ((Object) (hg1.d)), i + 1, hg1.e - i);
        }
        hg1.c[i] = l;
        hg1.d[i] = abo;
        hg1.e = hg1.e + 1;
    }

    final void a(abo abo)
    {
        acb acb2 = (acb)a.get(abo);
        acb acb1 = acb2;
        if (acb2 == null)
        {
            acb1 = acb.a();
            a.put(abo, acb1);
        }
        acb1.a = acb1.a | 1;
    }

    public final void a(abo abo, aba aba)
    {
        acb acb2 = (acb)a.get(abo);
        acb acb1 = acb2;
        if (acb2 == null)
        {
            acb1 = acb.a();
            a.put(abo, acb1);
        }
        acb1.b = aba;
        acb1.a = acb1.a | 4;
    }

    final void b(abo abo)
    {
        abo = (acb)a.get(abo);
        if (abo == null)
        {
            return;
        } else
        {
            abo.a = ((acb) (abo)).a & -2;
            return;
        }
    }

    final void c(abo abo)
    {
        int i = b.b() - 1;
        do
        {
label0:
            {
                if (i >= 0)
                {
                    if (abo != b.a(i))
                    {
                        break label0;
                    }
                    hg hg1 = b;
                    if (hg1.d[i] != hg.a)
                    {
                        hg1.d[i] = hg.a;
                        hg1.b = true;
                    }
                }
                abo = (acb)a.remove(abo);
                if (abo != null)
                {
                    acb.a(abo);
                }
                return;
            }
            i--;
        } while (true);
    }
}
