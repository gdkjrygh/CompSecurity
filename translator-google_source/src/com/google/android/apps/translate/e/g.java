// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import com.google.android.libraries.a.a;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.translate.e:
//            d, h

public final class g
{

    private final String a;
    private final a b;

    g(a a1, String s)
    {
        a = s;
        b = a1;
    }

    public final void a()
    {
        Object obj = d.b();
        obj;
        JVM INSTR monitorenter ;
        h h1 = (h)d.c().get(a);
        if (h1 == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        com.google.android.apps.translate.e.h.a(h1).remove(b);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
