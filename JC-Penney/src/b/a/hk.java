// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package b.a:
//            gc, mt, ph, nb, 
//            my, ov, gd, ot, 
//            op, gb, gh, pn, 
//            gg, nm, mu, nl, 
//            pe, gf

public final class hk
    implements gc
{

    private final nm a;
    private final int b[];
    private final gb c;

    public hk(nm nm1, int ai[], gb gb1)
    {
        if (nm1 == null)
        {
            throw new NullPointerException("method == null");
        }
        if (ai == null)
        {
            throw new NullPointerException("order == null");
        }
        if (gb1 == null)
        {
            throw new NullPointerException("addresses == null");
        } else
        {
            a = nm1;
            b = ai;
            c = gb1;
            return;
        }
    }

    private static gd a(mt mt1, gb gb1)
    {
        ph ph1 = mt1.c;
        int i = ph1.a();
        int k = mt1.d;
        mt1 = mt1.b.b().c();
        int l = mt1.a();
        if (l == 0)
        {
            return gd.a;
        }
        if (k == -1 && i != l || k != -1 && (i != l + 1 || k != ph1.a(l)))
        {
            throw new RuntimeException("shouldn't happen: weird successors list");
        }
        k = 0;
        gd gd1;
label0:
        do
        {
label1:
            {
                int j = l;
                if (k < l)
                {
                    if (!mt1.a(k).equals(ot.o))
                    {
                        break label1;
                    }
                    j = k + 1;
                }
                gd1 = new gd(j);
                for (k = 0; k < j; k++)
                {
                    op op1 = new op(mt1.a(k));
                    int i1 = ph1.a(k);
                    gd1.a(k, op1, gb1.a[i1].d());
                }

                break label0;
            }
            k++;
        } while (true);
        gd1.L = false;
        return gd1;
    }

    private static gg a(mt mt1, mt mt2, gd gd1, gb gb1)
    {
        mt1 = gb1.a(mt1);
        mt2 = gb1.b(mt2);
        return new gg(mt1.d(), mt2.d(), gd1);
    }

    public final gf a()
    {
        Object obj;
        Object obj1;
        Object obj2;
        int ai[];
        gb gb1;
        ArrayList arraylist;
        mu mu1;
        int i;
        int i1;
        obj2 = null;
        obj = a;
        ai = b;
        gb1 = c;
        i1 = ai.length;
        mu1 = ((nm) (obj)).a;
        arraylist = new ArrayList(i1);
        obj = gd.a;
        i = 0;
        obj1 = null;
_L8:
        if (i >= i1) goto _L2; else goto _L1
_L1:
        Object obj3;
        gd gd1;
        obj3 = mu1.b(ai[i]);
        boolean flag;
        if (((mt) (obj3)).b.b().b.b.a() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        gd1 = a(((mt) (obj3)), gb1);
        if (((pe) (obj)).K.length == 0) goto _L4; else goto _L3
_L3:
        if (!((gd) (obj)).equals(gd1)) goto _L6; else goto _L5
_L5:
        if (obj1 == null)
        {
            throw new NullPointerException("start == null");
        }
        if (obj3 == null)
        {
            throw new NullPointerException("end == null");
        }
        int k = gb1.a(((mt) (obj1))).d();
        if (gb1.b(((mt) (obj3))).d() - k <= 65535)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (!k) goto _L6; else goto _L7
_L7:
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
        obj2 = obj3;
_L9:
        i++;
        obj3 = obj1;
        obj1 = obj;
        obj = obj3;
          goto _L8
_L6:
        if (((pe) (obj)).K.length != 0)
        {
            arraylist.add(a(((mt) (obj1)), ((mt) (obj2)), ((gd) (obj)), gb1));
        }
_L4:
        obj = obj3;
        obj1 = gd1;
        obj2 = obj3;
          goto _L9
_L2:
        if (((pe) (obj)).K.length != 0)
        {
            arraylist.add(a(((mt) (obj1)), ((mt) (obj2)), ((gd) (obj)), gb1));
        }
        int l = arraylist.size();
        if (l == 0)
        {
            return gf.a;
        }
        obj = new gf(l);
        for (int j = 0; j < l; j++)
        {
            ((gf) (obj)).a(j, (gg)arraylist.get(j));
        }

        obj.L = false;
        return ((gf) (obj));
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L9
    }

    public final boolean b()
    {
        boolean flag1 = false;
        mu mu1 = a.a;
        int j = ((pe) (mu1)).K.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (mu1.a(i).b.b().c().a() == 0)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public final HashSet c()
    {
        HashSet hashset = new HashSet(20);
        mu mu1 = a.a;
        int k = ((pe) (mu1)).K.length;
        for (int i = 0; i < k; i++)
        {
            ov ov1 = mu1.a(i).b.b().c();
            int l = ov1.a();
            for (int j = 0; j < l; j++)
            {
                hashset.add(ov1.a(j));
            }

        }

        return hashset;
    }
}
