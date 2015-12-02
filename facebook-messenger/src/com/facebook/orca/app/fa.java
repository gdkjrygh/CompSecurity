// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.app.Application;
import android.os.Looper;
import com.facebook.backgroundtasks.d;
import com.facebook.base.a.a;
import com.facebook.base.j;
import com.facebook.common.e.h;
import com.facebook.common.process.c;
import com.facebook.common.w.n;
import com.facebook.contacts.database.ContactsTaskTag;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.inject.aa;
import com.facebook.inject.ag;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.background.MessagesTaskTag;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.List;

// Referenced classes of package com.facebook.orca.app:
//            dv, fb

public class fa extends a
    implements aa
{

    private final Class b = com/facebook/orca/app/fa;
    private ag c;

    public fa(Application application, com.facebook.config.a.a a1)
    {
        super(application, a1);
    }

    private void g()
    {
        t t1 = f();
        j j1 = (j)t1.a(com/facebook/base/j);
        if (j1 != null && j1 == j.DEBUG)
        {
            (new com.facebook.o.a((h)t1.a(com/facebook/common/e/h))).a();
        }
    }

    protected List b(c c1)
    {
        c1 = hq.a();
        c1.add(new dv(a(), b()));
        if (c != null)
        {
            c1.add(c);
        }
        return c1;
    }

    public void c()
    {
        super.c();
        e e1 = com.facebook.debug.d.e.a("MessengerApplicationImpl.onCreate");
        com.facebook.config.a.a a1 = (com.facebook.config.a.a)f().a(com/facebook/config/a/a);
        com.facebook.debug.log.b.a(b, (new StringBuilder()).append("FbAppType: ").append(a1.a()).toString());
        g();
        Looper.getMainLooper().setMessageLogging(new fb(this));
        if (com.facebook.base.b.a())
        {
            boolean flag;
            if (!n.a(a().getString(o.app_name)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
        }
        com.facebook.fdlimit.a.a();
        e1.a();
    }

    protected void c(c c1)
    {
        Object obj = f();
        c1 = (d)((t) (obj)).a(com/facebook/backgroundtasks/d);
        obj = (com.facebook.d.b.a)((t) (obj)).a(com/facebook/d/b/a);
        if (!((com.facebook.d.b.a) (obj)).a(com/facebook/contacts/data/b))
        {
            c1.a(com/facebook/contacts/database/ContactsTaskTag, true);
        }
        if (!((com.facebook.d.b.a) (obj)).a(com/facebook/orca/g/aa))
        {
            c1.a(com/facebook/orca/background/MessagesTaskTag, true);
        }
    }

    public void e()
    {
        super.e();
        ((com.facebook.ui.images.cache.a)f().a(com/facebook/ui/images/cache/a)).b();
        if (((com.facebook.auth.b.b)f().a(com/facebook/auth/b/b)).b())
        {
            ((com.facebook.orca.contacts.divebar.e)f().a(com/facebook/orca/contacts/divebar/e)).a();
        }
    }
}
