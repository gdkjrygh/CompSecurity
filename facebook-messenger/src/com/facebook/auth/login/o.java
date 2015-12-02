// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.a.b;
import com.facebook.auth.b.d;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.auth.e.a;
import com.facebook.auth.protocol.AuthenticationResult;
import com.facebook.auth.protocol.c;
import com.facebook.http.protocol.aq;
import com.facebook.http.protocol.f;
import com.facebook.prefs.shared.e;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.auth.login:
//            am, r, a, q, 
//            p

public class o
{

    private final d a;
    private final com.facebook.prefs.shared.d b;
    private final Set c;
    private final c d;
    private final com.facebook.auth.protocol.e e;
    private final javax.inject.a f;
    private final com.facebook.auth.protocol.b g;
    private final com.facebook.auth.protocol.a h;
    private final javax.inject.a i;
    private final am j;
    private final javax.inject.a k;
    private final com.facebook.auth.login.a l;

    public o(com.facebook.auth.b.a a1, com.facebook.prefs.shared.d d1, Set set, c c1, com.facebook.auth.protocol.e e1, com.facebook.auth.protocol.b b1, com.facebook.auth.protocol.a a2, 
            javax.inject.a a3, javax.inject.a a4, am am1, javax.inject.a a5, com.facebook.auth.login.a a6)
    {
        Preconditions.checkArgument(a1 instanceof d, "AuthDataStore must be an LoggedInUserSessionManager");
        a = (d)a1;
        b = d1;
        c = set;
        d = c1;
        e = e1;
        g = b1;
        h = a2;
        f = a3;
        i = a4;
        j = am1;
        k = a5;
        l = a6;
    }

    private AuthenticationResult a(Callable callable)
    {
        Iterator iterator1;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((b)iterator.next()).b()) { }
        try
        {
            callable = (AuthenticationResult)callable.call();
            if (callable.b() != null)
            {
                e e1 = b.b();
                e1.a(a.i, callable.b());
                e1.a();
            }
            j.c();
            a.a(callable.a());
            for (Iterator iterator2 = c.iterator(); iterator2.hasNext(); ((b)iterator2.next()).a(callable)) { }
            break MISSING_BLOCK_LABEL_184;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            for (iterator1 = c.iterator(); iterator1.hasNext(); ((b)iterator1.next()).a(callable)) { }
        }
        throw callable;
        return callable;
    }

    static com.facebook.prefs.shared.d a(o o1)
    {
        return o1.b;
    }

    private void a(f f1)
    {
        a.k();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((b)iterator.next()).c()) { }
        break MISSING_BLOCK_LABEL_53;
        f1;
        a.l();
        throw f1;
        for (Iterator iterator1 = c.iterator(); iterator1.hasNext(); ((b)iterator1.next()).d()) { }
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        ((aq)f.b()).a(f1, null);
        l.a(new r(this));
        for (f1 = c.iterator(); f1.hasNext(); ((b)f1.next()).f()) { }
        for (f1 = c.iterator(); f1.hasNext(); ((b)f1.next()).g()) { }
        f1 = b.b();
        f1.a(a.h, true);
        f1.a();
        for (f1 = c.iterator(); f1.hasNext(); ((b)f1.next()).h()) { }
        a.l();
        return;
    }

    static javax.inject.a b(o o1)
    {
        return o1.k;
    }

    static javax.inject.a c(o o1)
    {
        return o1.f;
    }

    static com.facebook.auth.protocol.e d(o o1)
    {
        return o1.e;
    }

    static c e(o o1)
    {
        return o1.d;
    }

    static Set f(o o1)
    {
        return o1.c;
    }

    static d g(o o1)
    {
        return o1.a;
    }

    public AuthenticationResult a(PasswordCredentials passwordcredentials)
    {
        return a(((Callable) (new q(this, passwordcredentials))));
    }

    public AuthenticationResult a(String s)
    {
        return a(((Callable) (new p(this, s))));
    }

    public void a()
    {
        com.facebook.auth.protocol.b b1;
        if (((Boolean)i.b()).booleanValue())
        {
            b1 = g;
        } else
        {
            b1 = null;
        }
        a(((f) (b1)));
    }

    public void b()
    {
        a(h);
    }
}
