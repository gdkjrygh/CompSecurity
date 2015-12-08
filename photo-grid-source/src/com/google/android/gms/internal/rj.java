// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            rl, rf

final class rj
    implements Runnable
{

    final AtomicInteger a;
    final int b;
    final rf c;
    final List d;

    rj(AtomicInteger atomicinteger, int i, rf rf1, List list)
    {
        a = atomicinteger;
        b = i;
        c = rf1;
        d = list;
        super();
    }

    public final void run()
    {
        if (a.incrementAndGet() < b) goto _L2; else goto _L1
_L1:
        Object obj;
        ArrayList arraylist;
        Object obj1;
        obj = c;
        obj1 = d;
        arraylist = new ArrayList();
        obj1 = ((List) (obj1)).iterator();
_L6:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        Object obj2 = ((rl)((Iterator) (obj1)).next()).get();
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        arraylist.add(obj2);
          goto _L6
_L8:
        zzb.zzd("Unable to convert list of futures to a future of list", ((Throwable) (obj)));
_L2:
        return;
_L4:
        try
        {
            ((rf) (obj)).b(arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (true) goto _L8; else goto _L7
_L7:
    }
}
