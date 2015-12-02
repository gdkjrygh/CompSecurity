// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview.upsell;

import android.os.Bundle;
import android.support.v4.a.c;
import android.support.v4.app.ah;
import com.facebook.contacts.models.Contact;

// Referenced classes of package com.facebook.orca.threadview.upsell:
//            i, a

class b
    implements ah
{

    final String a;
    final String b;
    final a c;

    b(a a1, String s, String s1)
    {
        c = a1;
        a = s;
        b = s1;
        super();
    }

    public c a(int j, Bundle bundle)
    {
        return new i(com.facebook.orca.threadview.upsell.a.a(c), a, b);
    }

    public void a(c c1)
    {
    }

    public void a(c c1, Contact contact)
    {
        com.facebook.orca.threadview.upsell.a.a(c, contact);
        if (contact != Contact.a)
        {
            com.facebook.orca.threadview.upsell.a.b(c);
        }
    }

    public volatile void a(c c1, Object obj)
    {
        a(c1, (Contact)obj);
    }
}
