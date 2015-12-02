// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.a.es;
import com.google.common.a.hq;
import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.List;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.threads:
//            ThreadSummary, ThreadParticipant

public class q
{

    private static Class a = com/facebook/orca/threads/q;
    private a b;

    public q(a a1)
    {
        b = a1;
    }

    public ThreadParticipant a(ThreadSummary threadsummary)
    {
label0:
        {
            UserKey userkey = (UserKey)b.b();
            if (userkey == null)
            {
                break label0;
            }
            Iterator iterator = threadsummary.j().iterator();
            ThreadParticipant threadparticipant;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                threadparticipant = (ThreadParticipant)iterator.next();
            } while (Objects.equal(threadparticipant.d(), userkey));
            return threadparticipant;
        }
        return (ThreadParticipant)threadsummary.j().get(0);
    }

    public ThreadParticipant b(ThreadSummary threadsummary)
    {
        if (threadsummary != null && threadsummary.h())
        {
            return a(threadsummary);
        } else
        {
            return null;
        }
    }

    public List c(ThreadSummary threadsummary)
    {
        UserKey userkey = (UserKey)b.b();
        java.util.ArrayList arraylist = hq.a();
        threadsummary = threadsummary.j().iterator();
        do
        {
            if (!threadsummary.hasNext())
            {
                break;
            }
            ThreadParticipant threadparticipant = (ThreadParticipant)threadsummary.next();
            if (!Objects.equal(threadparticipant.d(), userkey) && Objects.equal(threadparticipant.d().a(), n.PHONE_NUMBER))
            {
                arraylist.add(threadparticipant);
            }
        } while (true);
        return arraylist;
    }

}
