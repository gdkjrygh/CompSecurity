// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class cmy extends brg
    implements brd
{

    private final Object a;

    public final void a(brc brc1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (brc1.c().b())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        synchronized (a) { }
        boolean flag = brc1 instanceof brb;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        ((brb)brc1).a();
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        brc1;
        obj1;
        JVM INSTR monitorexit ;
        throw brc1;
        brc1;
        obj;
        JVM INSTR monitorexit ;
        throw brc1;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("TransformedResultImpl", (new StringBuilder("Unable to release ")).append(brc1).toString(), runtimeexception);
          goto _L1
    }
}
