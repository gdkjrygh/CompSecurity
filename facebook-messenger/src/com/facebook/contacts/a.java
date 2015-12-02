// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts;

import com.facebook.auth.userscope.UserScoped;
import com.facebook.contacts.annotations.ForContactSummary;
import com.facebook.contacts.annotations.IsMobileAppDataEnabled;
import com.facebook.contacts.annotations.IsMoreLastActiveEnabled;
import com.facebook.contacts.data.k;
import com.facebook.contacts.data.l;
import com.facebook.contacts.data.m;
import com.facebook.contacts.data.n;
import com.facebook.contacts.data.x;
import com.facebook.contacts.database.AddressBookPeriodicRunner;
import com.facebook.contacts.g.f;
import com.facebook.contacts.g.h;
import com.facebook.contacts.g.i;
import com.facebook.contacts.g.j;
import com.facebook.contacts.i.b;
import com.facebook.contacts.models.e;
import com.facebook.contacts.service.ContactsQueue;
import com.facebook.contacts.service.ContactsSyncQueue;
import com.facebook.contacts.service.d;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.inject.t;
import com.facebook.phonenumbers.PhoneNumberUtil;

// Referenced classes of package com.facebook.contacts:
//            i, x, y, h, 
//            aa, z, c, ah, 
//            ai, af, aj, ao, 
//            g, ag, ak, al, 
//            n, ab, ad, ae, 
//            q, p, l, m, 
//            am, an, k, w, 
//            v, e, s, j, 
//            t, u, r, ac, 
//            d, o, f

public class a extends c
{

    public a()
    {
    }

    protected void a()
    {
        a(((com.facebook.inject.ag) (new d())));
        f(com/facebook/d/a/a);
        a(java/lang/Boolean).a(com/facebook/contacts/annotations/IsMoreLastActiveEnabled).c(com/facebook/contacts/i/b);
        b(java/lang/Boolean).a(com/facebook/contacts/annotations/IsMobileAppDataEnabled).a(Boolean.FALSE);
        a(com/facebook/contacts/g/c).a(new com.facebook.contacts.i(this, null)).a();
        a(com/facebook/contacts/data/k).a(new com.facebook.contacts.x(this, null));
        a(com/facebook/contacts/data/l).a(new y(this, null));
        b(com/facebook/contacts/data/a/b).a(new com.facebook.contacts.h(null)).a();
        a(com/facebook/contacts/data/m).a(new aa(this, null)).a();
        a(com/facebook/contacts/data/n).a(new z(this, null));
        a(com/facebook/contacts/service/a).a(new com.facebook.contacts.c(this, null)).a();
        a(com/facebook/contacts/g/h).a(new ah(this, null));
        a(com/facebook/contacts/g/i).a(new ai(this, null));
        a(com/facebook/contacts/g/f).a(new af(this, null));
        a(com/facebook/contacts/g/j).a(new com.facebook.contacts.aj(this, null));
        a(com/facebook/contacts/g/k).a(new ao(this, null));
        a(com/facebook/contacts/g/b).a(new com.facebook.contacts.g(this, null));
        a(com/facebook/contacts/g/g).a(new ag(this, null));
        a(com/facebook/contacts/c/b).a(com/facebook/contacts/annotations/ForContactSummary).a(new ak(null)).a();
        a(com/facebook/contacts/c/d).a(com/facebook/contacts/annotations/ForContactSummary).a(new al(this, null));
        a(com/facebook/contacts/a/b).a(new com.facebook.contacts.n(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/contacts/a/c).a(new ab(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/contacts/a/d).a(new ad(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/contacts/data/x).a(new ae(this, null)).a();
        a(com/facebook/contacts/data/c).a(new q(this, null)).a();
        a(com/facebook/contacts/data/b).a(new p(this, null)).a();
        a(com/facebook/contacts/data/a).a(new com.facebook.contacts.l(this, null)).a();
        a(com/facebook/contacts/models/g).a(new com.facebook.contacts.m(this, null));
        a(com/facebook/user/a/l).a(new am(this, null)).a();
        a(com/facebook/phonenumbers/PhoneNumberUtil).a(new an(this, null)).a();
        a(com/facebook/contacts/models/e).a(new com.facebook.contacts.k(this, null));
        a(com/facebook/contacts/e/c).a(new w(this, null));
        a(com/facebook/contacts/e/a).a(new v(this, null));
        a(com/facebook/user/e).b(com/facebook/contacts/e/a);
        a(com/facebook/contacts/service/b).a(new com.facebook.contacts.e(this, null));
        a(com/facebook/contacts/service/c).a(new s(this, null));
        a(com/facebook/contacts/b/a).a(new com.facebook.contacts.j(this, null));
        a(com/facebook/contacts/upload/c).a(new com.facebook.contacts.t(this, null)).a();
        a(com/facebook/contacts/upload/f).a(new u(this, null));
        a(com/facebook/contacts/d/a).a(new r(this, null));
        a(com/facebook/contacts/service/m).a(new ac(null));
        a(com/facebook/contacts/database/AddressBookPeriodicRunner).a(new com.facebook.contacts.d(this, null)).a();
        a(com/facebook/contacts/database/g).a(new o(null)).a();
        a(com/facebook/fbservice/service/e).a(com/facebook/contacts/service/ContactsQueue).a(new com.facebook.contacts.f(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/fbservice/service/e).a(com/facebook/contacts/service/ContactsSyncQueue).a(new com.facebook.contacts.f(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/user/a/n).a(new com.facebook.user.a.k());
        c(com/facebook/f/f).a(com/facebook/contacts/g/a/c);
        c(com/facebook/auth/f/b).a(com/facebook/contacts/database/AddressBookPeriodicRunner);
        c(com/facebook/auth/f/a).a(com/facebook/contacts/data/b);
    }

    public void a(t t1)
    {
        super.a(t1);
        ((com.facebook.d.b.a)t1.a(com/facebook/d/b/a)).b(com/facebook/contacts/data/b, ((com.facebook.common.process.d)t1.a(com/facebook/common/process/d)).c());
    }
}
