// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import com.facebook.contacts.a.b;
import com.facebook.contacts.models.entry.Entry;
import com.facebook.contacts.models.entry.PhoneEntry;
import com.facebook.contacts.models.entry.d;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.a.es;
import com.google.common.base.Objects;
import java.util.Iterator;

// Referenced classes of package com.facebook.contacts.models:
//            ContactDetails, EntrySection

public class g
{

    private final b a;

    public g(b b1)
    {
        a = b1;
    }

    public PhoneEntry a(String s, String s1)
    {
        s = new UserKey(n.FACEBOOK_CONTACT, s);
        s = a.b(s);
        if (s == null)
        {
            return null;
        }
        for (s = s.getContactInfoSection().getEntries().iterator(); s.hasNext();)
        {
            PhoneEntry phoneentry = (PhoneEntry)s.next();
            if (phoneentry.a() == d.PHONE_NUMBER)
            {
                phoneentry = (PhoneEntry)phoneentry;
                if (Objects.equal(s1, phoneentry.getNumber()))
                {
                    return phoneentry;
                }
            }
        }

        return null;
    }
}
