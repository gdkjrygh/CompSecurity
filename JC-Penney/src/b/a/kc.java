// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package b.a:
//            kk, kd, kg, ow, 
//            ke, kf, pd, ji, 
//            ju

public final class kc extends kk
{

    private static final Comparator d = new kd();
    private final ArrayList e = new ArrayList(100);
    private final HashMap f = new HashMap(100);
    private final kf g;
    private int h;

    public kc(String s, ji ji, int i, kf kf1)
    {
        super(s, ji, i);
        g = kf1;
        h = -1;
    }

    public final int a(ju ju)
    {
        return ((kg)ju).d();
    }

    public final Collection a()
    {
        return e;
    }

    public final void a(kg kg1)
    {
        h();
        try
        {
            if (kg1.e() > super.b)
            {
                throw new IllegalArgumentException("incompatible item alignment");
            }
        }
        // Misplaced declaration of an exception variable
        catch (kg kg1)
        {
            throw new NullPointerException("item == null");
        }
        e.add(kg1);
    }

    protected final void a_(ow ow1)
    {
        boolean flag = ow1.a();
        ji ji = super.a;
        Iterator iterator = e.iterator();
        int i = 0;
        int k = 1;
        while (iterator.hasNext()) 
        {
            kg kg1 = (kg)iterator.next();
            int j = k;
            int l;
            if (flag)
            {
                if (k != 0)
                {
                    j = 0;
                } else
                {
                    ow1.a(0, "\n");
                    j = k;
                }
            }
            k = kg1.e() - 1;
            l = ~k & i + k;
            k = i;
            if (i != l)
            {
                ow1.g(l - i);
                k = l;
            }
            kg1.a(ji, ow1);
            i = kg1.i_() + k;
            k = j;
        }
        if (i != h)
        {
            throw new RuntimeException("output size mismatch");
        } else
        {
            return;
        }
    }

    public final kg b(kg kg1)
    {
        h();
        kg kg2 = (kg)f.get(kg1);
        if (kg2 != null)
        {
            return kg2;
        } else
        {
            a(kg1);
            f.put(kg1, kg1);
            return kg1;
        }
    }

    protected final void c()
    {
        ji ji = super.a;
        int i = 0;
        do
        {
            int j = e.size();
            if (i < j)
            {
                while (i < j) 
                {
                    ((kg)e.get(i)).a(ji);
                    i++;
                }
            } else
            {
                return;
            }
        } while (true);
    }

    public final void d()
    {
        g();
        ke.a[g.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 130
    //                   2 140;
           goto _L1 _L2 _L3
_L1:
        int i;
        int j;
        int k;
        k = e.size();
        i = 0;
        j = 0;
_L7:
        kg kg1;
        int l;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        kg1 = (kg)e.get(i);
        try
        {
            l = kg1.b(this, j);
        }
        catch (RuntimeException runtimeexception)
        {
            throw pd.a(runtimeexception, (new StringBuilder("...while placing ")).append(kg1).toString());
        }
        if (l >= j) goto _L5; else goto _L4
_L4:
        throw new RuntimeException((new StringBuilder("bogus place() result for ")).append(kg1).toString());
_L2:
        Collections.sort(e);
        continue; /* Loop/switch isn't completed */
_L3:
        Collections.sort(e, d);
        continue; /* Loop/switch isn't completed */
_L5:
        j = kg1.i_();
        j = l + j;
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        h = j;
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final int j_()
    {
        g();
        return h;
    }

}
