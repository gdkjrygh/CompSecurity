// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.debug.log.b;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.facebook.push.mqtt:
//            ai, v

class am
    implements Runnable
{

    final ObjectNode a;
    final boolean b;
    final int c;
    final ai d;

    am(ai ai1, ObjectNode objectnode, boolean flag, int i)
    {
        d = ai1;
        a = objectnode;
        b = flag;
        c = i;
        super();
    }

    public void run()
    {
        boolean flag;
        try
        {
            flag = ai.a(d).a("/foreground_state", a, 30000L);
            com.facebook.debug.log.b.b(ai.c(), "Publishing foreground state runnable complete. success:%b, hasChange:%b, interval:%d", new Object[] {
                Boolean.valueOf(flag), Boolean.valueOf(b), Integer.valueOf(c)
            });
        }
        catch (InterruptedException interruptedexception)
        {
            com.facebook.debug.log.b.b(ai.c(), interruptedexception.toString());
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        if (b)
        {
            ai.a(d).a(c);
        }
    }
}
