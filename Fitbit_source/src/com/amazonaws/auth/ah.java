// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.auth;

import com.amazonaws.services.securitytoken.a;
import com.amazonaws.services.securitytoken.b;
import com.amazonaws.services.securitytoken.model.Credentials;
import com.amazonaws.services.securitytoken.model.GetSessionTokenRequest;
import com.amazonaws.services.securitytoken.model.GetSessionTokenResult;
import java.util.Date;

// Referenced classes of package com.amazonaws.auth:
//            l, r, g, m

public class ah
    implements l
{

    public static final int a = 3600;
    private final a b;
    private final int c;
    private Credentials d;

    public ah(g g1)
    {
        this(g1, 3600);
    }

    public ah(g g1, int i)
    {
        b = new b(g1);
        c = i;
    }

    public ah(a a1)
    {
        this(a1, 3600);
    }

    public ah(a a1, int i)
    {
        b = a1;
        c = i;
    }

    private Credentials f()
    {
        this;
        JVM INSTR monitorenter ;
        Credentials credentials;
        if (g())
        {
            c();
        }
        credentials = d;
        this;
        JVM INSTR monitorexit ;
        return credentials;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean g()
    {
        while (d == null || d.d().getTime() - System.currentTimeMillis() < 60000L) 
        {
            return true;
        }
        return false;
    }

    public String a()
    {
        this;
        JVM INSTR monitorenter ;
        String s = f().a();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String b()
    {
        this;
        JVM INSTR monitorenter ;
        String s = f().b();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        d = b.a((new GetSessionTokenRequest()).b(Integer.valueOf(c))).a();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String d()
    {
        this;
        JVM INSTR monitorenter ;
        String s = f().c();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public m e()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = f();
        obj = new r(((Credentials) (obj)).a(), ((Credentials) (obj)).b(), ((Credentials) (obj)).c());
        this;
        JVM INSTR monitorexit ;
        return ((m) (obj));
        Exception exception;
        exception;
        throw exception;
    }
}
