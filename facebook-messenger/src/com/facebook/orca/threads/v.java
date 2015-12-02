// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.net.Uri;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.compose.MessageDraft;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.orca.threads:
//            ThreadSummary, FolderName

public class v
{

    private String a;
    private String b;
    private long c;
    private long d;
    private long e;
    private String f;
    private List g;
    private List h;
    private List i;
    private boolean j;
    private UserKey k;
    private long l;
    private List m;
    private String n;
    private ParticipantInfo o;
    private String p;
    private String q;
    private Uri r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private FolderName w;
    private MessageDraft x;
    private List y;

    public v()
    {
        g = es.d();
        h = es.d();
        i = es.d();
        m = es.d();
        y = es.d();
    }

    public v a(long l1)
    {
        d = l1;
        return this;
    }

    public v a(Uri uri)
    {
        r = uri;
        return this;
    }

    public v a(ParticipantInfo participantinfo)
    {
        o = participantinfo;
        return this;
    }

    public v a(MessageDraft messagedraft)
    {
        x = messagedraft;
        return this;
    }

    public v a(FolderName foldername)
    {
        w = foldername;
        return this;
    }

    public v a(ThreadSummary threadsummary)
    {
        a = threadsummary.a();
        b = threadsummary.b();
        c = threadsummary.c();
        d = threadsummary.d();
        e = threadsummary.e();
        f = threadsummary.g();
        g = threadsummary.j();
        h = threadsummary.B();
        i = threadsummary.k();
        j = threadsummary.h();
        k = threadsummary.i();
        l = threadsummary.l();
        m = threadsummary.m();
        n = threadsummary.n();
        o = threadsummary.p();
        p = threadsummary.o();
        q = threadsummary.q();
        r = threadsummary.s();
        s = threadsummary.u();
        t = threadsummary.v();
        u = threadsummary.w();
        v = threadsummary.x();
        w = threadsummary.y();
        x = threadsummary.z();
        y = threadsummary.A();
        return this;
    }

    public v a(UserKey userkey)
    {
        k = userkey;
        return this;
    }

    public v a(String s1)
    {
        a = s1;
        return this;
    }

    public v a(List list)
    {
        g = list;
        return this;
    }

    public v a(boolean flag)
    {
        j = flag;
        return this;
    }

    public String a()
    {
        return a;
    }

    public v b(long l1)
    {
        e = l1;
        return this;
    }

    public v b(String s1)
    {
        b = s1;
        return this;
    }

    public v b(List list)
    {
        h = list;
        return this;
    }

    public v b(boolean flag)
    {
        s = flag;
        return this;
    }

    public String b()
    {
        return b;
    }

    public long c()
    {
        return d;
    }

    public v c(long l1)
    {
        c = l1;
        return this;
    }

    public v c(String s1)
    {
        f = s1;
        return this;
    }

    public v c(List list)
    {
        i = list;
        return this;
    }

    public v c(boolean flag)
    {
        t = flag;
        return this;
    }

    public long d()
    {
        return e;
    }

    public v d(long l1)
    {
        l = l1;
        return this;
    }

    public v d(String s1)
    {
        n = s1;
        return this;
    }

    public v d(List list)
    {
        m = list;
        return this;
    }

    public v d(boolean flag)
    {
        u = flag;
        return this;
    }

    public v e(String s1)
    {
        p = s1;
        return this;
    }

    public v e(List list)
    {
        y = list;
        return this;
    }

    public v e(boolean flag)
    {
        v = flag;
        return this;
    }

    public String e()
    {
        return f;
    }

    public long f()
    {
        return c;
    }

    public v f(String s1)
    {
        q = s1;
        return this;
    }

    public boolean g()
    {
        return j;
    }

    public UserKey h()
    {
        return k;
    }

    public List i()
    {
        return g;
    }

    public List j()
    {
        return h;
    }

    public List k()
    {
        return i;
    }

    public long l()
    {
        return l;
    }

    public String m()
    {
        return n;
    }

    public ParticipantInfo n()
    {
        return o;
    }

    public String o()
    {
        return p;
    }

    public List p()
    {
        return m;
    }

    public String q()
    {
        return q;
    }

    public Uri r()
    {
        return r;
    }

    public boolean s()
    {
        return s;
    }

    public boolean t()
    {
        return t;
    }

    public boolean u()
    {
        return u;
    }

    public boolean v()
    {
        return v;
    }

    public FolderName w()
    {
        return w;
    }

    public MessageDraft x()
    {
        return x;
    }

    public List y()
    {
        return y;
    }

    public ThreadSummary z()
    {
        return new ThreadSummary(this);
    }
}
