// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk:
//            al

public class am
{

    private List a;
    private List b;

    private am()
    {
        a = Collections.synchronizedList(new ArrayList());
        b = Collections.synchronizedList(new ArrayList());
    }

    am(byte byte0)
    {
        this();
    }

    private void a()
    {
        if (b.isEmpty())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        this;
        JVM INSTR monitorenter ;
        if (!b.isEmpty())
        {
            al al1 = (al)b.get(0);
            b.remove(0);
            a.add(al1);
            (new Thread(al1)).start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(al al1)
    {
        b.add(al1);
        if (a.size() < 3)
        {
            a();
        }
    }

    public final void b(al al1)
    {
        a.remove(al1);
        a();
    }
}
