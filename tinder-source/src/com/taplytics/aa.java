// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.taplytics:
//            curlew, gs, z

final class aa
    implements Runnable
{

    final z a;

    aa(z z)
    {
        a = z;
        super();
    }

    public final void run()
    {
        Iterator iterator = Thread.getAllStackTraces().keySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Thread thread = (Thread)iterator.next();
        if (!thread.getName().equals("GAThread")) goto _L4; else goto _L3
_L3:
        if (thread == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Field afield[];
        int j;
        afield = thread.getClass().getDeclaredFields();
        j = afield.length;
        int i = 0;
_L6:
        Field field;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        field = afield[i];
        if (field.getType().equals(java/util/concurrent/LinkedBlockingQueue))
        {
            field.setAccessible(true);
            field.set(thread, new curlew());
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        break; /* Loop/switch isn't completed */
_L2:
        thread = null;
        if (true) goto _L3; else goto _L7
        Exception exception;
        exception;
        gs.b("GA Thread", exception);
_L7:
    }
}
