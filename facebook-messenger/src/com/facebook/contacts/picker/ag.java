// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import com.facebook.user.ChatContext;
import com.facebook.user.User;
import com.facebook.user.UserWithIdentifier;

// Referenced classes of package com.facebook.contacts.picker:
//            ad, aj, ai, ah

public class ag
    implements ad
{

    private final UserWithIdentifier a;
    private final ai b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final String f;
    private final int g;
    private final ChatContext h;
    private final ah i;
    private boolean j;
    private final boolean k;

    public ag(aj aj1)
    {
        a = aj1.b();
        b = aj1.c();
        c = aj1.d();
        d = aj1.e();
        e = aj1.f();
        f = aj1.g();
        g = aj1.h();
        h = aj1.i();
        i = aj1.j();
        j = aj1.k();
        k = aj1.l();
    }

    public UserWithIdentifier a()
    {
        return a;
    }

    public User b()
    {
        return a.a();
    }

    public ai c()
    {
        return b;
    }

    public boolean d()
    {
        return c;
    }

    public boolean e()
    {
        return d;
    }

    public String f()
    {
        return f;
    }

    public int g()
    {
        return g;
    }

    public ChatContext h()
    {
        return h;
    }

    public boolean i()
    {
        return e;
    }

    public ah j()
    {
        return i;
    }

    public boolean k()
    {
        return j;
    }

    public boolean l()
    {
        return k;
    }

    public String toString()
    {
        return b().g();
    }
}
