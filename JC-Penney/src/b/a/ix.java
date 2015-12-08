// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package b.a:
//            pf, gd, ow, gj, 
//            pe, gf, gg

public final class ix
{

    gf a;
    byte b[];
    int c;
    TreeMap d;
    private final gj e;

    public ix(gj gj1)
    {
        e = gj1;
        a = null;
        b = null;
        c = 0;
        d = null;
    }

    private static void a(gd gd1, int i, int j, String s, ow ow1)
    {
        ow1.a(j, gd1.a(s, (new StringBuilder()).append(pf.b(i)).append(": ").toString()));
    }

    final void a()
    {
        if (a == null)
        {
            gj gj1 = e;
            gj1.a();
            a = gj1.d;
        }
    }

    public final void a(ow ow1)
    {
        boolean flag1 = false;
        a();
        if (ow1.a())
        {
            a();
            String s;
            boolean flag;
            byte byte0;
            byte byte1;
            int i2;
            if (ow1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                byte0 = 6;
            } else
            {
                byte0 = 0;
            }
            if (flag)
            {
                byte1 = 2;
            } else
            {
                byte1 = 0;
            }
            i2 = ((pe) (a)).K.length;
            s = (new StringBuilder()).append("  ").append("  ").toString();
            if (flag)
            {
                ow1.a(0, (new StringBuilder()).append("  ").append("tries:").toString());
                for (int j1 = 0; j1 < i2;)
                {
                    Object obj1 = a.a(j1);
                    Object obj = ((gg) (obj1)).c();
                    obj1 = (new StringBuilder()).append(s).append("try ").append(pf.c(((gg) (obj1)).a())).append("..").append(pf.c(((gg) (obj1)).b())).toString();
                    obj = ((gd) (obj)).a(s, "");
                    if (flag)
                    {
                        ow1.a(byte0, ((String) (obj1)));
                        ow1.a(byte1, ((String) (obj)));
                        j1++;
                    } else
                    {
                        throw new NullPointerException();
                    }
                }

            } else
            {
                (new StringBuilder()).append("  ").append("tries:").toString();
                throw new NullPointerException();
            }
            if (flag)
            {
                ow1.a(0, (new StringBuilder()).append("  ").append("handlers:").toString());
                ow1.a(c, (new StringBuilder()).append(s).append("size: ").append(pf.b(d.size())).toString());
                Iterator iterator = d.entrySet().iterator();
                gd gd1 = null;
                int i;
                int k;
                for (i = 0; iterator.hasNext(); i = k)
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    gd gd2 = (gd)entry.getKey();
                    k = ((Integer)entry.getValue()).intValue();
                    if (gd1 != null)
                    {
                        a(gd1, i, k - i, s, ow1);
                    }
                    gd1 = gd2;
                }

                a(gd1, i, b.length - i, s, ow1);
            }
        }
        int l = ((pe) (a)).K.length;
        for (int j = ((flag1) ? 1 : 0); j < l; j++)
        {
            gg gg1 = a.a(j);
            int l1 = gg1.a();
            int i1 = gg1.b();
            int k1 = i1 - l1;
            if (k1 >= 0x10000)
            {
                throw new UnsupportedOperationException((new StringBuilder("bogus exception range: ")).append(pf.a(l1)).append("..").append(pf.a(i1)).toString());
            }
            ow1.d(l1);
            ow1.c(k1);
            ow1.c(((Integer)d.get(gg1.c())).intValue());
        }

        ow1.a(b);
    }

    public final int b()
    {
        a();
        return ((pe) (a)).K.length;
    }
}
