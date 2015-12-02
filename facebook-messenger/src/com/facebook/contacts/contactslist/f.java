// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactslist;

import android.content.Context;
import android.support.v4.a.a;
import com.facebook.contacts.e.b;
import com.facebook.contacts.e.c;
import com.google.common.a.es;
import com.google.common.a.et;

// Referenced classes of package com.facebook.contacts.contactslist:
//            g

public class f extends a
{

    private static final Class m = com/facebook/contacts/contactslist/f;
    private final c n;
    private g o;

    public f(Context context, c c1)
    {
        super(context);
        n = c1;
    }

    private g s()
    {
        return new g(t());
    }

    private es t()
    {
        b b1 = n.a(com.facebook.contacts.models.a.a.ALL_TYPES);
        et et1 = es.e();
        do
        {
            com.facebook.contacts.models.Contact contact = b1.a();
            if (contact != null)
            {
                et1.b(contact);
            } else
            {
                b1.close();
                return et1.b();
            }
        } while (true);
    }

    public Object d()
    {
        return r();
    }

    protected void i()
    {
        super.i();
        if (o != null)
        {
            b(o);
        }
        if (o == null)
        {
            j();
        }
    }

    public g r()
    {
        return s();
    }

}
