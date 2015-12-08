// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import com.roidapp.baselib.c.x;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            w

final class y
    implements Runnable
{

    private Object a;
    private int b;
    private w c;

    private y(int i, Object obj, w w1)
    {
        b = i;
        a = obj;
        c = w1;
    }

    y(int i, Object obj, w w1, byte byte0)
    {
        this(i, obj, w1);
    }

    public final void run()
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        b;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 46
    //                   1 62
    //                   2 99
    //                   3 115;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        c = null;
        return;
_L3:
        c.c(a);
        continue; /* Loop/switch isn't completed */
_L4:
        x x1 = (x)a;
        c.b(((Integer)x1.a).intValue(), (Exception)x1.b);
        continue; /* Loop/switch isn't completed */
_L5:
        c.b(a);
        continue; /* Loop/switch isn't completed */
_L6:
        c.a();
        if (true) goto _L2; else goto _L7
_L7:
    }
}
