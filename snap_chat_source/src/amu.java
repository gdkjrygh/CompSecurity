// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class amu extends ame
{

    private static final amu F;
    private static final Map G = new HashMap();

    private amu(alr alr, int i)
    {
        super(alr, i);
    }

    public static amu a(alw alw1, int i)
    {
        alw alw2;
        alw2 = alw1;
        if (alw1 == null)
        {
            alw2 = alw.a();
        }
        Map map = G;
        map;
        JVM INSTR monitorenter ;
        alw1 = (amu[])G.get(alw2);
        Object obj;
        obj = alw1;
        if (alw1 != null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = new amu[7];
        G.put(alw2, obj);
        Object obj1;
        obj1 = obj[i - 1];
        alw1 = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        if (alw2 != alw.a) goto _L4; else goto _L3
_L3:
        alw1 = new amu(null, i);
          goto _L5
_L2:
        map;
        JVM INSTR monitorexit ;
        return alw1;
        alw1;
        map;
        JVM INSTR monitorexit ;
        throw alw1;
_L4:
        alw1 = new amu(amw.a(a(alw.a, i), alw2), i);
_L5:
        obj[i - 1] = alw1;
        if (true) goto _L2; else goto _L6
_L6:
    }

    public static amu b(alw alw1)
    {
        return a(alw1, 4);
    }

    final int N()
    {
        return 0xee945402;
    }

    final int O()
    {
        return 0x116bbb60;
    }

    final long Q()
    {
        return 0x758fac300L;
    }

    final long R()
    {
        return 0x3ac7d6180L;
    }

    final long S()
    {
        return 0x9cbf9040L;
    }

    final long T()
    {
        return 0x1c453aba2980L;
    }

    public final alr a(alw alw1)
    {
        alw alw2 = alw1;
        if (alw1 == null)
        {
            alw2 = alw.a();
        }
        if (alw2 == a())
        {
            return this;
        } else
        {
            return a(alw2, 4);
        }
    }

    protected final void a(alZ.a a1)
    {
        if (super.a == null)
        {
            super.a(a1);
            a1.E = new ang(a1.E);
            a1.B = new ang(a1.B);
        }
    }

    final long b(int i, int j, int k)
    {
        int l = i;
        if (i <= 0)
        {
            if (i == 0)
            {
                throw new alB(alu.s(), Integer.valueOf(i), null, null);
            }
            l = i + 1;
        }
        return super.b(l, j, k);
    }

    public final alr b()
    {
        return F;
    }

    final boolean c(int i)
    {
        return (i & 3) == 0;
    }

    final long d(int i)
    {
        int l = i - 1968;
        if (l > 0) goto _L2; else goto _L1
_L1:
        int j = l + 3 >> 2;
_L4:
        long l1 = l;
        return ((long)j + l1 * 365L) * 0x5265c00L - 0xe71960800L;
_L2:
        int k = l >> 2;
        j = k;
        if (!c(i))
        {
            j = k + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        F = a(alw.a, 4);
    }
}
