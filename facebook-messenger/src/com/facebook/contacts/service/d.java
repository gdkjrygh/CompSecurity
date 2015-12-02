// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.service;

import com.facebook.auth.userscope.UserScoped;
import com.facebook.backgroundtasks.f;
import com.facebook.common.init.NeedsHighPriorityInitOnBackgroundThread;
import com.facebook.d.a.a;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.p;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.contacts.service:
//            AddressBookQueue, g, ContactsUploadQueue, i, 
//            ContactsInviteQueue, h, DynamicContactDataQueue, j, 
//            l, k, f

public class d extends c
{

    private p a;

    public d()
    {
    }

    protected void a()
    {
        f(com/facebook/backgroundtasks/f);
        f(com/facebook/d/a/a);
        a(com/facebook/fbservice/service/e).a(com/facebook/contacts/service/AddressBookQueue).a(new com.facebook.contacts.service.g(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/fbservice/service/e).a(com/facebook/contacts/service/ContactsUploadQueue).a(new i(this, null)).d();
        a(com/facebook/fbservice/service/e).a(com/facebook/contacts/service/ContactsInviteQueue).a(new h(this, null)).d();
        a(com/facebook/fbservice/service/e).a(com/facebook/contacts/service/DynamicContactDataQueue).a(new j(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/contacts/service/l).a(new k(this, null));
        a(com/facebook/base/c, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread).a(com/facebook/contacts/service/l);
        a(com/facebook/contacts/database/f).a(new com.facebook.contacts.service.f(null));
        c(com/facebook/backgroundtasks/c).a(com/facebook/contacts/database/f);
    }

    public void a(t t1)
    {
        a = (p)t1.a(com/facebook/fbservice/service/p);
    }
}
