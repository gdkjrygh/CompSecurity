// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.broadcast;

import android.content.Intent;
import android.content.res.Resources;
import com.facebook.auth.login.o;
import com.facebook.auth.login.v;
import com.facebook.base.a.d;
import com.facebook.base.d.a;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.auth.broadcast:
//            a, m, b

public class CrossProcessLogoutService extends a
{

    private static final Class a = com/facebook/auth/broadcast/CrossProcessLogoutService;

    public CrossProcessLogoutService()
    {
        super("CrossProcessLogout");
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj = a();
        ((d)((t) (obj)).a(com/facebook/base/a/d)).b();
        com.facebook.config.a.d d1 = com.facebook.auth.broadcast.a.a(intent);
        com.facebook.config.a.d d2 = (com.facebook.config.a.d)((t) (obj)).a(com/facebook/config/a/d);
        intent = (m)((t) (obj)).a(com/facebook/auth/broadcast/m);
        if (d1 == d2)
        {
            for (intent = ((t) (obj)).c(com/facebook/auth/broadcast/b).iterator(); intent.hasNext(); ((com.facebook.auth.broadcast.b)intent.next()).a()) { }
            ((v)((t) (obj)).a(com/facebook/auth/login/v)).d();
        } else
        if (d1 == com.facebook.config.a.d.FB4A && d2 == com.facebook.config.a.d.MESSENGER && ((com.facebook.prefs.shared.d)((t) (obj)).a(com/facebook/prefs/shared/d)).a(com.facebook.auth.e.a.n, false))
        {
            obj = (o)((t) (obj)).a(com/facebook/auth/login/o);
            try
            {
                ((o) (obj)).a();
            }
            catch (Exception exception)
            {
                b.e(a, "Error in auto logout.");
            }
            intent.a(getResources().getString(com.facebook.o.auto_logout_messenger));
            return;
        }
    }

}
