// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.a;

import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.ContactDetails;
import com.facebook.contacts.models.f;
import com.facebook.user.UserKey;
import com.google.common.a.em;
import com.google.common.a.hy;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public class b
    implements com.facebook.auth.f.b
{

    private final ConcurrentMap a;
    private final ConcurrentMap b;

    public b()
    {
        a = (new hy()).b(600L, TimeUnit.SECONDS).b(100).n();
        b = (new hy()).b(600L, TimeUnit.SECONDS).b(100).n();
    }

    public Contact a(UserKey userkey)
    {
        if (userkey == null)
        {
            return null;
        } else
        {
            return (Contact)a.get(userkey);
        }
    }

    public void a()
    {
        a.clear();
        b.clear();
    }

    public void a(Contact contact, ContactDetails contactdetails)
    {
        Iterator iterator = f.b(contact).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            UserKey userkey = (UserKey)iterator.next();
            a.put(userkey, contact);
            if (contactdetails != null)
            {
                b.put(userkey, contactdetails);
            }
        } while (true);
    }

    public ContactDetails b(UserKey userkey)
    {
        if (userkey == null)
        {
            return null;
        } else
        {
            return (ContactDetails)b.get(userkey);
        }
    }

    public void d()
    {
        a();
    }
}
