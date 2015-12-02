// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.prefs.shared:
//            j

class m
    implements Runnable
{

    final j a;

    m(j j1)
    {
        a = j1;
        super();
    }

    public void run()
    {
        java.util.ArrayList arraylist;
        synchronized (a)
        {
            arraylist = hq.a(j.a(a));
            j.a(a).clear();
        }
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((Runnable)((Iterator) (obj)).next()).run()) { }
        break MISSING_BLOCK_LABEL_70;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
