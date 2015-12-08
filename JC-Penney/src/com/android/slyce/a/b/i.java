// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.b;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.android.slyce.a.b:
//            g, h

class i
    implements g
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public void a(Exception exception, Object obj)
    {
        ArrayList arraylist;
        synchronized (a)
        {
            arraylist = a.a;
            a.a = null;
        }
        if (arraylist == null)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_37;
        exception;
        h1;
        JVM INSTR monitorexit ;
        throw exception;
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); ((g)iterator.next()).a(exception, obj)) { }
        return;
    }
}
