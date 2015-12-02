// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import android.content.Context;
import android.support.v4.a.a;
import com.facebook.contacts.data.l;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.user.MobileAppData;
import com.facebook.user.User;
import com.facebook.user.o;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.ew;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            ah

public class ag extends a
{

    private final com.facebook.user.e m;
    private final l n;
    private final com.facebook.contacts.a.e o;
    private ah p;

    public ag(Context context, com.facebook.user.e e1, l l1, com.facebook.contacts.a.e e2)
    {
        super(context);
        m = e1;
        n = l1;
        o = e2;
    }

    private es t()
    {
        e e1;
        et et1;
        Object obj;
        e1 = e.a("getFriendMobileAppData");
        Object obj1 = n.b();
        obj = ev.k();
        et1 = es.e();
        User user1;
        for (obj1 = ((es) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((ew) (obj)).b(user1.c(), user1.D()))
        {
            user1 = (User)((Iterator) (obj1)).next();
            et1.b(user1.c());
        }

        obj = ((ew) (obj)).b();
        m.a(et1.b());
        et1 = es.e();
_L3:
        User user = m.c();
        if (user == null) goto _L2; else goto _L1
_L1:
        et1.b((new o()).a(user).a((MobileAppData)((ev) (obj)).get(user.c())).x());
          goto _L3
        IOException ioexception;
        ioexception;
        b.d("orca:FriendListsLoader", "Exception reading users", ioexception);
        m.d();
_L5:
        e1.a();
        return et1.b();
_L2:
        m.d();
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        m.d();
        throw exception;
    }

    public Object d()
    {
        return r();
    }

    protected void i()
    {
        super.i();
        b.b("orca:FriendListsLoader", "onStartLoading");
        if (p != null)
        {
            b.b("orca:FriendListsLoader", "Using cached result");
            b(p);
        }
        if (p == null)
        {
            b.b("orca:FriendListsLoader", "Forcing a load");
            j();
        }
    }

    protected void l()
    {
        super.l();
        b.b("orca:FriendListsLoader", "onStopLoading");
        b();
    }

    protected void p()
    {
        b.b("orca:FriendListsLoader", "onReset");
        l();
        p = null;
    }

    public ah r()
    {
        b.b("orca:FriendListsLoader", "starting loadInBackground");
        ah ah1 = s();
        b.b("orca:FriendListsLoader", "loadInBackground. loadLocalData loaded");
        o.a(ah1.a());
        o.b(ah1.b());
        p = new ah(ah1.a());
        b.b("orca:FriendListsLoader", (new StringBuilder()).append("loadInBackground result=").append(p.toString()).toString());
        return p;
    }

    ah s()
    {
        e.b(3L);
        e e1 = e.a("loadInBackground");
        es es1 = t();
        e1.a();
        e.c("orca:FriendListsLoader");
        return new ah(es1);
    }
}
