// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.common.b.c;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.w;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.orca.f:
//            ab

public class m
{

    private static final Class a = com/facebook/orca/f/m;
    private static final l b = new l();
    private final FolderName c;
    private final c d = new c(new w());
    private final Map e = ik.a();
    private final Map f = ik.a();
    private final Map g = ik.a();
    private final Map h = ik.a();
    private boolean i;
    private boolean j;
    private boolean k;
    private long l;
    private FolderCounts m;

    m(FolderName foldername)
    {
        l = -1L;
        c = foldername;
    }

    private void c(ThreadSummary threadsummary)
    {
        Preconditions.checkArgument(c.equals(threadsummary.y()));
        if (threadsummary.l() > k())
        {
            d.put(threadsummary.a(), threadsummary);
        }
    }

    private long k()
    {
        List list = d.a();
        if (list.isEmpty())
        {
            return -1L;
        } else
        {
            return ((ThreadSummary)list.get(list.size() - 1)).l();
        }
    }

    public c a()
    {
        return d;
    }

    public ThreadSummary a(UserKey userkey)
    {
        return (ThreadSummary)f.get(userkey);
    }

    public void a(long l1)
    {
        l = l1;
    }

    public void a(FolderCounts foldercounts)
    {
        m = foldercounts;
    }

    public void a(MessagesCollection messagescollection)
    {
        String s = messagescollection.a();
        g.put(s, messagescollection);
    }

    public void a(ThreadSummary threadsummary)
    {
        Preconditions.checkArgument(c.equals(threadsummary.y()));
        d.put(threadsummary.a(), threadsummary);
    }

    public void a(String s)
    {
        d.remove(s);
    }

    public void a(boolean flag)
    {
        i = flag;
    }

    public void b(ThreadSummary threadsummary)
    {
        Preconditions.checkArgument(c.equals(threadsummary.y()));
        e.put(threadsummary.a(), threadsummary);
        c(threadsummary);
        if (threadsummary.h())
        {
            UserKey userkey = threadsummary.i();
            f.put(userkey, threadsummary);
        }
    }

    public void b(String s)
    {
        s = (ThreadSummary)e.remove(s);
        if (s != null && s.h())
        {
            s = s.i();
            f.remove(s);
        }
    }

    public void b(boolean flag)
    {
        j = flag;
    }

    public boolean b()
    {
        return i;
    }

    public ThreadSummary c(String s)
    {
        return (ThreadSummary)e.get(s);
    }

    public void c(boolean flag)
    {
        k = flag;
    }

    public boolean c()
    {
        return j;
    }

    public boolean d()
    {
        return k;
    }

    public boolean d(String s)
    {
        return e.containsKey(s);
    }

    public long e()
    {
        return l;
    }

    public void e(String s)
    {
        g.remove(s);
    }

    public FolderCounts f()
    {
        return m;
    }

    public MessagesCollection f(String s)
    {
        return (MessagesCollection)g.get(s);
    }

    ab g(String s)
    {
        if (s == null)
        {
            com.facebook.debug.log.b.a(b, a, "ensuring null threadId ThreadLocalState");
        }
        ab ab2 = h(s);
        ab ab1 = ab2;
        if (ab2 == null)
        {
            ab1 = new ab(s);
            h.put(s, ab1);
        }
        return ab1;
    }

    public void g()
    {
        d.clear();
    }

    public ab h(String s)
    {
        return (ab)h.get(s);
    }

    public es h()
    {
        return es.a(e.values());
    }

    public void i()
    {
        for (Iterator iterator = h.values().iterator(); iterator.hasNext(); ((ab)iterator.next()).c()) { }
    }

    public void j()
    {
        d.clear();
        e.clear();
        f.clear();
        g.clear();
        h.clear();
        j = false;
        l = -1L;
        k = false;
        m = null;
    }

}
