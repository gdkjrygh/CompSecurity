// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.a.em;
import com.google.common.a.fk;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.contacts.models:
//            Contact

public class f
{

    public f()
    {
    }

    public static UserKey a(Contact contact)
    {
        UserKey userkey = null;
        if (contact.getProfileFbid() == null && contact.getContactId() == null)
        {
            if (contact.getLookupKey() != null)
            {
                userkey = new UserKey(n.ADDRESS_BOOK, contact.getLookupKey());
            }
        } else
        {
            String s = contact.getProfileFbid();
            if (s != null)
            {
                return new UserKey(n.FACEBOOK, s);
            }
            contact = contact.getContactId();
            if (contact != null)
            {
                return new UserKey(n.FACEBOOK_CONTACT, contact);
            }
        }
        return userkey;
    }

    public static em b(Contact contact)
    {
        fk fk1;
        String s;
        boolean flag;
        if (contact.getProfileFbid() != null || contact.getContactId() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        fk1 = new fk();
        s = contact.getProfileFbid();
        if (s != null)
        {
            fk1.b(new UserKey(n.FACEBOOK, s));
        }
        contact = contact.getContactId();
        if (contact != null)
        {
            fk1.b(new UserKey(n.FACEBOOK_CONTACT, contact));
        }
        return fk1.b();
    }
}
