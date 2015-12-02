// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import com.facebook.auth.f.b;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.threads.m;
import com.google.common.a.hy;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class p
    implements b
{

    private final Map a = (new hy()).i().n();

    public p()
    {
    }

    Message a(String s)
    {
        return (Message)a.get(s);
    }

    public void a()
    {
        a.clear();
    }

    void a(Message message)
    {
        if (message.y())
        {
            return;
        } else
        {
            a.put(message.d(), message);
            return;
        }
    }

    public void b()
    {
        Iterator iterator = a.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (m.i(s) || m.h(s))
            {
                iterator.remove();
            }
        } while (true);
    }

    public void d()
    {
        a();
    }
}
