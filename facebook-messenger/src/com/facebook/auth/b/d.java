// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.b;

import com.facebook.auth.credentials.FacebookCredentials;
import com.facebook.auth.e.a;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.e.h;
import com.facebook.common.w.q;
import com.facebook.prefs.shared.e;
import com.facebook.user.User;
import com.facebook.user.ac;
import com.facebook.user.n;
import com.facebook.user.o;
import java.util.List;

// Referenced classes of package com.facebook.auth.b:
//            b, c

public final class d
    implements b, c
{

    private final com.facebook.prefs.shared.d a;
    private final com.facebook.auth.viewercontext.d b;
    private final ac c;
    private final h d;
    private boolean e;
    private User f;
    private boolean g;
    private boolean h;
    private ViewerContext i;

    public d(com.facebook.prefs.shared.d d1, com.facebook.auth.viewercontext.d d2, ac ac1, h h1)
    {
        a = d1;
        b = d2;
        c = ac1;
        d = h1;
    }

    private User m()
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        if (f == null) goto _L2; else goto _L1
_L1:
        Object obj = f;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((User) (obj));
_L2:
        obj = obj1;
        if (!a.a()) goto _L4; else goto _L3
_L3:
        String s = a.a(a.v, null);
        obj = obj1;
        if (s == null) goto _L4; else goto _L5
_L5:
        f = c.a(n.FACEBOOK, s);
        obj = a();
        if (f.F() == null || obj == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (((ViewerContext) (obj)).b().equals(f.F()) || g)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        obj = (new StringBuilder()).append("auth token does not match me user. current token ").append(((ViewerContext) (obj)).b()).append(", me user token ").append(f.F()).toString();
        d.a(getClass().getSimpleName(), ((String) (obj)));
        g();
        g = true;
        obj = obj1;
          goto _L4
        obj;
        throw obj;
        obj = f;
          goto _L4
    }

    public ViewerContext a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = h;
        if (!flag) goto _L2; else goto _L1
_L1:
        ViewerContext viewercontext = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return viewercontext;
_L2:
        if (i == null)
        {
            i = b.a();
        }
        viewercontext = i;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(FacebookCredentials facebookcredentials)
    {
        this;
        JVM INSTR monitorenter ;
        a(facebookcredentials, false);
        this;
        JVM INSTR monitorexit ;
        return;
        facebookcredentials;
        throw facebookcredentials;
    }

    public void a(FacebookCredentials facebookcredentials, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        e e1 = a.b();
        e1.a(a.c, facebookcredentials.a());
        e1.a(a.d, facebookcredentials.b());
        e1.a(a.e, facebookcredentials.c());
        if (facebookcredentials.e() != null)
        {
            e1.a(a.f, facebookcredentials.e());
        }
        if (facebookcredentials.d() != null)
        {
            e1.a(a.j, facebookcredentials.d());
        }
        if (facebookcredentials.f() != null)
        {
            e1.a(a.k, facebookcredentials.f());
        }
        if (facebookcredentials.g() != null)
        {
            e1.a(a.m, facebookcredentials.g());
        }
        e1.a(a.g, flag);
        e1.a(a.h);
        e1.a();
        i = null;
        h = false;
        this;
        JVM INSTR monitorexit ;
        return;
        facebookcredentials;
        throw facebookcredentials;
    }

    public void a(User user)
    {
        this;
        JVM INSTR monitorenter ;
        User user1 = user;
        if (f != null)
        {
            user = (new o()).a(user);
            if (user.o() == q.UNSET)
            {
                user.a(f.x());
            }
            if (user.c().isEmpty())
            {
                user.a(f.j());
            }
            if (user.d().isEmpty())
            {
                user.b(f.k());
            }
            if (user.w() == null)
            {
                user.g(f.F());
            }
            user.a(f.y());
            user1 = user.x();
        }
        b(user1);
        this;
        JVM INSTR monitorexit ;
        return;
        user;
        throw user;
    }

    public void b(User user)
    {
        this;
        JVM INSTR monitorenter ;
        e e1 = a.b();
        String s = c.a(user);
        e1.a(a.v, s);
        e1.a();
        f = user;
        d.c("uid", f.b());
        this;
        JVM INSTR monitorexit ;
        return;
        user;
        throw user;
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        if (m() == null) goto _L2; else goto _L1
_L1:
        ViewerContext viewercontext = a();
        if (viewercontext == null) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public User d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = i();
        if (!flag) goto _L2; else goto _L1
_L1:
        User user = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return user;
_L2:
        user = m();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        f();
        j();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void f()
    {
        this;
        JVM INSTR monitorenter ;
        f = null;
        e e1 = a.b();
        e1.a(a.v);
        e1.a();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void g()
    {
        this;
        JVM INSTR monitorenter ;
        h = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void h()
    {
        this;
        JVM INSTR monitorenter ;
        h = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean i()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = h;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void j()
    {
        this;
        JVM INSTR monitorenter ;
        g();
        i = null;
        a.b().a(a.c).a(a.d).a(a.e).a(a.f).a(a.g).a(a.j).a(a.k).a(a.m).a();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void k()
    {
        this;
        JVM INSTR monitorenter ;
        e = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void l()
    {
        this;
        JVM INSTR monitorenter ;
        e = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
