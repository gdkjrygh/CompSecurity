// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.service;

import com.facebook.base.c;
import com.facebook.contacts.server.d;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.p;

// Referenced classes of package com.facebook.contacts.service:
//            ContactsUploadQueue, ContactsQueueSet, ContactsInviteQueue, ContactsQueue, 
//            ContactsSyncQueue, AddressBookQueue, DynamicContactDataQueue

public class l
    implements c
{

    private final p a;

    public l(p p1)
    {
        a = p1;
    }

    private void a(OperationType operationtype, Class class1)
    {
        a.a(operationtype, class1);
    }

    public void a()
    {
        a.a(com/facebook/contacts/service/ContactsUploadQueue, com/facebook/contacts/service/ContactsQueueSet);
        a.a(com/facebook/contacts/service/ContactsInviteQueue, com/facebook/contacts/service/ContactsQueueSet);
        a.a(com/facebook/contacts/service/ContactsQueue, com/facebook/contacts/service/ContactsQueueSet);
        a.a(com/facebook/contacts/service/ContactsSyncQueue, com/facebook/contacts/service/ContactsQueueSet);
        a.a(com/facebook/contacts/service/AddressBookQueue, com/facebook/contacts/service/ContactsQueueSet);
        a.a(com/facebook/contacts/service/DynamicContactDataQueue, com/facebook/contacts/service/ContactsQueueSet);
        a(d.m, com/facebook/contacts/service/ContactsUploadQueue);
        a(d.n, com/facebook/contacts/service/ContactsInviteQueue);
        a(d.d, com/facebook/contacts/service/ContactsQueue);
        a(d.b, com/facebook/contacts/service/ContactsQueue);
        a(d.c, com/facebook/contacts/service/ContactsQueue);
        a(d.e, com/facebook/contacts/service/ContactsQueue);
        a(d.f, com/facebook/contacts/service/ContactsQueue);
        a(d.a, com/facebook/contacts/service/ContactsSyncQueue);
        a(d.g, com/facebook/contacts/service/AddressBookQueue);
        a(d.h, com/facebook/contacts/service/AddressBookQueue);
        a(d.i, com/facebook/contacts/service/AddressBookQueue);
        a(d.j, com/facebook/contacts/service/AddressBookQueue);
        a(d.k, com/facebook/contacts/service/AddressBookQueue);
        a(d.l, com/facebook/contacts/service/AddressBookQueue);
        a(d.p, com/facebook/contacts/service/DynamicContactDataQueue);
        a(d.o, com/facebook/contacts/service/DynamicContactDataQueue);
    }
}
