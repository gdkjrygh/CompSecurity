// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            r

public final class u
{

    private final Object a = new Object();
    private boolean b;
    private SharedPreferences c;

    public u()
    {
        b = false;
        c = null;
    }

    public final Object a(r r1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        r1 = ((r) (r1.b));
        return r1;
        obj;
        JVM INSTR monitorexit ;
        return r1.a(c);
        r1;
        obj;
        JVM INSTR monitorexit ;
        throw r1;
    }
}
