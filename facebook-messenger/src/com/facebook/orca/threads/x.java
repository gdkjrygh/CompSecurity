// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.user.User;
import com.google.common.a.es;
import com.google.common.a.hq;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.threads:
//            ThreadSummary, r, v

public class x
{

    private final a a;
    private final r b;

    public x(a a1, r r1)
    {
        a = a1;
        b = r1;
    }

    public ThreadSummary a(ThreadSummary threadsummary, Message message)
    {
        Preconditions.checkNotNull(threadsummary);
        Preconditions.checkNotNull(message);
        java.util.ArrayList arraylist = hq.a();
        Object obj = message.i();
        arraylist.add(obj);
        Object obj1 = threadsummary.m().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            ParticipantInfo participantinfo = (ParticipantInfo)((Iterator) (obj1)).next();
            if (!Objects.equal(participantinfo.e(), ((ParticipantInfo) (obj)).e()))
            {
                arraylist.add(participantinfo);
            }
        } while (true);
        obj = b.a(message);
        if (obj != null && ((String) (obj)).length() > 120)
        {
            obj = ((String) (obj)).substring(0, 120);
        }
        obj1 = ((User)a.b()).c();
        boolean flag;
        if (!Objects.equal(message.i().e(), obj1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return (new v()).a(threadsummary).c(message.s()).b(message.s()).d(message.f()).d(((String) (obj))).a(message.i()).d(arraylist).b(flag).z();
    }
}
