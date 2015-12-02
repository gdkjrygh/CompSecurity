// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.e.a;
import com.facebook.auth.protocol.AuthenticationResult;
import com.facebook.auth.protocol.f;
import com.facebook.http.protocol.aq;
import com.facebook.http.protocol.l;
import com.facebook.http.protocol.m;
import com.facebook.prefs.shared.d;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.auth.login:
//            o

class p
    implements Callable
{

    final String a;
    final o b;

    p(o o1, String s)
    {
        b = o1;
        a = s;
        super();
    }

    public AuthenticationResult a()
    {
        Object obj = com.facebook.auth.login.o.a(b).a(a.i, null);
        obj = new f(a, ((String) (obj)), ((Boolean)o.b(b).b()).booleanValue());
        l l1 = new l();
        l1.a(m.BOOTSTRAP);
        return (AuthenticationResult)((aq)o.c(b).b()).a(com.facebook.auth.login.o.d(b), obj, l1);
    }

    public Object call()
    {
        return a();
    }
}
