// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;

public final class nsm
{

    private final Context a;
    private SparseArray b;

    public nsm(Context context)
    {
        b = new SparseArray();
        a = context;
    }

    public final nsl a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        nsl nsl2 = (nsl)b.get(i);
        nsl nsl1;
        nsl1 = nsl2;
        if (nsl2 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        nsl1 = new nsl(a, i);
        b.put(i, nsl1);
        this;
        JVM INSTR monitorexit ;
        return nsl1;
        Exception exception;
        exception;
        throw exception;
    }
}
