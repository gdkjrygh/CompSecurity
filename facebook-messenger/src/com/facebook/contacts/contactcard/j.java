// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Intent;
import android.net.Uri;
import com.facebook.c.s;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.aa;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ContactCardFragment

class j
    implements h
{

    final aa a;
    final ContactCardFragment b;

    j(ContactCardFragment contactcardfragment, aa aa1)
    {
        b = contactcardfragment;
        a = aa1;
        super();
    }

    public void a(Uri uri)
    {
        a.b();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        ContactCardFragment.a(b, true);
        ContactCardFragment.l(b).b(intent, b.n());
    }

    public volatile void a(Object obj)
    {
        a((Uri)obj);
    }

    public void a(Throwable throwable)
    {
        a.b();
        com.facebook.debug.log.b.e(ContactCardFragment.V(), "unable to lookup contact in addressbook", throwable);
        ContactCardFragment.m(b).a(ContactCardFragment.V().getSimpleName(), "unable to lookup contact in addressbook", throwable);
    }
}
