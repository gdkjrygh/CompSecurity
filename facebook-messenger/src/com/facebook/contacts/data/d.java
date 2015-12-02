// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import com.facebook.contacts.a;
import com.facebook.contacts.annotations.IsContactsListEnabled;
import com.facebook.contacts.contactslist.e;
import com.facebook.contacts.contactslist.f;
import com.facebook.contacts.contactslist.h;
import com.facebook.contacts.models.a.b;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.orca.annotations.ShowOtherContactsDivebar;
import com.facebook.orca.contacts.divebar.br;

// Referenced classes of package com.facebook.contacts.data:
//            f, p, h, g

public class d extends c
{

    public d()
    {
    }

    protected void a()
    {
        a(((com.facebook.inject.ag) (new a())));
        a(com/facebook/contacts/contactslist/e).a(new com.facebook.contacts.data.f(this, null));
        a(java/lang/Boolean).a(com/facebook/contacts/annotations/IsContactsListEnabled).c(com/facebook/contacts/contactslist/h);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/ShowOtherContactsDivebar).c(com/facebook/orca/contacts/divebar/br);
        a(com/facebook/contacts/data/p).a(new com.facebook.contacts.data.h(this, null));
        c(com/facebook/contacts/models/a/b).a(com/facebook/contacts/models/a/c);
        a(com/facebook/contacts/contactslist/f).a(new g(this, null));
    }
}
