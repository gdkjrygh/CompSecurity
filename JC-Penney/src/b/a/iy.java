// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package b.a:
//            kg, ow, jl, op, 
//            jv, jk, jm, oz, 
//            kk, nr, oi, nu, 
//            ok, om, ot, nw, 
//            nx, ny, nz, oc, 
//            od, oj, on, oe, 
//            pn, nt, ji

public final class iy extends kg
{

    private final op a;
    private final ArrayList c;
    private final HashMap d;
    private final ArrayList e;
    private final ArrayList f;
    private final ArrayList g;
    private nt h;
    private byte i[];

    public iy(op op1)
    {
        super(1, -1);
        if (op1 == null)
        {
            throw new NullPointerException("thisClass == null");
        } else
        {
            a = op1;
            c = new ArrayList(20);
            d = new HashMap(40);
            e = new ArrayList(20);
            f = new ArrayList(20);
            g = new ArrayList(20);
            h = null;
            return;
        }
    }

    private static void a(ji ji, ow ow1, String s, ArrayList arraylist)
    {
        int l = arraylist.size();
        if (l != 0)
        {
            if (ow1.a())
            {
                ow1.a(0, (new StringBuilder("  ")).append(s).append(":").toString());
            }
            int j = 0;
            int k = 0;
            while (j < l) 
            {
                k = ((jl)arraylist.get(j)).a(ji, ow1, k, j);
                j++;
            }
        }
    }

    private static void a(ow ow1, String s, int j)
    {
        if (ow1.a())
        {
            ow1.a(String.format("  %-21s %08x", new Object[] {
                (new StringBuilder()).append(s).append("_size:").toString(), Integer.valueOf(j)
            }));
        }
        ow1.e(j);
    }

    private void b(ji ji, ow ow1)
    {
        boolean flag = ow1.a();
        if (flag)
        {
            ow1.a(0, (new StringBuilder()).append(f()).append(" class data for ").append(a.h_()).toString());
        }
        a(ow1, "static_fields", c.size());
        a(ow1, "instance_fields", e.size());
        a(ow1, "direct_methods", f.size());
        a(ow1, "virtual_methods", g.size());
        a(ji, ow1, "static_fields", c);
        a(ji, ow1, "instance_fields", e);
        a(ji, ow1, "direct_methods", f);
        a(ji, ow1, "virtual_methods", g);
        if (flag)
        {
            ow1.c();
        }
    }

    public final jv a()
    {
        return jv.l;
    }

    public final void a(ji ji)
    {
        if (!c.isEmpty())
        {
            c();
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((jk)iterator.next()).a(ji)) { }
        }
        if (!e.isEmpty())
        {
            Collections.sort(e);
            for (Iterator iterator1 = e.iterator(); iterator1.hasNext(); ((jk)iterator1.next()).a(ji)) { }
        }
        if (!f.isEmpty())
        {
            Collections.sort(f);
            for (Iterator iterator2 = f.iterator(); iterator2.hasNext(); ((jm)iterator2.next()).a(ji)) { }
        }
        if (!g.isEmpty())
        {
            Collections.sort(g);
            for (Iterator iterator3 = g.iterator(); iterator3.hasNext(); ((jm)iterator3.next()).a(ji)) { }
        }
    }

    public final void a(jk jk1)
    {
        if (jk1 == null)
        {
            throw new NullPointerException("field == null");
        } else
        {
            e.add(jk1);
            return;
        }
    }

    public final void a(jk jk1, nr nr1)
    {
        if (jk1 == null)
        {
            throw new NullPointerException("field == null");
        }
        if (h != null)
        {
            throw new UnsupportedOperationException("static fields already sorted");
        } else
        {
            c.add(jk1);
            d.put(jk1, nr1);
            return;
        }
    }

    public final void a(jm jm1)
    {
        if (jm1 == null)
        {
            throw new NullPointerException("method == null");
        } else
        {
            f.add(jm1);
            return;
        }
    }

    protected final void a(kk kk1, int j)
    {
        oz oz1 = new oz();
        b(kk1.a, oz1);
        i = oz1.e();
        a(i.length);
    }

    public final void a_(ji ji, ow ow1)
    {
        if (ow1.a())
        {
            b(ji, ow1);
            return;
        } else
        {
            ow1.a(i);
            return;
        }
    }

    public final void b(jm jm1)
    {
        if (jm1 == null)
        {
            throw new NullPointerException("method == null");
        } else
        {
            g.add(jm1);
            return;
        }
    }

    public final boolean b()
    {
        return c.isEmpty() && e.isEmpty() && f.isEmpty() && g.isEmpty();
    }

    public final nt c()
    {
        if (h != null || c.size() == 0) goto _L2; else goto _L1
_L1:
        int j;
        Collections.sort(c);
        j = c.size();
_L8:
        if (j <= 0) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = (jk)c.get(j - 1);
        obj = (nr)d.get(obj);
        if ((obj instanceof oi) ? ((oi)obj).h() != 0L : obj != null) goto _L4; else goto _L5
_L4:
        if (j != 0) goto _L7; else goto _L6
_L6:
        obj = null;
_L23:
        h = ((nt) (obj));
_L2:
        return h;
_L5:
        j--;
          goto _L8
_L7:
        nu nu1;
        int k;
        nu1 = new nu(j);
        k = 0;
_L22:
        jk jk1;
        if (k >= j)
        {
            break MISSING_BLOCK_LABEL_331;
        }
        jk1 = (jk)c.get(k);
        obj = (nr)d.get(jk1);
        if (obj != null) goto _L10; else goto _L9
_L9:
        obj = ((ok) (jk1.a)).b.d();
        ((ot) (obj)).c();
        JVM INSTR tableswitch 1 9: default 228
    //                   1 255
    //                   2 275
    //                   3 282
    //                   4 289
    //                   5 296
    //                   6 303
    //                   7 310
    //                   8 317
    //                   9 324;
           goto _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L20:
        break MISSING_BLOCK_LABEL_324;
_L13:
        break; /* Loop/switch isn't completed */
_L11:
        throw new UnsupportedOperationException((new StringBuilder("no zero for type: ")).append(((ot) (obj)).h_()).toString());
_L12:
        obj = nw.a;
_L10:
        nu1.a(k, ((nr) (obj)));
        k++;
        if (true) goto _L22; else goto _L21
_L21:
        obj = nx.a;
          goto _L10
_L14:
        obj = ny.a;
          goto _L10
_L15:
        obj = nz.a;
          goto _L10
_L16:
        obj = oc.a;
          goto _L10
_L17:
        obj = od.b;
          goto _L10
_L18:
        obj = oj.a;
          goto _L10
_L19:
        obj = on.a;
          goto _L10
        obj = oe.a;
          goto _L10
        nu1.L = false;
        obj = new nt(nu1);
          goto _L23
    }
}
