// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview.upsell;

import android.content.Context;
import android.support.v4.a.a;
import com.facebook.common.w.n;
import com.facebook.contacts.e.b;
import com.facebook.contacts.e.c;
import com.facebook.contacts.models.Contact;
import com.facebook.inject.t;
import com.facebook.phonenumbers.NumberParseException;

public class i extends a
{

    private static final Class m = com/facebook/orca/threadview/upsell/i;
    private final c n;
    private final String o;
    private final String p;

    public i(Context context, String s1, String s2)
    {
        super(context);
        n = (c)com.facebook.inject.t.a(context).a(com/facebook/contacts/e/c);
        o = s1;
        p = s2;
    }

    private Contact a(b b1)
    {
        Contact contact = Contact.a;
        do
        {
            if (!b1.hasNext())
            {
                break;
            }
            Contact contact1 = b1.a();
            if (com.facebook.common.w.n.a(contact1.getProfileFbid()))
            {
                continue;
            }
            contact = contact1;
            break;
        } while (true);
        b1.close();
        return contact;
    }

    private Contact s()
    {
        b b1 = null;
        b b2 = n.a(o);
        b1 = b2;
_L1:
        NumberParseException numberparseexception;
        if (b1 == null)
        {
            return Contact.a;
        } else
        {
            return a(b1);
        }
        numberparseexception;
        com.facebook.debug.log.b.b(m, (new StringBuilder()).append("Could not parse number: ").append(o).toString());
          goto _L1
    }

    private Contact t()
    {
        return a(n.a(p, com.facebook.contacts.models.a.a.MESSAGABLE_TYPES));
    }

    public Object d()
    {
        return r();
    }

    protected void i()
    {
        super.i();
        j();
    }

    public Contact r()
    {
        Contact contact = s();
        if (contact != Contact.a)
        {
            return contact;
        } else
        {
            return t();
        }
    }

}
