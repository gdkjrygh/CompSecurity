// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactslist;

import com.facebook.config.a.b;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class h
    implements a
{

    public static final ae a = n.a("messenger_has_contacts_list_android");
    private final d b;
    private final com.facebook.config.a.a c;

    public h(d d1, com.facebook.config.a.a a1)
    {
        b = d1;
        c = a1;
    }

    public Boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b.a(a, false))
        {
            flag = flag1;
            if (c.h() != b.PUBLIC)
            {
                flag = true;
            }
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }

}
