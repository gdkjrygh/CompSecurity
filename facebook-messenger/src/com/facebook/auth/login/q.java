// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.auth.e.a;
import com.facebook.auth.protocol.AuthenticationResult;
import com.facebook.http.protocol.aq;
import com.facebook.http.protocol.l;
import com.facebook.http.protocol.m;
import com.facebook.prefs.shared.d;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.auth.login:
//            o

class q
    implements Callable
{

    final PasswordCredentials a;
    final o b;

    q(o o1, PasswordCredentials passwordcredentials)
    {
        b = o1;
        a = passwordcredentials;
        super();
    }

    public AuthenticationResult a()
    {
        Object obj = com.facebook.auth.login.o.a(b).a(a.i, null);
        obj = new com.facebook.auth.protocol.d(a, ((String) (obj)), ((Boolean)o.b(b).b()).booleanValue());
        l l1 = new l();
        l1.a(m.BOOTSTRAP);
        return (AuthenticationResult)((aq)o.c(b).b()).a(o.e(b), obj, l1);
    }

    public Object call()
    {
        return a();
    }
}
