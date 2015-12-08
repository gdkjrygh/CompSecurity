// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bw.e;
import com.google.android.m4b.maps.cc.q;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            l, j

final class a
    implements com.google.android.m4b.maps.bf.a
{

    private l a;

    public final void a(ac ac, q q1, boolean flag)
    {
        com.google.android.m4b.maps.bf.c c = l.a(a);
        c;
        JVM INSTR monitorenter ;
        if (l.b(a).d(ac) == null || q1 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        q1.f();
        c;
        JVM INSTR monitorexit ;
        ac = a.i;
        if (ac != null && (q1 != null || !flag))
        {
            ac.a(true, false);
        }
        return;
        ac;
        c;
        JVM INSTR monitorexit ;
        throw ac;
    }

    (l l1)
    {
        a = l1;
        super();
    }
}
