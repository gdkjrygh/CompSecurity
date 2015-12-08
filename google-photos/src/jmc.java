// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.util.SparseBooleanArray;

final class jmc extends jmd
{

    private final jnk a = new jnk(new byte[5]);
    private jlz b;

    public jmc(jlz jlz1)
    {
        b = jlz1;
        super();
    }

    public final void a()
    {
    }

    public final void a(jnl jnl1, boolean flag, jkf jkf1)
    {
        int i;
        if (flag)
        {
            jnl1.c(jnl1.d());
        }
        jnl1.a(a, 3);
        a.b(12);
        i = a.c(12);
        jnl1.c(7);
        jnl1.a(a, 2);
        a.b(4);
        int j = a.c(12);
        jnl1.c(j);
        if (b.c == null)
        {
            b.c = new jlu(jkf1.c(21));
        }
        i = i - 9 - j - 4;
_L12:
        if (i <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        int k;
        int l;
        jnl1.a(a, 5);
        k = a.c(8);
        a.b(3);
        l = a.c(13);
        a.b(4);
        int i1 = a.c(12);
        jnl1.c(i1);
        i -= i1 + 5;
        if (b.a.get(k))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = null;
        k;
        JVM INSTR lookupswitch 8: default 296
    //                   3: 342
    //                   4: 361
    //                   15: 380
    //                   21: 499
    //                   27: 420
    //                   36: 463
    //                   129: 400
    //                   135: 400;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L10
_L3:
        if (obj != null)
        {
            b.a.put(k, true);
            b.b.put(l, new jmb(b, ((jlp) (obj))));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new jlv(jkf1.c(3));
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new jlv(jkf1.c(4));
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new jlo(jkf1.c(15));
        continue; /* Loop/switch isn't completed */
_L10:
        obj = new jlm(jkf1.c(k));
        continue; /* Loop/switch isn't completed */
_L8:
        obj = new jlq(jkf1.c(27), new jly(jkf1.c(256)), jlz.a(b));
        continue; /* Loop/switch isn't completed */
_L9:
        obj = new jls(jkf1.c(36), new jly(jkf1.c(256)));
        continue; /* Loop/switch isn't completed */
_L7:
        obj = b.c;
        if (true) goto _L3; else goto _L2
_L2:
        jkf1.g();
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }
}
