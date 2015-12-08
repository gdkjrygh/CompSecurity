// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package b.a:
//            ol, oz, gx, pe, 
//            gv, gw, he, oo, 
//            op, ow, no, ji, 
//            ko, kq, or, os, 
//            ot, jf, hd, je, 
//            pd

public final class jd
{

    ow a;
    PrintWriter b;
    String c;
    boolean d;
    private final hd e;
    private final gv f;
    private final oz g = new oz();
    private final ji h;
    private final int i;
    private final int j;
    private final or k;
    private final boolean l;
    private int m;
    private int n;
    private final gx o[];

    public jd(hd hd1, gv gv1, ji ji1, int i1, int j1, boolean flag, ol ol1)
    {
        m = 0;
        n = 1;
        e = hd1;
        f = gv1;
        h = ji1;
        k = ol1.f();
        l = flag;
        i = i1;
        j = j1;
        o = new gx[j1];
    }

    private int a(int i1)
    {
        for (int k1 = ((pe) (f)).K.length; i1 < k1 && f.a(i1).a() == m;)
        {
            Object obj = f;
            int j1 = i1 + 1;
            obj = ((gv) (obj)).a(i1);
            i1 = ((gx) (obj)).g();
            gx gx1 = o[i1];
            if (obj != gx1)
            {
                o[i1] = ((gx) (obj));
                if (((gx) (obj)).c())
                {
                    if (gx1 != null && ((gx) (obj)).a(gx1))
                    {
                        if (gx1.c())
                        {
                            throw new RuntimeException("shouldn't happen");
                        }
                        i1 = g.b;
                        g.b(6);
                        d(((gx) (obj)).g());
                        if (a != null || b != null)
                        {
                            a(g.b - i1, String.format("%04x: +local restart %s", new Object[] {
                                Integer.valueOf(m), a(((gx) (obj)))
                            }));
                        }
                        i1 = j1;
                    } else
                    if (((gx) (obj)).e() != null)
                    {
                        b(((gx) (obj)));
                        i1 = j1;
                    } else
                    {
                        i1 = g.b;
                        g.b(3);
                        d(((gx) (obj)).g());
                        a(((gx) (obj)).d());
                        a(((gx) (obj)).f());
                        if (a != null || b != null)
                        {
                            a(g.b - i1, String.format("%04x: +local %s", new Object[] {
                                Integer.valueOf(m), a(((gx) (obj)))
                            }));
                        }
                        i1 = j1;
                    }
                } else
                {
                    if (((gx) (obj)).b() != gw.c)
                    {
                        i1 = g.b;
                        g.b(5);
                        g.e(((gx) (obj)).g());
                        if (a != null || b != null)
                        {
                            a(g.b - i1, String.format("%04x: -local %s", new Object[] {
                                Integer.valueOf(m), a(((gx) (obj)))
                            }));
                        }
                    }
                    i1 = j1;
                }
            } else
            {
                i1 = j1;
            }
        }

        return i1;
    }

    private static int a(int i1, int j1)
    {
        if (i1 < -4 || i1 > 10)
        {
            throw new RuntimeException("Parameter out of range");
        } else
        {
            return i1 + 4 + j1 * 15 + 10;
        }
    }

    private int a(int i1, ArrayList arraylist)
    {
        for (int j1 = arraylist.size(); i1 < j1 && ((he)arraylist.get(i1)).a == m; i1++)
        {
            a((he)arraylist.get(i1));
        }

        return i1;
    }

    private static String a(gx gx1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("v");
        stringbuilder.append(gx1.g());
        stringbuilder.append(' ');
        Object obj = gx1.d();
        if (obj == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(((oo) (obj)).h_());
        }
        stringbuilder.append(' ');
        obj = gx1.f();
        if (obj == null)
        {
            stringbuilder.append("null");
        } else
        {
            stringbuilder.append(((op) (obj)).h_());
        }
        gx1 = gx1.e();
        if (gx1 != null)
        {
            stringbuilder.append(' ');
            stringbuilder.append(gx1.h_());
        }
        return stringbuilder.toString();
    }

