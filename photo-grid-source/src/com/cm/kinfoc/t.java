// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import com.cm.kinfoc.a.d;

// Referenced classes of package com.cm.kinfoc:
//            f, q, v, x, 
//            s

final class t
    implements d
{

    final x a;
    final s b;

    t(s s, x x)
    {
        b = s;
        a = x;
        super();
    }

    public final void a(Object obj)
    {
        obj = (f)obj;
        if (obj == null || !q.c() || a == null) goto _L2; else goto _L1
_L1:
        q q1 = q.a();
        if (q1 == null || obj == null) goto _L2; else goto _L3
_L3:
        ((f) (obj)).a;
        JVM INSTR tableswitch 1 4: default 68
    //                   1 69
    //                   2 102
    //                   3 114
    //                   4 126;
           goto _L2 _L4 _L5 _L6 _L7
_L2:
        return;
_L4:
        if (((f) (obj)).b != null)
        {
            q1.a(((v)((f) (obj)).b).a, ((v)((f) (obj)).b).b);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (((f) (obj)).b != null)
        {
            q.f();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (((f) (obj)).b != null)
        {
            q.e();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (((f) (obj)).b != null)
        {
            q1.b(((v)((f) (obj)).b).a, ((v)((f) (obj)).b).b);
            return;
        }
        if (true) goto _L2; else goto _L8
_L8:
    }
}
