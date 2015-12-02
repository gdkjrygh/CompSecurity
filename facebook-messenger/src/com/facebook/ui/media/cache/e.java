// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.cache;

import com.google.common.b.i;
import com.google.common.base.Preconditions;
import java.io.InputStream;

// Referenced classes of package com.facebook.ui.media.cache:
//            b

class e
    implements i
{

    private final InputStream a;
    private boolean b;

    private e(InputStream inputstream)
    {
        a = inputstream;
    }

    e(InputStream inputstream, b b1)
    {
        this(inputstream);
    }

    public InputStream a()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        InputStream inputstream;
        if (b)
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        b = true;
        inputstream = a;
        this;
        JVM INSTR monitorexit ;
        return inputstream;
        Exception exception;
        exception;
        throw exception;
    }

    public Object b()
    {
        return a();
    }
}