    private void a(int i1, String s)
    {
        String s1 = s;
        if (c != null)
        {
            s1 = (new StringBuilder()).append(c).append(s).toString();
        }
        if (a != null)
        {
            s = a;
            if (!d)
            {
                i1 = 0;
            }
            s.a(i1, s1);
        }
        if (b != null)
        {
            b.println(s1);
        }
    }

    private void a(he he1)
    {
        int i1;
        int j1;
label0:
        {
            j1 = he1.b.a();
            i1 = he1.a;
            int k1 = j1 - n;
            j1 = i1 - m;
            if (j1 < 0)
            {
                throw new RuntimeException("Position entries must be in ascending address order");
            }
            if (k1 >= -4)
            {
                i1 = k1;
                if (k1 <= 10)
                {
                    break label0;
                }
            }
            b(k1);
            i1 = 0;
        }
        int i2 = a(i1, j1);
        int l1;
        if ((i2 & 0xffffff00) > 0)
        {
            c(j1);
            j1 = a(i1, 0);
            if ((j1 & 0xffffff00) > 0)
            {
                b(i1);
                i1 = a(0, 0);
                j1 = 0;
                l1 = 0;
            } else
            {
                l1 = i1;
                i1 = j1;
                j1 = 0;
            }
        } else
        {
            l1 = i1;
            i1 = i2;
        }
        g.b(i1);
        n = n + l1;
        m = m + j1;
        if (a != null || b != null)
        {
            a(1, String.format("%04x: line %d", new Object[] {
                Integer.valueOf(m), Integer.valueOf(n)
            }));
        }
    }

    private void a(oo oo1)
    {
        if (oo1 == null || h == null)
        {
            g.e(0);
            return;
        } else
        {
            g.e(h.f.b(oo1) + 1);
            return;
        }
    }

    private void a(op op1)
    {
        if (op1 == null || h == null)
        {
            g.e(0);
            return;
        } else
        {
            g.e(h.g.b(op1) + 1);
            return;
        }
    }

    private void a(ArrayList arraylist, ArrayList arraylist1)
    {
        boolean flag1;
        flag1 = false;
        os os1;
        ot ot1;
        Iterator iterator;
        int i1;
        boolean flag;
        int l1;
        int i2;
        int j2;
        if (a != null || b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = g.b;
        if (arraylist.size() > 0)
        {
            n = ((he)arraylist.get(0)).b.a();
        }
        g.e(n);
        if (flag)
        {
            a(g.b - i1, (new StringBuilder("line_start: ")).append(n).toString());
        }
        i1 = b();
        os1 = k.b();
        j2 = ((pe) (os1)).K.length;
        if (!l)
        {
            arraylist = arraylist1.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                gx gx1 = (gx)arraylist.next();
                if (i1 != gx1.g())
                {
                    continue;
                }
                o[i1] = gx1;
                break;
            } while (true);
            i1++;
        }
        l1 = g.b;
        g.e(j2);
        if (flag)
        {
            a(g.b - l1, String.format("parameters_size: %04x", new Object[] {
                Integer.valueOf(j2)
            }));
        }
        i2 = 0;
        l1 = i1;
        i1 = i2;
        if (i1 >= j2) goto _L2; else goto _L1
_L1:
        ot1 = os1.b(i1);
        i2 = g.b;
        iterator = arraylist1.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_499;
            }
            arraylist = (gx)iterator.next();
        } while (l1 != arraylist.g());
        if (arraylist.e() != null)
        {
            a(((oo) (null)));
        } else
        {
            a(arraylist.d());
        }
        o[l1] = arraylist;
_L4:
        if (arraylist == null)
        {
            a(((oo) (null)));
        }
        if (flag)
        {
            if (arraylist == null || arraylist.e() != null)
            {
                arraylist = "<unnamed>";
            } else
            {
                arraylist = arraylist.d().h_();
            }
            a(g.b - i2, (new StringBuilder("parameter ")).append(arraylist).append(" v").append(l1).toString());
        }
        l1 += ot1.f();
        i1++;
        break MISSING_BLOCK_LABEL_250;
