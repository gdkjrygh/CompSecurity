// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;

import rx.b.b;

final class g
    implements b
{

    final e.g a;

    g(e.g g1)
    {
        a = g1;
        super();
    }

    public final void call(Object obj)
    {
        boolean flag;
        boolean flag1;
label0:
        {
            flag1 = true;
            flag = false;
            synchronized ((n.b)obj)
            {
                if (b1.b && !b1.c)
                {
                    break label0;
                }
            }
            return;
        }
        b1.b = false;
        b1.c = true;
        b1;
        JVM INSTR monitorexit ;
_L5:
        int i;
        int j;
        i = ((Integer)b1.g).intValue();
        j = a.a;
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        b1.g = a.a(Integer.valueOf(i), b1);
        b1;
        JVM INSTR monitorenter ;
        if (j != a.a) goto _L2; else goto _L1
_L1:
        b1.c = false;
        b1;
        JVM INSTR monitorexit ;
        return;
_L6:
        flag1 = flag;
        b1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
_L7:
        if (flag) goto _L4; else goto _L3
_L3:
        b1;
        JVM INSTR monitorenter ;
        b1.c = false;
        b1;
        JVM INSTR monitorexit ;
_L4:
        throw obj;
        obj;
        b1;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        b1;
        JVM INSTR monitorexit ;
          goto _L5
        obj;
        flag = false;
          goto _L6
        obj;
        b1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
          goto _L7
        obj;
        flag = flag1;
          goto _L6
    }
}
