// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import com.facebook.messages.model.threads.Message;
import com.google.common.a.ik;
import java.util.Map;

// Referenced classes of package com.facebook.orca.threads:
//            j

class k
{

    private Map a;

    private k()
    {
        a = ik.a();
    }

    k(j j)
    {
        this();
    }

    void a(Message message)
    {
        a.put(message.d(), message);
        if (message.x())
        {
            a.put(message.w(), message);
        }
    }

    boolean b(Message message)
    {
        return c(message) != null;
    }

    Message c(Message message)
    {
        for (Message message1 = (Message)a.get(message.d()); message1 != null || !message.x();)
        {
            return message1;
        }

        return (Message)a.get(message.w());
    }

    void d(Message message)
    {
        a.remove(message.d());
        if (message.x())
        {
            a.remove(message.w());
        }
    }
}
