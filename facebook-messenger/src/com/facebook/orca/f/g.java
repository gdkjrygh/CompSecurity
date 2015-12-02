// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import android.os.Bundle;
import com.facebook.common.e.h;
import com.facebook.common.e.m;
import com.facebook.common.e.n;
import com.facebook.fbservice.c.b;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.s;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.server.aa;
import com.facebook.orca.server.ac;
import com.facebook.orca.server.y;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.f:
//            k, ad, h

public class g
{

    private final Class a = com/facebook/orca/f/g;
    private final com.facebook.orca.f.ad b;
    private final k c;
    private final h d;

    public g(com.facebook.orca.f.ad ad1, k k1, h h1)
    {
        b = ad1;
        c = k1;
        d = h1;
    }

    private FetchThreadParams a(FetchThreadParams fetchthreadparams, String s1)
    {
        ac ac1 = FetchThreadParams.newBuilder().a(fetchthreadparams);
        s s2 = c.a(s1, fetchthreadparams.b());
        if (s2 != fetchthreadparams.b())
        {
            ac1.a(s2).b(fetchthreadparams.b());
        }
        if (s1 == null)
        {
            return ac1.h();
        }
        long l = b.c(s1);
        if (l > b.d(s1))
        {
            ac1.a(true).a(l);
        }
        return ac1.h();
    }

    private FetchThreadResult a(ThreadSummary threadsummary, MessagesCollection messagescollection)
    {
        if (threadsummary == null)
        {
            return FetchThreadResult.a;
        }
        et et1 = es.e();
        for (Iterator iterator = threadsummary.C().iterator(); iterator.hasNext();)
        {
            Object obj = (ThreadParticipant)iterator.next();
            obj = b.a(((ThreadParticipant) (obj)).d());
            if (obj == null)
            {
                b(threadsummary);
            } else
            {
                et1.b(obj);
            }
        }

        b b1;
        if (b.a(threadsummary.a(), threadsummary.y()))
        {
            b1 = b.FROM_CACHE_UP_TO_DATE;
        } else
        {
            b1 = b.FROM_CACHE_STALE;
        }
        return new FetchThreadResult(b1, threadsummary, messagescollection, et1.b(), null, -1L);
    }

    private MessagesCollection a(ThreadSummary threadsummary)
    {
        if (threadsummary == null)
        {
            return null;
        } else
        {
            String s1 = threadsummary.a();
            threadsummary = threadsummary.y();
            return b.b(threadsummary, s1);
        }
    }

    private boolean a(FetchThreadParams fetchthreadparams, ThreadSummary threadsummary, MessagesCollection messagescollection)
    {
        if (threadsummary != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (h.a[fetchthreadparams.b().ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            if (messagescollection != null)
            {
                return true;
            }
            break;

        case 2: // '\002'
        case 3: // '\003'
            return b.a(threadsummary.a(), fetchthreadparams.f(), threadsummary.y());
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void b(ThreadSummary threadsummary)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        Object obj = b.e().iterator();
        boolean flag = true;
        while (((Iterator) (obj)).hasNext()) 
        {
            User user = (User)((Iterator) (obj)).next();
            if (!flag)
            {
                stringbuilder.append(", ");
            } else
            {
                flag = false;
            }
            stringbuilder.append(user.c().c());
        }
        stringbuilder.append("]");
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("[");
        Iterator iterator = threadsummary.C().iterator();
        flag = true;
        while (iterator.hasNext()) 
        {
            ThreadParticipant threadparticipant = (ThreadParticipant)iterator.next();
            if (!flag)
            {
                ((StringBuilder) (obj)).append(", ");
            } else
            {
                flag = false;
            }
            ((StringBuilder) (obj)).append(threadparticipant.d());
        }
        ((StringBuilder) (obj)).append("]");
        threadsummary = (new StringBuilder()).append("userCache: ").append(stringbuilder.toString()).append("\nThread Summary: ").append(threadsummary.toString()).append("\nThread Participants: ").append(((StringBuilder) (obj)).toString()).toString();
        d.a(m.a(a.getSimpleName(), threadsummary).a(new Throwable()).b(true).g());
    }

    public FetchThreadListParams a(FetchThreadListParams fetchthreadlistparams)
    {
        s s1 = c.a(fetchthreadlistparams.b(), fetchthreadlistparams.a());
        FetchThreadListParams fetchthreadlistparams1 = fetchthreadlistparams;
        if (s1 != fetchthreadlistparams.a())
        {
            fetchthreadlistparams1 = FetchThreadListParams.newBuilder().a(fetchthreadlistparams).a(s1).f();
        }
        return fetchthreadlistparams1;
    }

    public FetchThreadListResult a(FolderName foldername)
    {
        com.facebook.orca.threads.ThreadsCollection threadscollection = b.c(foldername);
        es es1 = es.a(b.e());
        b b1;
        com.facebook.orca.threads.FolderCounts foldercounts;
        if (b.b(foldername))
        {
            b1 = b.FROM_CACHE_UP_TO_DATE;
        } else
        {
            b1 = b.FROM_CACHE_STALE;
        }
        foldercounts = b.e(foldername);
        return FetchThreadListResult.newBuilder().a(b1).a(foldername).a(threadscollection).a(es1).a(foldercounts).o();
    }

    public FetchThreadResult a(ad ad1, FolderName foldername)
    {
        Bundle bundle = ad1.b();
        FetchThreadParams fetchthreadparams = (FetchThreadParams)bundle.getParcelable("fetchThreadParams");
        foldername = a(foldername, fetchthreadparams.a());
        MessagesCollection messagescollection = a(((ThreadSummary) (foldername)));
        if (foldername != null)
        {
            ad1 = foldername.a();
        } else
        {
            ad1 = null;
        }
        ad1 = a(fetchthreadparams, ((String) (ad1)));
        bundle.putParcelable("fetchThreadParams", ad1);
        if (!a(((FetchThreadParams) (ad1)), ((ThreadSummary) (foldername)), messagescollection))
        {
            return null;
        } else
        {
            return a(((ThreadSummary) (foldername)), messagescollection);
        }
    }

    public ThreadSummary a(FolderName foldername, ThreadCriteria threadcriteria)
    {
        return b.a(foldername, threadcriteria);
    }

    public boolean a(FolderName foldername, s s1)
    {
        switch (h.a[s1.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            return b.a(foldername);

        case 2: // '\002'
        case 3: // '\003'
            return b.b(foldername);
        }
    }
}
