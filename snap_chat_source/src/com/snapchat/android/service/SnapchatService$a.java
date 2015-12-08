// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.service;

import CU;
import Eh;
import Ei;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.snapchat.android.service:
//            SnapchatService

final class a
    implements Runnable
{

    private final CU a;
    private SnapchatService b;

    public final void run()
    {
        CU cu;
        Object obj;
        a.postProcess(SnapchatService.a(b));
        obj = SnapchatService.c(b);
        cu = a;
        SparseArray sparsearray = ((Ei) (obj)).d;
        sparsearray;
        JVM INSTR monitorenter ;
        obj = (HashSet)((Ei) (obj)).d.get(Ei.b(cu));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Eh)((Iterator) (obj)).next()).a(cu)) { }
        break MISSING_BLOCK_LABEL_92;
        Exception exception;
        exception;
        sparsearray;
        JVM INSTR monitorexit ;
        throw exception;
        sparsearray;
        JVM INSTR monitorexit ;
        SnapchatService.a(b, a);
        return;
    }

    public (SnapchatService snapchatservice, CU cu)
    {
        b = snapchatservice;
        super();
        a = cu;
    }
}
