// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.debug.log.b;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.threads.MessagesCollection;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.kl;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class z
{

    private static final String a = com/facebook/orca/threadview/z.getSimpleName();

    public z()
    {
    }

    public es a(MessagesCollection messagescollection, List list)
    {
        if (list.isEmpty())
        {
            return es.d();
        }
        java.util.HashSet hashset = kl.a();
        for (Iterator iterator = list.iterator(); iterator.hasNext(); hashset.add(((Message)iterator.next()).w())) { }
        messagescollection = messagescollection.b().iterator();
        do
        {
            if (!messagescollection.hasNext())
            {
                break;
            }
            Message message = (Message)messagescollection.next();
            if (message.x() && hashset.contains(message.w()))
            {
                b.a(a, "Deduped message %s", new Object[] {
                    message
                });
                hashset.remove(message.w());
            }
        } while (true);
        messagescollection = es.e();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Message message1 = (Message)list.next();
            if (hashset.contains(message1.w()))
            {
                messagescollection.b(message1);
            }
        } while (true);
        return messagescollection.b();
    }

}
