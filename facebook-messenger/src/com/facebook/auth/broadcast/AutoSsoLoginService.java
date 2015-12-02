// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.broadcast;

import android.content.Intent;
import android.content.res.Resources;
import com.facebook.auth.b.d;
import com.facebook.auth.login.bc;
import com.facebook.auth.login.bm;
import com.facebook.auth.login.o;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.base.d.a;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.facebook.prefs.shared.e;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.auth.broadcast:
//            c, m

public class AutoSsoLoginService extends a
{

    private static final Class a = com/facebook/auth/broadcast/AutoSsoLoginService;
    private d b;
    private com.facebook.prefs.shared.d c;
    private bm d;
    private o e;
    private bc f;
    private Set g;
    private m h;

    public AutoSsoLoginService()
    {
        super("auto_sso_login");
    }

    private void a(com.facebook.auth.credentials.b b1)
    {
        e e1;
        if (b.a() != null)
        {
            try
            {
                e.a();
            }
            // Misplaced declaration of an exception variable
            catch (com.facebook.auth.credentials.b b1)
            {
                com.facebook.debug.log.b.e(a, "Error logging out.");
                return;
            }
        }
        com.facebook.debug.log.b.b(a, "Starting auto-login");
        b.h();
        try
        {
            e.a(b1.c());
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.auth.credentials.b b1)
        {
            com.facebook.debug.log.b.e(a, "SSO login failed.");
            return;
        }
        com.facebook.debug.log.b.b(a, "SSO login succeeded, starting login operation.");
        try
        {
            f.a();
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.auth.credentials.b b1)
        {
            com.facebook.debug.log.b.e(a, "Login operation failed.");
            return;
        }
        e1 = c.b();
        e1.a(com.facebook.auth.e.a.n, true);
        e1.a();
        com.facebook.debug.log.b.b(a, "Login succeeded, calling background login hooks.");
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((c)iterator.next()).a()) { }
        b1 = getResources().getString(com.facebook.o.auto_login_messenger, new Object[] {
            b1.b()
        });
        h.a(b1);
    }

    private boolean a(String s)
    {
        ViewerContext viewercontext = b.a();
        return s != null && viewercontext != null && s.equals(viewercontext.a());
    }

    private boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b.a() != null)
        {
            flag = flag1;
            if (c.a(com.facebook.auth.e.a.g, false))
            {
                flag = true;
            }
        }
        return flag;
    }

    public void onCreate()
    {
        super.onCreate();
        t t1 = t.a(this);
        b = (d)t1.a(com/facebook/auth/b/d);
        c = (com.facebook.prefs.shared.d)t1.a(com/facebook/prefs/shared/d);
        d = (bm)t1.a(com/facebook/auth/login/bm);
        e = (o)t1.a(com/facebook/auth/login/o);
        f = (bc)t1.a(com/facebook/auth/login/bc);
        g = t1.c(com/facebook/auth/broadcast/c);
        h = (m)t1.a(com/facebook/auth/broadcast/m);
    }

    protected void onHandleIntent(Intent intent)
    {
        com.facebook.debug.log.b.b(a, "AutoSsoLoginService, in onHandleIntent");
        break MISSING_BLOCK_LABEL_8;
        if (!b() && d.a(this))
        {
            intent = d.a();
            if (intent != null && !a(intent.a()))
            {
                a(intent);
                return;
            }
        }
        return;
    }

}
