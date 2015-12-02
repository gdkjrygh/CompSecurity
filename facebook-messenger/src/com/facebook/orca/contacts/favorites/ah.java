// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import com.facebook.user.MobileAppData;
import com.facebook.user.User;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ah
{

    private final es a;

    public ah(es es1)
    {
        a = es1;
    }

    public es a()
    {
        return a;
    }

    public es a(List list)
    {
        et et1 = es.e();
        if (a != null)
        {
            Iterator iterator = a.iterator();
label0:
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                User user = (User)iterator.next();
                MobileAppData mobileappdata = user.D();
                if (mobileappdata == null)
                {
                    continue;
                }
                Iterator iterator1 = list.iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label0;
                    }
                } while (!mobileappdata.a((Long)iterator1.next()).booleanValue());
                et1.b(user);
            } while (true);
        }
        return et1.b();
    }

    public es b()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(Long.valueOf(0xe8d530ffbaefL));
        arraylist.add(Long.valueOf(0xd83dcaf3fa67L));
        arraylist.add(Long.valueOf(0x9cbd2626f872L));
        return a(arraylist);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (a != null)
        {
            stringbuilder.append("mobileAppDataFriends: ").append(a.size());
        }
        return stringbuilder.toString();
    }
}
