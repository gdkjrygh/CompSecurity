// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.threads;

import com.facebook.location.Coordinates;
import com.facebook.user.RecipientInfo;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.messages.model.threads:
//            c, SendError, Message, ParticipantInfo, 
//            GroupMessageInfo

public class e
{

    private SendError A;
    private String a;
    private String b;
    private long c;
    private long d;
    private ParticipantInfo e;
    private String f;
    private String g;
    private String h;
    private long i;
    private Coordinates j;
    private List k;
    private List l;
    private List m;
    private int n;
    private List o;
    private String p;
    private boolean q;
    private String r;
    private c s;
    private List t;
    private List u;
    private String v;
    private long w;
    private RecipientInfo x;
    private GroupMessageInfo y;
    private Map z;

    public e()
    {
        k = Collections.emptyList();
        l = Collections.emptyList();
        m = Collections.emptyList();
        o = Collections.emptyList();
        s = c.API;
        u = Collections.emptyList();
        z = ik.a();
        A = SendError.a;
    }

    public SendError A()
    {
        return A;
    }

    public Message B()
    {
        return new Message(this);
    }

    public e a(int i1)
    {
        n = i1;
        return this;
    }

    public e a(long l1)
    {
        c = l1;
        return this;
    }

    public e a(Coordinates coordinates)
    {
        j = coordinates;
        return this;
    }

    public e a(GroupMessageInfo groupmessageinfo)
    {
        y = groupmessageinfo;
        return this;
    }

    public e a(Message message)
    {
        a = message.d();
        b = message.e();
        c = message.f();
        d = message.h();
        e = message.i();
        f = message.j();
        g = message.k();
        h = message.m();
        i = message.s();
        j = message.n();
        k = message.o();
        l = message.p();
        m = message.q();
        n = message.u();
        o = message.v();
        p = message.w();
        q = message.y();
        r = message.z();
        s = message.A();
        t = message.B();
        u = message.D();
        v = message.E();
        w = message.F();
        x = message.G();
        y = message.H();
        z = ik.a(message.J());
        A = message.K();
        return this;
    }

    public e a(ParticipantInfo participantinfo)
    {
        e = participantinfo;
        return this;
    }

    public e a(SendError senderror)
    {
        A = senderror;
        return this;
    }

    public e a(c c1)
    {
        s = c1;
        return this;
    }

    public e a(RecipientInfo recipientinfo)
    {
        x = recipientinfo;
        return this;
    }

    public e a(String s1)
    {
        a = s1;
        return this;
    }

    public e a(String s1, String s2)
    {
        z.put(s1, s2);
        return this;
    }

    public e a(List list)
    {
        k = list;
        return this;
    }

    public e a(Map map)
    {
        Preconditions.checkNotNull(map);
        z = ik.a(map);
        return this;
    }

    public e a(boolean flag)
    {
        q = flag;
        return this;
    }

    public String a()
    {
        return a;
    }

    public e b(long l1)
    {
        d = l1;
        return this;
    }

    public e b(String s1)
    {
        b = s1;
        return this;
    }

    public e b(List list)
    {
        l = list;
        return this;
    }

    public String b()
    {
        return b;
    }

    public long c()
    {
        return c;
    }

    public e c(long l1)
    {
        i = l1;
        return this;
    }

    public e c(String s1)
    {
        f = s1;
        return this;
    }

    public e c(List list)
    {
        m = list;
        return this;
    }

    public long d()
    {
        return d;
    }

    public e d(long l1)
    {
        w = l1;
        return this;
    }

    public e d(String s1)
    {
        g = s1;
        return this;
    }

    public e d(List list)
    {
        o = list;
        return this;
    }

    public ParticipantInfo e()
    {
        return e;
    }

    public e e(String s1)
    {
        p = s1;
        return this;
    }

    public e e(List list)
    {
        t = list;
        return this;
    }

    public e f(String s1)
    {
        r = s1;
        return this;
    }

    public e f(List list)
    {
        u = list;
        return this;
    }

    public String f()
    {
        return f;
    }

    public e g(String s1)
    {
        v = s1;
        return this;
    }

    public String g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public long i()
    {
        return i;
    }

    public Coordinates j()
    {
        return j;
    }

    public List k()
    {
        return k;
    }

    public List l()
    {
        return l;
    }

    public List m()
    {
        return m;
    }

    public int n()
    {
        return n;
    }

    public List o()
    {
        return o;
    }

    public String p()
    {
        return p;
    }

    public boolean q()
    {
        return q;
    }

    public String r()
    {
        return r;
    }

    public c s()
    {
        return s;
    }

    public List t()
    {
        if (t == null)
        {
            return hq.a();
        } else
        {
            return t;
        }
    }

    public List u()
    {
        return u;
    }

    public String v()
    {
        return v;
    }

    public long w()
    {
        return w;
    }

    public RecipientInfo x()
    {
        return x;
    }

    public GroupMessageInfo y()
    {
        return y;
    }

    public Map z()
    {
        return z;
    }
}
