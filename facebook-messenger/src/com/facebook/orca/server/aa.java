// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import com.facebook.fbservice.c.b;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.ThreadsCollection;
import com.google.common.a.es;
import com.google.common.a.ev;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.orca.server:
//            FetchThreadListResult

public class aa
{

    private b a;
    private FolderName b;
    private ThreadsCollection c;
    private List d;
    private List e;
    private List f;
    private FolderCounts g;
    private NotificationSetting h;
    private boolean i;
    private long j;
    private long k;
    private boolean l;
    private Map m;
    private ServiceException n;

    aa()
    {
        d = es.d();
        e = es.d();
        f = es.d();
        j = -1L;
        k = -1L;
        m = ev.j();
    }

    public b a()
    {
        return a;
    }

    public aa a(long l1)
    {
        j = l1;
        return this;
    }

    public aa a(b b1)
    {
        a = b1;
        return this;
    }

    public aa a(ServiceException serviceexception)
    {
        n = serviceexception;
        return this;
    }

    public aa a(NotificationSetting notificationsetting)
    {
        h = notificationsetting;
        return this;
    }

    public aa a(FetchThreadListResult fetchthreadlistresult)
    {
        a = fetchthreadlistresult.e();
        b = fetchthreadlistresult.a();
        c = fetchthreadlistresult.b();
        d = fetchthreadlistresult.c();
        e = fetchthreadlistresult.d();
        f = fetchthreadlistresult.g();
        g = fetchthreadlistresult.h();
        h = fetchthreadlistresult.i();
        i = fetchthreadlistresult.j();
        j = fetchthreadlistresult.f();
        k = fetchthreadlistresult.k();
        l = fetchthreadlistresult.l();
        m = fetchthreadlistresult.m();
        n = fetchthreadlistresult.n();
        return this;
    }

    public aa a(FolderCounts foldercounts)
    {
        g = foldercounts;
        return this;
    }

    public aa a(FolderName foldername)
    {
        b = foldername;
        return this;
    }

    public aa a(ThreadsCollection threadscollection)
    {
        c = threadscollection;
        return this;
    }

    public aa a(es es1)
    {
        d = es1;
        return this;
    }

    public aa a(List list)
    {
        e = list;
        return this;
    }

    public aa a(Map map)
    {
        m = map;
        return this;
    }

    public aa a(boolean flag)
    {
        i = flag;
        return this;
    }

    public aa b(long l1)
    {
        k = l1;
        return this;
    }

    public aa b(List list)
    {
        f = list;
        return this;
    }

    public aa b(boolean flag)
    {
        l = flag;
        return this;
    }

    public FolderName b()
    {
        return b;
    }

    public ThreadsCollection c()
    {
        return c;
    }

    public List d()
    {
        return d;
    }

    public List e()
    {
        return e;
    }

    public List f()
    {
        return f;
    }

    public FolderCounts g()
    {
        return g;
    }

    public NotificationSetting h()
    {
        return h;
    }

    public boolean i()
    {
        return i;
    }

    public long j()
    {
        return j;
    }

    public long k()
    {
        return k;
    }

    public boolean l()
    {
        return l;
    }

    public Map m()
    {
        return m;
    }

    public ServiceException n()
    {
        return n;
    }

    public FetchThreadListResult o()
    {
        return new FetchThreadListResult(this);
    }
}
