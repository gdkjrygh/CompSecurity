// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;

public final class nsz
{

    private static nsz a;
    private SparseArray b;
    private Context c;

    private nsz(Context context)
    {
        b = new SparseArray();
        c = context;
        olm.a(context, mmv);
    }

    public static nsz a(Context context)
    {
        nsz;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new nsz(context);
        }
        context = a;
        nsz;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public final nsy a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i != -1) goto _L2; else goto _L1
_L1:
        nsy nsy1 = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return nsy1;
_L2:
        nsy nsy2 = (nsy)b.get(i);
        nsy1 = nsy2;
        if (nsy2 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        nsy1 = new nsy(c, i);
        b.put(i, nsy1);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
