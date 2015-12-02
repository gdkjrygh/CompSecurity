// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import com.facebook.user.ChatContext;
import com.facebook.user.UserWithIdentifier;

// Referenced classes of package com.facebook.contacts.picker:
//            ah, ag, ai

public class aj
{

    private UserWithIdentifier a;
    private ai b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    private boolean g;
    private int h;
    private ChatContext i;
    private ah j;
    private boolean k;

    public aj()
    {
        j = ah.UNKNOWN;
    }

    public ag a()
    {
        return new ag(this);
    }

    public aj a(int i1)
    {
        h = i1;
        return this;
    }

    public aj a(ah ah1)
    {
        j = ah1;
        return this;
    }

    public aj a(ai ai)
    {
        b = ai;
        return this;
    }

    public aj a(ChatContext chatcontext)
    {
        i = chatcontext;
        return this;
    }

    public aj a(UserWithIdentifier userwithidentifier)
    {
        a = userwithidentifier;
        return this;
    }

    public aj a(String s)
    {
        f = s;
        return this;
    }

    public aj a(boolean flag)
    {
        c = flag;
        return this;
    }

    public aj b(boolean flag)
    {
        d = flag;
        return this;
    }

    public UserWithIdentifier b()
    {
        return a;
    }

    public ai c()
    {
        return b;
    }

    public aj c(boolean flag)
    {
        e = flag;
        return this;
    }

    public aj d(boolean flag)
    {
        g = flag;
        return this;
    }

    public boolean d()
    {
        return c;
    }

    public aj e(boolean flag)
    {
        k = flag;
        return this;
    }

    public boolean e()
    {
        return d;
    }

    public boolean f()
    {
        return e;
    }

    public String g()
    {
        return f;
    }

    public int h()
    {
        return h;
    }

    public ChatContext i()
    {
        return i;
    }

    public ah j()
    {
        return j;
    }

    public boolean k()
    {
        return g;
    }

    public boolean l()
    {
        return k;
    }
}
