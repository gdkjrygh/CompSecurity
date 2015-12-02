// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import com.facebook.messages.model.threads.Message;
import com.facebook.push.g;

// Referenced classes of package com.facebook.orca.notify:
//            ai, aj, aq, c

public class ap extends ai
{

    private final String b;
    private final Message c;
    private final aq d;
    private final g e;
    private final c f;

    public ap(String s, Message message, aq aq, g g1, c c1)
    {
        super(aj.NEW_MESSAGE);
        b = s;
        c = message;
        d = aq;
        e = g1;
        f = c1;
    }

    public String a()
    {
        return b;
    }

    public Message b()
    {
        return c;
    }

    public aq c()
    {
        return d;
    }

    public boolean d()
    {
        return e != g.MQTT;
    }

    public c e()
    {
        return f;
    }
}