_L2:
        arraylist = o;
        int k1 = arraylist.length;
        for (int j1 = ((flag1) ? 1 : 0); j1 < k1; j1++)
        {
            arraylist1 = arraylist[j1];
            if (arraylist1 != null && arraylist1.e() != null)
            {
                b(arraylist1);
            }
        }

        return;
        arraylist = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int b()
    {
        int j1 = j;
        int k1 = k.b().b();
        int i1;
        if (l)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        return j1 - k1 - i1;
    }

    private void b(int i1)
    {
        int j1 = g.b;
        g.b(2);
        g.f(i1);
        n = n + i1;
        if (a != null || b != null)
        {
            a(g.b - j1, String.format("line = %d", new Object[] {
                Integer.valueOf(n)
            }));
        }
    }

    private void b(gx gx1)
    {
        int i1 = g.b;
        g.b(4);
        d(gx1.g());
        a(gx1.d());
        a(gx1.f());
        a(gx1.e());
        if (a != null || b != null)
        {
            a(g.b - i1, String.format("%04x: +localx %s", new Object[] {
                Integer.valueOf(m), a(gx1)
            }));
        }
    }

    private ArrayList c()
    {
        ArrayList arraylist = new ArrayList(((pe) (k.b())).K.length);
        int j1 = b();
        BitSet bitset = new BitSet(j - j1);
        int k1 = ((pe) (f)).K.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            gx gx1 = f.a(i1);
            int l1 = gx1.g();
            if (l1 >= j1 && !bitset.get(l1 - j1))
            {
                bitset.set(l1 - j1);
                arraylist.add(gx1);
            }
        }

        Collections.sort(arraylist, new jf(this));
        return arraylist;
    }

    private void c(int i1)
    {
        int j1 = g.b;
        g.b(1);
        g.e(i1);
        m = m + i1;
        if (a != null || b != null)
        {
            a(g.b - j1, String.format("%04x: advance pc", new Object[] {
                Integer.valueOf(m)
            }));
        }
    }

    private void d(int i1)
    {
        if (i1 < 0)
        {
            throw new RuntimeException((new StringBuilder("Signed value where unsigned required: ")).append(i1).toString());
        } else
        {
            g.e(i1);
            return;
        }
    }

    public final byte[] a()
    {
        int k1 = 0;
        if (e != null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L5:
        int j1;
        ArrayList arraylist;
        byte abyte0[];
        int l1;
        int i2;
        int j2;
        int k2;
        try
        {
            arraylist = new ArrayList(i1);
        }
        catch (IOException ioexception)
        {
            throw pd.a(ioexception, "...while encoding debug info");
        }
        j1 = 0;
_L4:
        if (j1 >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(e.a(j1));
        j1++;
        if (true) goto _L4; else goto _L3
_L2:
        i1 = ((pe) (e)).K.length;
          goto _L5
_L3:
        Collections.sort(arraylist, new je(this));
        a(arraylist, c());
        g.b(7);
        if (a != null || b != null)
        {
            a(1, String.format("%04x: prologue end", new Object[] {
                Integer.valueOf(m)
            }));
        }
        i2 = arraylist.size();
        j2 = ((pe) (f)).K.length;
        j1 = 0;
        i1 = k1;
_L6:
        i1 = a(i1);
        l1 = a(j1, arraylist);
        if (i1 >= j2)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        j1 = f.a(i1).a();
_L8:
        if (l1 >= i2)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        k1 = ((he)arraylist.get(l1)).a;
_L7:
        k2 = Math.min(k1, j1);
        if (k2 == 0x7fffffff)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        if (k2 == i && j1 == 0x7fffffff && k1 == 0x7fffffff)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        if (k2 != k1)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        j1 = l1 + 1;
        a((he)arraylist.get(l1));
          goto _L6
        c(k2 - m);
        j1 = l1;
          goto _L6
        g.b(0);
        if (a != null || b != null)
        {
            a(1, "end sequence");
        }
        abyte0 = g.e();
        return abyte0;
        k1 = 0x7fffffff;
          goto _L7
        j1 = 0x7fffffff;
          goto _L8
    }
}
